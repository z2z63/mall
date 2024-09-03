package com.example.mall.service;

import com.example.mall.AdminUserDetails;
import com.example.mall.JwtUtil;
import com.example.mall.mappers.UmsAdminMapper;
import com.example.mall.model.UmsAdmin;
import com.example.mall.model.UmsRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UmsAdminService {
    private final UmsAdminMapper umsadminMapper;
    private final JwtUtil jwtUtil;
    private final AuthenticationManager authManager;

    @Autowired
    public UmsAdminService(UmsAdminMapper umsadminMapper, JwtUtil jwtUtil, AuthenticationManager authManager) {
        this.umsadminMapper = umsadminMapper;
        this.jwtUtil = jwtUtil;
        this.authManager = authManager;
    }

    public String login(String username, String password) {
        AdminUserDetails userDetails = new AdminUserDetails(username, password);
        UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(userDetails, password);
        authToken.setDetails(userDetails);
        Authentication auth = authManager.authenticate(authToken);
        if (auth.isAuthenticated()) {
            SecurityContextHolder.getContext().setAuthentication(auth);
            return jwtUtil.generateToken((AdminUserDetails) auth.getDetails());
        }
        return null;
    }
    @Cacheable("admin-getAdminByUsername")
    public UmsAdmin getAdminByUsername(String username) {
        Optional<UmsAdmin> usmAdmin = umsadminMapper.getAdminByUsername(username);
        return usmAdmin.orElse(null);
    }

    public List<UmsRole> getRoleList(Long adminId) {
        return umsadminMapper.getRoleList(adminId);
    }
}
