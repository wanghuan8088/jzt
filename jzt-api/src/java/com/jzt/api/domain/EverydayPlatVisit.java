package com.jzt.api.domain;

import java.util.Date;

public class EverydayPlatVisit {
    private Integer id;

    private Integer pid;

    private Integer numClick;

    private Integer numChange;

    private Date lastUpdate;

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

    public Integer getNumClick() {
        return numClick;
    }

    public void setNumClick(Integer numClick) {
        this.numClick = numClick;
    }

    public Integer getNumChange() {
        return numChange;
    }

    public void setNumChange(Integer numChange) {
        this.numChange = numChange;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}