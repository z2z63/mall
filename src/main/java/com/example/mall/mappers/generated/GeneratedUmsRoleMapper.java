package com.example.mall.mappers.generated;

import static com.example.mall.mappers.generated.UmsRoleDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.example.mall.model.UmsRole;
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
public interface GeneratedUmsRoleMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<UmsRole>, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.76929161+08:00", comments="Source Table: ums_role")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, description, adminCount, createTime, status, sort);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.76859202+08:00", comments="Source Table: ums_role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UmsRoleResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="admin_count", property="adminCount", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER)
    })
    List<UmsRole> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.768662977+08:00", comments="Source Table: ums_role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UmsRoleResult")
    Optional<UmsRole> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.768720665+08:00", comments="Source Table: ums_role")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, umsRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.768965037+08:00", comments="Source Table: ums_role")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, umsRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.768996535+08:00", comments="Source Table: ums_role")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.769029429+08:00", comments="Source Table: ums_role")
    default int insert(UmsRole row) {
        return MyBatis3Utils.insert(this::insert, row, umsRole, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(description).toProperty("description")
            .map(adminCount).toProperty("adminCount")
            .map(createTime).toProperty("createTime")
            .map(status).toProperty("status")
            .map(sort).toProperty("sort")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.769109816+08:00", comments="Source Table: ums_role")
    default int insertMultiple(Collection<UmsRole> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, umsRole, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(description).toProperty("description")
            .map(adminCount).toProperty("adminCount")
            .map(createTime).toProperty("createTime")
            .map(status).toProperty("status")
            .map(sort).toProperty("sort")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.7691733+08:00", comments="Source Table: ums_role")
    default int insertSelective(UmsRole row) {
        return MyBatis3Utils.insert(this::insert, row, umsRole, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(name).toPropertyWhenPresent("name", row::getName)
            .map(description).toPropertyWhenPresent("description", row::getDescription)
            .map(adminCount).toPropertyWhenPresent("adminCount", row::getAdminCount)
            .map(createTime).toPropertyWhenPresent("createTime", row::getCreateTime)
            .map(status).toPropertyWhenPresent("status", row::getStatus)
            .map(sort).toPropertyWhenPresent("sort", row::getSort)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.769344479+08:00", comments="Source Table: ums_role")
    default Optional<UmsRole> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, umsRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.769393647+08:00", comments="Source Table: ums_role")
    default List<UmsRole> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, umsRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.769442325+08:00", comments="Source Table: ums_role")
    default List<UmsRole> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, umsRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.769488071+08:00", comments="Source Table: ums_role")
    default Optional<UmsRole> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.769542546+08:00", comments="Source Table: ums_role")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, umsRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.769591155+08:00", comments="Source Table: ums_role")
    static UpdateDSL<UpdateModel> updateAllColumns(UmsRole row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(name).equalTo(row::getName)
                .set(description).equalTo(row::getDescription)
                .set(adminCount).equalTo(row::getAdminCount)
                .set(createTime).equalTo(row::getCreateTime)
                .set(status).equalTo(row::getStatus)
                .set(sort).equalTo(row::getSort);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.769727064+08:00", comments="Source Table: ums_role")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(UmsRole row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(name).equalToWhenPresent(row::getName)
                .set(description).equalToWhenPresent(row::getDescription)
                .set(adminCount).equalToWhenPresent(row::getAdminCount)
                .set(createTime).equalToWhenPresent(row::getCreateTime)
                .set(status).equalToWhenPresent(row::getStatus)
                .set(sort).equalToWhenPresent(row::getSort);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.769815203+08:00", comments="Source Table: ums_role")
    default int updateByPrimaryKey(UmsRole row) {
        return update(c ->
            c.set(name).equalTo(row::getName)
            .set(description).equalTo(row::getDescription)
            .set(adminCount).equalTo(row::getAdminCount)
            .set(createTime).equalTo(row::getCreateTime)
            .set(status).equalTo(row::getStatus)
            .set(sort).equalTo(row::getSort)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2024-09-01T22:50:34.769897055+08:00", comments="Source Table: ums_role")
    default int updateByPrimaryKeySelective(UmsRole row) {
        return update(c ->
            c.set(name).equalToWhenPresent(row::getName)
            .set(description).equalToWhenPresent(row::getDescription)
            .set(adminCount).equalToWhenPresent(row::getAdminCount)
            .set(createTime).equalToWhenPresent(row::getCreateTime)
            .set(status).equalToWhenPresent(row::getStatus)
            .set(sort).equalToWhenPresent(row::getSort)
            .where(id, isEqualTo(row::getId))
        );
    }
}