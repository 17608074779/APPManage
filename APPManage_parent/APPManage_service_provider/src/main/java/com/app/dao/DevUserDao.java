package com.app.dao;

import com.app.pojo.DevUser;

import java.util.List;
import java.util.Map;

public interface DevUserDao {
    DevUser findAll();

    DevUser login(DevUser devUser);
}
