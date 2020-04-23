package com.app.dao;

import com.app.entity.QueryPageBean;
import com.app.pojo.AppInfo;
import com.github.pagehelper.Page;

import java.util.List;

public interface APPMenuDao {

    Page<AppInfo> findByCondition(QueryPageBean queryPageBean);


    List<AppInfo> findAll();




}
