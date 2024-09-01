package com.example.mall.model;

import jakarta.annotation.Generated;
import java.util.Date;

public class UmsRole {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.767679975+08:00", comments="Source field: ums_role.id")
    private Long id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.767786971+08:00", comments="Source field: ums_role.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.767877623+08:00", comments="Source field: ums_role.description")
    private String description;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.767939083+08:00", comments="Source field: ums_role.admin_count")
    private Integer adminCount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.767998447+08:00", comments="Source field: ums_role.create_time")
    private Date createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.768070103+08:00", comments="Source field: ums_role.status")
    private Integer status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.768129677+08:00", comments="Source field: ums_role.sort")
    private Integer sort;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.767724184+08:00", comments="Source field: ums_role.id")
    public Long getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.767758825+08:00", comments="Source field: ums_role.id")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.767823637+08:00", comments="Source field: ums_role.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.76785702+08:00", comments="Source field: ums_role.name")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.767898925+08:00", comments="Source field: ums_role.description")
    public String getDescription() {
        return description;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.767920924+08:00", comments="Source field: ums_role.description")
    public void setDescription(String description) {
        this.description = description;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.767959895+08:00", comments="Source field: ums_role.admin_count")
    public Integer getAdminCount() {
        return adminCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.767980568+08:00", comments="Source field: ums_role.admin_count")
    public void setAdminCount(Integer adminCount) {
        this.adminCount = adminCount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.76802757+08:00", comments="Source field: ums_role.create_time")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.768051037+08:00", comments="Source field: ums_role.create_time")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.768090008+08:00", comments="Source field: ums_role.status")
    public Integer getStatus() {
        return status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.76811103+08:00", comments="Source field: ums_role.status")
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.768149651+08:00", comments="Source field: ums_role.sort")
    public Integer getSort() {
        return sort;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.768170254+08:00", comments="Source field: ums_role.sort")
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}