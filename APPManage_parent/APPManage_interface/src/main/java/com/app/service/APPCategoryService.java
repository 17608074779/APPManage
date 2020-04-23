package com.app.service;

import java.util.List;

public interface APPCategoryService {


    List<String> findCategoryLevel1();

    List<String> findCategoryLevel2(String categoryLevel1);

    List<String> findCategoryLevel3(String categoryLevel2);
}
