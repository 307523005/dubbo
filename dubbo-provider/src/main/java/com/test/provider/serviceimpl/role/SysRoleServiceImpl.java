package com.test.provider.serviceimpl.role;

import com.alibaba.dubbo.config.annotation.Service;
import com.test.provider.dao.role.SysRoleDao;
import com.text.api.service.role.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Component
@Service(version = "${demo.service.version}",interfaceClass = SysRoleService.class)
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    private SysRoleDao sysRoleMapper;

    @Override
    public Set<String> findRoleNameByUserId(int userId) {
        Map values = sysRoleMapper.findRoleNameByUserId(userId);
        Set<String> set = new HashSet(values.values());
        return set;
    }
}
