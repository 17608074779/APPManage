package com.app.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import redis.clients.jedis.JedisPool;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Component
public class MyInterceptor implements HandlerInterceptor {

    @Autowired
    private JedisPool jedisPool;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String devCode = jedisPool.getResource().get("devCode");
        // 不为空说明还没有注销，没有过期，则可放行
        if(!StringUtils.isEmpty(devCode) && devCode.length()>0){
            return true;
        }else{
            System.out.println("请求被拦截了，用户还没登录呢");
            response.sendRedirect("/pages/Development.html");
            return false;
        }
    }


}
