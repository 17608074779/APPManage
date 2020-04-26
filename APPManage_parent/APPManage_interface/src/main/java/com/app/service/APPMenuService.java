package com.app.service;

import com.app.entity.PageResult;
import com.app.entity.QueryPageBean;
import com.app.pojo.AppInfo;

import java.util.List;
import java.util.Map;


public interface APPMenuService {

    /**
     * 查询所有软件的信息
     * @param queryPageBean
     * @return
     */
    PageResult findAppInfo(QueryPageBean queryPageBean);

    List<AppInfo> findAll();

    //新增软件
    void addAppInfo(Map map);
}
