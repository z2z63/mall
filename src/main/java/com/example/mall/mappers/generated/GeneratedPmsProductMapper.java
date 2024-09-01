package com.example.mall.mappers.generated;

import static com.example.mall.mappers.generated.PmsProductDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.example.mall.model.PmsProduct;
import jakarta.annotation.Generated;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.CommonCountMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonDeleteMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonInsertMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonUpdateMapper;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface GeneratedPmsProductMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<PmsProduct>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.777483039+08:00", comments="Source Table: pms_product")
    BasicColumn[] selectList = BasicColumn.columnList(id, brandId, productCategoryId, feightTemplateId, productAttributeCategoryId, name, pic, productSn, deleteStatus, publishStatus, newStatus, recommendStatus, verifyStatus, sort, sale, price, promotionPrice, giftGrowth, giftPoint, usePointLimit, subTitle, originalPrice, stock, lowStock, unit, weight, previewStatus, serviceIds, keywords, note, albumPics, detailTitle, promotionStartTime, promotionEndTime, promotionPerLimit, promotionType, brandName, productCategoryName, description, detailDesc, detailHtml, detailMobileHtml);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.77680901+08:00", comments="Source Table: pms_product")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PmsProductResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="brand_id", property="brandId", jdbcType=JdbcType.BIGINT),
        @Result(column="product_category_id", property="productCategoryId", jdbcType=JdbcType.BIGINT),
        @Result(column="feight_template_id", property="feightTemplateId", jdbcType=JdbcType.BIGINT),
        @Result(column="product_attribute_category_id", property="productAttributeCategoryId", jdbcType=JdbcType.BIGINT),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="pic", property="pic", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_sn", property="productSn", jdbcType=JdbcType.VARCHAR),
        @Result(column="delete_status", property="deleteStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="publish_status", property="publishStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="new_status", property="newStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="recommend_status", property="recommendStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="verify_status", property="verifyStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER),
        @Result(column="sale", property="sale", jdbcType=JdbcType.INTEGER),
        @Result(column="price", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="promotion_price", property="promotionPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="gift_growth", property="giftGrowth", jdbcType=JdbcType.INTEGER),
        @Result(column="gift_point", property="giftPoint", jdbcType=JdbcType.INTEGER),
        @Result(column="use_point_limit", property="usePointLimit", jdbcType=JdbcType.INTEGER),
        @Result(column="sub_title", property="subTitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="original_price", property="originalPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="stock", property="stock", jdbcType=JdbcType.INTEGER),
        @Result(column="low_stock", property="lowStock", jdbcType=JdbcType.INTEGER),
        @Result(column="unit", property="unit", jdbcType=JdbcType.VARCHAR),
        @Result(column="weight", property="weight", jdbcType=JdbcType.DECIMAL),
        @Result(column="preview_status", property="previewStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="service_ids", property="serviceIds", jdbcType=JdbcType.VARCHAR),
        @Result(column="keywords", property="keywords", jdbcType=JdbcType.VARCHAR),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="album_pics", property="albumPics", jdbcType=JdbcType.VARCHAR),
        @Result(column="detail_title", property="detailTitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="promotion_start_time", property="promotionStartTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="promotion_end_time", property="promotionEndTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="promotion_per_limit", property="promotionPerLimit", jdbcType=JdbcType.INTEGER),
        @Result(column="promotion_type", property="promotionType", jdbcType=JdbcType.INTEGER),
        @Result(column="brand_name", property="brandName", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_category_name", property="productCategoryName", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="detail_desc", property="detailDesc", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="detail_html", property="detailHtml", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="detail_mobile_html", property="detailMobileHtml", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<PmsProduct> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.776966639+08:00", comments="Source Table: pms_product")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PmsProductResult")
    Optional<PmsProduct> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.777010779+08:00", comments="Source Table: pms_product")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, pmsProduct, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.777047445+08:00", comments="Source Table: pms_product")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, pmsProduct, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.777073705+08:00", comments="Source Table: pms_product")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.77710185+08:00", comments="Source Table: pms_product")
    default int insert(PmsProduct row) {
        return MyBatis3Utils.insert(this::insert, row, pmsProduct, c ->
            c.map(id).toProperty("id")
            .map(brandId).toProperty("brandId")
            .map(productCategoryId).toProperty("productCategoryId")
            .map(feightTemplateId).toProperty("feightTemplateId")
            .map(productAttributeCategoryId).toProperty("productAttributeCategoryId")
            .map(name).toProperty("name")
            .map(pic).toProperty("pic")
            .map(productSn).toProperty("productSn")
            .map(deleteStatus).toProperty("deleteStatus")
            .map(publishStatus).toProperty("publishStatus")
            .map(newStatus).toProperty("newStatus")
            .map(recommendStatus).toProperty("recommendStatus")
            .map(verifyStatus).toProperty("verifyStatus")
            .map(sort).toProperty("sort")
            .map(sale).toProperty("sale")
            .map(price).toProperty("price")
            .map(promotionPrice).toProperty("promotionPrice")
            .map(giftGrowth).toProperty("giftGrowth")
            .map(giftPoint).toProperty("giftPoint")
            .map(usePointLimit).toProperty("usePointLimit")
            .map(subTitle).toProperty("subTitle")
            .map(originalPrice).toProperty("originalPrice")
            .map(stock).toProperty("stock")
            .map(lowStock).toProperty("lowStock")
            .map(unit).toProperty("unit")
            .map(weight).toProperty("weight")
            .map(previewStatus).toProperty("previewStatus")
            .map(serviceIds).toProperty("serviceIds")
            .map(keywords).toProperty("keywords")
            .map(note).toProperty("note")
            .map(albumPics).toProperty("albumPics")
            .map(detailTitle).toProperty("detailTitle")
            .map(promotionStartTime).toProperty("promotionStartTime")
            .map(promotionEndTime).toProperty("promotionEndTime")
            .map(promotionPerLimit).toProperty("promotionPerLimit")
            .map(promotionType).toProperty("promotionType")
            .map(brandName).toProperty("brandName")
            .map(productCategoryName).toProperty("productCategoryName")
            .map(description).toProperty("description")
            .map(detailDesc).toProperty("detailDesc")
            .map(detailHtml).toProperty("detailHtml")
            .map(detailMobileHtml).toProperty("detailMobileHtml")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.777202839+08:00", comments="Source Table: pms_product")
    default int insertMultiple(Collection<PmsProduct> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, pmsProduct, c ->
            c.map(id).toProperty("id")
            .map(brandId).toProperty("brandId")
            .map(productCategoryId).toProperty("productCategoryId")
            .map(feightTemplateId).toProperty("feightTemplateId")
            .map(productAttributeCategoryId).toProperty("productAttributeCategoryId")
            .map(name).toProperty("name")
            .map(pic).toProperty("pic")
            .map(productSn).toProperty("productSn")
            .map(deleteStatus).toProperty("deleteStatus")
            .map(publishStatus).toProperty("publishStatus")
            .map(newStatus).toProperty("newStatus")
            .map(recommendStatus).toProperty("recommendStatus")
            .map(verifyStatus).toProperty("verifyStatus")
            .map(sort).toProperty("sort")
            .map(sale).toProperty("sale")
            .map(price).toProperty("price")
            .map(promotionPrice).toProperty("promotionPrice")
            .map(giftGrowth).toProperty("giftGrowth")
            .map(giftPoint).toProperty("giftPoint")
            .map(usePointLimit).toProperty("usePointLimit")
            .map(subTitle).toProperty("subTitle")
            .map(originalPrice).toProperty("originalPrice")
            .map(stock).toProperty("stock")
            .map(lowStock).toProperty("lowStock")
            .map(unit).toProperty("unit")
            .map(weight).toProperty("weight")
            .map(previewStatus).toProperty("previewStatus")
            .map(serviceIds).toProperty("serviceIds")
            .map(keywords).toProperty("keywords")
            .map(note).toProperty("note")
            .map(albumPics).toProperty("albumPics")
            .map(detailTitle).toProperty("detailTitle")
            .map(promotionStartTime).toProperty("promotionStartTime")
            .map(promotionEndTime).toProperty("promotionEndTime")
            .map(promotionPerLimit).toProperty("promotionPerLimit")
            .map(promotionType).toProperty("promotionType")
            .map(brandName).toProperty("brandName")
            .map(productCategoryName).toProperty("productCategoryName")
            .map(description).toProperty("description")
            .map(detailDesc).toProperty("detailDesc")
            .map(detailHtml).toProperty("detailHtml")
            .map(detailMobileHtml).toProperty("detailMobileHtml")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.777305016+08:00", comments="Source Table: pms_product")
    default int insertSelective(PmsProduct row) {
        return MyBatis3Utils.insert(this::insert, row, pmsProduct, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(brandId).toPropertyWhenPresent("brandId", row::getBrandId)
            .map(productCategoryId).toPropertyWhenPresent("productCategoryId", row::getProductCategoryId)
            .map(feightTemplateId).toPropertyWhenPresent("feightTemplateId", row::getFeightTemplateId)
            .map(productAttributeCategoryId).toPropertyWhenPresent("productAttributeCategoryId", row::getProductAttributeCategoryId)
            .map(name).toPropertyWhenPresent("name", row::getName)
            .map(pic).toPropertyWhenPresent("pic", row::getPic)
            .map(productSn).toPropertyWhenPresent("productSn", row::getProductSn)
            .map(deleteStatus).toPropertyWhenPresent("deleteStatus", row::getDeleteStatus)
            .map(publishStatus).toPropertyWhenPresent("publishStatus", row::getPublishStatus)
            .map(newStatus).toPropertyWhenPresent("newStatus", row::getNewStatus)
            .map(recommendStatus).toPropertyWhenPresent("recommendStatus", row::getRecommendStatus)
            .map(verifyStatus).toPropertyWhenPresent("verifyStatus", row::getVerifyStatus)
            .map(sort).toPropertyWhenPresent("sort", row::getSort)
            .map(sale).toPropertyWhenPresent("sale", row::getSale)
            .map(price).toPropertyWhenPresent("price", row::getPrice)
            .map(promotionPrice).toPropertyWhenPresent("promotionPrice", row::getPromotionPrice)
            .map(giftGrowth).toPropertyWhenPresent("giftGrowth", row::getGiftGrowth)
            .map(giftPoint).toPropertyWhenPresent("giftPoint", row::getGiftPoint)
            .map(usePointLimit).toPropertyWhenPresent("usePointLimit", row::getUsePointLimit)
            .map(subTitle).toPropertyWhenPresent("subTitle", row::getSubTitle)
            .map(originalPrice).toPropertyWhenPresent("originalPrice", row::getOriginalPrice)
            .map(stock).toPropertyWhenPresent("stock", row::getStock)
            .map(lowStock).toPropertyWhenPresent("lowStock", row::getLowStock)
            .map(unit).toPropertyWhenPresent("unit", row::getUnit)
            .map(weight).toPropertyWhenPresent("weight", row::getWeight)
            .map(previewStatus).toPropertyWhenPresent("previewStatus", row::getPreviewStatus)
            .map(serviceIds).toPropertyWhenPresent("serviceIds", row::getServiceIds)
            .map(keywords).toPropertyWhenPresent("keywords", row::getKeywords)
            .map(note).toPropertyWhenPresent("note", row::getNote)
            .map(albumPics).toPropertyWhenPresent("albumPics", row::getAlbumPics)
            .map(detailTitle).toPropertyWhenPresent("detailTitle", row::getDetailTitle)
            .map(promotionStartTime).toPropertyWhenPresent("promotionStartTime", row::getPromotionStartTime)
            .map(promotionEndTime).toPropertyWhenPresent("promotionEndTime", row::getPromotionEndTime)
            .map(promotionPerLimit).toPropertyWhenPresent("promotionPerLimit", row::getPromotionPerLimit)
            .map(promotionType).toPropertyWhenPresent("promotionType", row::getPromotionType)
            .map(brandName).toPropertyWhenPresent("brandName", row::getBrandName)
            .map(productCategoryName).toPropertyWhenPresent("productCategoryName", row::getProductCategoryName)
            .map(description).toPropertyWhenPresent("description", row::getDescription)
            .map(detailDesc).toPropertyWhenPresent("detailDesc", row::getDetailDesc)
            .map(detailHtml).toPropertyWhenPresent("detailHtml", row::getDetailHtml)
            .map(detailMobileHtml).toPropertyWhenPresent("detailMobileHtml", row::getDetailMobileHtml)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.777514397+08:00", comments="Source Table: pms_product")
    default Optional<PmsProduct> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, pmsProduct, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.777557698+08:00", comments="Source Table: pms_product")
    default List<PmsProduct> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, pmsProduct, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.77758298+08:00", comments="Source Table: pms_product")
    default List<PmsProduct> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, pmsProduct, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.777607843+08:00", comments="Source Table: pms_product")
    default Optional<PmsProduct> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.777636478+08:00", comments="Source Table: pms_product")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, pmsProduct, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.777667417+08:00", comments="Source Table: pms_product")
    static UpdateDSL<UpdateModel> updateAllColumns(PmsProduct row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(brandId).equalTo(row::getBrandId)
                .set(productCategoryId).equalTo(row::getProductCategoryId)
                .set(feightTemplateId).equalTo(row::getFeightTemplateId)
                .set(productAttributeCategoryId).equalTo(row::getProductAttributeCategoryId)
                .set(name).equalTo(row::getName)
                .set(pic).equalTo(row::getPic)
                .set(productSn).equalTo(row::getProductSn)
                .set(deleteStatus).equalTo(row::getDeleteStatus)
                .set(publishStatus).equalTo(row::getPublishStatus)
                .set(newStatus).equalTo(row::getNewStatus)
                .set(recommendStatus).equalTo(row::getRecommendStatus)
                .set(verifyStatus).equalTo(row::getVerifyStatus)
                .set(sort).equalTo(row::getSort)
                .set(sale).equalTo(row::getSale)
                .set(price).equalTo(row::getPrice)
                .set(promotionPrice).equalTo(row::getPromotionPrice)
                .set(giftGrowth).equalTo(row::getGiftGrowth)
                .set(giftPoint).equalTo(row::getGiftPoint)
                .set(usePointLimit).equalTo(row::getUsePointLimit)
                .set(subTitle).equalTo(row::getSubTitle)
                .set(originalPrice).equalTo(row::getOriginalPrice)
                .set(stock).equalTo(row::getStock)
                .set(lowStock).equalTo(row::getLowStock)
                .set(unit).equalTo(row::getUnit)
                .set(weight).equalTo(row::getWeight)
                .set(previewStatus).equalTo(row::getPreviewStatus)
                .set(serviceIds).equalTo(row::getServiceIds)
                .set(keywords).equalTo(row::getKeywords)
                .set(note).equalTo(row::getNote)
                .set(albumPics).equalTo(row::getAlbumPics)
                .set(detailTitle).equalTo(row::getDetailTitle)
                .set(promotionStartTime).equalTo(row::getPromotionStartTime)
                .set(promotionEndTime).equalTo(row::getPromotionEndTime)
                .set(promotionPerLimit).equalTo(row::getPromotionPerLimit)
                .set(promotionType).equalTo(row::getPromotionType)
                .set(brandName).equalTo(row::getBrandName)
                .set(productCategoryName).equalTo(row::getProductCategoryName)
                .set(description).equalTo(row::getDescription)
                .set(detailDesc).equalTo(row::getDetailDesc)
                .set(detailHtml).equalTo(row::getDetailHtml)
                .set(detailMobileHtml).equalTo(row::getDetailMobileHtml);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.777777765+08:00", comments="Source Table: pms_product")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(PmsProduct row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(brandId).equalToWhenPresent(row::getBrandId)
                .set(productCategoryId).equalToWhenPresent(row::getProductCategoryId)
                .set(feightTemplateId).equalToWhenPresent(row::getFeightTemplateId)
                .set(productAttributeCategoryId).equalToWhenPresent(row::getProductAttributeCategoryId)
                .set(name).equalToWhenPresent(row::getName)
                .set(pic).equalToWhenPresent(row::getPic)
                .set(productSn).equalToWhenPresent(row::getProductSn)
                .set(deleteStatus).equalToWhenPresent(row::getDeleteStatus)
                .set(publishStatus).equalToWhenPresent(row::getPublishStatus)
                .set(newStatus).equalToWhenPresent(row::getNewStatus)
                .set(recommendStatus).equalToWhenPresent(row::getRecommendStatus)
                .set(verifyStatus).equalToWhenPresent(row::getVerifyStatus)
                .set(sort).equalToWhenPresent(row::getSort)
                .set(sale).equalToWhenPresent(row::getSale)
                .set(price).equalToWhenPresent(row::getPrice)
                .set(promotionPrice).equalToWhenPresent(row::getPromotionPrice)
                .set(giftGrowth).equalToWhenPresent(row::getGiftGrowth)
                .set(giftPoint).equalToWhenPresent(row::getGiftPoint)
                .set(usePointLimit).equalToWhenPresent(row::getUsePointLimit)
                .set(subTitle).equalToWhenPresent(row::getSubTitle)
                .set(originalPrice).equalToWhenPresent(row::getOriginalPrice)
                .set(stock).equalToWhenPresent(row::getStock)
                .set(lowStock).equalToWhenPresent(row::getLowStock)
                .set(unit).equalToWhenPresent(row::getUnit)
                .set(weight).equalToWhenPresent(row::getWeight)
                .set(previewStatus).equalToWhenPresent(row::getPreviewStatus)
                .set(serviceIds).equalToWhenPresent(row::getServiceIds)
                .set(keywords).equalToWhenPresent(row::getKeywords)
                .set(note).equalToWhenPresent(row::getNote)
                .set(albumPics).equalToWhenPresent(row::getAlbumPics)
                .set(detailTitle).equalToWhenPresent(row::getDetailTitle)
                .set(promotionStartTime).equalToWhenPresent(row::getPromotionStartTime)
                .set(promotionEndTime).equalToWhenPresent(row::getPromotionEndTime)
                .set(promotionPerLimit).equalToWhenPresent(row::getPromotionPerLimit)
                .set(promotionType).equalToWhenPresent(row::getPromotionType)
                .set(brandName).equalToWhenPresent(row::getBrandName)
                .set(productCategoryName).equalToWhenPresent(row::getProductCategoryName)
                .set(description).equalToWhenPresent(row::getDescription)
                .set(detailDesc).equalToWhenPresent(row::getDetailDesc)
                .set(detailHtml).equalToWhenPresent(row::getDetailHtml)
                .set(detailMobileHtml).equalToWhenPresent(row::getDetailMobileHtml);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.77789789+08:00", comments="Source Table: pms_product")
    default int updateByPrimaryKey(PmsProduct row) {
        return update(c ->
            c.set(brandId).equalTo(row::getBrandId)
            .set(productCategoryId).equalTo(row::getProductCategoryId)
            .set(feightTemplateId).equalTo(row::getFeightTemplateId)
            .set(productAttributeCategoryId).equalTo(row::getProductAttributeCategoryId)
            .set(name).equalTo(row::getName)
            .set(pic).equalTo(row::getPic)
            .set(productSn).equalTo(row::getProductSn)
            .set(deleteStatus).equalTo(row::getDeleteStatus)
            .set(publishStatus).equalTo(row::getPublishStatus)
            .set(newStatus).equalTo(row::getNewStatus)
            .set(recommendStatus).equalTo(row::getRecommendStatus)
            .set(verifyStatus).equalTo(row::getVerifyStatus)
            .set(sort).equalTo(row::getSort)
            .set(sale).equalTo(row::getSale)
            .set(price).equalTo(row::getPrice)
            .set(promotionPrice).equalTo(row::getPromotionPrice)
            .set(giftGrowth).equalTo(row::getGiftGrowth)
            .set(giftPoint).equalTo(row::getGiftPoint)
            .set(usePointLimit).equalTo(row::getUsePointLimit)
            .set(subTitle).equalTo(row::getSubTitle)
            .set(originalPrice).equalTo(row::getOriginalPrice)
            .set(stock).equalTo(row::getStock)
            .set(lowStock).equalTo(row::getLowStock)
            .set(unit).equalTo(row::getUnit)
            .set(weight).equalTo(row::getWeight)
            .set(previewStatus).equalTo(row::getPreviewStatus)
            .set(serviceIds).equalTo(row::getServiceIds)
            .set(keywords).equalTo(row::getKeywords)
            .set(note).equalTo(row::getNote)
            .set(albumPics).equalTo(row::getAlbumPics)
            .set(detailTitle).equalTo(row::getDetailTitle)
            .set(promotionStartTime).equalTo(row::getPromotionStartTime)
            .set(promotionEndTime).equalTo(row::getPromotionEndTime)
            .set(promotionPerLimit).equalTo(row::getPromotionPerLimit)
            .set(promotionType).equalTo(row::getPromotionType)
            .set(brandName).equalTo(row::getBrandName)
            .set(productCategoryName).equalTo(row::getProductCategoryName)
            .set(description).equalTo(row::getDescription)
            .set(detailDesc).equalTo(row::getDetailDesc)
            .set(detailHtml).equalTo(row::getDetailHtml)
            .set(detailMobileHtml).equalTo(row::getDetailMobileHtml)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.778013057+08:00", comments="Source Table: pms_product")
    default int updateByPrimaryKeySelective(PmsProduct row) {
        return update(c ->
            c.set(brandId).equalToWhenPresent(row::getBrandId)
            .set(productCategoryId).equalToWhenPresent(row::getProductCategoryId)
            .set(feightTemplateId).equalToWhenPresent(row::getFeightTemplateId)
            .set(productAttributeCategoryId).equalToWhenPresent(row::getProductAttributeCategoryId)
            .set(name).equalToWhenPresent(row::getName)
            .set(pic).equalToWhenPresent(row::getPic)
            .set(productSn).equalToWhenPresent(row::getProductSn)
            .set(deleteStatus).equalToWhenPresent(row::getDeleteStatus)
            .set(publishStatus).equalToWhenPresent(row::getPublishStatus)
            .set(newStatus).equalToWhenPresent(row::getNewStatus)
            .set(recommendStatus).equalToWhenPresent(row::getRecommendStatus)
            .set(verifyStatus).equalToWhenPresent(row::getVerifyStatus)
            .set(sort).equalToWhenPresent(row::getSort)
            .set(sale).equalToWhenPresent(row::getSale)
            .set(price).equalToWhenPresent(row::getPrice)
            .set(promotionPrice).equalToWhenPresent(row::getPromotionPrice)
            .set(giftGrowth).equalToWhenPresent(row::getGiftGrowth)
            .set(giftPoint).equalToWhenPresent(row::getGiftPoint)
            .set(usePointLimit).equalToWhenPresent(row::getUsePointLimit)
            .set(subTitle).equalToWhenPresent(row::getSubTitle)
            .set(originalPrice).equalToWhenPresent(row::getOriginalPrice)
            .set(stock).equalToWhenPresent(row::getStock)
            .set(lowStock).equalToWhenPresent(row::getLowStock)
            .set(unit).equalToWhenPresent(row::getUnit)
            .set(weight).equalToWhenPresent(row::getWeight)
            .set(previewStatus).equalToWhenPresent(row::getPreviewStatus)
            .set(serviceIds).equalToWhenPresent(row::getServiceIds)
            .set(keywords).equalToWhenPresent(row::getKeywords)
            .set(note).equalToWhenPresent(row::getNote)
            .set(albumPics).equalToWhenPresent(row::getAlbumPics)
            .set(detailTitle).equalToWhenPresent(row::getDetailTitle)
            .set(promotionStartTime).equalToWhenPresent(row::getPromotionStartTime)
            .set(promotionEndTime).equalToWhenPresent(row::getPromotionEndTime)
            .set(promotionPerLimit).equalToWhenPresent(row::getPromotionPerLimit)
            .set(promotionType).equalToWhenPresent(row::getPromotionType)
            .set(brandName).equalToWhenPresent(row::getBrandName)
            .set(productCategoryName).equalToWhenPresent(row::getProductCategoryName)
            .set(description).equalToWhenPresent(row::getDescription)
            .set(detailDesc).equalToWhenPresent(row::getDetailDesc)
            .set(detailHtml).equalToWhenPresent(row::getDetailHtml)
            .set(detailMobileHtml).equalToWhenPresent(row::getDetailMobileHtml)
            .where(id, isEqualTo(row::getId))
        );
    }
}