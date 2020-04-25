package com.app.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.app.entity.Result;
import com.app.service.APPCategoryService;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class APPCategoryController {

    @Reference
    private APPCategoryService categoryService;


    /**
     *  刷新页面即自动查询一级分类
     */
    @RequestMapping("/findCategoryLevel1")
    public Result findCategoryLevel1(){
        List<String> categoryLevel1s = categoryService.findCategoryLevel1();
        return new Result(true, "一级分类查询成功", categoryLevel1s);
    }

    /**
     *  通过一级分类名去查对应二级分类选项的更新操作
     */
    @RequestMapping("/findCategoryLevel2")
    public Result findCategoryLevel2(@RequestParam("categoryLevel1") String categoryLevel1){
        System.out.println("前台传来的一级分类名：" + categoryLevel1);
        if(categoryLevel1 == "" || StringUtils.isEmpty(categoryLevel1)){
            return new Result(false, "一级分类没有传值");
        }
        List<String> categoryLevel2s = categoryService.findCategoryLevel2(categoryLevel1);
        return new Result(true, "二级分类查询成功", categoryLevel2s);
    }


    /**
     *  通过二级分类名去查对应三级分类选项的更新操作
     */
    @RequestMapping("/findCategoryLevel3")
    public Result findCategoryLevel3(String categoryLevel1, String categoryLevel2){
        if(categoryLevel1 == "" || StringUtils.isEmpty(categoryLevel1) || categoryLevel2 == "" || StringUtils.isEmpty(categoryLevel2)){
            return new Result(false, "一级分类或者二级分类没有传值");
        }
        List<String> categoryLevel3s = categoryService.findCategoryLevel3(categoryLevel2);
        return new Result(true, "三级分类查询成功", categoryLevel3s);
    }
}
