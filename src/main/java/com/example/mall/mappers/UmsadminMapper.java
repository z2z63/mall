package com.example.mall.mappers;

import static com.example.mall.mappers.UmsadminDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.example.mall.model.Umsadmin;
import jakarta.annotation.Generated;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
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
import org.mybatis.dynamic.sql.util.mybatis3.CommonCountMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonDeleteMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonInsertMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonUpdateMapper;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface UmsadminMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<Umsadmin>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-29T20:17:07.3700565+08:00", comments="Source Table: umsadmin")
    BasicColumn[] selectList = BasicColumn.columnList(id, username, password, avatar, email, nickname, createTime, lastLoginTime, status, note);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-29T20:17:07.3624413+08:00", comments="Source Table: umsadmin")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UmsadminResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="avatar", property="avatar", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="nickname", property="nickname", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.DATE),
        @Result(column="last_login_time", property="lastLoginTime", jdbcType=JdbcType.DATE),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR)
    })
    List<Umsadmin> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-29T20:17:07.3644435+08:00", comments="Source Table: umsadmin")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UmsadminResult")
    Optional<Umsadmin> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-29T20:17:07.3654416+08:00", comments="Source Table: umsadmin")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, umsadmin, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-29T20:17:07.3654416+08:00", comments="Source Table: umsadmin")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, umsadmin, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-29T20:17:07.3664448+08:00", comments="Source Table: umsadmin")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-29T20:17:07.3664448+08:00", comments="Source Table: umsadmin")
    default int insert(Umsadmin row) {
        return MyBatis3Utils.insert(this::insert, row, umsadmin, c ->
            c.map(id).toProperty("id")
            .map(username).toProperty("username")
            .map(password).toProperty("password")
            .map(avatar).toProperty("avatar")
            .map(email).toProperty("email")
            .map(nickname).toProperty("nickname")
            .map(createTime).toProperty("createTime")
            .map(lastLoginTime).toProperty("lastLoginTime")
            .map(status).toProperty("status")
            .map(note).toProperty("note")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-29T20:17:07.369048+08:00", comments="Source Table: umsadmin")
    default int insertMultiple(Collection<Umsadmin> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, umsadmin, c ->
            c.map(id).toProperty("id")
            .map(username).toProperty("username")
            .map(password).toProperty("password")
            .map(avatar).toProperty("avatar")
            .map(email).toProperty("email")
            .map(nickname).toProperty("nickname")
            .map(createTime).toProperty("createTime")
            .map(lastLoginTime).toProperty("lastLoginTime")
            .map(status).toProperty("status")
            .map(note).toProperty("note")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-29T20:17:07.3700565+08:00", comments="Source Table: umsadmin")
    default int insertSelective(Umsadmin row) {
        return MyBatis3Utils.insert(this::insert, row, umsadmin, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(username).toPropertyWhenPresent("username", row::getUsername)
            .map(password).toPropertyWhenPresent("password", row::getPassword)
            .map(avatar).toPropertyWhenPresent("avatar", row::getAvatar)
            .map(email).toPropertyWhenPresent("email", row::getEmail)
            .map(nickname).toPropertyWhenPresent("nickname", row::getNickname)
            .map(createTime).toPropertyWhenPresent("createTime", row::getCreateTime)
            .map(lastLoginTime).toPropertyWhenPresent("lastLoginTime", row::getLastLoginTime)
            .map(status).toPropertyWhenPresent("status", row::getStatus)
            .map(note).toPropertyWhenPresent("note", row::getNote)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-29T20:17:07.3715652+08:00", comments="Source Table: umsadmin")
    default Optional<Umsadmin> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, umsadmin, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-29T20:17:07.3725761+08:00", comments="Source Table: umsadmin")
    default List<Umsadmin> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, umsadmin, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-29T20:17:07.3725761+08:00", comments="Source Table: umsadmin")
    default List<Umsadmin> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, umsadmin, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-29T20:17:07.3735839+08:00", comments="Source Table: umsadmin")
    default Optional<Umsadmin> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-29T20:17:07.3735839+08:00", comments="Source Table: umsadmin")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, umsadmin, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-29T20:17:07.3735839+08:00", comments="Source Table: umsadmin")
    static UpdateDSL<UpdateModel> updateAllColumns(Umsadmin row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(username).equalTo(row::getUsername)
                .set(password).equalTo(row::getPassword)
                .set(avatar).equalTo(row::getAvatar)
                .set(email).equalTo(row::getEmail)
                .set(nickname).equalTo(row::getNickname)
                .set(createTime).equalTo(row::getCreateTime)
                .set(lastLoginTime).equalTo(row::getLastLoginTime)
                .set(status).equalTo(row::getStatus)
                .set(note).equalTo(row::getNote);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-29T20:17:07.3745831+08:00", comments="Source Table: umsadmin")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Umsadmin row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(username).equalToWhenPresent(row::getUsername)
                .set(password).equalToWhenPresent(row::getPassword)
                .set(avatar).equalToWhenPresent(row::getAvatar)
                .set(email).equalToWhenPresent(row::getEmail)
                .set(nickname).equalToWhenPresent(row::getNickname)
                .set(createTime).equalToWhenPresent(row::getCreateTime)
                .set(lastLoginTime).equalToWhenPresent(row::getLastLoginTime)
                .set(status).equalToWhenPresent(row::getStatus)
                .set(note).equalToWhenPresent(row::getNote);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-29T20:17:07.3755856+08:00", comments="Source Table: umsadmin")
    default int updateByPrimaryKey(Umsadmin row) {
        return update(c ->
            c.set(username).equalTo(row::getUsername)
            .set(password).equalTo(row::getPassword)
            .set(avatar).equalTo(row::getAvatar)
            .set(email).equalTo(row::getEmail)
            .set(nickname).equalTo(row::getNickname)
            .set(createTime).equalTo(row::getCreateTime)
            .set(lastLoginTime).equalTo(row::getLastLoginTime)
            .set(status).equalTo(row::getStatus)
            .set(note).equalTo(row::getNote)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-08-29T20:17:07.3755856+08:00", comments="Source Table: umsadmin")
    default int updateByPrimaryKeySelective(Umsadmin row) {
        return update(c ->
            c.set(username).equalToWhenPresent(row::getUsername)
            .set(password).equalToWhenPresent(row::getPassword)
            .set(avatar).equalToWhenPresent(row::getAvatar)
            .set(email).equalToWhenPresent(row::getEmail)
            .set(nickname).equalToWhenPresent(row::getNickname)
            .set(createTime).equalToWhenPresent(row::getCreateTime)
            .set(lastLoginTime).equalToWhenPresent(row::getLastLoginTime)
            .set(status).equalToWhenPresent(row::getStatus)
            .set(note).equalToWhenPresent(row::getNote)
            .where(id, isEqualTo(row::getId))
        );
    }
}