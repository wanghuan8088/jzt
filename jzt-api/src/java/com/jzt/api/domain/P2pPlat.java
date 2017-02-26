package com.jzt.api.domain;

import java.util.Date;

public class P2pPlat {
    private Integer id;

    private Integer platId;

    private Integer isAutoBid;

    private Integer isEquitableAssignment;

    private String manageFee;

    private String prepaidFee;

    private String cashWithdrawalFee;

    private String vipFee;

    private String transferFee;

    private String modeOfPayment;

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

    public Integer getIsAutoBid() {
        return isAutoBid;
    }

    public void setIsAutoBid(Integer isAutoBid) {
        this.isAutoBid = isAutoBid;
    }

    public Integer getIsEquitableAssignment() {
        return isEquitableAssignment;
    }

    public void setIsEquitableAssignment(Integer isEquitableAssignment) {
        this.isEquitableAssignment = isEquitableAssignment;
    }

    public String getManageFee() {
        return manageFee;
    }

    public void setManageFee(String manageFee) {
        this.manageFee = manageFee;
    }

    public String getPrepaidFee() {
        return prepaidFee;
    }

    public void setPrepaidFee(String prepaidFee) {
        this.prepaidFee = prepaidFee;
    }

    public String getCashWithdrawalFee() {
        return cashWithdrawalFee;
    }

    public void setCashWithdrawalFee(String cashWithdrawalFee) {
        this.cashWithdrawalFee = cashWithdrawalFee;
    }

    public String getVipFee() {
        return vipFee;
    }

    public void setVipFee(String vipFee) {
        this.vipFee = vipFee;
    }

    public String getTransferFee() {
        return transferFee;
    }

    public void setTransferFee(String transferFee) {
        this.transferFee = transferFee;
    }

    public String getModeOfPayment() {
        return modeOfPayment;
    }

    public void setModeOfPayment(String modeOfPayment) {
        this.modeOfPayment = modeOfPayment;
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