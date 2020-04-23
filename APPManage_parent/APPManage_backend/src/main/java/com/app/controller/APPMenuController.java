package com.app.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.app.constant.MessageConstant;
import com.app.entity.PageResult;
import com.app.entity.QueryAppResult;
import com.app.entity.QueryPageBean;
import com.app.entity.Result;
import com.app.pojo.AppCategory;
import com.app.pojo.AppInfo;
import com.app.service.APPMenuService;
import com.github.pagehelper.PageHelper;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/app")
public class APPMenuController {

    @Reference
    private APPMenuService appMenuService;

    /**
     * 查询所有软件的详情信息
     * @param queryPageBean
     * @return
     */
    @RequestMapping("/findAppInfo")
    public Result findAppInfo(@RequestBody QueryPageBean queryPageBean){
        System.out.println(queryPageBean);
        PageResult queryAppResults = appMenuService.findAppInfo(queryPageBean);
        if(queryAppResults.getRows() != null){
            return new Result(true, MessageConstant.QUERY_software_SUCCESS, queryAppResults);
        }
        return new Result(false, "一条数据也没有");
    }


    /**
     * 查询所有软件的基本信息
     * @param
     * @return
     */
    @RequestMapping("/findAll")
    public Result findAppInfo(){
        List<AppInfo> appInfos = appMenuService.findAll();
        if(appInfos != null){
            return new Result(true, MessageConstant.QUERY_software_SUCCESS, appInfos);
        }
        return new Result(false, MessageConstant.QUERY_software_FAIL);
    }






}
