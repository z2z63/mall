package com.example.mall.mappers.generated;

import jakarta.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

import java.sql.JDBCType;
import java.util.Date;

public final class UmsRoleDynamicSqlSupport {
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8872357+08:00", comments = "Source Table: ums_role")
    public static final UmsRole umsRole = new UmsRole();

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8872357+08:00", comments = "Source field: ums_role.id")
    public static final SqlColumn<Long> id = umsRole.id;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8872357+08:00", comments = "Source field: ums_role.name")
    public static final SqlColumn<String> name = umsRole.name;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8872357+08:00", comments = "Source field: ums_role.description")
    public static final SqlColumn<String> description = umsRole.description;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8872357+08:00", comments = "Source field: ums_role.admin_count")
    public static final SqlColumn<Integer> adminCount = umsRole.adminCount;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8872357+08:00", comments = "Source field: ums_role.create_time")
    public static final SqlColumn<Date> createTime = umsRole.createTime;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8872357+08:00", comments = "Source field: ums_role.status")
    public static final SqlColumn<Integer> status = umsRole.status;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8872357+08:00", comments = "Source field: ums_role.sort")
    public static final SqlColumn<Integer> sort = umsRole.sort;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8872357+08:00", comments = "Source Table: ums_role")
    public static final class UmsRole extends AliasableSqlTable<UmsRole> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> description = column("description", JDBCType.VARCHAR);

        public final SqlColumn<Integer> adminCount = column("admin_count", JDBCType.INTEGER);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

        public final SqlColumn<Integer> sort = column("sort", JDBCType.INTEGER);

        public UmsRole() {
            super("ums_role", UmsRole::new);
        }
    }
}