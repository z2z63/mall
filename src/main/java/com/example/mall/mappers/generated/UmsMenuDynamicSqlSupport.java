package com.example.mall.mappers.generated;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class UmsMenuDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.770933904+08:00", comments="Source Table: ums_menu")
    public static final UmsMenu umsMenu = new UmsMenu();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.771059757+08:00", comments="Source field: ums_menu.id")
    public static final SqlColumn<Long> id = umsMenu.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.771113813+08:00", comments="Source field: ums_menu.parent_id")
    public static final SqlColumn<Long> parentId = umsMenu.parentId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.771153273+08:00", comments="Source field: ums_menu.create_time")
    public static final SqlColumn<Date> createTime = umsMenu.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.771201253+08:00", comments="Source field: ums_menu.title")
    public static final SqlColumn<String> title = umsMenu.title;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.771246649+08:00", comments="Source field: ums_menu.level")
    public static final SqlColumn<Integer> level = umsMenu.level;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.771282338+08:00", comments="Source field: ums_menu.sort")
    public static final SqlColumn<Integer> sort = umsMenu.sort;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.77131614+08:00", comments="Source field: ums_menu.name")
    public static final SqlColumn<String> name = umsMenu.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.771367333+08:00", comments="Source field: ums_menu.icon")
    public static final SqlColumn<String> icon = umsMenu.icon;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.771413847+08:00", comments="Source field: ums_menu.hidden")
    public static final SqlColumn<Integer> hidden = umsMenu.hidden;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.771003954+08:00", comments="Source Table: ums_menu")
    public static final class UmsMenu extends AliasableSqlTable<UmsMenu> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> parentId = column("parent_id", JDBCType.BIGINT);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> title = column("title", JDBCType.VARCHAR);

        public final SqlColumn<Integer> level = column("level", JDBCType.INTEGER);

        public final SqlColumn<Integer> sort = column("sort", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> icon = column("icon", JDBCType.VARCHAR);

        public final SqlColumn<Integer> hidden = column("hidden", JDBCType.INTEGER);

        public UmsMenu() {
            super("ums_menu", UmsMenu::new);
        }
    }
}