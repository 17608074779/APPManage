package com.app.dao;

import java.util.Map;

public interface APPDictionaryDao {

    /**
     * 通过statusId来查询状态
     */
    String findStatusByStatusId(Map map);

    /**
     * 通过flatformId查询所属平台
     * @param map
     */
    String  findFlatFormByflatformId(Map map);

    /**
     * 通过所属平台字符串去查所属平台的valueId
     */
    Integer findflatformValueIdByflatformName(Map map);

    /**
     * 通过状态字符串去查状态的valueId
     */
    Integer findStatusValueIdByStatusName(Map map);
}
