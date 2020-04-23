package com.app.dao;

public interface APPVersionDao {

    /**
     * 通过versionId查询版本号VersionNo
     * @param versionId
     * @return
     */
    String findVersionNoByVersionId(Integer versionId);
}
