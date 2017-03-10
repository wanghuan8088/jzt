package com.jzt.api.domain;

import java.util.Date;

public class BankEval {
    private Integer id;

    private Integer platId;

    private Double releaseScore;

    private Double profitScore;

    private Double riskScore;

    private Double productRichScore;

    private Double infoDisclosureScore;

    private Double evaluateScore;

    private Double totalScore;

    private Date createTime;

    private Date updateTime;

    private Integer isDelete;

    private Date startDate;

    private Date endDate;

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

    public Double getReleaseScore() {
        return releaseScore;
    }

    public void setReleaseScore(Double releaseScore) {
        this.releaseScore = releaseScore;
    }

    public Double getProfitScore() {
        return profitScore;
    }

    public void setProfitScore(Double profitScore) {
        this.profitScore = profitScore;
    }

    public Double getRiskScore() {
        return riskScore;
    }

    public void setRiskScore(Double riskScore) {
        this.riskScore = riskScore;
    }

    public Double getProductRichScore() {
        return productRichScore;
    }

    public void setProductRichScore(Double productRichScore) {
        this.productRichScore = productRichScore;
    }

    public Double getInfoDisclosureScore() {
        return infoDisclosureScore;
    }

    public void setInfoDisclosureScore(Double infoDisclosureScore) {
        this.infoDisclosureScore = infoDisclosureScore;
    }

    public Double getEvaluateScore() {
        return evaluateScore;
    }

    public void setEvaluateScore(Double evaluateScore) {
        this.evaluateScore = evaluateScore;
    }

    public Double getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Double totalScore) {
        this.totalScore = totalScore;
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}