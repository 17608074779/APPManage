package com.app.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.app.constant.MessageConstant;
import com.app.entity.Result;
import com.app.pojo.DevUser;
import com.app.service.DevUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.JedisPool;

@RestController
@RequestMapping("/devUser")
public class DevUserController {

    @Reference
    private DevUserService devUserService;

    @Autowired
    private JedisPool jedisPool;

    /**
     *  登录
     */
    @RequestMapping("/login")
    public Result login(@RequestBody DevUser devUser){
        DevUser devUser1 = devUserService.login(devUser);

        if(devUser1 != null){
            jedisPool.getResource().setex("devCode",60*60*24, devUser1.getDevCode());
            return new Result(true, MessageConstant.GET_USERNAME_SUCCESS,devUser1);
        }else{
            return new  Result(false, MessageConstant.GET_USERNAME_FAIL);
        }
    }

}
