package com.example.mall.controller;

import com.example.mall.dto.AdminLoginParam;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/admin")
public class UmsAdminController {
    @PostMapping("/login")
    public Object login(@Validated AdminLoginParam param) {
        return null;
    }
}

