package com.app.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.app.dao.DevUserDao;
import com.app.pojo.DevUser;
import com.app.service.DevUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service(interfaceClass = DevUserService.class)
@Transactional
public class DevUserServiceImpl implements DevUserService {

    @Autowired
    private DevUserDao devUserDao;

    /*@Override
    public DevUser login(DevUser devUser) {
        System.out.println("service层：" + devUser);

    }*/

    @Override
    public DevUser login(DevUser devUser) {
        return devUserDao.login(devUser);
    }
}
