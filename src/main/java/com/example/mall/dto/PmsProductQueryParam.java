package com.example.mall.dto;

import lombok.Data;

@Data
public class PmsProductQueryParam {

    private Integer publishStatus;

    private Integer verifyStatus;

    private String keyword;

    private String productSn;

    private Long productCategoryId;

    private Long brandId;
}
