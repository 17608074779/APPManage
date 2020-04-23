package com.app.dao;

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
}
