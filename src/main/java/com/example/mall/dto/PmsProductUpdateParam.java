package com.example.mall.dto;

import lombok.Data;

@Data
public class PmsProductUpdateParam {
    private Integer deleteStatus;
    private Integer publishStatus;
    private Integer recommendStatus;
    private Integer newStatus;
}
