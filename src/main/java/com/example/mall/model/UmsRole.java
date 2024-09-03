package com.example.mall.model;

import jakarta.annotation.Generated;

import java.io.Serializable;
import java.util.Date;

public class UmsRole implements Serializable {
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8862471+08:00", comments = "Source field: ums_role.id")
    private Long id;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8862471+08:00", comments = "Source field: ums_role.name")
    private String name;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8862471+08:00", comments = "Source field: ums_role.description")
    private String description;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8862471+08:00", comments = "Source field: ums_role.admin_count")
    private Integer adminCount;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8862471+08:00", comments = "Source field: ums_role.create_time")
    private Date createTime;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8872357+08:00", comments = "Source field: ums_role.status")
    private Integer status;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8872357+08:00", comments = "Source field: ums_role.sort")
    private Integer sort;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8872357+08:00", comments = "Source Table: ums_role")
    private static final long serialVersionUID = 1L;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8862471+08:00", comments = "Source field: ums_role.id")
    public Long getId() {
        return id;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8862471+08:00", comments = "Source field: ums_role.id")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8862471+08:00", comments = "Source field: ums_role.name")
    public String getName() {
        return name;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8862471+08:00", comments = "Source field: ums_role.name")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8862471+08:00", comments = "Source field: ums_role.description")
    public String getDescription() {
        return description;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8862471+08:00", comments = "Source field: ums_role.description")
    public void setDescription(String description) {
        this.description = description;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8862471+08:00", comments = "Source field: ums_role.admin_count")
    public Integer getAdminCount() {
        return adminCount;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8862471+08:00", comments = "Source field: ums_role.admin_count")
    public void setAdminCount(Integer adminCount) {
        this.adminCount = adminCount;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8862471+08:00", comments = "Source field: ums_role.create_time")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8872357+08:00", comments = "Source field: ums_role.create_time")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8872357+08:00", comments = "Source field: ums_role.status")
    public Integer getStatus() {
        return status;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8872357+08:00", comments = "Source field: ums_role.status")
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8872357+08:00", comments = "Source field: ums_role.sort")
    public Integer getSort() {
        return sort;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8872357+08:00", comments = "Source field: ums_role.sort")
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}