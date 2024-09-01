package com.example.mall.model;

import jakarta.annotation.Generated;
import java.util.Date;

public class UmsMenu {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.770022489+08:00", comments="Source field: ums_menu.id")
    private Long id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.770109021+08:00", comments="Source field: ums_menu.parent_id")
    private Long parentId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.770193458+08:00", comments="Source field: ums_menu.create_time")
    private Date createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.770285088+08:00", comments="Source field: ums_menu.title")
    private String title;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.770381677+08:00", comments="Source field: ums_menu.level")
    private Integer level;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.770464368+08:00", comments="Source field: ums_menu.sort")
    private Integer sort;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.770559281+08:00", comments="Source field: ums_menu.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.770713908+08:00", comments="Source field: ums_menu.icon")
    private String icon;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.770827049+08:00", comments="Source field: ums_menu.hidden")
    private Integer hidden;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.770054895+08:00", comments="Source field: ums_menu.id")
    public Long getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.770084507+08:00", comments="Source field: ums_menu.id")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.770134303+08:00", comments="Source field: ums_menu.parent_id")
    public Long getParentId() {
        return parentId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.77016203+08:00", comments="Source field: ums_menu.parent_id")
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.770224956+08:00", comments="Source field: ums_menu.create_time")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.770259666+08:00", comments="Source field: ums_menu.create_time")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.770311348+08:00", comments="Source field: ums_menu.title")
    public String getTitle() {
        return title;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.770345221+08:00", comments="Source field: ums_menu.title")
    public void setTitle(String title) {
        this.title = title;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.77041108+08:00", comments="Source field: ums_menu.level")
    public Integer getLevel() {
        return level;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.770440203+08:00", comments="Source field: ums_menu.level")
    public void setLevel(Integer level) {
        this.level = level;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.770499777+08:00", comments="Source field: ums_menu.sort")
    public Integer getSort() {
        return sort;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.770528342+08:00", comments="Source field: ums_menu.sort")
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.770592246+08:00", comments="Source field: ums_menu.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.77068667+08:00", comments="Source field: ums_menu.name")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.770741145+08:00", comments="Source field: ums_menu.icon")
    public String getIcon() {
        return icon;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.770795132+08:00", comments="Source field: ums_menu.icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.77084842+08:00", comments="Source field: ums_menu.hidden")
    public Integer getHidden() {
        return hidden;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.770869791+08:00", comments="Source field: ums_menu.hidden")
    public void setHidden(Integer hidden) {
        this.hidden = hidden;
    }
}