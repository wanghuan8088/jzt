package com.jzt.api.domain;

/**
 * Created by wanghuan on 22/03/2017.
 */
public class Search {

    private String keyword;
    private Integer platformCount;
    private Integer companyCount;
    private Integer bankProductCount;
    private Integer p2pProductCount;
    private Integer stockholderCount;//股东
    private Integer businessmanCount;//高管

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
}
