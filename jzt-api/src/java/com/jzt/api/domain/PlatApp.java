package com.jzt.api.domain;

import java.util.Date;

public class PlatApp {
    private Integer id;

    private Integer platId;

    private String name;

    private String iosAddress;

    private String androidAddress;

    private String iosCodeUrl;

    private String androidCodeUrl;

    private String logo;

    private Integer isIos;

    private Integer isAndroid;

    private Date createTime;

    private Date updateTime;

    private Integer isDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPlatId() {
        return platId;
    }

    public void setPlatId(Integer platId) {
        this.platId = platId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIosAddress() {
        return iosAddress;
    }

    public void setIosAddress(String iosAddress) {
        this.iosAddress = iosAddress;
    }

    public String getAndroidAddress() {
        return androidAddress;
    }

    public void setAndroidAddress(String androidAddress) {
        this.androidAddress = androidAddress;
    }

    public String getIosCodeUrl() {
        return iosCodeUrl;
    }

    public void setIosCodeUrl(String iosCodeUrl) {
        this.iosCodeUrl = iosCodeUrl;
    }

    public String getAndroidCodeUrl() {
        return androidCodeUrl;
    }

    public void setAndroidCodeUrl(String androidCodeUrl) {
        this.androidCodeUrl = androidCodeUrl;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Integer getIsIos() {
        return isIos;
    }

    public void setIsIos(Integer isIos) {
        this.isIos = isIos;
    }

    public Integer getIsAndroid() {
        return isAndroid;
    }

    public void setIsAndroid(Integer isAndroid) {
        this.isAndroid = isAndroid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}