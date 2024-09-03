package com.example.mall.service;

import com.example.mall.mappers.UmsRoleMapper;
import com.example.mall.model.UmsMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UmsRoleService {
    private final UmsRoleMapper umsRoleMapper;

    @Autowired
    public UmsRoleService(UmsRoleMapper umsRoleMapper) {
        this.umsRoleMapper = umsRoleMapper;
    }

    public List<UmsMenu> getMenuList(Long adminId) {
        return umsRoleMapper.getMenuList(adminId);
    }
}
