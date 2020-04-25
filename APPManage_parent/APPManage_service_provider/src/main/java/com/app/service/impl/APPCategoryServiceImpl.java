package com.app.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.app.dao.APPCategoryDao;
import com.app.service.APPCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(interfaceClass = APPCategoryService.class)
@Transactional
public class APPCategoryServiceImpl implements APPCategoryService {

    @Autowired
    private APPCategoryDao categoryDao;

    /**
     *  查询所有一级分类
     */
    @Override
    public List<String> findCategoryLevel1() {
        return categoryDao.findCategoryLevel1();
    }

    /**
     *  通过一级分类名去查对应二级分类选项的更新操作
     */
    @Override
    public List<String> findCategoryLevel2(String categoryLevel1) {
        return categoryDao.findCategoryLevel2(categoryLevel1);
    }

    /**
     * 通过二级分类名去查对应三级分类选项的更新操作
     * @param categoryLevel2
     * @return
     */
    @Override
    public List<String> findCategoryLevel3(String categoryLevel2) {
        return categoryDao.findCategoryLevel3(categoryLevel2);
    }
}
