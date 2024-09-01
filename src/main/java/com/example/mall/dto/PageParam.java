package com.example.mall.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class PageParam<T> {
    private Integer pageNum;
    private Integer pageSize;
    private T param;
}
