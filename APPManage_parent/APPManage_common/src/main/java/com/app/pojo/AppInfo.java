package com.app.pojo;

import java.io.Serializable;
import java.util.Date;
/**
 *  app信息
 */

public class AppInfo implements Serializable {

    private Integer id;//
    private String softwareName;
    private String APKName;
    private String supportROM;
    private String interfaceLanguage;
    private Float softwareSize;
    private String updateDate;//
    private Integer devId;
    private String appInfo;
    private Integer status;
    private String onSaleDate;//
    private String offSaleDate;//
    private Integer flatformId;
    private Integer categoryLevel3;
    private Integer downloads;
    private Integer createdBy;
    private String creationDate;
    private Integer modifyBy;//
    private String modifyDate;//
    private Integer categoryLevel1;
    private Integer categoryLevel2;
    private String logoPicPath;
    private String logoLocPath;
    private Integer versionId;//

    public AppInfo(String softwareName, String APKName, String supportROM, String interfaceLanguage, Float softwareSize, Integer devId, String appInfo, Integer status, Integer flatformId, Integer categoryLevel3, Integer downloads, Integer createdBy, String creationDate, Integer categoryLevel1, Integer categoryLevel2, String logoPicPath, String logoLocPath) {
        this.softwareName = softwareName;
        this.APKName = APKName;
        this.supportROM = supportROM;
        this.interfaceLanguage = interfaceLanguage;
        this.softwareSize = softwareSize;
        this.devId = devId;
        this.appInfo = appInfo;
        this.status = status;
        this.flatformId = flatformId;
        this.categoryLevel3 = categoryLevel3;
        this.downloads = downloads;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.categoryLevel1 = categoryLevel1;
        this.categoryLevel2 = categoryLevel2;
        this.logoPicPath = logoPicPath;
        this.logoLocPath = logoLocPath;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getSupportROM() {
        return supportROM;
    }

    public void setSupportROM(String supportROM) {
        this.supportROM = supportROM;
    }

    public String getInterfaceLanguage() {
        return interfaceLanguage;
    }

    public void setInterfaceLanguage(String interfaceLanguage) {
        this.interfaceLanguage = interfaceLanguage;
    }

    public Float getSoftwareSize() {
        return softwareSize;
    }

    public void setSoftwareSize(Float softwareSize) {
        this.softwareSize = softwareSize;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getDevId() {
        return devId;
    }

    public void setDevId(Integer devId) {
        this.devId = devId;
    }

    public String getAppInfo() {
        return appInfo;
    }

    public void setAppInfo(String appInfo) {
        this.appInfo = appInfo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getOnSaleDate() {
        return onSaleDate;
    }

    public void setOnSaleDate(String onSaleDate) {
        this.onSaleDate = onSaleDate;
    }

    public String getOffSaleDate() {
        return offSaleDate;
    }

    public void setOffSaleDate(String offSaleDate) {
        this.offSaleDate = offSaleDate;
    }

    public Integer getFlatformId() {
        return flatformId;
    }

    public void setFlatformId(Integer flatformId) {
        this.flatformId = flatformId;
    }

    public Integer getCategoryLevel3() {
        return categoryLevel3;
    }

    public void setCategoryLevel3(Integer categoryLevel3) {
        this.categoryLevel3 = categoryLevel3;
    }

    public Integer getDownloads() {
        return downloads;
    }

    public void setDownloads(Integer downloads) {
        this.downloads = downloads;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(Integer modifyBy) {
        this.modifyBy = modifyBy;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getCategoryLevel1() {
        return categoryLevel1;
    }

    public void setCategoryLevel1(Integer categoryLevel1) {
        this.categoryLevel1 = categoryLevel1;
    }

    public Integer getCategoryLevel2() {
        return categoryLevel2;
    }

    public void setCategoryLevel2(Integer categoryLevel2) {
        this.categoryLevel2 = categoryLevel2;
    }

    public String getLogoPicPath() {
        return logoPicPath;
    }

    public void setLogoPicPath(String logoPicPath) {
        this.logoPicPath = logoPicPath;
    }

    public String getLogoLocPath() {
        return logoLocPath;
    }

    public void setLogoLocPath(String logoLocPath) {
        this.logoLocPath = logoLocPath;
    }

    public Integer getVersionId() {
        return versionId;
    }

    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    @Override
    public String toString() {
        return "AppInfo{" +
                "id=" + id +
                ", softwareName='" + softwareName + '\'' +
                ", APKName='" + APKName + '\'' +
                ", supportROM='" + supportROM + '\'' +
                ", interfaceLanguage='" + interfaceLanguage + '\'' +
                ", softwareSize=" + softwareSize +
                ", updateDate='" + updateDate + '\'' +
                ", devId=" + devId +
                ", appInfo='" + appInfo + '\'' +
                ", status=" + status +
                ", onSaleDate='" + onSaleDate + '\'' +
                ", offSaleDate='" + offSaleDate + '\'' +
                ", flatformId=" + flatformId +
                ", categoryLevel3=" + categoryLevel3 +
                ", downloads=" + downloads +
                ", createdBy=" + createdBy +
                ", creationDate='" + creationDate + '\'' +
                ", modifyBy=" + modifyBy +
                ", modifyDate='" + modifyDate + '\'' +
                ", categoryLevel1=" + categoryLevel1 +
                ", categoryLevel2=" + categoryLevel2 +
                ", logoPicPath='" + logoPicPath + '\'' +
                ", logoLocPath='" + logoLocPath + '\'' +
                ", versionId=" + versionId +
                '}';
    }
}
