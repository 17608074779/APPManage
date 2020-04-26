package com.app.dao;

import com.app.entity.QueryPageBean;
import com.app.pojo.AppInfo;
import com.github.pagehelper.Page;

import java.util.List;
import java.util.Map;

public interface APPMenuDao {

    Page<AppInfo> findByCondition(QueryPageBean queryPageBean);


    List<AppInfo> findAll();

    /**
     * 新增一条软件信息
     * @param appInfo
     * @return
     */
    void addAppInfo(AppInfo appInfo);
}
