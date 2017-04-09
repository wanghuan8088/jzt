package com.jzt.api.domain;

import java.util.Date;

public class Platform {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform.id
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform.type
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private Integer type;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    private String typeName;

    private String stateName;

    private String totalScore;

    private String types;
    
    

    /**
	 * @return the types
	 */
	public String getTypes() {
		return types;
	}

	/**
	 * @param types the types to set
	 */
	public void setTypes(String types) {
		this.types = types;
	}

	public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    private String rank;

    public String getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(String registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    private String registeredCapital;


    public String getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(String totalScore) {
        this.totalScore = totalScore;
    }

    public String getTotalAsset() {
        return totalAsset;
    }

    public void setTotalAsset(String totalAsset) {
        this.totalAsset = totalAsset;
    }

    private String totalAsset;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform.name
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform.name_before
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private String nameBefore;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform.state
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private Integer state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform.icon
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private String icon;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform.start_time
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private Date startTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform.end_time
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private Date endTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform.province
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private Integer province;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform.city
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private Integer city;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform.create_time
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform.update_time
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform.is_delete
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private Integer isDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column platform.company
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    private Integer company;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    private Integer userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform.id
     *
     * @return the value of platform.id
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform.id
     *
     * @param id the value for platform.id
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform.type
     *
     * @return the value of platform.type
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform.type
     *
     * @param type the value for platform.type
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform.name
     *
     * @return the value of platform.name
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform.name
     *
     * @param name the value for platform.name
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform.name_before
     *
     * @return the value of platform.name_before
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public String getNameBefore() {
        return nameBefore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform.name_before
     *
     * @param nameBefore the value for platform.name_before
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setNameBefore(String nameBefore) {
        this.nameBefore = nameBefore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform.state
     *
     * @return the value of platform.state
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform.state
     *
     * @param state the value for platform.state
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform.icon
     *
     * @return the value of platform.icon
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform.icon
     *
     * @param icon the value for platform.icon
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform.start_time
     *
     * @return the value of platform.start_time
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform.start_time
     *
     * @param startTime the value for platform.start_time
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform.end_time
     *
     * @return the value of platform.end_time
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform.end_time
     *
     * @param endTime the value for platform.end_time
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform.province
     *
     * @return the value of platform.province
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public Integer getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform.province
     *
     * @param province the value for platform.province
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setProvince(Integer province) {
        this.province = province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform.city
     *
     * @return the value of platform.city
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public Integer getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform.city
     *
     * @param city the value for platform.city
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setCity(Integer city) {
        this.city = city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform.create_time
     *
     * @return the value of platform.create_time
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform.create_time
     *
     * @param createTime the value for platform.create_time
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform.update_time
     *
     * @return the value of platform.update_time
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform.update_time
     *
     * @param updateTime the value for platform.update_time
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform.is_delete
     *
     * @return the value of platform.is_delete
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform.is_delete
     *
     * @param isDelete the value for platform.is_delete
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column platform.company
     *
     * @return the value of platform.company
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public Integer getCompany() {
        return company;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column platform.company
     *
     * @param company the value for platform.company
     *
     * @mbggenerated Sun Mar 12 23:14:32 CST 2017
     */
    public void setCompany(Integer company) {
        this.company = company;
    }

    private int startRow;

    private int pageSize;
    
    private int tagType;

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

	public int getTagType() {
		return tagType;
	}

	public void setTagType(int tagType) {
		this.tagType = tagType;
	}

}
