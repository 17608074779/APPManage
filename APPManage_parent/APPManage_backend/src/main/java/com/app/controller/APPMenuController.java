package com.app.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.app.constant.MessageConstant;
import com.app.constant.RedisConstant;
import com.app.entity.PageResult;
import com.app.entity.QueryPageBean;
import com.app.entity.Result;
import com.app.pojo.AppInfo;
import com.app.service.APPMenuService;
import com.app.utils.QiniuUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import redis.clients.jedis.JedisPool;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/app")
public class APPMenuController {

    @Reference
    private APPMenuService appMenuService;
    @Autowired
    private JedisPool jedisPool;

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

    /**
     * 图片文件上传（前端一定要校验图片通过）
     * @param imageFile
     * @return
     */
    @RequestMapping("/upload")
    public Result upload(@RequestParam("imageFile")MultipartFile imageFile){
        //将文件名换成uuid.jpg格式
        String originalFilename = imageFile.getOriginalFilename();
        int index = originalFilename.lastIndexOf(".");
        String extention = originalFilename.substring(index);   // .jpg
        String filename = UUID.randomUUID().toString() + extention;
        try {
            // 将文件上传到七牛云
            QiniuUtils.upload2Qiniu(imageFile.getBytes(), filename);
            jedisPool.getResource().sadd(RedisConstant.PIC_RESOURCES);
        } catch (IOException e) {
            e.printStackTrace();
            return new Result(false, MessageConstant.PIC_UPLOAD_FAIL);
        }
        return new Result(false, MessageConstant.PIC_UPLOAD_SUCCESS, "http://q8nm6aqk9.bkt.clouddn.com/" + filename);
    }

    /**
     * 新增一条软件信息
     * @param map
     * @return
     */
    @RequestMapping("/addAppInfo")
    public Result addAppInfo(@RequestBody Map map){
        try {
            appMenuService.addAppInfo(map);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, MessageConstant.ADD_FAIL);
        }
        return new Result(true, MessageConstant.ADD_SUCCESS);
    }







}
