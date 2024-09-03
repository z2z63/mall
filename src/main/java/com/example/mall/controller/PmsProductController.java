package com.example.mall.controller;

import com.example.mall.dto.PmsProductQueryParam;
import com.example.mall.dto.PmsProductUpdateParam;
import com.example.mall.model.PmsProduct;
import com.example.mall.response.PageResult;
import com.example.mall.service.PmsProductService;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/product")
public class PmsProductController {
    private final PmsProductService productService;

    @Autowired
    public PmsProductController(PmsProductService productService) {
        this.productService = productService;
    }


    @GetMapping("/list")
    @Cacheable(value = "product-list", sync = true)
    public PageResult<PmsProduct> list(PmsProductQueryParam queryParam,
                                       @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                       @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        log.info("list method start");
        List<PmsProduct> list = productService.list(queryParam, pageSize, pageNum);
        Long count = productService.count(queryParam);
        return PageResult.<PmsProduct>builder()
                .list(list).pageNum(pageNum).pageSize(pageSize).total(count)
                .totalPage((int) Math.ceilDiv(count, pageSize)).build();
    }

    @PostMapping("/update/newStatus")
    public Integer updateNewStatus(@RequestParam("ids") List<Long> ids, @RequestParam("newStatus") Integer newStatus) {
        PmsProductUpdateParam updateParam = new PmsProductUpdateParam();
        updateParam.setNewStatus(newStatus);
        return productService.batchUpdate(ids, updateParam);
    }
    @SneakyThrows
    @PostMapping("/update/deleteStatus")
    @CacheEvict(value = "product-list", beforeInvocation = true, allEntries = true)
    public Integer updateDeleteStatus(@RequestParam("ids") List<Long> ids, @RequestParam("deleteStatus") Integer deleteStatus) {

        PmsProductUpdateParam updateParam = new PmsProductUpdateParam();
        updateParam.setDeleteStatus(deleteStatus);
        log.info("delete method start");
        return productService.batchUpdate(ids, updateParam);

    }

    @PostMapping("/update/recommendStatus")
    public Integer updateRecommendStatus(@RequestParam("ids") List<Long> ids, @RequestParam("recommendStatus") Integer recommendStatus) {
        PmsProductUpdateParam updateParam = new PmsProductUpdateParam();
        updateParam.setRecommendStatus(recommendStatus);
        return productService.batchUpdate(ids, updateParam);
    }


    @PostMapping("/update/publishStatus")
    @CacheEvict("product-list")
    public Integer updatePublishStatus(@RequestParam("ids") List<Long> ids, @RequestParam("publishStatus") Integer publishStatus) {

        PmsProductUpdateParam updateParam = new PmsProductUpdateParam();
        updateParam.setPublishStatus(publishStatus);
        return productService.batchUpdate(ids, updateParam);
    }
}
