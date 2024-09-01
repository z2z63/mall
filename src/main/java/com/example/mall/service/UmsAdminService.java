package com.example.mall.service;

import com.example.mall.AdminUserDetails;
import com.example.mall.JwtUtil;
import com.example.mall.mappers.UmsAdminMapper;
import com.example.mall.model.UmsAdmin;
import com.example.mall.model.UmsRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.example.mall.mappers.UmsAdminMapper;

import static org.mybatis.dynamic.sql.SqlBuilder.*;

@Service
public class UmsAdminService {
    private final UmsAdminMapper umsadminMapper;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;

    @Autowired
    public UmsAdminService(UmsAdminMapper umsadminMapper, PasswordEncoder passwordEncoder, JwtUtil jwtUtil) {
        this.umsadminMapper = umsadminMapper;
        this.passwordEncoder = passwordEncoder;
        this.jwtUtil = jwtUtil;
    }

    public String login(String username, String password) {
        Optional<UmsAdmin> usmAdmin = umsadminMapper.getAdminByUsername(username);
        if (usmAdmin.isEmpty()) {
            return null;
        }
        UmsAdmin umsadmin = usmAdmin.get();
        if (passwordEncoder.matches(password, umsadmin.getPassword())) {
            AdminUserDetails details = new AdminUserDetails(umsadmin);
            UsernamePasswordAuthenticationToken authentication =
                    new UsernamePasswordAuthenticationToken(username, null, details.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
            return jwtUtil.generateToken(details);
        }
        return null;
    }

    public UmsAdmin getAdminByUsername(String username) {
        Optional<UmsAdmin> usmAdmin = umsadminMapper.getAdminByUsername(username);
        return usmAdmin.orElse(null);
    }

    public List<UmsRole> getRoleList(Long adminId) {
        return umsadminMapper.getRoleList(adminId);
    }
}
