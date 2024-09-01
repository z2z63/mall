package com.example.mall.mappers;

import com.example.mall.mappers.generated.GeneratedUmsRoleMapper;
import com.example.mall.model.UmsMenu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UmsRoleMapper extends GeneratedUmsRoleMapper{
    @Select("""
            SELECT m.id,
                   m.parent_id,
                   m.create_time,
                   m.title,
                   m.level,
                   m.sort,
                   m.name,
                   m.icon,
                   m.hidden
            FROM ums_admin_role_relation arr
                     LEFT JOIN ums_role r ON arr.role_id = r.id
                     LEFT JOIN ums_role_menu_relation rmr ON r.id = rmr.role_id
                     LEFT JOIN ums_menu m ON rmr.menu_id = m.id
            WHERE arr.admin_id = 3
              AND m.id IS NOT NULL
            GROUP BY m.id
            """)
    List<UmsMenu> getMenuList(Long adminId);
}