package com.jzt.api.domain;

import java.util.Date;

public class AppFinanceFavorite {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_finance_favorite.id
     *
     * @mbggenerated Sun Mar 12 23:14:31 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_finance_favorite.title
     *
     * @mbggenerated Sun Mar 12 23:14:31 CST 2017
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_finance_favorite.order
     *
     * @mbggenerated Sun Mar 12 23:14:31 CST 2017
     */
    private Integer order;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_finance_favorite.create_time
     *
     * @mbggenerated Sun Mar 12 23:14:31 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_finance_favorite.update_time
     *
     * @mbggenerated Sun Mar 12 23:14:31 CST 2017
     */
    private Date updateTime;

	
	/** 
    * @Fields appFinanceFavoriteOptions : for celletion of list
    */ 
    private List<AppFinanceFavoriteOptions> appFinanceFavoriteOptions;
    

    /**
	 * @return the appFinanceFavoriteOptions
	 */
	public List<AppFinanceFavoriteOptions> getAppFinanceFavoriteOptions() {
		return appFinanceFavoriteOptions;
	}

	/**
	 * @param appFinanceFavoriteOptions the appFinanceFavoriteOptions to set
	 */
	public void setAppFinanceFavoriteOptions(
			List<AppFinanceFavoriteOptions> appFinanceFavoriteOptions) {
		this.appFinanceFavoriteOptions = appFinanceFavoriteOptions;
	}
	
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_finance_favorite.id
     *
     * @return the value of app_finance_favorite.id
     *
     * @mbggenerated Sun Mar 12 23:14:31 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_finance_favorite.id
     *
     * @param id the value for app_finance_favorite.id
     *
     * @mbggenerated Sun Mar 12 23:14:31 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_finance_favorite.title
     *
     * @return the value of app_finance_favorite.title
     *
     * @mbggenerated Sun Mar 12 23:14:31 CST 2017
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_finance_favorite.title
     *
     * @param title the value for app_finance_favorite.title
     *
     * @mbggenerated Sun Mar 12 23:14:31 CST 2017
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_finance_favorite.order
     *
     * @return the value of app_finance_favorite.order
     *
     * @mbggenerated Sun Mar 12 23:14:31 CST 2017
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_finance_favorite.order
     *
     * @param order the value for app_finance_favorite.order
     *
     * @mbggenerated Sun Mar 12 23:14:31 CST 2017
     */
    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_finance_favorite.create_time
     *
     * @return the value of app_finance_favorite.create_time
     *
     * @mbggenerated Sun Mar 12 23:14:31 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_finance_favorite.create_time
     *
     * @param createTime the value for app_finance_favorite.create_time
     *
     * @mbggenerated Sun Mar 12 23:14:31 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_finance_favorite.update_time
     *
     * @return the value of app_finance_favorite.update_time
     *
     * @mbggenerated Sun Mar 12 23:14:31 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_finance_favorite.update_time
     *
     * @param updateTime the value for app_finance_favorite.update_time
     *
     * @mbggenerated Sun Mar 12 23:14:31 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}