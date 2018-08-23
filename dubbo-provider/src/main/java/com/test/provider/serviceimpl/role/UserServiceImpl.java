package com.test.provider.serviceimpl.role;

import com.alibaba.dubbo.config.annotation.Service;
import com.test.provider.dao.role.SysResourcesDao;
import com.test.provider.dao.role.SysUserDao;
import com.text.api.entity.role.SysUser;
import com.text.api.service.role.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Component
@Transactional//配置事务处理
@Service(version = "${demo.service.version}",interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {
    @Autowired
    private SysUserDao userMapper;

    @Autowired
    private SysResourcesDao sysResourcesMapper;

    @Override
    public SysUser getUser(SysUser user) {
        SysUser info = userMapper.selectOne(user);
        System.out.println(info.getUserName()+"*****");
        return info;
    }

    @Override
    public Set<String> findPermissionsByUserId(int userId) {
        Map<Integer, String> permissions = sysResourcesMapper.findRoleNameByUserId(userId);
        Set<String> result = new HashSet<>();
        for (String permission : permissions.values()) {
            if (StringUtils.isBlank(permission)) {
                continue;
            }
            permission = StringUtils.trim(permission);
            result.addAll(Arrays.asList(permission.split("\\s*;\\s*")));
        }
        return result;
    }
}
