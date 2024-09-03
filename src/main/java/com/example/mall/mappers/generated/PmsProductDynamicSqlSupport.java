package com.example.mall.mappers.generated;

import jakarta.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;

public final class PmsProductDynamicSqlSupport {
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8937381+08:00", comments = "Source Table: pms_product")
    public static final PmsProduct pmsProduct = new PmsProduct();

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8937381+08:00", comments = "Source field: pms_product.id")
    public static final SqlColumn<Long> id = pmsProduct.id;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8937381+08:00", comments = "Source field: pms_product.brand_id")
    public static final SqlColumn<Long> brandId = pmsProduct.brandId;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8937381+08:00", comments = "Source field: pms_product.product_category_id")
    public static final SqlColumn<Long> productCategoryId = pmsProduct.productCategoryId;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8937381+08:00", comments = "Source field: pms_product.feight_template_id")
    public static final SqlColumn<Long> feightTemplateId = pmsProduct.feightTemplateId;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8937381+08:00", comments = "Source field: pms_product.product_attribute_category_id")
    public static final SqlColumn<Long> productAttributeCategoryId = pmsProduct.productAttributeCategoryId;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8937381+08:00", comments = "Source field: pms_product.name")
    public static final SqlColumn<String> name = pmsProduct.name;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8937381+08:00", comments = "Source field: pms_product.pic")
    public static final SqlColumn<String> pic = pmsProduct.pic;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8937381+08:00", comments = "Source field: pms_product.product_sn")
    public static final SqlColumn<String> productSn = pmsProduct.productSn;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8937381+08:00", comments = "Source field: pms_product.delete_status")
    public static final SqlColumn<Integer> deleteStatus = pmsProduct.deleteStatus;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8937381+08:00", comments = "Source field: pms_product.publish_status")
    public static final SqlColumn<Integer> publishStatus = pmsProduct.publishStatus;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8937381+08:00", comments = "Source field: pms_product.new_status")
    public static final SqlColumn<Integer> newStatus = pmsProduct.newStatus;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8947464+08:00", comments = "Source field: pms_product.recommend_status")
    public static final SqlColumn<Integer> recommendStatus = pmsProduct.recommendStatus;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8947464+08:00", comments = "Source field: pms_product.verify_status")
    public static final SqlColumn<Integer> verifyStatus = pmsProduct.verifyStatus;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8947464+08:00", comments = "Source field: pms_product.sort")
    public static final SqlColumn<Integer> sort = pmsProduct.sort;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8947464+08:00", comments = "Source field: pms_product.sale")
    public static final SqlColumn<Integer> sale = pmsProduct.sale;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8947464+08:00", comments = "Source field: pms_product.price")
    public static final SqlColumn<BigDecimal> price = pmsProduct.price;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8947464+08:00", comments = "Source field: pms_product.promotion_price")
    public static final SqlColumn<BigDecimal> promotionPrice = pmsProduct.promotionPrice;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8947464+08:00", comments = "Source field: pms_product.gift_growth")
    public static final SqlColumn<Integer> giftGrowth = pmsProduct.giftGrowth;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8947464+08:00", comments = "Source field: pms_product.gift_point")
    public static final SqlColumn<Integer> giftPoint = pmsProduct.giftPoint;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8947464+08:00", comments = "Source field: pms_product.use_point_limit")
    public static final SqlColumn<Integer> usePointLimit = pmsProduct.usePointLimit;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8947464+08:00", comments = "Source field: pms_product.sub_title")
    public static final SqlColumn<String> subTitle = pmsProduct.subTitle;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8947464+08:00", comments = "Source field: pms_product.original_price")
    public static final SqlColumn<BigDecimal> originalPrice = pmsProduct.originalPrice;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8947464+08:00", comments = "Source field: pms_product.stock")
    public static final SqlColumn<Integer> stock = pmsProduct.stock;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8947464+08:00", comments = "Source field: pms_product.low_stock")
    public static final SqlColumn<Integer> lowStock = pmsProduct.lowStock;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8947464+08:00", comments = "Source field: pms_product.unit")
    public static final SqlColumn<String> unit = pmsProduct.unit;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8947464+08:00", comments = "Source field: pms_product.weight")
    public static final SqlColumn<BigDecimal> weight = pmsProduct.weight;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8947464+08:00", comments = "Source field: pms_product.preview_status")
    public static final SqlColumn<Integer> previewStatus = pmsProduct.previewStatus;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8947464+08:00", comments = "Source field: pms_product.service_ids")
    public static final SqlColumn<String> serviceIds = pmsProduct.serviceIds;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8947464+08:00", comments = "Source field: pms_product.keywords")
    public static final SqlColumn<String> keywords = pmsProduct.keywords;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8947464+08:00", comments = "Source field: pms_product.note")
    public static final SqlColumn<String> note = pmsProduct.note;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8947464+08:00", comments = "Source field: pms_product.album_pics")
    public static final SqlColumn<String> albumPics = pmsProduct.albumPics;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8947464+08:00", comments = "Source field: pms_product.detail_title")
    public static final SqlColumn<String> detailTitle = pmsProduct.detailTitle;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8957588+08:00", comments = "Source field: pms_product.promotion_start_time")
    public static final SqlColumn<Date> promotionStartTime = pmsProduct.promotionStartTime;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8957588+08:00", comments = "Source field: pms_product.promotion_end_time")
    public static final SqlColumn<Date> promotionEndTime = pmsProduct.promotionEndTime;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8957588+08:00", comments = "Source field: pms_product.promotion_per_limit")
    public static final SqlColumn<Integer> promotionPerLimit = pmsProduct.promotionPerLimit;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8957588+08:00", comments = "Source field: pms_product.promotion_type")
    public static final SqlColumn<Integer> promotionType = pmsProduct.promotionType;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8957588+08:00", comments = "Source field: pms_product.brand_name")
    public static final SqlColumn<String> brandName = pmsProduct.brandName;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8957588+08:00", comments = "Source field: pms_product.product_category_name")
    public static final SqlColumn<String> productCategoryName = pmsProduct.productCategoryName;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8957588+08:00", comments = "Source field: pms_product.description")
    public static final SqlColumn<String> description = pmsProduct.description;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8957588+08:00", comments = "Source field: pms_product.detail_desc")
    public static final SqlColumn<String> detailDesc = pmsProduct.detailDesc;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8957588+08:00", comments = "Source field: pms_product.detail_html")
    public static final SqlColumn<String> detailHtml = pmsProduct.detailHtml;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8957588+08:00", comments = "Source field: pms_product.detail_mobile_html")
    public static final SqlColumn<String> detailMobileHtml = pmsProduct.detailMobileHtml;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8937381+08:00", comments = "Source Table: pms_product")
    public static final class PmsProduct extends AliasableSqlTable<PmsProduct> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> brandId = column("brand_id", JDBCType.BIGINT);

        public final SqlColumn<Long> productCategoryId = column("product_category_id", JDBCType.BIGINT);

        public final SqlColumn<Long> feightTemplateId = column("feight_template_id", JDBCType.BIGINT);

        public final SqlColumn<Long> productAttributeCategoryId = column("product_attribute_category_id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> pic = column("pic", JDBCType.VARCHAR);

        public final SqlColumn<String> productSn = column("product_sn", JDBCType.VARCHAR);

        public final SqlColumn<Integer> deleteStatus = column("delete_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> publishStatus = column("publish_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> newStatus = column("new_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> recommendStatus = column("recommend_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> verifyStatus = column("verify_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> sort = column("sort", JDBCType.INTEGER);

        public final SqlColumn<Integer> sale = column("sale", JDBCType.INTEGER);

        public final SqlColumn<BigDecimal> price = column("price", JDBCType.DECIMAL);

        public final SqlColumn<BigDecimal> promotionPrice = column("promotion_price", JDBCType.DECIMAL);

        public final SqlColumn<Integer> giftGrowth = column("gift_growth", JDBCType.INTEGER);

        public final SqlColumn<Integer> giftPoint = column("gift_point", JDBCType.INTEGER);

        public final SqlColumn<Integer> usePointLimit = column("use_point_limit", JDBCType.INTEGER);

        public final SqlColumn<String> subTitle = column("sub_title", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> originalPrice = column("original_price", JDBCType.DECIMAL);

        public final SqlColumn<Integer> stock = column("stock", JDBCType.INTEGER);

        public final SqlColumn<Integer> lowStock = column("low_stock", JDBCType.INTEGER);

        public final SqlColumn<String> unit = column("unit", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> weight = column("weight", JDBCType.DECIMAL);

        public final SqlColumn<Integer> previewStatus = column("preview_status", JDBCType.INTEGER);

        public final SqlColumn<String> serviceIds = column("service_ids", JDBCType.VARCHAR);

        public final SqlColumn<String> keywords = column("keywords", JDBCType.VARCHAR);

        public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);

        public final SqlColumn<String> albumPics = column("album_pics", JDBCType.VARCHAR);

        public final SqlColumn<String> detailTitle = column("detail_title", JDBCType.VARCHAR);

        public final SqlColumn<Date> promotionStartTime = column("promotion_start_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> promotionEndTime = column("promotion_end_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> promotionPerLimit = column("promotion_per_limit", JDBCType.INTEGER);

        public final SqlColumn<Integer> promotionType = column("promotion_type", JDBCType.INTEGER);

        public final SqlColumn<String> brandName = column("brand_name", JDBCType.VARCHAR);

        public final SqlColumn<String> productCategoryName = column("product_category_name", JDBCType.VARCHAR);

        public final SqlColumn<String> description = column("description", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> detailDesc = column("detail_desc", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> detailHtml = column("detail_html", JDBCType.LONGVARCHAR);

        public final SqlColumn<String> detailMobileHtml = column("detail_mobile_html", JDBCType.LONGVARCHAR);

        public PmsProduct() {
            super("pms_product", PmsProduct::new);
        }
    }
}