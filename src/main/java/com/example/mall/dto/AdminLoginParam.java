package com.example.mall.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class AdminLoginParam {
    @NotEmpty
    private String username;
    @NotEmpty
    private String password;
}