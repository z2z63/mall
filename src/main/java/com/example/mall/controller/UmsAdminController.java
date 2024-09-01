package com.example.mall.controller;

import com.example.mall.dto.AdminLoginParam;
import com.example.mall.exception.ValidateFailedException;
import com.example.mall.model.UmsAdmin;
import com.example.mall.model.UmsMenu;
import com.example.mall.model.UmsRole;
import com.example.mall.service.UmsAdminService;
import com.example.mall.service.UmsRoleService;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/admin")
public class UmsAdminController {
    private UmsAdminService adminService;
    private UmsRoleService roleService;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Autowired
    public UmsAdminController(UmsAdminService adminService, UmsRoleService roleService) {
        this.adminService = adminService;
        this.roleService = roleService;
    }

    @PostMapping("/login")
    public Map<String, String> login(@Validated @RequestBody AdminLoginParam param) {
        String token = adminService.login(param.getUsername(), param.getPassword());
        if (token == null) {
            throw new ValidateFailedException("用户名或密码错误");
        } else {
            Map<String, String> map = new HashMap<>();
            map.put("token", token);
            map.put("tokenHead", tokenHead);
            return map;
        }
    }

    @GetMapping("/info")
    public Map<String, Object> info(Principal principal) {
        if (principal == null) {
            throw new ValidateFailedException("未登录");
        }
        String username = principal.getName();
        UmsAdmin admin = adminService.getAdminByUsername(username);
        if (admin == null) {
            throw new ValidateFailedException("用户不存在");
        }
        List<UmsMenu> menus = roleService.getMenuList(admin.getId());
        List<UmsRole> roles = adminService.getRoleList(admin.getId());
        List<String> roleNames = roles.stream().map(UmsRole::getName).toList();
        Map<String, Object> map = new HashMap<>();
        map.put("username", admin.getUsername());
        map.put("menus", menus);
        map.put("icon", admin.getIcon());
        map.put("roles", roleNames);
        return map;
    }

    @PostMapping("/logout")
    public void logout() {
        return;
    }
}

