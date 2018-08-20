package com.test.provider.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.test.provider.dao.RemotecontrolDao;
import com.test.provider.servlet.redis.RedisUtils;
import com.text.api.entity.RemotecontrolBeen;
import com.text.api.service.RemotecontrolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional//配置事务处理
@Service(version = "${demo.service.version}",interfaceClass = RemotecontrolService.class)
public class RemotecontrolServiceImpl implements RemotecontrolService {


    @Autowired
    RemotecontrolDao remotecontrolDao;

    @Override
    public List<RemotecontrolBeen> getRemotecontrol(RemotecontrolBeen remotecontrolBeen) {
        return remotecontrolDao.getRemotecontrol(remotecontrolBeen);
    }
}
