package com.example.mall.mappers;

import com.example.mall.mappers.generated.GeneratedUmsAdminMapper;
import com.example.mall.model.UmsAdmin;
import com.example.mall.model.UmsRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

import static com.example.mall.mappers.generated.UmsAdminDynamicSqlSupport.username;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Mapper
public interface UmsAdminMapper extends GeneratedUmsAdminMapper {
    default Optional<UmsAdmin> getAdminByUsername(String _username) {
        return selectOne(c -> c.where(username, isEqualTo(_username)));
    }

    @Select("""
            SELECT r.*
            FROM ums_admin_role_relation AS arr
                     LEFT JOIN ums_role AS r ON arr.role_id = r.id
            WHERE arr.admin_id = #{adminId};
            """)
    List<UmsRole> getRoleList(Long adminId);


}