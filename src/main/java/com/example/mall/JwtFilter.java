package com.example.mall;


import com.example.mall.mappers.UmsAdminMapper;
import com.example.mall.model.UmsAdmin;
import io.jsonwebtoken.Claims;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Optional;


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
        auth.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
        log.info("authenticated username:{}", username);
        SecurityContextHolder.getContext().setAuthentication(auth);
        filterChain.doFilter(request, response);
    }

    @Bean
    @Autowired
    public static UserDetailsService userDetailsService(UmsAdminMapper umsadminMapper) {
        return username -> {
            Optional<UmsAdmin> admin = umsadminMapper.getAdminByUsername(username);
            return admin.map(AdminUserDetails::new).orElse(null);
        };
    }
}
