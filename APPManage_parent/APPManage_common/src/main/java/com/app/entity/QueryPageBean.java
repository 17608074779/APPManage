package com.app.entity;

import java.io.Serializable;

/**
 * 封装查询条件
 */
public class QueryPageBean implements Serializable{
    private Integer currentPage;     //页码
    private Integer pageSize;        //每页记录数
    private String softwareName;     //软件名称
    private String status;           //App状态
    private Integer statusValueId;   //App状态valueID
    private String flatForm;         //所属平台
    private Integer flatFormValueID; //所属平台valueID
    private String categoryLevel1;   //一级分类
    private String categoryLevel2;   //二级分类
    private String categoryLevel3;   //三级分类
    private Integer categoryId1;     //一级分类ID
    private Integer categoryId2;     //二级分类ID
    private Integer categoryId3;     //三级分类ID

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getSoftwareName() {
        return softwareName;
    }

    public void setSoftwareName(String softwareName) {
        this.softwareName = softwareName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getStatusValueId() {
        return statusValueId;
    }

    public void setStatusValueId(Integer statusValueId) {
        this.statusValueId = statusValueId;
    }

    public String getFlatForm() {
        return flatForm;
    }

    public void setFlatForm(String flatForm) {
        this.flatForm = flatForm;
    }

    public Integer getFlatFormValueID() {
        return flatFormValueID;
    }

    public void setFlatFormValueID(Integer flatFormValueID) {
        this.flatFormValueID = flatFormValueID;
    }

    public String getCategoryLevel1() {
        return categoryLevel1;
    }

    public void setCategoryLevel1(String categoryLevel1) {
        this.categoryLevel1 = categoryLevel1;
    }

    public String getCategoryLevel2() {
        return categoryLevel2;
    }

    public void setCategoryLevel2(String categoryLevel2) {
        this.categoryLevel2 = categoryLevel2;
    }

    public String getCategoryLevel3() {
        return categoryLevel3;
    }

    public void setCategoryLevel3(String categoryLevel3) {
        this.categoryLevel3 = categoryLevel3;
    }

    public Integer getCategoryId1() {
        return categoryId1;
    }

    public void setCategoryId1(Integer categoryId1) {
        this.categoryId1 = categoryId1;
    }

    public Integer getCategoryId2() {
        return categoryId2;
    }

    public void setCategoryId2(Integer categoryId2) {
        this.categoryId2 = categoryId2;
    }

    public Integer getCategoryId3() {
        return categoryId3;
    }

    public void setCategoryId3(Integer categoryId3) {
        this.categoryId3 = categoryId3;
    }

    @Override
    public String toString() {
        return "QueryPageBean{" +
                "currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                ", softwareName='" + softwareName + '\'' +
                ", status='" + status + '\'' +
                ", statusValueId=" + statusValueId +
                ", flatForm='" + flatForm + '\'' +
                ", flatFormValueID=" + flatFormValueID +
                ", categoryLevel1='" + categoryLevel1 + '\'' +
                ", categoryLevel2='" + categoryLevel2 + '\'' +
                ", categoryLevel3='" + categoryLevel3 + '\'' +
                ", categoryId1=" + categoryId1 +
                ", categoryId2=" + categoryId2 +
                ", categoryId3=" + categoryId3 +
                '}';
    }
}