package com.example.mall.service;

import com.example.mall.AdminUserDetails;
import com.example.mall.mappers.UmsAdminMapper;
import com.example.mall.model.UmsAdmin;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminDetailService implements UserDetailsService {
    private final UmsAdminMapper umsAdminMapper;

    public AdminDetailService(UmsAdminMapper umsAdminMapper) {
        this.umsAdminMapper = umsAdminMapper;
    }


    @Override
    @Cacheable("admin-loadUserByUsername")
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UmsAdmin> admin= umsAdminMapper.getAdminByUsername(username);
        return admin.map(AdminUserDetails::new).orElse(null);
    }
}
