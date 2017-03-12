package com.jzt.api.domain;

import java.util.Date;

public class Company {
    private Integer id;

    private Date createTime;

    private Date updateTime;

    private Integer isDelete;

    private String name;

    private String artificialPerson;

    private String type;

    private Double registeredCapital;

    private Double contributedCapital;

    private String registeredAddress;

    private Date openingDate;

    private Date approvedDate;

    private String registrationAuthority;

    private Integer hasAnnualReport;

    private String businessLicence;

    private String licenceImg;

    private String institutionalFramework;

    private String institutionalImg;

    private String taxRegistrationNum;

    private String taxImg;

    protected int startRow;

    protected int pageSize;

    public int getStartRow() {
        return startRow;
    }

    public void setStartRow(int startRow) {
        this.startRow = startRow;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtificialPerson() {
        return artificialPerson;
    }

    public void setArtificialPerson(String artificialPerson) {
        this.artificialPerson = artificialPerson;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(Double registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    public Double getContributedCapital() {
        return contributedCapital;
    }

    public void setContributedCapital(Double contributedCapital) {
        this.contributedCapital = contributedCapital;
    }

    public String getRegisteredAddress() {
        return registeredAddress;
    }

    public void setRegisteredAddress(String registeredAddress) {
        this.registeredAddress = registeredAddress;
    }

    public Date getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(Date openingDate) {
        this.openingDate = openingDate;
    }

    public Date getApprovedDate() {
        return approvedDate;
    }

    public void setApprovedDate(Date approvedDate) {
        this.approvedDate = approvedDate;
    }

    public String getRegistrationAuthority() {
        return registrationAuthority;
    }

    public void setRegistrationAuthority(String registrationAuthority) {
        this.registrationAuthority = registrationAuthority;
    }

    public Integer getHasAnnualReport() {
        return hasAnnualReport;
    }

    public void setHasAnnualReport(Integer hasAnnualReport) {
        this.hasAnnualReport = hasAnnualReport;
    }

    public String getBusinessLicence() {
        return businessLicence;
    }

    public void setBusinessLicence(String businessLicence) {
        this.businessLicence = businessLicence;
    }

    public String getLicenceImg() {
        return licenceImg;
    }

    public void setLicenceImg(String licenceImg) {
        this.licenceImg = licenceImg;
    }

    public String getInstitutionalFramework() {
        return institutionalFramework;
    }

    public void setInstitutionalFramework(String institutionalFramework) {
        this.institutionalFramework = institutionalFramework;
    }

    public String getInstitutionalImg() {
        return institutionalImg;
    }

    public void setInstitutionalImg(String institutionalImg) {
        this.institutionalImg = institutionalImg;
    }

    public String getTaxRegistrationNum() {
        return taxRegistrationNum;
    }

    public void setTaxRegistrationNum(String taxRegistrationNum) {
        this.taxRegistrationNum = taxRegistrationNum;
    }

    public String getTaxImg() {
        return taxImg;
    }

    public void setTaxImg(String taxImg) {
        this.taxImg = taxImg;
    }
}