package com.jzt.api.domain;

import java.util.Date;

public class AdverProductNow {
    private Integer id;

    private String feature;

    private Integer relatedAdmin;

    private Float sortValue;

    private Integer productId;

    private Date publishTime;

    private Integer idx;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public Integer getRelatedAdmin() {
        return relatedAdmin;
    }

    public void setRelatedAdmin(Integer relatedAdmin) {
        this.relatedAdmin = relatedAdmin;
    }

    public Float getSortValue() {
        return sortValue;
    }

    public void setSortValue(Float sortValue) {
        this.sortValue = sortValue;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
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