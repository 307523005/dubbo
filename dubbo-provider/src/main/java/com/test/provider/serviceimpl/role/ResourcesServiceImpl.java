package com.test.provider.serviceimpl.role;

import com.test.provider.dao.role.SysResourcesDao;
import com.text.api.entity.role.SysResources;
import com.text.api.service.role.ResourcesService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Service(version = "${demo.service.version}",interfaceClass = ResourcesService.class)
public class ResourcesServiceImpl implements ResourcesService {
    @Autowired
    private SysResourcesDao sysResourcesMapper;

    @Override
    public List<SysResources> selectAll() {
        List<SysResources> resourcesList = sysResourcesMapper.selectAll();
        return resourcesList;
    }
}
