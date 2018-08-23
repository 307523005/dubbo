package com.test.provider.dao.role;


import java.util.Map;

public interface SysRoleDao {
    Map findRoleNameByUserId(int userId);
}
