package com.example.mall.mappers.generated;

import jakarta.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

import java.sql.JDBCType;
import java.util.Date;

public final class UmsAdminDynamicSqlSupport {
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8691495+08:00", comments = "Source Table: ums_admin")
    public static final UmsAdmin umsAdmin = new UmsAdmin();

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8701482+08:00", comments = "Source field: ums_admin.id")
    public static final SqlColumn<Long> id = umsAdmin.id;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8701482+08:00", comments = "Source field: ums_admin.username")
    public static final SqlColumn<String> username = umsAdmin.username;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8701482+08:00", comments = "Source field: ums_admin.password")
    public static final SqlColumn<String> password = umsAdmin.password;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8701482+08:00", comments = "Source field: ums_admin.icon")
    public static final SqlColumn<String> icon = umsAdmin.icon;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8701482+08:00", comments = "Source field: ums_admin.email")
    public static final SqlColumn<String> email = umsAdmin.email;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8701482+08:00", comments = "Source field: ums_admin.nick_name")
    public static final SqlColumn<String> nickName = umsAdmin.nickName;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8711414+08:00", comments = "Source field: ums_admin.note")
    public static final SqlColumn<String> note = umsAdmin.note;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8711414+08:00", comments = "Source field: ums_admin.create_time")
    public static final SqlColumn<Date> createTime = umsAdmin.createTime;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8711414+08:00", comments = "Source field: ums_admin.login_time")
    public static final SqlColumn<Date> loginTime = umsAdmin.loginTime;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8711414+08:00", comments = "Source field: ums_admin.status")
    public static final SqlColumn<Integer> status = umsAdmin.status;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8701482+08:00", comments = "Source Table: ums_admin")
    public static final class UmsAdmin extends AliasableSqlTable<UmsAdmin> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> username = column("username", JDBCType.VARCHAR);

        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

        public final SqlColumn<String> icon = column("icon", JDBCType.VARCHAR);

        public final SqlColumn<String> email = column("email", JDBCType.VARCHAR);

        public final SqlColumn<String> nickName = column("nick_name", JDBCType.VARCHAR);

        public final SqlColumn<String> note = column("note", JDBCType.VARCHAR);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> loginTime = column("login_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

        public UmsAdmin() {
            super("ums_admin", UmsAdmin::new);
        }
    }
}