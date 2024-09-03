package com.example.mall.mappers;

import com.example.mall.dto.PmsProductQueryParam;
import com.example.mall.dto.PmsProductUpdateParam;
import com.example.mall.mappers.generated.GeneratedPmsProductMapper;
import com.example.mall.model.PmsProduct;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Objects;

import static com.example.mall.mappers.generated.PmsProductDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;


@Mapper
public interface PmsProductMapper extends GeneratedPmsProductMapper {
    default List<PmsProduct> list(PmsProductQueryParam queryParam, Integer pageSize, Integer pageNum) {
        String keywordSearch;

        if (StringUtils.isEmpty(queryParam.getKeyword())) {
            keywordSearch = null;
        } else {
            keywordSearch = "%" + queryParam.getKeyword() + "%";
        }
        return select(
                c -> c.configureStatement(stmt -> stmt.setNonRenderingWhereClauseAllowed(true))
                        .where(publishStatus, isEqualTo(queryParam.getPublishStatus()).filter(Objects::nonNull))
                        .or(verifyStatus, isEqualTo(queryParam.getVerifyStatus()).filter(Objects::nonNull))
                        .or(keywords, isLike(keywordSearch).filter(Objects::nonNull))
                        .or(productSn, isEqualTo(queryParam.getProductSn()).filter(StringUtils::isNotEmpty))
                        .or(productCategoryId, isEqualTo(queryParam.getProductCategoryId()).filter(Objects::nonNull))
                        .or(brandId, isEqualTo(queryParam.getBrandId()).filter(Objects::nonNull))
                        .and(deleteStatus, isEqualTo(0))
                        .limit(pageSize).offset((long) (pageNum - 1) * pageSize)
        );
    }

    default Long count(PmsProductQueryParam queryParam) {
        String keywordSearch;
        if (StringUtils.isEmpty(queryParam.getKeyword())) {
            keywordSearch = null;
        } else {
            keywordSearch = "%" + queryParam.getKeyword() + "%";
        }
        return count(c ->
                c.configureStatement(stmt -> stmt.setNonRenderingWhereClauseAllowed(true))
                        .where(publishStatus, isEqualTo(queryParam.getPublishStatus()).filter(Objects::nonNull))
                        .or(verifyStatus, isEqualTo(queryParam.getVerifyStatus()).filter(Objects::nonNull))
                        .or(keywords, isLike(keywordSearch).filter(Objects::nonNull))
                        .or(productSn, isEqualTo(queryParam.getProductSn()).filter(StringUtils::isNotEmpty))
                        .or(productCategoryId, isEqualTo(queryParam.getProductCategoryId()).filter(Objects::nonNull))
                        .and(deleteStatus, isEqualTo(0))
                        .or(brandId, isEqualTo(queryParam.getBrandId()).filter(Objects::nonNull))
        );
    }

    default Integer batchUpdate(List<Long> ids, PmsProductUpdateParam updateParam) {
        return update(
                c -> c.set(deleteStatus).equalToWhenPresent(updateParam.getDeleteStatus())
                        .set(publishStatus).equalToWhenPresent(updateParam.getPublishStatus())
                        .set(recommendStatus).equalToWhenPresent(updateParam.getRecommendStatus())
                        .set(newStatus).equalToWhenPresent(updateParam.getNewStatus())
                        .where(id, isIn(ids))
        );
    }
}
