package com.jzt.api.domain;

public class NewsApproval {
    private Integer id;

    private Integer nid;

    private Integer ischeck;

    private Integer relatedAdmin;

    private Integer polarity;

    private Integer isrecom;

    private Integer clickTimes;

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

    public Integer getIscheck() {
        return ischeck;
    }

    public void setIscheck(Integer ischeck) {
        this.ischeck = ischeck;
    }

    public Integer getRelatedAdmin() {
        return relatedAdmin;
    }

    public void setRelatedAdmin(Integer relatedAdmin) {
        this.relatedAdmin = relatedAdmin;
    }

    public Integer getPolarity() {
        return polarity;
    }

    public void setPolarity(Integer polarity) {
        this.polarity = polarity;
    }

    public Integer getIsrecom() {
        return isrecom;
    }

    public void setIsrecom(Integer isrecom) {
        this.isrecom = isrecom;
    }

    public Integer getClickTimes() {
        return clickTimes;
    }

    public void setClickTimes(Integer clickTimes) {
        this.clickTimes = clickTimes;
    }
}