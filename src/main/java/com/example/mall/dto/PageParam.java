package com.example.mall.dto;

import lombok.Data;

@Data
public class PageParam<T> {
    private Integer pageNum;
    private Integer pageSize;
    private T param;
}
