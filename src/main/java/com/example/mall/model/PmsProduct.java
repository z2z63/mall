package com.example.mall.model;

import jakarta.annotation.Generated;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PmsProduct implements Serializable {
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8912294+08:00", comments = "Source field: pms_product.id")
    private Long id;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8912294+08:00", comments = "Source field: pms_product.brand_id")
    private Long brandId;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8912294+08:00", comments = "Source field: pms_product.product_category_id")
    private Long productCategoryId;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8912294+08:00", comments = "Source field: pms_product.feight_template_id")
    private Long feightTemplateId;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8912294+08:00", comments = "Source field: pms_product.product_attribute_category_id")
    private Long productAttributeCategoryId;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8912294+08:00", comments = "Source field: pms_product.name")
    private String name;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8912294+08:00", comments = "Source field: pms_product.pic")
    private String pic;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8912294+08:00", comments = "Source field: pms_product.product_sn")
    private String productSn;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8912294+08:00", comments = "Source field: pms_product.delete_status")
    private Integer deleteStatus;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8912294+08:00", comments = "Source field: pms_product.publish_status")
    private Integer publishStatus;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8912294+08:00", comments = "Source field: pms_product.new_status")
    private Integer newStatus;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8912294+08:00", comments = "Source field: pms_product.recommend_status")
    private Integer recommendStatus;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8912294+08:00", comments = "Source field: pms_product.verify_status")
    private Integer verifyStatus;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.sort")
    private Integer sort;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.sale")
    private Integer sale;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.price")
    private BigDecimal price;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.promotion_price")
    private BigDecimal promotionPrice;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.gift_growth")
    private Integer giftGrowth;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.gift_point")
    private Integer giftPoint;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.use_point_limit")
    private Integer usePointLimit;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.sub_title")
    private String subTitle;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.original_price")
    private BigDecimal originalPrice;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.stock")
    private Integer stock;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.low_stock")
    private Integer lowStock;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.unit")
    private String unit;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.weight")
    private BigDecimal weight;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.preview_status")
    private Integer previewStatus;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.service_ids")
    private String serviceIds;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.keywords")
    private String keywords;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.note")
    private String note;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.album_pics")
    private String albumPics;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.detail_title")
    private String detailTitle;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.promotion_start_time")
    private Date promotionStartTime;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.promotion_end_time")
    private Date promotionEndTime;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.promotion_per_limit")
    private Integer promotionPerLimit;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.promotion_type")
    private Integer promotionType;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.brand_name")
    private String brandName;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.product_category_name")
    private String productCategoryName;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8937381+08:00", comments = "Source field: pms_product.description")
    private String description;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8937381+08:00", comments = "Source field: pms_product.detail_desc")
    private String detailDesc;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8937381+08:00", comments = "Source field: pms_product.detail_html")
    private String detailHtml;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8937381+08:00", comments = "Source field: pms_product.detail_mobile_html")
    private String detailMobileHtml;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8937381+08:00", comments = "Source Table: pms_product")
    private static final long serialVersionUID = 1L;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8912294+08:00", comments = "Source field: pms_product.id")
    public Long getId() {
        return id;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8912294+08:00", comments = "Source field: pms_product.id")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8912294+08:00", comments = "Source field: pms_product.brand_id")
    public Long getBrandId() {
        return brandId;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8912294+08:00", comments = "Source field: pms_product.brand_id")
    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8912294+08:00", comments = "Source field: pms_product.product_category_id")
    public Long getProductCategoryId() {
        return productCategoryId;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8912294+08:00", comments = "Source field: pms_product.product_category_id")
    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8912294+08:00", comments = "Source field: pms_product.feight_template_id")
    public Long getFeightTemplateId() {
        return feightTemplateId;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8912294+08:00", comments = "Source field: pms_product.feight_template_id")
    public void setFeightTemplateId(Long feightTemplateId) {
        this.feightTemplateId = feightTemplateId;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8912294+08:00", comments = "Source field: pms_product.product_attribute_category_id")
    public Long getProductAttributeCategoryId() {
        return productAttributeCategoryId;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8912294+08:00", comments = "Source field: pms_product.product_attribute_category_id")
    public void setProductAttributeCategoryId(Long productAttributeCategoryId) {
        this.productAttributeCategoryId = productAttributeCategoryId;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8912294+08:00", comments = "Source field: pms_product.name")
    public String getName() {
        return name;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8912294+08:00", comments = "Source field: pms_product.name")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8912294+08:00", comments = "Source field: pms_product.pic")
    public String getPic() {
        return pic;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8912294+08:00", comments = "Source field: pms_product.pic")
    public void setPic(String pic) {
        this.pic = pic;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8912294+08:00", comments = "Source field: pms_product.product_sn")
    public String getProductSn() {
        return productSn;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8912294+08:00", comments = "Source field: pms_product.product_sn")
    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8912294+08:00", comments = "Source field: pms_product.delete_status")
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8912294+08:00", comments = "Source field: pms_product.delete_status")
    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8912294+08:00", comments = "Source field: pms_product.publish_status")
    public Integer getPublishStatus() {
        return publishStatus;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8912294+08:00", comments = "Source field: pms_product.publish_status")
    public void setPublishStatus(Integer publishStatus) {
        this.publishStatus = publishStatus;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8912294+08:00", comments = "Source field: pms_product.new_status")
    public Integer getNewStatus() {
        return newStatus;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8912294+08:00", comments = "Source field: pms_product.new_status")
    public void setNewStatus(Integer newStatus) {
        this.newStatus = newStatus;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8912294+08:00", comments = "Source field: pms_product.recommend_status")
    public Integer getRecommendStatus() {
        return recommendStatus;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8912294+08:00", comments = "Source field: pms_product.recommend_status")
    public void setRecommendStatus(Integer recommendStatus) {
        this.recommendStatus = recommendStatus;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.verify_status")
    public Integer getVerifyStatus() {
        return verifyStatus;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.verify_status")
    public void setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.sort")
    public Integer getSort() {
        return sort;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.sort")
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.sale")
    public Integer getSale() {
        return sale;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.sale")
    public void setSale(Integer sale) {
        this.sale = sale;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.price")
    public BigDecimal getPrice() {
        return price;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.price")
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.promotion_price")
    public BigDecimal getPromotionPrice() {
        return promotionPrice;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.promotion_price")
    public void setPromotionPrice(BigDecimal promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.gift_growth")
    public Integer getGiftGrowth() {
        return giftGrowth;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.gift_growth")
    public void setGiftGrowth(Integer giftGrowth) {
        this.giftGrowth = giftGrowth;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.gift_point")
    public Integer getGiftPoint() {
        return giftPoint;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.gift_point")
    public void setGiftPoint(Integer giftPoint) {
        this.giftPoint = giftPoint;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.use_point_limit")
    public Integer getUsePointLimit() {
        return usePointLimit;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.use_point_limit")
    public void setUsePointLimit(Integer usePointLimit) {
        this.usePointLimit = usePointLimit;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.sub_title")
    public String getSubTitle() {
        return subTitle;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.sub_title")
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.original_price")
    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.original_price")
    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.stock")
    public Integer getStock() {
        return stock;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.stock")
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.low_stock")
    public Integer getLowStock() {
        return lowStock;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.low_stock")
    public void setLowStock(Integer lowStock) {
        this.lowStock = lowStock;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.unit")
    public String getUnit() {
        return unit;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.unit")
    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.weight")
    public BigDecimal getWeight() {
        return weight;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.weight")
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.preview_status")
    public Integer getPreviewStatus() {
        return previewStatus;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.preview_status")
    public void setPreviewStatus(Integer previewStatus) {
        this.previewStatus = previewStatus;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.service_ids")
    public String getServiceIds() {
        return serviceIds;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.service_ids")
    public void setServiceIds(String serviceIds) {
        this.serviceIds = serviceIds;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.keywords")
    public String getKeywords() {
        return keywords;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.keywords")
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.note")
    public String getNote() {
        return note;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.note")
    public void setNote(String note) {
        this.note = note;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.album_pics")
    public String getAlbumPics() {
        return albumPics;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.album_pics")
    public void setAlbumPics(String albumPics) {
        this.albumPics = albumPics;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.detail_title")
    public String getDetailTitle() {
        return detailTitle;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.detail_title")
    public void setDetailTitle(String detailTitle) {
        this.detailTitle = detailTitle;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.promotion_start_time")
    public Date getPromotionStartTime() {
        return promotionStartTime;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.promotion_start_time")
    public void setPromotionStartTime(Date promotionStartTime) {
        this.promotionStartTime = promotionStartTime;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.promotion_end_time")
    public Date getPromotionEndTime() {
        return promotionEndTime;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.promotion_end_time")
    public void setPromotionEndTime(Date promotionEndTime) {
        this.promotionEndTime = promotionEndTime;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.promotion_per_limit")
    public Integer getPromotionPerLimit() {
        return promotionPerLimit;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.promotion_per_limit")
    public void setPromotionPerLimit(Integer promotionPerLimit) {
        this.promotionPerLimit = promotionPerLimit;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.promotion_type")
    public Integer getPromotionType() {
        return promotionType;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.promotion_type")
    public void setPromotionType(Integer promotionType) {
        this.promotionType = promotionType;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.brand_name")
    public String getBrandName() {
        return brandName;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.brand_name")
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8922297+08:00", comments = "Source field: pms_product.product_category_name")
    public String getProductCategoryName() {
        return productCategoryName;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8937381+08:00", comments = "Source field: pms_product.product_category_name")
    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8937381+08:00", comments = "Source field: pms_product.description")
    public String getDescription() {
        return description;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8937381+08:00", comments = "Source field: pms_product.description")
    public void setDescription(String description) {
        this.description = description;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8937381+08:00", comments = "Source field: pms_product.detail_desc")
    public String getDetailDesc() {
        return detailDesc;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8937381+08:00", comments = "Source field: pms_product.detail_desc")
    public void setDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8937381+08:00", comments = "Source field: pms_product.detail_html")
    public String getDetailHtml() {
        return detailHtml;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8937381+08:00", comments = "Source field: pms_product.detail_html")
    public void setDetailHtml(String detailHtml) {
        this.detailHtml = detailHtml;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8937381+08:00", comments = "Source field: pms_product.detail_mobile_html")
    public String getDetailMobileHtml() {
        return detailMobileHtml;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8937381+08:00", comments = "Source field: pms_product.detail_mobile_html")
    public void setDetailMobileHtml(String detailMobileHtml) {
        this.detailMobileHtml = detailMobileHtml;
    }
}