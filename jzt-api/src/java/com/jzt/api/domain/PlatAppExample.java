package com.jzt.api.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PlatAppExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlatAppExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIosAddressIsNull() {
            addCriterion("ios_address is null");
            return (Criteria) this;
        }

        public Criteria andIosAddressIsNotNull() {
            addCriterion("ios_address is not null");
            return (Criteria) this;
        }

        public Criteria andIosAddressEqualTo(String value) {
            addCriterion("ios_address =", value, "iosAddress");
            return (Criteria) this;
        }

        public Criteria andIosAddressNotEqualTo(String value) {
            addCriterion("ios_address <>", value, "iosAddress");
            return (Criteria) this;
        }

        public Criteria andIosAddressGreaterThan(String value) {
            addCriterion("ios_address >", value, "iosAddress");
            return (Criteria) this;
        }

        public Criteria andIosAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ios_address >=", value, "iosAddress");
            return (Criteria) this;
        }

        public Criteria andIosAddressLessThan(String value) {
            addCriterion("ios_address <", value, "iosAddress");
            return (Criteria) this;
        }

        public Criteria andIosAddressLessThanOrEqualTo(String value) {
            addCriterion("ios_address <=", value, "iosAddress");
            return (Criteria) this;
        }

        public Criteria andIosAddressLike(String value) {
            addCriterion("ios_address like", value, "iosAddress");
            return (Criteria) this;
        }

        public Criteria andIosAddressNotLike(String value) {
            addCriterion("ios_address not like", value, "iosAddress");
            return (Criteria) this;
        }

        public Criteria andIosAddressIn(List<String> values) {
            addCriterion("ios_address in", values, "iosAddress");
            return (Criteria) this;
        }

        public Criteria andIosAddressNotIn(List<String> values) {
            addCriterion("ios_address not in", values, "iosAddress");
            return (Criteria) this;
        }

        public Criteria andIosAddressBetween(String value1, String value2) {
            addCriterion("ios_address between", value1, value2, "iosAddress");
            return (Criteria) this;
        }

        public Criteria andIosAddressNotBetween(String value1, String value2) {
            addCriterion("ios_address not between", value1, value2, "iosAddress");
            return (Criteria) this;
        }

        public Criteria andAndroidAddressIsNull() {
            addCriterion("android_address is null");
            return (Criteria) this;
        }

        public Criteria andAndroidAddressIsNotNull() {
            addCriterion("android_address is not null");
            return (Criteria) this;
        }

        public Criteria andAndroidAddressEqualTo(String value) {
            addCriterion("android_address =", value, "androidAddress");
            return (Criteria) this;
        }

        public Criteria andAndroidAddressNotEqualTo(String value) {
            addCriterion("android_address <>", value, "androidAddress");
            return (Criteria) this;
        }

        public Criteria andAndroidAddressGreaterThan(String value) {
            addCriterion("android_address >", value, "androidAddress");
            return (Criteria) this;
        }

        public Criteria andAndroidAddressGreaterThanOrEqualTo(String value) {
            addCriterion("android_address >=", value, "androidAddress");
            return (Criteria) this;
        }

        public Criteria andAndroidAddressLessThan(String value) {
            addCriterion("android_address <", value, "androidAddress");
            return (Criteria) this;
        }

        public Criteria andAndroidAddressLessThanOrEqualTo(String value) {
            addCriterion("android_address <=", value, "androidAddress");
            return (Criteria) this;
        }

        public Criteria andAndroidAddressLike(String value) {
            addCriterion("android_address like", value, "androidAddress");
            return (Criteria) this;
        }

        public Criteria andAndroidAddressNotLike(String value) {
            addCriterion("android_address not like", value, "androidAddress");
            return (Criteria) this;
        }

        public Criteria andAndroidAddressIn(List<String> values) {
            addCriterion("android_address in", values, "androidAddress");
            return (Criteria) this;
        }

        public Criteria andAndroidAddressNotIn(List<String> values) {
            addCriterion("android_address not in", values, "androidAddress");
            return (Criteria) this;
        }

        public Criteria andAndroidAddressBetween(String value1, String value2) {
            addCriterion("android_address between", value1, value2, "androidAddress");
            return (Criteria) this;
        }

        public Criteria andAndroidAddressNotBetween(String value1, String value2) {
            addCriterion("android_address not between", value1, value2, "androidAddress");
            return (Criteria) this;
        }

        public Criteria andIosCodeUrlIsNull() {
            addCriterion("ios_code_url is null");
            return (Criteria) this;
        }

        public Criteria andIosCodeUrlIsNotNull() {
            addCriterion("ios_code_url is not null");
            return (Criteria) this;
        }

        public Criteria andIosCodeUrlEqualTo(String value) {
            addCriterion("ios_code_url =", value, "iosCodeUrl");
            return (Criteria) this;
        }

        public Criteria andIosCodeUrlNotEqualTo(String value) {
            addCriterion("ios_code_url <>", value, "iosCodeUrl");
            return (Criteria) this;
        }

        public Criteria andIosCodeUrlGreaterThan(String value) {
            addCriterion("ios_code_url >", value, "iosCodeUrl");
            return (Criteria) this;
        }

        public Criteria andIosCodeUrlGreaterThanOrEqualTo(String value) {
            addCriterion("ios_code_url >=", value, "iosCodeUrl");
            return (Criteria) this;
        }

        public Criteria andIosCodeUrlLessThan(String value) {
            addCriterion("ios_code_url <", value, "iosCodeUrl");
            return (Criteria) this;
        }

        public Criteria andIosCodeUrlLessThanOrEqualTo(String value) {
            addCriterion("ios_code_url <=", value, "iosCodeUrl");
            return (Criteria) this;
        }

        public Criteria andIosCodeUrlLike(String value) {
            addCriterion("ios_code_url like", value, "iosCodeUrl");
            return (Criteria) this;
        }

        public Criteria andIosCodeUrlNotLike(String value) {
            addCriterion("ios_code_url not like", value, "iosCodeUrl");
            return (Criteria) this;
        }

        public Criteria andIosCodeUrlIn(List<String> values) {
            addCriterion("ios_code_url in", values, "iosCodeUrl");
            return (Criteria) this;
        }

        public Criteria andIosCodeUrlNotIn(List<String> values) {
            addCriterion("ios_code_url not in", values, "iosCodeUrl");
            return (Criteria) this;
        }

        public Criteria andIosCodeUrlBetween(String value1, String value2) {
            addCriterion("ios_code_url between", value1, value2, "iosCodeUrl");
            return (Criteria) this;
        }

        public Criteria andIosCodeUrlNotBetween(String value1, String value2) {
            addCriterion("ios_code_url not between", value1, value2, "iosCodeUrl");
            return (Criteria) this;
        }

        public Criteria andAndroidCodeUrlIsNull() {
            addCriterion("android_code_url is null");
            return (Criteria) this;
        }

        public Criteria andAndroidCodeUrlIsNotNull() {
            addCriterion("android_code_url is not null");
            return (Criteria) this;
        }

        public Criteria andAndroidCodeUrlEqualTo(String value) {
            addCriterion("android_code_url =", value, "androidCodeUrl");
            return (Criteria) this;
        }

        public Criteria andAndroidCodeUrlNotEqualTo(String value) {
            addCriterion("android_code_url <>", value, "androidCodeUrl");
            return (Criteria) this;
        }

        public Criteria andAndroidCodeUrlGreaterThan(String value) {
            addCriterion("android_code_url >", value, "androidCodeUrl");
            return (Criteria) this;
        }

        public Criteria andAndroidCodeUrlGreaterThanOrEqualTo(String value) {
            addCriterion("android_code_url >=", value, "androidCodeUrl");
            return (Criteria) this;
        }

        public Criteria andAndroidCodeUrlLessThan(String value) {
            addCriterion("android_code_url <", value, "androidCodeUrl");
            return (Criteria) this;
        }

        public Criteria andAndroidCodeUrlLessThanOrEqualTo(String value) {
            addCriterion("android_code_url <=", value, "androidCodeUrl");
            return (Criteria) this;
        }

        public Criteria andAndroidCodeUrlLike(String value) {
            addCriterion("android_code_url like", value, "androidCodeUrl");
            return (Criteria) this;
        }

        public Criteria andAndroidCodeUrlNotLike(String value) {
            addCriterion("android_code_url not like", value, "androidCodeUrl");
            return (Criteria) this;
        }

        public Criteria andAndroidCodeUrlIn(List<String> values) {
            addCriterion("android_code_url in", values, "androidCodeUrl");
            return (Criteria) this;
        }

        public Criteria andAndroidCodeUrlNotIn(List<String> values) {
            addCriterion("android_code_url not in", values, "androidCodeUrl");
            return (Criteria) this;
        }

        public Criteria andAndroidCodeUrlBetween(String value1, String value2) {
            addCriterion("android_code_url between", value1, value2, "androidCodeUrl");
            return (Criteria) this;
        }

        public Criteria andAndroidCodeUrlNotBetween(String value1, String value2) {
            addCriterion("android_code_url not between", value1, value2, "androidCodeUrl");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("logo like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("logo not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("logo not between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andIsIosIsNull() {
            addCriterion("is_ios is null");
            return (Criteria) this;
        }

        public Criteria andIsIosIsNotNull() {
            addCriterion("is_ios is not null");
            return (Criteria) this;
        }

        public Criteria andIsIosEqualTo(Integer value) {
            addCriterion("is_ios =", value, "isIos");
            return (Criteria) this;
        }

        public Criteria andIsIosNotEqualTo(Integer value) {
            addCriterion("is_ios <>", value, "isIos");
            return (Criteria) this;
        }

        public Criteria andIsIosGreaterThan(Integer value) {
            addCriterion("is_ios >", value, "isIos");
            return (Criteria) this;
        }

        public Criteria andIsIosGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_ios >=", value, "isIos");
            return (Criteria) this;
        }

        public Criteria andIsIosLessThan(Integer value) {
            addCriterion("is_ios <", value, "isIos");
            return (Criteria) this;
        }

        public Criteria andIsIosLessThanOrEqualTo(Integer value) {
            addCriterion("is_ios <=", value, "isIos");
            return (Criteria) this;
        }

        public Criteria andIsIosIn(List<Integer> values) {
            addCriterion("is_ios in", values, "isIos");
            return (Criteria) this;
        }

        public Criteria andIsIosNotIn(List<Integer> values) {
            addCriterion("is_ios not in", values, "isIos");
            return (Criteria) this;
        }

        public Criteria andIsIosBetween(Integer value1, Integer value2) {
            addCriterion("is_ios between", value1, value2, "isIos");
            return (Criteria) this;
        }

        public Criteria andIsIosNotBetween(Integer value1, Integer value2) {
            addCriterion("is_ios not between", value1, value2, "isIos");
            return (Criteria) this;
        }

        public Criteria andIsAndroidIsNull() {
            addCriterion("is_android is null");
            return (Criteria) this;
        }

        public Criteria andIsAndroidIsNotNull() {
            addCriterion("is_android is not null");
            return (Criteria) this;
        }

        public Criteria andIsAndroidEqualTo(Integer value) {
            addCriterion("is_android =", value, "isAndroid");
            return (Criteria) this;
        }

        public Criteria andIsAndroidNotEqualTo(Integer value) {
            addCriterion("is_android <>", value, "isAndroid");
            return (Criteria) this;
        }

        public Criteria andIsAndroidGreaterThan(Integer value) {
            addCriterion("is_android >", value, "isAndroid");
            return (Criteria) this;
        }

        public Criteria andIsAndroidGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_android >=", value, "isAndroid");
            return (Criteria) this;
        }

        public Criteria andIsAndroidLessThan(Integer value) {
            addCriterion("is_android <", value, "isAndroid");
            return (Criteria) this;
        }

        public Criteria andIsAndroidLessThanOrEqualTo(Integer value) {
            addCriterion("is_android <=", value, "isAndroid");
            return (Criteria) this;
        }

        public Criteria andIsAndroidIn(List<Integer> values) {
            addCriterion("is_android in", values, "isAndroid");
            return (Criteria) this;
        }

        public Criteria andIsAndroidNotIn(List<Integer> values) {
            addCriterion("is_android not in", values, "isAndroid");
            return (Criteria) this;
        }

        public Criteria andIsAndroidBetween(Integer value1, Integer value2) {
            addCriterion("is_android between", value1, value2, "isAndroid");
            return (Criteria) this;
        }

        public Criteria andIsAndroidNotBetween(Integer value1, Integer value2) {
            addCriterion("is_android not between", value1, value2, "isAndroid");
            return (Criteria) this;
        }

        public Criteria andPlatIdIsNull() {
            addCriterion("plat_id is null");
            return (Criteria) this;
        }

        public Criteria andPlatIdIsNotNull() {
            addCriterion("plat_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlatIdEqualTo(Integer value) {
            addCriterion("plat_id =", value, "platId");
            return (Criteria) this;
        }

        public Criteria andPlatIdNotEqualTo(Integer value) {
            addCriterion("plat_id <>", value, "platId");
            return (Criteria) this;
        }

        public Criteria andPlatIdGreaterThan(Integer value) {
            addCriterion("plat_id >", value, "platId");
            return (Criteria) this;
        }

        public Criteria andPlatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("plat_id >=", value, "platId");
            return (Criteria) this;
        }

        public Criteria andPlatIdLessThan(Integer value) {
            addCriterion("plat_id <", value, "platId");
            return (Criteria) this;
        }

        public Criteria andPlatIdLessThanOrEqualTo(Integer value) {
            addCriterion("plat_id <=", value, "platId");
            return (Criteria) this;
        }

        public Criteria andPlatIdIn(List<Integer> values) {
            addCriterion("plat_id in", values, "platId");
            return (Criteria) this;
        }

        public Criteria andPlatIdNotIn(List<Integer> values) {
            addCriterion("plat_id not in", values, "platId");
            return (Criteria) this;
        }

        public Criteria andPlatIdBetween(Integer value1, Integer value2) {
            addCriterion("plat_id between", value1, value2, "platId");
            return (Criteria) this;
        }

        public Criteria andPlatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("plat_id not between", value1, value2, "platId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterionForJDBCDate("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}