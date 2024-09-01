package com.example.mall.mappers;

import com.example.mall.dto.PmsProductQueryParam;
import com.example.mall.mappers.generated.GeneratedPmsProductMapper;
import com.example.mall.model.PmsProduct;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.dynamic.sql.where.AbstractWhereStarter;


import java.util.List;

import static com.example.mall.mappers.generated.PmsProductDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;
import static org.mybatis.dynamic.sql.SqlBuilder.isLike;


@Mapper
public interface PmsProductMapper extends GeneratedPmsProductMapper {
    default List<PmsProduct> list(PmsProductQueryParam queryParam, Integer pageSize, Integer pageNum) {
        return select(c -> {
            var whereBuilder = c.where();
            if (queryParam.getPublishStatus() != null) {
                whereBuilder.or(publishStatus, isEqualTo(queryParam.getPublishStatus()));
            }
            if (queryParam.getVerifyStatus() != null) {
                whereBuilder.or(verifyStatus, isEqualTo(queryParam.getVerifyStatus()));
            }
            if (queryParam.getKeyword() != null) {
                whereBuilder.or(keywords, isLike("%" + queryParam.getKeyword() + "%"));
            }
            if (queryParam.getProductSn() != null) {
                whereBuilder.or(productSn, isEqualTo(queryParam.getProductSn()));
            }
            if (queryParam.getProductCategoryId() != null) {
                whereBuilder.or(productCategoryId, isEqualTo(queryParam.getProductCategoryId()));
            }
            if (queryParam.getBrandId() != null) {
                whereBuilder.or(brandId, isEqualTo(queryParam.getBrandId()));
            }
            return whereBuilder.limit(pageSize).offset((long) (pageNum - 1) * pageSize);
        });
    }
}
