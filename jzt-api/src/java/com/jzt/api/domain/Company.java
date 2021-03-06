package com.jzt.api.domain;

import java.util.Date;

public class Company {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.id
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.create_time
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.update_time
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.is_delete
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private Integer isDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.name
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.artificial_person
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private String artificialPerson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.type
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.registered_capital
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private Double registeredCapital;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.contributed_capital
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private Double contributedCapital;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.registered_address
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private String registeredAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.opening_date
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private Date openingDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.approved_date
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private Date approvedDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.registration_authority
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private String registrationAuthority;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.has_annual_report
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private Integer hasAnnualReport;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.business_licence
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private String businessLicence;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.licence_img
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private String licenceImg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.institutional_framework
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private String institutionalFramework;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.institutional_img
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private String institutionalImg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.tax_registration_num
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private String taxRegistrationNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company.tax_img
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private String taxImg;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.id
     *
     * @return the value of company.id
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.id
     *
     * @param id the value for company.id
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.create_time
     *
     * @return the value of company.create_time
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.create_time
     *
     * @param createTime the value for company.create_time
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.update_time
     *
     * @return the value of company.update_time
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.update_time
     *
     * @param updateTime the value for company.update_time
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.is_delete
     *
     * @return the value of company.is_delete
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.is_delete
     *
     * @param isDelete the value for company.is_delete
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.name
     *
     * @return the value of company.name
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.name
     *
     * @param name the value for company.name
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.artificial_person
     *
     * @return the value of company.artificial_person
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public String getArtificialPerson() {
        return artificialPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.artificial_person
     *
     * @param artificialPerson the value for company.artificial_person
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setArtificialPerson(String artificialPerson) {
        this.artificialPerson = artificialPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.type
     *
     * @return the value of company.type
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.type
     *
     * @param type the value for company.type
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.registered_capital
     *
     * @return the value of company.registered_capital
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public Double getRegisteredCapital() {
        return registeredCapital;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.registered_capital
     *
     * @param registeredCapital the value for company.registered_capital
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setRegisteredCapital(Double registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.contributed_capital
     *
     * @return the value of company.contributed_capital
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public Double getContributedCapital() {
        return contributedCapital;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.contributed_capital
     *
     * @param contributedCapital the value for company.contributed_capital
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setContributedCapital(Double contributedCapital) {
        this.contributedCapital = contributedCapital;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.registered_address
     *
     * @return the value of company.registered_address
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public String getRegisteredAddress() {
        return registeredAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.registered_address
     *
     * @param registeredAddress the value for company.registered_address
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setRegisteredAddress(String registeredAddress) {
        this.registeredAddress = registeredAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.opening_date
     *
     * @return the value of company.opening_date
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public Date getOpeningDate() {
        return openingDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.opening_date
     *
     * @param openingDate the value for company.opening_date
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setOpeningDate(Date openingDate) {
        this.openingDate = openingDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.approved_date
     *
     * @return the value of company.approved_date
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public Date getApprovedDate() {
        return approvedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.approved_date
     *
     * @param approvedDate the value for company.approved_date
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setApprovedDate(Date approvedDate) {
        this.approvedDate = approvedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.registration_authority
     *
     * @return the value of company.registration_authority
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public String getRegistrationAuthority() {
        return registrationAuthority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.registration_authority
     *
     * @param registrationAuthority the value for company.registration_authority
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setRegistrationAuthority(String registrationAuthority) {
        this.registrationAuthority = registrationAuthority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.has_annual_report
     *
     * @return the value of company.has_annual_report
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public Integer getHasAnnualReport() {
        return hasAnnualReport;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.has_annual_report
     *
     * @param hasAnnualReport the value for company.has_annual_report
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setHasAnnualReport(Integer hasAnnualReport) {
        this.hasAnnualReport = hasAnnualReport;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.business_licence
     *
     * @return the value of company.business_licence
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public String getBusinessLicence() {
        return businessLicence;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.business_licence
     *
     * @param businessLicence the value for company.business_licence
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setBusinessLicence(String businessLicence) {
        this.businessLicence = businessLicence;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.licence_img
     *
     * @return the value of company.licence_img
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public String getLicenceImg() {
        return licenceImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.licence_img
     *
     * @param licenceImg the value for company.licence_img
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setLicenceImg(String licenceImg) {
        this.licenceImg = licenceImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.institutional_framework
     *
     * @return the value of company.institutional_framework
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public String getInstitutionalFramework() {
        return institutionalFramework;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.institutional_framework
     *
     * @param institutionalFramework the value for company.institutional_framework
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setInstitutionalFramework(String institutionalFramework) {
        this.institutionalFramework = institutionalFramework;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.institutional_img
     *
     * @return the value of company.institutional_img
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public String getInstitutionalImg() {
        return institutionalImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.institutional_img
     *
     * @param institutionalImg the value for company.institutional_img
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setInstitutionalImg(String institutionalImg) {
        this.institutionalImg = institutionalImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.tax_registration_num
     *
     * @return the value of company.tax_registration_num
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public String getTaxRegistrationNum() {
        return taxRegistrationNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.tax_registration_num
     *
     * @param taxRegistrationNum the value for company.tax_registration_num
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setTaxRegistrationNum(String taxRegistrationNum) {
        this.taxRegistrationNum = taxRegistrationNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company.tax_img
     *
     * @return the value of company.tax_img
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public String getTaxImg() {
        return taxImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company.tax_img
     *
     * @param taxImg the value for company.tax_img
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setTaxImg(String taxImg) {
        this.taxImg = taxImg;
    }

    private int startRow;

    private int pageSize;

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

}