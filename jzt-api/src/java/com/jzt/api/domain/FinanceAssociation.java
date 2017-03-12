package com.jzt.api.domain;

import java.util.Date;

public class FinanceAssociation {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column finance_association.id
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column finance_association.company_id
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private Integer companyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column finance_association.name
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column finance_association.create_time
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column finance_association.update_time
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column finance_association.id
     *
     * @return the value of finance_association.id
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column finance_association.id
     *
     * @param id the value for finance_association.id
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column finance_association.company_id
     *
     * @return the value of finance_association.company_id
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column finance_association.company_id
     *
     * @param companyId the value for finance_association.company_id
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column finance_association.name
     *
     * @return the value of finance_association.name
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column finance_association.name
     *
     * @param name the value for finance_association.name
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column finance_association.create_time
     *
     * @return the value of finance_association.create_time
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column finance_association.create_time
     *
     * @param createTime the value for finance_association.create_time
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column finance_association.update_time
     *
     * @return the value of finance_association.update_time
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column finance_association.update_time
     *
     * @param updateTime the value for finance_association.update_time
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}