package com.jzt.api.domain;

import java.util.Date;

public class P2pLoan {
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String type;

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    private String icon;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p2p_loan.id
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p2p_loan.plat_id
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private Integer platId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p2p_loan.create_time
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p2p_loan.update_time
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p2p_loan.is_delete
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private Integer isDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p2p_loan.name
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p2p_loan.amount
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private Integer amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p2p_loan.interest_rate
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private Double interestRate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p2p_loan.start_time
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private Date startTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p2p_loan.limit_time
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private Integer limitTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p2p_loan.schedule
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private Double schedule;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p2p_loan.firstday_interest
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private Date firstdayInterest;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p2p_loan.mode_of_payment
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private String modeOfPayment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p2p_loan.purchase_amount
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private Integer purchaseAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p2p_loan.limit_amount
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private Integer limitAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p2p_loan.dock_product
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private String dockProduct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p2p_loan.protection_means
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private String protectionMeans;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p2p_loan.is_transfer
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private Integer isTransfer;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p2p_loan.state
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private Integer state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p2p_loan.product_url
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private String productUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p2p_loan.protocol
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private String protocol;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column p2p_loan.des
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private String des;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p2p_loan.id
     *
     * @return the value of p2p_loan.id
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p2p_loan.id
     *
     * @param id the value for p2p_loan.id
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p2p_loan.plat_id
     *
     * @return the value of p2p_loan.plat_id
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public Integer getPlatId() {
        return platId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p2p_loan.plat_id
     *
     * @param platId the value for p2p_loan.plat_id
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setPlatId(Integer platId) {
        this.platId = platId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p2p_loan.create_time
     *
     * @return the value of p2p_loan.create_time
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p2p_loan.create_time
     *
     * @param createTime the value for p2p_loan.create_time
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p2p_loan.update_time
     *
     * @return the value of p2p_loan.update_time
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p2p_loan.update_time
     *
     * @param updateTime the value for p2p_loan.update_time
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p2p_loan.is_delete
     *
     * @return the value of p2p_loan.is_delete
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p2p_loan.is_delete
     *
     * @param isDelete the value for p2p_loan.is_delete
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p2p_loan.name
     *
     * @return the value of p2p_loan.name
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p2p_loan.name
     *
     * @param name the value for p2p_loan.name
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p2p_loan.amount
     *
     * @return the value of p2p_loan.amount
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p2p_loan.amount
     *
     * @param amount the value for p2p_loan.amount
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p2p_loan.interest_rate
     *
     * @return the value of p2p_loan.interest_rate
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public Double getInterestRate() {
        return interestRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p2p_loan.interest_rate
     *
     * @param interestRate the value for p2p_loan.interest_rate
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p2p_loan.start_time
     *
     * @return the value of p2p_loan.start_time
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p2p_loan.start_time
     *
     * @param startTime the value for p2p_loan.start_time
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p2p_loan.limit_time
     *
     * @return the value of p2p_loan.limit_time
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public Integer getLimitTime() {
        return limitTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p2p_loan.limit_time
     *
     * @param limitTime the value for p2p_loan.limit_time
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setLimitTime(Integer limitTime) {
        this.limitTime = limitTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p2p_loan.schedule
     *
     * @return the value of p2p_loan.schedule
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public Double getSchedule() {
        return schedule;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p2p_loan.schedule
     *
     * @param schedule the value for p2p_loan.schedule
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setSchedule(Double schedule) {
        this.schedule = schedule;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p2p_loan.firstday_interest
     *
     * @return the value of p2p_loan.firstday_interest
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public Date getFirstdayInterest() {
        return firstdayInterest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p2p_loan.firstday_interest
     *
     * @param firstdayInterest the value for p2p_loan.firstday_interest
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setFirstdayInterest(Date firstdayInterest) {
        this.firstdayInterest = firstdayInterest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p2p_loan.mode_of_payment
     *
     * @return the value of p2p_loan.mode_of_payment
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public String getModeOfPayment() {
        return modeOfPayment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p2p_loan.mode_of_payment
     *
     * @param modeOfPayment the value for p2p_loan.mode_of_payment
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setModeOfPayment(String modeOfPayment) {
        this.modeOfPayment = modeOfPayment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p2p_loan.purchase_amount
     *
     * @return the value of p2p_loan.purchase_amount
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public Integer getPurchaseAmount() {
        return purchaseAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p2p_loan.purchase_amount
     *
     * @param purchaseAmount the value for p2p_loan.purchase_amount
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setPurchaseAmount(Integer purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p2p_loan.limit_amount
     *
     * @return the value of p2p_loan.limit_amount
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public Integer getLimitAmount() {
        return limitAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p2p_loan.limit_amount
     *
     * @param limitAmount the value for p2p_loan.limit_amount
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setLimitAmount(Integer limitAmount) {
        this.limitAmount = limitAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p2p_loan.dock_product
     *
     * @return the value of p2p_loan.dock_product
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public String getDockProduct() {
        return dockProduct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p2p_loan.dock_product
     *
     * @param dockProduct the value for p2p_loan.dock_product
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setDockProduct(String dockProduct) {
        this.dockProduct = dockProduct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p2p_loan.protection_means
     *
     * @return the value of p2p_loan.protection_means
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public String getProtectionMeans() {
        return protectionMeans;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p2p_loan.protection_means
     *
     * @param protectionMeans the value for p2p_loan.protection_means
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setProtectionMeans(String protectionMeans) {
        this.protectionMeans = protectionMeans;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p2p_loan.is_transfer
     *
     * @return the value of p2p_loan.is_transfer
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public Integer getIsTransfer() {
        return isTransfer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p2p_loan.is_transfer
     *
     * @param isTransfer the value for p2p_loan.is_transfer
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setIsTransfer(Integer isTransfer) {
        this.isTransfer = isTransfer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p2p_loan.state
     *
     * @return the value of p2p_loan.state
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p2p_loan.state
     *
     * @param state the value for p2p_loan.state
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p2p_loan.product_url
     *
     * @return the value of p2p_loan.product_url
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public String getProductUrl() {
        return productUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p2p_loan.product_url
     *
     * @param productUrl the value for p2p_loan.product_url
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p2p_loan.protocol
     *
     * @return the value of p2p_loan.protocol
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p2p_loan.protocol
     *
     * @param protocol the value for p2p_loan.protocol
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column p2p_loan.des
     *
     * @return the value of p2p_loan.des
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public String getDes() {
        return des;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column p2p_loan.des
     *
     * @param des the value for p2p_loan.des
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setDes(String des) {
        this.des = des;
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