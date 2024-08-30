package com.example.mall.mappers;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class UmsadminDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-29T20:17:07.3614825+08:00", comments="Source Table: umsadmin")
    public static final Umsadmin umsadmin = new Umsadmin();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-29T20:17:07.3614825+08:00", comments="Source field: umsadmin.id")
    public static final SqlColumn<Long> id = umsadmin.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-29T20:17:07.3614825+08:00", comments="Source field: umsadmin.username")
    public static final SqlColumn<String> username = umsadmin.username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-29T20:17:07.3614825+08:00", comments="Source field: umsadmin.password")
    public static final SqlColumn<String> password = umsadmin.password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-29T20:17:07.3614825+08:00", comments="Source field: umsadmin.avatar")
    public static final SqlColumn<String> avatar = umsadmin.avatar;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-29T20:17:07.3614825+08:00", comments="Source field: umsadmin.email")
    public static final SqlColumn<String> email = umsadmin.email;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-29T20:17:07.3624413+08:00", comments="Source field: umsadmin.nickname")
    public static final SqlColumn<String> nickname = umsadmin.nickname;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-29T20:17:07.3624413+08:00", comments="Source field: umsadmin.create_time")
    public static final SqlColumn<Date> createTime = umsadmin.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-29T20:17:07.3624413+08:00", comments="Source field: umsadmin.last_login_time")
    public static final SqlColumn<Date> lastLoginTime = umsadmin.lastLoginTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-29T20:17:07.3624413+08:00", comments="Source field: umsadmin.status")
    public static final SqlColumn<Integer> status = umsadmin.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-29T20:17:07.3624413+08:00", comments="Source field: umsadmin.note")
    public static final SqlColumn<String> note = umsadmin.note;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-29T20:17:07.3614825+08:00", comments="Source Table: umsadmin")
    public static final class Umsadmin extends AliasableSqlTable<Umsadmin> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> username = column("username", JDBCType.VARCHAR);

        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

        public final SqlColumn<String> avatar = column("avatar", JDBCType.VARCHAR);

        public final SqlColumn<String> email = column("email", JDBCType.VARCHAR);

        public final SqlColumn<String> nickname = column("nickname", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.DATE);

        public final SqlColumn<Date> lastLoginTime = column("last_login_time", JDBCType.DATE);

        public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

        public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);

        public Umsadmin() {
            super("umsadmin", Umsadmin::new);
        }
    }
}