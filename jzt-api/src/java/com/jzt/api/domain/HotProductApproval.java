package com.jzt.api.domain;

import java.util.Date;

public class HotProductApproval {
    private Integer id;

    private Integer pid;

    private Integer hotpoint;

    private String ischeck;

    private Integer relatedAdmin;

    private Date publishTime;

    private Integer idx;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getHotpoint() {
        return hotpoint;
    }

    public void setHotpoint(Integer hotpoint) {
        this.hotpoint = hotpoint;
    }

    public String getIscheck() {
        return ischeck;
    }

    public void setIscheck(String ischeck) {
        this.ischeck = ischeck;
    }

    public Integer getRelatedAdmin() {
        return relatedAdmin;
    }

    public void setRelatedAdmin(Integer relatedAdmin) {
        this.relatedAdmin = relatedAdmin;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }
}