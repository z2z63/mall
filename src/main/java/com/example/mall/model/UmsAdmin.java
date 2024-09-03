package com.example.mall.model;

import jakarta.annotation.Generated;

import java.io.Serializable;
import java.util.Date;

public class UmsAdmin implements Serializable {
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.865141+08:00", comments = "Source field: ums_admin.id")
    private Long id;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8661505+08:00", comments = "Source field: ums_admin.username")
    private String username;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8671563+08:00", comments = "Source field: ums_admin.password")
    private String password;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8671563+08:00", comments = "Source field: ums_admin.icon")
    private String icon;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8671563+08:00", comments = "Source field: ums_admin.email")
    private String email;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8671563+08:00", comments = "Source field: ums_admin.nick_name")
    private String nickName;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8671563+08:00", comments = "Source field: ums_admin.note")
    private String note;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8671563+08:00", comments = "Source field: ums_admin.create_time")
    private Date createTime;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8671563+08:00", comments = "Source field: ums_admin.login_time")
    private Date loginTime;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8671563+08:00", comments = "Source field: ums_admin.status")
    private Integer status;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8671563+08:00", comments = "Source Table: ums_admin")
    private static final long serialVersionUID = 1L;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8661505+08:00", comments = "Source field: ums_admin.id")
    public Long getId() {
        return id;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8661505+08:00", comments = "Source field: ums_admin.id")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8661505+08:00", comments = "Source field: ums_admin.username")
    public String getUsername() {
        return username;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8671563+08:00", comments = "Source field: ums_admin.username")
    public void setUsername(String username) {
        this.username = username;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8671563+08:00", comments = "Source field: ums_admin.password")
    public String getPassword() {
        return password;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8671563+08:00", comments = "Source field: ums_admin.password")
    public void setPassword(String password) {
        this.password = password;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8671563+08:00", comments = "Source field: ums_admin.icon")
    public String getIcon() {
        return icon;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8671563+08:00", comments = "Source field: ums_admin.icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8671563+08:00", comments = "Source field: ums_admin.email")
    public String getEmail() {
        return email;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8671563+08:00", comments = "Source field: ums_admin.email")
    public void setEmail(String email) {
        this.email = email;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8671563+08:00", comments = "Source field: ums_admin.nick_name")
    public String getNickName() {
        return nickName;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8671563+08:00", comments = "Source field: ums_admin.nick_name")
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8671563+08:00", comments = "Source field: ums_admin.note")
    public String getNote() {
        return note;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8671563+08:00", comments = "Source field: ums_admin.note")
    public void setNote(String note) {
        this.note = note;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8671563+08:00", comments = "Source field: ums_admin.create_time")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8671563+08:00", comments = "Source field: ums_admin.create_time")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8671563+08:00", comments = "Source field: ums_admin.login_time")
    public Date getLoginTime() {
        return loginTime;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8671563+08:00", comments = "Source field: ums_admin.login_time")
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8671563+08:00", comments = "Source field: ums_admin.status")
    public Integer getStatus() {
        return status;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8671563+08:00", comments = "Source field: ums_admin.status")
    public void setStatus(Integer status) {
        this.status = status;
    }
}