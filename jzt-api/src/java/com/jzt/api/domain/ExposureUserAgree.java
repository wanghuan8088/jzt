package com.jzt.api.domain;

import java.util.Date;

public class ExposureUserAgree {
    private Integer id;

    private Integer userId;

    private Date createdDate;

    private Integer exposureId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getExposureId() {
        return exposureId;
    }

    public void setExposureId(Integer exposureId) {
        this.exposureId = exposureId;
    }
}