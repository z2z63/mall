package com.example.mall;

import com.example.mall.model.Umsadmin;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

public class AdminUserDetails implements UserDetails {
    private final Umsadmin umsadmin;

    public AdminUserDetails(Umsadmin umsadmin) {
        this.umsadmin = umsadmin;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("TEST"));
    }

    @Override
    public String getPassword() {
        return umsadmin.getPassword();
    }

    @Override
    public String getUsername() {
        return umsadmin.getUsername();
    }
}
