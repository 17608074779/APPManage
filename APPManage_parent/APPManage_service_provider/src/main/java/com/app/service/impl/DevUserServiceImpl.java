package com.app.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.app.dao.DevUserDao;
import com.app.pojo.DevUser;
import com.app.service.DevUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(interfaceClass = DevUserService.class)
@Transactional
public class DevUserServiceImpl implements DevUserService {

    @Autowired
    private DevUserDao devUserDao;

    @Override
    public DevUser login(DevUser devUser) {
        System.out.println("service层：" + devUser);
        DevUser devUser1 = devUserDao.login(devUser);
        return devUser1;
    }
}
