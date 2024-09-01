package com.example.mall.controller;

import com.example.mall.dto.PmsProductQueryParam;
import com.example.mall.model.PmsProduct;
import com.example.mall.service.PmsProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/product")
public class PmsProductController {
    private final PmsProductService productService;

    @Autowired
    public PmsProductController(PmsProductService productService) {
        this.productService = productService;
    }


    @GetMapping("/list")
    public List<PmsProduct> list(PmsProductQueryParam queryParam,
                                 @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                 @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        return productService.list(queryParam, pageSize, pageNum);
    }
}
