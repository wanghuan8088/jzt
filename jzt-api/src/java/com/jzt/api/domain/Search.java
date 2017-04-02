package com.jzt.api.domain;

/**
 * 关键字搜索
 */
public class Search {

    private String keyword;

    private Integer platformCount;
    private Integer companyCount;
    private Integer bankProductCount;
    private Integer p2pProductCount;
    private Integer stockholderCount;//股东
    private Integer businessmanCount;//高管

    private Integer platformStartRow;
    private Integer platformPageSize;

    private Integer companyStartRow;
    private Integer companyPageSize;

    private Integer bankProductStartRow;
    private Integer bankProductPageSize;

    private Integer p2pProductStartRow;
    private Integer p2pProductPageSize;

    private Integer stockholderStartRow;
    private Integer stockholderPageSize;

    private Integer businessmanStartRow;
    private Integer businessmanPageSize;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }


    public Integer getPlatformCount() {
        return platformCount;
    }

    public void setPlatformCount(Integer platformCount) {
        this.platformCount = platformCount;
    }

    public Integer getCompanyCount() {
        return companyCount;
    }

    public void setCompanyCount(Integer companyCount) {
        this.companyCount = companyCount;
    }

    public Integer getBankProductCount() {
        return bankProductCount;
    }

    public void setBankProductCount(Integer bankProductCount) {
        this.bankProductCount = bankProductCount;
    }

    public Integer getP2pProductCount() {
        return p2pProductCount;
    }

    public void setP2pProductCount(Integer p2pProductCount) {
        this.p2pProductCount = p2pProductCount;
    }

    public Integer getStockholderCount() {
        return stockholderCount;
    }

    public void setStockholderCount(Integer stockholderCount) {
        this.stockholderCount = stockholderCount;
    }

    public Integer getBusinessmanCount() {
        return businessmanCount;
    }

    public void setBusinessmanCount(Integer businessmanCount) {
        this.businessmanCount = businessmanCount;
    }

    public Integer getPlatformStartRow() {
        return platformStartRow;
    }

    public void setPlatformStartRow(Integer platformStartRow) {
        this.platformStartRow = platformStartRow;
    }

    public Integer getPlatformPageSize() {
        return platformPageSize;
    }

    public void setPlatformPageSize(Integer platformPageSize) {
        this.platformPageSize = platformPageSize;
    }

    public Integer getCompanyStartRow() {
        return companyStartRow;
    }

    public void setCompanyStartRow(Integer companyStartRow) {
        this.companyStartRow = companyStartRow;
    }

    public Integer getCompanyPageSize() {
        return companyPageSize;
    }

    public void setCompanyPageSize(Integer companyPageSize) {
        this.companyPageSize = companyPageSize;
    }

    public Integer getBankProductStartRow() {
        return bankProductStartRow;
    }

    public void setBankProductStartRow(Integer bankProductStartRow) {
        this.bankProductStartRow = bankProductStartRow;
    }

    public Integer getBankProductPageSize() {
        return bankProductPageSize;
    }

    public void setBankProductPageSize(Integer bankProductPageSize) {
        this.bankProductPageSize = bankProductPageSize;
    }

    public Integer getP2pProductStartRow() {
        return p2pProductStartRow;
    }

    public void setP2pProductStartRow(Integer p2pProductStartRow) {
        this.p2pProductStartRow = p2pProductStartRow;
    }

    public Integer getP2pProductPageSize() {
        return p2pProductPageSize;
    }

    public void setP2pProductPageSize(Integer p2pProductPageSize) {
        this.p2pProductPageSize = p2pProductPageSize;
    }

    public Integer getStockholderStartRow() {
        return stockholderStartRow;
    }

    public void setStockholderStartRow(Integer stockholderStartRow) {
        this.stockholderStartRow = stockholderStartRow;
    }

    public Integer getStockholderPageSize() {
        return stockholderPageSize;
    }

    public void setStockholderPageSize(Integer stockholderPageSize) {
        this.stockholderPageSize = stockholderPageSize;
    }

    public Integer getBusinessmanStartRow() {
        return businessmanStartRow;
    }

    public void setBusinessmanStartRow(Integer businessmanStartRow) {
        this.businessmanStartRow = businessmanStartRow;
    }

    public Integer getBusinessmanPageSize() {
        return businessmanPageSize;
    }

    public void setBusinessmanPageSize(Integer businessmanPageSize) {
        this.businessmanPageSize = businessmanPageSize;
    }
}
