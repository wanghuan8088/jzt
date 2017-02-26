package com.jzt.api.domain;

import java.util.Date;

public class BankInfo {
    private Integer id;

    private Integer bankId;

    private Date startDate;

    private Date endDate;

    private Double totalProfit;

    private Double totalEquity;

    private Double badAsset;

    private Double badLoanRate;

    private Double totalProvision;

    private Double lossAsset;

    private Double totalAsset;

    private Double totalDeposit;

    private Double totalLoan;

    private Double totalOther;

    private Double income;

    private Double interestIncome;

    private Double commission;

    private Integer stockholderNum;

    private Date createTime;

    private Date updateTime;

    private Integer isDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
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

    public Double getTotalProfit() {
        return totalProfit;
    }

    public void setTotalProfit(Double totalProfit) {
        this.totalProfit = totalProfit;
    }

    public Double getTotalEquity() {
        return totalEquity;
    }

    public void setTotalEquity(Double totalEquity) {
        this.totalEquity = totalEquity;
    }

    public Double getBadAsset() {
        return badAsset;
    }

    public void setBadAsset(Double badAsset) {
        this.badAsset = badAsset;
    }

    public Double getBadLoanRate() {
        return badLoanRate;
    }

    public void setBadLoanRate(Double badLoanRate) {
        this.badLoanRate = badLoanRate;
    }

    public Double getTotalProvision() {
        return totalProvision;
    }

    public void setTotalProvision(Double totalProvision) {
        this.totalProvision = totalProvision;
    }

    public Double getLossAsset() {
        return lossAsset;
    }

    public void setLossAsset(Double lossAsset) {
        this.lossAsset = lossAsset;
    }

    public Double getTotalAsset() {
        return totalAsset;
    }

    public void setTotalAsset(Double totalAsset) {
        this.totalAsset = totalAsset;
    }

    public Double getTotalDeposit() {
        return totalDeposit;
    }

    public void setTotalDeposit(Double totalDeposit) {
        this.totalDeposit = totalDeposit;
    }

    public Double getTotalLoan() {
        return totalLoan;
    }

    public void setTotalLoan(Double totalLoan) {
        this.totalLoan = totalLoan;
    }

    public Double getTotalOther() {
        return totalOther;
    }

    public void setTotalOther(Double totalOther) {
        this.totalOther = totalOther;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public Double getInterestIncome() {
        return interestIncome;
    }

    public void setInterestIncome(Double interestIncome) {
        this.interestIncome = interestIncome;
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }

    public Integer getStockholderNum() {
        return stockholderNum;
    }

    public void setStockholderNum(Integer stockholderNum) {
        this.stockholderNum = stockholderNum;
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