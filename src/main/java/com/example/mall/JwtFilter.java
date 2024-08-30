package com.example.mall;


import com.example.mall.mappers.UmsadminDynamicSqlSupport;
import com.example.mall.mappers.UmsadminMapper;
import com.example.mall.model.Umsadmin;
import io.jsonwebtoken.Claims;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.dynamic.sql.select.join.EqualTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Optional;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Slf4j
@Component
public class JwtFilter extends OncePerRequestFilter {

    private final JwtUtil jwtUtil;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
    private final UserDetailsService userDetailsService;

    @Autowired
    public JwtFilter(JwtUtil jwtUtil, UserDetailsService userDetailsService) {
        this.jwtUtil = jwtUtil;
        this.userDetailsService = userDetailsService;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String header = request.getHeader(tokenHeader);
        if (header == null || !header.startsWith(tokenHead)) {
            filterChain.doFilter(request, response);
            return;
        }
        String token = header.substring(tokenHead.length());
        Claims claims = jwtUtil.verifyAndGetClaims(token);
        if (claims == null) {
            filterChain.doFilter(request, response);
            return;
        }
        UserDetails details = userDetailsService.loadUserByUsername(claims.getSubject());
        String username = claims.getSubject();
        if(details == null || !details.getUsername().equals(username)) {
            filterChain.doFilter(request, response);
            return;
        }
        UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(details, null, details.getAuthorities());
        auth.setDetails(details);
        log.info("authenticated username:{}", username);
        SecurityContextHolder.getContext().setAuthentication(auth);
    }

    @Bean
    @Autowired
    public UserDetailsService userDetailsService(UmsadminMapper umsadminMapper) {
        return username -> {
            Optional<Umsadmin> admin = umsadminMapper.selectOne(c -> c.where(UmsadminDynamicSqlSupport.username, isEqualTo(username)));
            return admin.map(AdminUserDetails::new).orElse(null);
        };
    }
}
