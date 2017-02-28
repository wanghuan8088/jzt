package com.jzt.api.domain;

import java.util.Date;

public class P2pSecurity {
    private Integer id;

    private Integer p2pId;

    private String tenderSecurity;

    private String securityMode;

    private String securityModeUrl;

    private String guaranteeInstitutions;

    private Double riskReserveInit;

    private String trustFunds;

    private String custodianInstitution;

    private String trustFundsTuo;

    private Date createTime;

    private Date updateTime;

    private Integer isDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getP2pId() {
        return p2pId;
    }

    public void setP2pId(Integer p2pId) {
        this.p2pId = p2pId;
    }

    public String getTenderSecurity() {
        return tenderSecurity;
    }

    public void setTenderSecurity(String tenderSecurity) {
        this.tenderSecurity = tenderSecurity;
    }

    public String getSecurityMode() {
        return securityMode;
    }

    public void setSecurityMode(String securityMode) {
        this.securityMode = securityMode;
    }

    public String getSecurityModeUrl() {
        return securityModeUrl;
    }

    public void setSecurityModeUrl(String securityModeUrl) {
        this.securityModeUrl = securityModeUrl;
    }

    public String getGuaranteeInstitutions() {
        return guaranteeInstitutions;
    }

    public void setGuaranteeInstitutions(String guaranteeInstitutions) {
        this.guaranteeInstitutions = guaranteeInstitutions;
    }

    public Double getRiskReserveInit() {
        return riskReserveInit;
    }

    public void setRiskReserveInit(Double riskReserveInit) {
        this.riskReserveInit = riskReserveInit;
    }

    public String getTrustFunds() {
        return trustFunds;
    }

    public void setTrustFunds(String trustFunds) {
        this.trustFunds = trustFunds;
    }

    public String getCustodianInstitution() {
        return custodianInstitution;
    }

    public void setCustodianInstitution(String custodianInstitution) {
        this.custodianInstitution = custodianInstitution;
    }

    public String getTrustFundsTuo() {
        return trustFundsTuo;
    }

    public void setTrustFundsTuo(String trustFundsTuo) {
        this.trustFundsTuo = trustFundsTuo;
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