package com.app.pojo;

import java.io.Serializable;
import java.util.Date;

public class AdPromotion implements Serializable {

    private Long id; //主键id
    private Long appId; //appId（来源于：app_info表的主键id）
    private String adPicPath; //广告图片存储路径
    private Long adPV; //广告点击量
    private Integer carouselPosition; //轮播位
    private Date startTime; //起效时间
    private Date endTime; //失效时间
    private Long createBy; //创建者（来源于backend_user用户表的用户id）
    private Date creationDate; //创建时间
    private Long modifyBy; //更新者（来源于backend_user用户表的用户id）
    private Date modifyDate; //最新更新时间

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public String getAdPicPath() {
        return adPicPath;
    }

    public void setAdPicPath(String adPicPath) {
        this.adPicPath = adPicPath;
    }

    public Long getAdPV() {
        return adPV;
    }

    public void setAdPV(Long adPV) {
        this.adPV = adPV;
    }

    public Integer getCarouselPosition() {
        return carouselPosition;
    }

    public void setCarouselPosition(Integer carouselPosition) {
        this.carouselPosition = carouselPosition;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Long getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(Long modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Override
    public String toString() {
        return "AdPromotion{" +
                "id=" + id +
                ", appId=" + appId +
                ", adPicPath='" + adPicPath + '\'' +
                ", adPV=" + adPV +
                ", carouselPosition=" + carouselPosition +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", createBy=" + createBy +
                ", creationDate=" + creationDate +
                ", modifyBy=" + modifyBy +
                ", modifyDate=" + modifyDate +
                '}';
    }
}
