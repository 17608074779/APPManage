package com.app.entity;

import java.io.Serializable;

public class QueryAppResult implements Serializable {

    private String softwareName;      //软件名称
    private String APKName;           //APK名称
    private Float softwareSize;       //软件大小
    private String flatForm;          //所属平台
    private String categoryLevel1;    //一级分类
    private String categoryLevel2;    //二级分类
    private String categoryLevel3;    //三级分类
    private String  status;           //状态
    private Integer downloads;        //下载次数
    private String versionNo;           //最新版本号


    public String getSoftwareName() {
        return softwareName;
    }

    public void setSoftwareName(String softwareName) {
        this.softwareName = softwareName;
    }

    public String getAPKName() {
        return APKName;
    }

    public void setAPKName(String APKName) {
        this.APKName = APKName;
    }

    public Float getSoftwareSize() {
        return softwareSize;
    }

    public void setSoftwareSize(Float softwareSize) {
        this.softwareSize = softwareSize;
    }

    public String getFlatForm() {
        return flatForm;
    }

    public void setFlatForm(String flatForm) {
        this.flatForm = flatForm;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getDownloads() {
        return downloads;
    }

    public void setDownloads(Integer downloads) {
        this.downloads = downloads;
    }

    public String getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(String versionNo) {
        this.versionNo = versionNo;
    }

    @Override
    public String toString() {
        return "QueryAppResult{" +
                "softwareName='" + softwareName + '\'' +
                ", APKName='" + APKName + '\'' +
                ", softwareSize=" + softwareSize +
                ", flatForm='" + flatForm + '\'' +
                ", categoryLevel1='" + categoryLevel1 + '\'' +
                ", categoryLevel2='" + categoryLevel2 + '\'' +
                ", categoryLevel3='" + categoryLevel3 + '\'' +
                ", status='" + status + '\'' +
                ", downloads=" + downloads +
                ", versionNo='" + versionNo + '\'' +
                '}';
    }
}
