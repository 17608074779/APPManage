package com.app.dao;

import java.util.List;

public interface APPCategoryDao {

    /**
     * 通过categoryLevelId查分类名称
     * @param categoryLevelId
     * @return
     */
    String findCategoryNameByCategoryId(Integer categoryLevelId);

    /**
     * 通过分类字符串去查分类的Id
     */
    Integer findCategoryIdByCategoryName(String categoryName);

    /**
     *  查询所有的一级分类
     * @return
     */
    List<String> findCategoryLevel1();

    /**
     *  通过一级分类名去查对应二级分类选项的更新操作
     */
    List<String> findCategoryLevel2(String categoryLevel1);

    /**
     * 通过二级分类名去查对应三级分类选项的更新操作
     * @param categoryLevel2
     * @return
     */
    List<String> findCategoryLevel3(String categoryLevel2);
}
