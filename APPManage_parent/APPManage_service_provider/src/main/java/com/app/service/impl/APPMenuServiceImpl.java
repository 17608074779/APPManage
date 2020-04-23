package com.app.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.app.dao.APPCategoryDao;
import com.app.dao.APPDictionaryDao;
import com.app.dao.APPMenuDao;
import com.app.dao.APPVersionDao;
import com.app.entity.PageResult;
import com.app.entity.QueryAppResult;
import com.app.entity.QueryPageBean;
import com.app.pojo.AppInfo;
import com.app.service.APPMenuService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service(interfaceClass = APPMenuService.class)
@Transactional
public class APPMenuServiceImpl implements APPMenuService {

    @Autowired
    private APPMenuDao appMenuDao;

    @Autowired
    private APPDictionaryDao appDictionaryDao;

    @Autowired
    private APPVersionDao appVersionDao;

    @Autowired
    private APPCategoryDao appCategoryDao;

    /**
     * 查询AppInfo的详情信息 + 条件查询
     * @param queryPageBean
     * @return
     */
    @Override
    public PageResult findAppInfo(QueryPageBean queryPageBean) {

        System.out.println(queryPageBean);
        /**
         *  appinfo条件查询List集合
         */
        //通过前台传来的分类名去查分类Id
        String category1 = queryPageBean.getCategoryLevel1();    //分类名
        String category2 = queryPageBean.getCategoryLevel2();
        String category3 = queryPageBean.getCategoryLevel3();
        Integer categoryId1 = null;
        Integer categoryId2 = null;
        Integer categoryId3 = null;
        if(category1 != null && category1 != ""){
            categoryId1 = this.findCategoryIdByCategoryName(category1);
            queryPageBean.setCategoryId1(categoryId1);
        }
        if(category2 != null && category2 != ""){
            categoryId2 = this.findCategoryIdByCategoryName(category2);
            queryPageBean.setCategoryId2(categoryId2);
        }
        if(category3 != null && category3 != ""){
            categoryId3 = this.findCategoryIdByCategoryName(category3);
            queryPageBean.setCategoryId3(categoryId3);
        }

        //通过所属平台字符串去查所属平台的valueId
        String flatForm1 = queryPageBean.getFlatForm();   //所属平台
        Integer flatFormValueId = null;
        if(flatForm1 != null && flatForm1 != ""){
            flatFormValueId = this.findflatformValueIdByflatformName(flatForm1);
            queryPageBean.setFlatFormValueID(flatFormValueId);
        }

        //通过状态字符串去查状态的Id
        String status1 = queryPageBean.getStatus();
        Integer statusValueId = null;
        if(status1 != null){
            statusValueId = this.findStatusValueIdByStatusName(status1);
            queryPageBean.setStatusValueId(statusValueId);
        }

        //完成分页查询，基于mybatis框架提供的分页助手插件完成
        //查询appInfo的信息，返回Page集合再转化为List
        Integer currentPage = queryPageBean.getCurrentPage();   //当前页
        Integer pageSize = queryPageBean.getPageSize();         //每页记录数
        PageHelper.startPage(currentPage,pageSize);
        Page<AppInfo> pages = appMenuDao.findByCondition(queryPageBean);
        long total = pages.getTotal();      //总记录数
        List<AppInfo> appInfos = pages.getResult();

        //创建返回给前台的QueryAppBean集合
        List<QueryAppResult> queryAppResults = null;
        QueryAppResult queryAppResult = null;

        //成功拿到数据
        if(appInfos != null){
            queryAppResults = new ArrayList<>();
            for (AppInfo appInfo : appInfos) {
                //通过statisId查询状态
                Integer statusId = appInfo.getStatus();
                String status = null;
                if(statusId != null) {
                    Map map = new HashMap<>();
                    map.put("typeCode", "APP_STATUS");
                    map.put("statusId", statusId);
                    status = appDictionaryDao.findStatusByStatusId(map); //当前软件状态
                }

                //通过flatformId查询所属平台
                Integer flatformId = appInfo.getFlatformId();
                String flatForm = null;
                if(flatformId != null) {
                    Map map1 = new HashMap();
                    map1.put("typeCode", "APP_FLATFORM");
                    map1.put("flatformId", flatformId);
                    flatForm = appDictionaryDao.findFlatFormByflatformId(map1);
                }
                
                //通过versionId查询版本号VersionNo
                Integer versionId = appInfo.getVersionId();
                String versionNo = null;
                if(versionId != null) {
                    versionNo = appVersionDao.findVersionNoByVersionId(versionId);
                }

                //通过categoryLevelId查分类名称
                Integer categoryLevelId1 = appInfo.getCategoryLevel1();
                Integer categoryLevelId2 = appInfo.getCategoryLevel2();
                Integer categoryLevelId3 = appInfo.getCategoryLevel3();
                String categoryLevel1 = appCategoryDao.findCategoryNameByCategoryId(categoryLevelId1);
                String categoryLevel2 = appCategoryDao.findCategoryNameByCategoryId(categoryLevelId2);
                String categoryLevel3 = appCategoryDao.findCategoryNameByCategoryId(categoryLevelId3);

                //将数据封装到该集合
                queryAppResult = new QueryAppResult();
                queryAppResult.setSoftwareName(appInfo.getSoftwareName());
                queryAppResult.setAPKName(appInfo.getAPKName());
                queryAppResult.setSoftwareSize(appInfo.getSoftwareSize());
                queryAppResult.setFlatForm(flatForm);
                queryAppResult.setStatus(status);
                queryAppResult.setVersionNo(versionNo);
                queryAppResult.setCategoryLevel1(categoryLevel1);
                queryAppResult.setCategoryLevel2(categoryLevel2);
                queryAppResult.setCategoryLevel3(categoryLevel3);
                queryAppResult.setDownloads(appInfo.getDownloads());

                //将queryAppResult对象添加到List<QueryAppResult>
                queryAppResults.add(queryAppResult);
            }
            return new PageResult(total, queryAppResults);
        } else {
            return new PageResult(total, queryAppResults);
        }

    }

    @Override
    public List<AppInfo> findAll() {
        return appMenuDao.findAll();
    }


    /**
     * 通过分类字符串去查分类的Id
     */
    public Integer findCategoryIdByCategoryName(String categoryName){
        Integer categoryId = appCategoryDao.findCategoryIdByCategoryName(categoryName);
        return categoryId;
    }

    /**
     * 通过所属平台字符串去查所属平台的valueId
     */
    public Integer findflatformValueIdByflatformName(String flatformName){
        Map map = new HashMap();
        map.put("typeCode", "APP_FLATFORM");
        map.put("valueName", flatformName);
        Integer flatformValueId = appDictionaryDao.findflatformValueIdByflatformName(map);
        return flatformValueId;
    }

    /**
     * 通过状态字符串去查状态的valueId
     */
    public Integer findStatusValueIdByStatusName(String statusName){
        Map map = new HashMap();
        map.put("typeCode", "APP_STATUS");
        map.put("valueName", statusName);
        Integer statusValueId = appDictionaryDao.findStatusValueIdByStatusName(map);
        return statusValueId;
    }



/*    //分页
    public void show(){
        PageHelper.startPage(1, 5);
        Page<AppInfo> pages = appMenuDao.findAll();
        List<AppInfo> result = pages.getResult();
        for (AppInfo appInfo : result) {
            System.out.println(appInfo);
        }}*/

}
