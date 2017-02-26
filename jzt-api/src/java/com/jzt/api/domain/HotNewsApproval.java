package com.jzt.api.domain;

import java.util.Date;

public class HotNewsApproval {
    private Integer id;

    private Integer nid;

    private Float hotpoint;

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

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public Float getHotpoint() {
        return hotpoint;
    }

    public void setHotpoint(Float hotpoint) {
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