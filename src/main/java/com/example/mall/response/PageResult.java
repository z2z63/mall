package com.example.mall.response;

import lombok.Data;

import java.util.List;

@Data
public class PageResult<T> {
    private Integer pageNum;
    private Integer pageSize;
    private Integer totalPage;
    private Long total;
    private List<T> list;
}
