package com.example.mall.service;

import com.example.mall.dto.PmsProductQueryParam;
import com.example.mall.mappers.PmsProductMapper;
import com.example.mall.model.PmsProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PmsProductService {
    private final PmsProductMapper pmsProductMapper;

    @Autowired
    public PmsProductService(PmsProductMapper pmsProductMapper) {
        this.pmsProductMapper = pmsProductMapper;
    }

    public List<PmsProduct> list(PmsProductQueryParam queryParam, Integer pageSize, Integer pageNum) {
        return pmsProductMapper.list(queryParam, pageSize, pageNum);
    }
}
