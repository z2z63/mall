package com.example.mall.mappers.generated;

import com.example.mall.model.UmsAdmin;
import jakarta.annotation.Generated;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import static com.example.mall.mappers.generated.UmsAdminDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Mapper
public interface GeneratedUmsAdminMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<UmsAdmin>, CommonUpdateMapper {
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8797025+08:00", comments = "Source Table: ums_admin")
    BasicColumn[] selectList = BasicColumn.columnList(id, username, password, icon, email, nickName, note, createTime, loginTime, status);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8721521+08:00", comments = "Source Table: ums_admin")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @Results(id = "UmsAdminResult", value = {
            @Result(column = "id", property = "id", jdbcType = JdbcType.BIGINT, id = true),
            @Result(column = "username", property = "username", jdbcType = JdbcType.VARCHAR),
            @Result(column = "password", property = "password", jdbcType = JdbcType.VARCHAR),
            @Result(column = "icon", property = "icon", jdbcType = JdbcType.VARCHAR),
            @Result(column = "email", property = "email", jdbcType = JdbcType.VARCHAR),
            @Result(column = "nick_name", property = "nickName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "note", property = "note", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "login_time", property = "loginTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "status", property = "status", jdbcType = JdbcType.INTEGER)
    })
    List<UmsAdmin> selectMany(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8736763+08:00", comments = "Source Table: ums_admin")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @ResultMap("UmsAdminResult")
    Optional<UmsAdmin> selectOne(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8736763+08:00", comments = "Source Table: ums_admin")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, umsAdmin, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8736763+08:00", comments = "Source Table: ums_admin")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, umsAdmin, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8746865+08:00", comments = "Source Table: ums_admin")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c ->
                c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8746865+08:00", comments = "Source Table: ums_admin")
    default int insert(UmsAdmin row) {
        return MyBatis3Utils.insert(this::insert, row, umsAdmin, c ->
                c.map(id).toProperty("id")
                        .map(username).toProperty("username")
                        .map(password).toProperty("password")
                        .map(icon).toProperty("icon")
                        .map(email).toProperty("email")
                        .map(nickName).toProperty("nickName")
                        .map(note).toProperty("note")
                        .map(createTime).toProperty("createTime")
                        .map(loginTime).toProperty("loginTime")
                        .map(status).toProperty("status")
        );
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8767009+08:00", comments = "Source Table: ums_admin")
    default int insertMultiple(Collection<UmsAdmin> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, umsAdmin, c ->
                c.map(id).toProperty("id")
                        .map(username).toProperty("username")
                        .map(password).toProperty("password")
                        .map(icon).toProperty("icon")
                        .map(email).toProperty("email")
                        .map(nickName).toProperty("nickName")
                        .map(note).toProperty("note")
                        .map(createTime).toProperty("createTime")
                        .map(loginTime).toProperty("loginTime")
                        .map(status).toProperty("status")
        );
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8787011+08:00", comments = "Source Table: ums_admin")
    default int insertSelective(UmsAdmin row) {
        return MyBatis3Utils.insert(this::insert, row, umsAdmin, c ->
                c.map(id).toPropertyWhenPresent("id", row::getId)
                        .map(username).toPropertyWhenPresent("username", row::getUsername)
                        .map(password).toPropertyWhenPresent("password", row::getPassword)
                        .map(icon).toPropertyWhenPresent("icon", row::getIcon)
                        .map(email).toPropertyWhenPresent("email", row::getEmail)
                        .map(nickName).toPropertyWhenPresent("nickName", row::getNickName)
                        .map(note).toPropertyWhenPresent("note", row::getNote)
                        .map(createTime).toPropertyWhenPresent("createTime", row::getCreateTime)
                        .map(loginTime).toPropertyWhenPresent("loginTime", row::getLoginTime)
                        .map(status).toPropertyWhenPresent("status", row::getStatus)
        );
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8807286+08:00", comments = "Source Table: ums_admin")
    default Optional<UmsAdmin> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, umsAdmin, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8817327+08:00", comments = "Source Table: ums_admin")
    default List<UmsAdmin> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, umsAdmin, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8817327+08:00", comments = "Source Table: ums_admin")
    default List<UmsAdmin> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, umsAdmin, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8817327+08:00", comments = "Source Table: ums_admin")
    default Optional<UmsAdmin> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
                c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8827062+08:00", comments = "Source Table: ums_admin")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, umsAdmin, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8827062+08:00", comments = "Source Table: ums_admin")
    static UpdateDSL<UpdateModel> updateAllColumns(UmsAdmin row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(username).equalTo(row::getUsername)
                .set(password).equalTo(row::getPassword)
                .set(icon).equalTo(row::getIcon)
                .set(email).equalTo(row::getEmail)
                .set(nickName).equalTo(row::getNickName)
                .set(note).equalTo(row::getNote)
                .set(createTime).equalTo(row::getCreateTime)
                .set(loginTime).equalTo(row::getLoginTime)
                .set(status).equalTo(row::getStatus);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8827062+08:00", comments = "Source Table: ums_admin")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(UmsAdmin row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(username).equalToWhenPresent(row::getUsername)
                .set(password).equalToWhenPresent(row::getPassword)
                .set(icon).equalToWhenPresent(row::getIcon)
                .set(email).equalToWhenPresent(row::getEmail)
                .set(nickName).equalToWhenPresent(row::getNickName)
                .set(note).equalToWhenPresent(row::getNote)
                .set(createTime).equalToWhenPresent(row::getCreateTime)
                .set(loginTime).equalToWhenPresent(row::getLoginTime)
                .set(status).equalToWhenPresent(row::getStatus);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8842204+08:00", comments = "Source Table: ums_admin")
    default int updateByPrimaryKey(UmsAdmin row) {
        return update(c ->
                c.set(username).equalTo(row::getUsername)
                        .set(password).equalTo(row::getPassword)
                        .set(icon).equalTo(row::getIcon)
                        .set(email).equalTo(row::getEmail)
                        .set(nickName).equalTo(row::getNickName)
                        .set(note).equalTo(row::getNote)
                        .set(createTime).equalTo(row::getCreateTime)
                        .set(loginTime).equalTo(row::getLoginTime)
                        .set(status).equalTo(row::getStatus)
                        .where(id, isEqualTo(row::getId))
        );
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2024-09-03T13:00:33.8842204+08:00", comments = "Source Table: ums_admin")
    default int updateByPrimaryKeySelective(UmsAdmin row) {
        return update(c ->
                c.set(username).equalToWhenPresent(row::getUsername)
                        .set(password).equalToWhenPresent(row::getPassword)
                        .set(icon).equalToWhenPresent(row::getIcon)
                        .set(email).equalToWhenPresent(row::getEmail)
                        .set(nickName).equalToWhenPresent(row::getNickName)
                        .set(note).equalToWhenPresent(row::getNote)
                        .set(createTime).equalToWhenPresent(row::getCreateTime)
                        .set(loginTime).equalToWhenPresent(row::getLoginTime)
                        .set(status).equalToWhenPresent(row::getStatus)
                        .where(id, isEqualTo(row::getId))
        );
    }
}