package com.test.provider.dao.role;

import com.text.api.entity.role.SysResources;

import java.util.List;
import java.util.Map;

public interface SysResourcesDao {
    List<SysResources> selectAll();
    Map findRoleNameByUserId(int userId);

}
