package com.jzt.api.domain;

public class P2pPlatWithBLOBs extends P2pPlat {
    private String manageFeeDetail;

    private String prepaidFeeDetail;

    private String cashWithdrawalFeeDetail;

    public String getManageFeeDetail() {
        return manageFeeDetail;
    }

    public void setManageFeeDetail(String manageFeeDetail) {
        this.manageFeeDetail = manageFeeDetail;
    }

    public String getPrepaidFeeDetail() {
        return prepaidFeeDetail;
    }

    public void setPrepaidFeeDetail(String prepaidFeeDetail) {
        this.prepaidFeeDetail = prepaidFeeDetail;
    }

    public String getCashWithdrawalFeeDetail() {
        return cashWithdrawalFeeDetail;
    }

    public void setCashWithdrawalFeeDetail(String cashWithdrawalFeeDetail) {
        this.cashWithdrawalFeeDetail = cashWithdrawalFeeDetail;
    }
}