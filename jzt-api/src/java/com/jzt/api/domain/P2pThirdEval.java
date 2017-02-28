package com.jzt.api.domain;

import java.util.Date;

public class P2pThirdEval {
    private Integer id;

    private Integer pid;

    private Float developmentRate;

    private Float mobility;

    private Float turnover;

    private Float benefit;

    private Float dispersion;

    private Date updateDate;

    private Float popularity;

    private Float transparency;

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

    public Float getDevelopmentRate() {
        return developmentRate;
    }

    public void setDevelopmentRate(Float developmentRate) {
        this.developmentRate = developmentRate;
    }

    public Float getMobility() {
        return mobility;
    }

    public void setMobility(Float mobility) {
        this.mobility = mobility;
    }

    public Float getTurnover() {
        return turnover;
    }

    public void setTurnover(Float turnover) {
        this.turnover = turnover;
    }

    public Float getBenefit() {
        return benefit;
    }

    public void setBenefit(Float benefit) {
        this.benefit = benefit;
    }

    public Float getDispersion() {
        return dispersion;
    }

    public void setDispersion(Float dispersion) {
        this.dispersion = dispersion;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Float getPopularity() {
        return popularity;
    }

    public void setPopularity(Float popularity) {
        this.popularity = popularity;
    }

    public Float getTransparency() {
        return transparency;
    }

    public void setTransparency(Float transparency) {
        this.transparency = transparency;
    }
}