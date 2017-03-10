package com.jzt.api.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BankProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankProductExample() {
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

        public Criteria andProductNumIsNull() {
            addCriterion("product_num is null");
            return (Criteria) this;
        }

        public Criteria andProductNumIsNotNull() {
            addCriterion("product_num is not null");
            return (Criteria) this;
        }

        public Criteria andProductNumEqualTo(String value) {
            addCriterion("product_num =", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotEqualTo(String value) {
            addCriterion("product_num <>", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumGreaterThan(String value) {
            addCriterion("product_num >", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumGreaterThanOrEqualTo(String value) {
            addCriterion("product_num >=", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLessThan(String value) {
            addCriterion("product_num <", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLessThanOrEqualTo(String value) {
            addCriterion("product_num <=", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLike(String value) {
            addCriterion("product_num like", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotLike(String value) {
            addCriterion("product_num not like", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumIn(List<String> values) {
            addCriterion("product_num in", values, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotIn(List<String> values) {
            addCriterion("product_num not in", values, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumBetween(String value1, String value2) {
            addCriterion("product_num between", value1, value2, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotBetween(String value1, String value2) {
            addCriterion("product_num not between", value1, value2, "productNum");
            return (Criteria) this;
        }

        public Criteria andPeriodNumIsNull() {
            addCriterion("period_num is null");
            return (Criteria) this;
        }

        public Criteria andPeriodNumIsNotNull() {
            addCriterion("period_num is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodNumEqualTo(Integer value) {
            addCriterion("period_num =", value, "periodNum");
            return (Criteria) this;
        }

        public Criteria andPeriodNumNotEqualTo(Integer value) {
            addCriterion("period_num <>", value, "periodNum");
            return (Criteria) this;
        }

        public Criteria andPeriodNumGreaterThan(Integer value) {
            addCriterion("period_num >", value, "periodNum");
            return (Criteria) this;
        }

        public Criteria andPeriodNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("period_num >=", value, "periodNum");
            return (Criteria) this;
        }

        public Criteria andPeriodNumLessThan(Integer value) {
            addCriterion("period_num <", value, "periodNum");
            return (Criteria) this;
        }

        public Criteria andPeriodNumLessThanOrEqualTo(Integer value) {
            addCriterion("period_num <=", value, "periodNum");
            return (Criteria) this;
        }

        public Criteria andPeriodNumIn(List<Integer> values) {
            addCriterion("period_num in", values, "periodNum");
            return (Criteria) this;
        }

        public Criteria andPeriodNumNotIn(List<Integer> values) {
            addCriterion("period_num not in", values, "periodNum");
            return (Criteria) this;
        }

        public Criteria andPeriodNumBetween(Integer value1, Integer value2) {
            addCriterion("period_num between", value1, value2, "periodNum");
            return (Criteria) this;
        }

        public Criteria andPeriodNumNotBetween(Integer value1, Integer value2) {
            addCriterion("period_num not between", value1, value2, "periodNum");
            return (Criteria) this;
        }

        public Criteria andProfitTypeIsNull() {
            addCriterion("profit_type is null");
            return (Criteria) this;
        }

        public Criteria andProfitTypeIsNotNull() {
            addCriterion("profit_type is not null");
            return (Criteria) this;
        }

        public Criteria andProfitTypeEqualTo(String value) {
            addCriterion("profit_type =", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeNotEqualTo(String value) {
            addCriterion("profit_type <>", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeGreaterThan(String value) {
            addCriterion("profit_type >", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeGreaterThanOrEqualTo(String value) {
            addCriterion("profit_type >=", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeLessThan(String value) {
            addCriterion("profit_type <", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeLessThanOrEqualTo(String value) {
            addCriterion("profit_type <=", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeLike(String value) {
            addCriterion("profit_type like", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeNotLike(String value) {
            addCriterion("profit_type not like", value, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeIn(List<String> values) {
            addCriterion("profit_type in", values, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeNotIn(List<String> values) {
            addCriterion("profit_type not in", values, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeBetween(String value1, String value2) {
            addCriterion("profit_type between", value1, value2, "profitType");
            return (Criteria) this;
        }

        public Criteria andProfitTypeNotBetween(String value1, String value2) {
            addCriterion("profit_type not between", value1, value2, "profitType");
            return (Criteria) this;
        }

        public Criteria andLimitDayIsNull() {
            addCriterion("limit_day is null");
            return (Criteria) this;
        }

        public Criteria andLimitDayIsNotNull() {
            addCriterion("limit_day is not null");
            return (Criteria) this;
        }

        public Criteria andLimitDayEqualTo(Integer value) {
            addCriterion("limit_day =", value, "limitDay");
            return (Criteria) this;
        }

        public Criteria andLimitDayNotEqualTo(Integer value) {
            addCriterion("limit_day <>", value, "limitDay");
            return (Criteria) this;
        }

        public Criteria andLimitDayGreaterThan(Integer value) {
            addCriterion("limit_day >", value, "limitDay");
            return (Criteria) this;
        }

        public Criteria andLimitDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("limit_day >=", value, "limitDay");
            return (Criteria) this;
        }

        public Criteria andLimitDayLessThan(Integer value) {
            addCriterion("limit_day <", value, "limitDay");
            return (Criteria) this;
        }

        public Criteria andLimitDayLessThanOrEqualTo(Integer value) {
            addCriterion("limit_day <=", value, "limitDay");
            return (Criteria) this;
        }

        public Criteria andLimitDayIn(List<Integer> values) {
            addCriterion("limit_day in", values, "limitDay");
            return (Criteria) this;
        }

        public Criteria andLimitDayNotIn(List<Integer> values) {
            addCriterion("limit_day not in", values, "limitDay");
            return (Criteria) this;
        }

        public Criteria andLimitDayBetween(Integer value1, Integer value2) {
            addCriterion("limit_day between", value1, value2, "limitDay");
            return (Criteria) this;
        }

        public Criteria andLimitDayNotBetween(Integer value1, Integer value2) {
            addCriterion("limit_day not between", value1, value2, "limitDay");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterionForJDBCDate("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterionForJDBCDate("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNull() {
            addCriterion("deadline is null");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNotNull() {
            addCriterion("deadline is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlineEqualTo(Date value) {
            addCriterionForJDBCDate("deadline =", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotEqualTo(Date value) {
            addCriterionForJDBCDate("deadline <>", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThan(Date value) {
            addCriterionForJDBCDate("deadline >", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("deadline >=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThan(Date value) {
            addCriterionForJDBCDate("deadline <", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("deadline <=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineIn(List<Date> values) {
            addCriterionForJDBCDate("deadline in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotIn(List<Date> values) {
            addCriterionForJDBCDate("deadline not in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("deadline between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("deadline not between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDisbankIsNull() {
            addCriterion("disbank is null");
            return (Criteria) this;
        }

        public Criteria andDisbankIsNotNull() {
            addCriterion("disbank is not null");
            return (Criteria) this;
        }

        public Criteria andDisbankEqualTo(String value) {
            addCriterion("disbank =", value, "disbank");
            return (Criteria) this;
        }

        public Criteria andDisbankNotEqualTo(String value) {
            addCriterion("disbank <>", value, "disbank");
            return (Criteria) this;
        }

        public Criteria andDisbankGreaterThan(String value) {
            addCriterion("disbank >", value, "disbank");
            return (Criteria) this;
        }

        public Criteria andDisbankGreaterThanOrEqualTo(String value) {
            addCriterion("disbank >=", value, "disbank");
            return (Criteria) this;
        }

        public Criteria andDisbankLessThan(String value) {
            addCriterion("disbank <", value, "disbank");
            return (Criteria) this;
        }

        public Criteria andDisbankLessThanOrEqualTo(String value) {
            addCriterion("disbank <=", value, "disbank");
            return (Criteria) this;
        }

        public Criteria andDisbankLike(String value) {
            addCriterion("disbank like", value, "disbank");
            return (Criteria) this;
        }

        public Criteria andDisbankNotLike(String value) {
            addCriterion("disbank not like", value, "disbank");
            return (Criteria) this;
        }

        public Criteria andDisbankIn(List<String> values) {
            addCriterion("disbank in", values, "disbank");
            return (Criteria) this;
        }

        public Criteria andDisbankNotIn(List<String> values) {
            addCriterion("disbank not in", values, "disbank");
            return (Criteria) this;
        }

        public Criteria andDisbankBetween(String value1, String value2) {
            addCriterion("disbank between", value1, value2, "disbank");
            return (Criteria) this;
        }

        public Criteria andDisbankNotBetween(String value1, String value2) {
            addCriterion("disbank not between", value1, value2, "disbank");
            return (Criteria) this;
        }

        public Criteria andStartMoneyIsNull() {
            addCriterion("start_money is null");
            return (Criteria) this;
        }

        public Criteria andStartMoneyIsNotNull() {
            addCriterion("start_money is not null");
            return (Criteria) this;
        }

        public Criteria andStartMoneyEqualTo(Integer value) {
            addCriterion("start_money =", value, "startMoney");
            return (Criteria) this;
        }

        public Criteria andStartMoneyNotEqualTo(Integer value) {
            addCriterion("start_money <>", value, "startMoney");
            return (Criteria) this;
        }

        public Criteria andStartMoneyGreaterThan(Integer value) {
            addCriterion("start_money >", value, "startMoney");
            return (Criteria) this;
        }

        public Criteria andStartMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("start_money >=", value, "startMoney");
            return (Criteria) this;
        }

        public Criteria andStartMoneyLessThan(Integer value) {
            addCriterion("start_money <", value, "startMoney");
            return (Criteria) this;
        }

        public Criteria andStartMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("start_money <=", value, "startMoney");
            return (Criteria) this;
        }

        public Criteria andStartMoneyIn(List<Integer> values) {
            addCriterion("start_money in", values, "startMoney");
            return (Criteria) this;
        }

        public Criteria andStartMoneyNotIn(List<Integer> values) {
            addCriterion("start_money not in", values, "startMoney");
            return (Criteria) this;
        }

        public Criteria andStartMoneyBetween(Integer value1, Integer value2) {
            addCriterion("start_money between", value1, value2, "startMoney");
            return (Criteria) this;
        }

        public Criteria andStartMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("start_money not between", value1, value2, "startMoney");
            return (Criteria) this;
        }

        public Criteria andAddMoneyIsNull() {
            addCriterion("add_money is null");
            return (Criteria) this;
        }

        public Criteria andAddMoneyIsNotNull() {
            addCriterion("add_money is not null");
            return (Criteria) this;
        }

        public Criteria andAddMoneyEqualTo(Integer value) {
            addCriterion("add_money =", value, "addMoney");
            return (Criteria) this;
        }

        public Criteria andAddMoneyNotEqualTo(Integer value) {
            addCriterion("add_money <>", value, "addMoney");
            return (Criteria) this;
        }

        public Criteria andAddMoneyGreaterThan(Integer value) {
            addCriterion("add_money >", value, "addMoney");
            return (Criteria) this;
        }

        public Criteria andAddMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_money >=", value, "addMoney");
            return (Criteria) this;
        }

        public Criteria andAddMoneyLessThan(Integer value) {
            addCriterion("add_money <", value, "addMoney");
            return (Criteria) this;
        }

        public Criteria andAddMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("add_money <=", value, "addMoney");
            return (Criteria) this;
        }

        public Criteria andAddMoneyIn(List<Integer> values) {
            addCriterion("add_money in", values, "addMoney");
            return (Criteria) this;
        }

        public Criteria andAddMoneyNotIn(List<Integer> values) {
            addCriterion("add_money not in", values, "addMoney");
            return (Criteria) this;
        }

        public Criteria andAddMoneyBetween(Integer value1, Integer value2) {
            addCriterion("add_money between", value1, value2, "addMoney");
            return (Criteria) this;
        }

        public Criteria andAddMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("add_money not between", value1, value2, "addMoney");
            return (Criteria) this;
        }

        public Criteria andLimitMoneyIsNull() {
            addCriterion("limit_money is null");
            return (Criteria) this;
        }

        public Criteria andLimitMoneyIsNotNull() {
            addCriterion("limit_money is not null");
            return (Criteria) this;
        }

        public Criteria andLimitMoneyEqualTo(Integer value) {
            addCriterion("limit_money =", value, "limitMoney");
            return (Criteria) this;
        }

        public Criteria andLimitMoneyNotEqualTo(Integer value) {
            addCriterion("limit_money <>", value, "limitMoney");
            return (Criteria) this;
        }

        public Criteria andLimitMoneyGreaterThan(Integer value) {
            addCriterion("limit_money >", value, "limitMoney");
            return (Criteria) this;
        }

        public Criteria andLimitMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("limit_money >=", value, "limitMoney");
            return (Criteria) this;
        }

        public Criteria andLimitMoneyLessThan(Integer value) {
            addCriterion("limit_money <", value, "limitMoney");
            return (Criteria) this;
        }

        public Criteria andLimitMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("limit_money <=", value, "limitMoney");
            return (Criteria) this;
        }

        public Criteria andLimitMoneyIn(List<Integer> values) {
            addCriterion("limit_money in", values, "limitMoney");
            return (Criteria) this;
        }

        public Criteria andLimitMoneyNotIn(List<Integer> values) {
            addCriterion("limit_money not in", values, "limitMoney");
            return (Criteria) this;
        }

        public Criteria andLimitMoneyBetween(Integer value1, Integer value2) {
            addCriterion("limit_money between", value1, value2, "limitMoney");
            return (Criteria) this;
        }

        public Criteria andLimitMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("limit_money not between", value1, value2, "limitMoney");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("channel like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("channel not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("channel not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andIsTransferIsNull() {
            addCriterion("is_transfer is null");
            return (Criteria) this;
        }

        public Criteria andIsTransferIsNotNull() {
            addCriterion("is_transfer is not null");
            return (Criteria) this;
        }

        public Criteria andIsTransferEqualTo(Integer value) {
            addCriterion("is_transfer =", value, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferNotEqualTo(Integer value) {
            addCriterion("is_transfer <>", value, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferGreaterThan(Integer value) {
            addCriterion("is_transfer >", value, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_transfer >=", value, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferLessThan(Integer value) {
            addCriterion("is_transfer <", value, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferLessThanOrEqualTo(Integer value) {
            addCriterion("is_transfer <=", value, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferIn(List<Integer> values) {
            addCriterion("is_transfer in", values, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferNotIn(List<Integer> values) {
            addCriterion("is_transfer not in", values, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferBetween(Integer value1, Integer value2) {
            addCriterion("is_transfer between", value1, value2, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferNotBetween(Integer value1, Integer value2) {
            addCriterion("is_transfer not between", value1, value2, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andCustomerIsNull() {
            addCriterion("customer is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIsNotNull() {
            addCriterion("customer is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerEqualTo(String value) {
            addCriterion("customer =", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotEqualTo(String value) {
            addCriterion("customer <>", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThan(String value) {
            addCriterion("customer >", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("customer >=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThan(String value) {
            addCriterion("customer <", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThanOrEqualTo(String value) {
            addCriterion("customer <=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLike(String value) {
            addCriterion("customer like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotLike(String value) {
            addCriterion("customer not like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerIn(List<String> values) {
            addCriterion("customer in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotIn(List<String> values) {
            addCriterion("customer not in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerBetween(String value1, String value2) {
            addCriterion("customer between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotBetween(String value1, String value2) {
            addCriterion("customer not between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andRiskRankIsNull() {
            addCriterion("risk_rank is null");
            return (Criteria) this;
        }

        public Criteria andRiskRankIsNotNull() {
            addCriterion("risk_rank is not null");
            return (Criteria) this;
        }

        public Criteria andRiskRankEqualTo(Integer value) {
            addCriterion("risk_rank =", value, "riskRank");
            return (Criteria) this;
        }

        public Criteria andRiskRankNotEqualTo(Integer value) {
            addCriterion("risk_rank <>", value, "riskRank");
            return (Criteria) this;
        }

        public Criteria andRiskRankGreaterThan(Integer value) {
            addCriterion("risk_rank >", value, "riskRank");
            return (Criteria) this;
        }

        public Criteria andRiskRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("risk_rank >=", value, "riskRank");
            return (Criteria) this;
        }

        public Criteria andRiskRankLessThan(Integer value) {
            addCriterion("risk_rank <", value, "riskRank");
            return (Criteria) this;
        }

        public Criteria andRiskRankLessThanOrEqualTo(Integer value) {
            addCriterion("risk_rank <=", value, "riskRank");
            return (Criteria) this;
        }

        public Criteria andRiskRankIn(List<Integer> values) {
            addCriterion("risk_rank in", values, "riskRank");
            return (Criteria) this;
        }

        public Criteria andRiskRankNotIn(List<Integer> values) {
            addCriterion("risk_rank not in", values, "riskRank");
            return (Criteria) this;
        }

        public Criteria andRiskRankBetween(Integer value1, Integer value2) {
            addCriterion("risk_rank between", value1, value2, "riskRank");
            return (Criteria) this;
        }

        public Criteria andRiskRankNotBetween(Integer value1, Integer value2) {
            addCriterion("risk_rank not between", value1, value2, "riskRank");
            return (Criteria) this;
        }

        public Criteria andIssueSizeIsNull() {
            addCriterion("issue_size is null");
            return (Criteria) this;
        }

        public Criteria andIssueSizeIsNotNull() {
            addCriterion("issue_size is not null");
            return (Criteria) this;
        }

        public Criteria andIssueSizeEqualTo(Integer value) {
            addCriterion("issue_size =", value, "issueSize");
            return (Criteria) this;
        }

        public Criteria andIssueSizeNotEqualTo(Integer value) {
            addCriterion("issue_size <>", value, "issueSize");
            return (Criteria) this;
        }

        public Criteria andIssueSizeGreaterThan(Integer value) {
            addCriterion("issue_size >", value, "issueSize");
            return (Criteria) this;
        }

        public Criteria andIssueSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("issue_size >=", value, "issueSize");
            return (Criteria) this;
        }

        public Criteria andIssueSizeLessThan(Integer value) {
            addCriterion("issue_size <", value, "issueSize");
            return (Criteria) this;
        }

        public Criteria andIssueSizeLessThanOrEqualTo(Integer value) {
            addCriterion("issue_size <=", value, "issueSize");
            return (Criteria) this;
        }

        public Criteria andIssueSizeIn(List<Integer> values) {
            addCriterion("issue_size in", values, "issueSize");
            return (Criteria) this;
        }

        public Criteria andIssueSizeNotIn(List<Integer> values) {
            addCriterion("issue_size not in", values, "issueSize");
            return (Criteria) this;
        }

        public Criteria andIssueSizeBetween(Integer value1, Integer value2) {
            addCriterion("issue_size between", value1, value2, "issueSize");
            return (Criteria) this;
        }

        public Criteria andIssueSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("issue_size not between", value1, value2, "issueSize");
            return (Criteria) this;
        }

        public Criteria andExpectProfitYearIsNull() {
            addCriterion("expect_profit_year is null");
            return (Criteria) this;
        }

        public Criteria andExpectProfitYearIsNotNull() {
            addCriterion("expect_profit_year is not null");
            return (Criteria) this;
        }

        public Criteria andExpectProfitYearEqualTo(Double value) {
            addCriterion("expect_profit_year =", value, "expectProfitYear");
            return (Criteria) this;
        }

        public Criteria andExpectProfitYearNotEqualTo(Double value) {
            addCriterion("expect_profit_year <>", value, "expectProfitYear");
            return (Criteria) this;
        }

        public Criteria andExpectProfitYearGreaterThan(Double value) {
            addCriterion("expect_profit_year >", value, "expectProfitYear");
            return (Criteria) this;
        }

        public Criteria andExpectProfitYearGreaterThanOrEqualTo(Double value) {
            addCriterion("expect_profit_year >=", value, "expectProfitYear");
            return (Criteria) this;
        }

        public Criteria andExpectProfitYearLessThan(Double value) {
            addCriterion("expect_profit_year <", value, "expectProfitYear");
            return (Criteria) this;
        }

        public Criteria andExpectProfitYearLessThanOrEqualTo(Double value) {
            addCriterion("expect_profit_year <=", value, "expectProfitYear");
            return (Criteria) this;
        }

        public Criteria andExpectProfitYearIn(List<Double> values) {
            addCriterion("expect_profit_year in", values, "expectProfitYear");
            return (Criteria) this;
        }

        public Criteria andExpectProfitYearNotIn(List<Double> values) {
            addCriterion("expect_profit_year not in", values, "expectProfitYear");
            return (Criteria) this;
        }

        public Criteria andExpectProfitYearBetween(Double value1, Double value2) {
            addCriterion("expect_profit_year between", value1, value2, "expectProfitYear");
            return (Criteria) this;
        }

        public Criteria andExpectProfitYearNotBetween(Double value1, Double value2) {
            addCriterion("expect_profit_year not between", value1, value2, "expectProfitYear");
            return (Criteria) this;
        }

        public Criteria andPubTimeIsNull() {
            addCriterion("pub_time is null");
            return (Criteria) this;
        }

        public Criteria andPubTimeIsNotNull() {
            addCriterion("pub_time is not null");
            return (Criteria) this;
        }

        public Criteria andPubTimeEqualTo(Date value) {
            addCriterionForJDBCDate("pub_time =", value, "pubTime");
            return (Criteria) this;
        }

        public Criteria andPubTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("pub_time <>", value, "pubTime");
            return (Criteria) this;
        }

        public Criteria andPubTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("pub_time >", value, "pubTime");
            return (Criteria) this;
        }

        public Criteria andPubTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pub_time >=", value, "pubTime");
            return (Criteria) this;
        }

        public Criteria andPubTimeLessThan(Date value) {
            addCriterionForJDBCDate("pub_time <", value, "pubTime");
            return (Criteria) this;
        }

        public Criteria andPubTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pub_time <=", value, "pubTime");
            return (Criteria) this;
        }

        public Criteria andPubTimeIn(List<Date> values) {
            addCriterionForJDBCDate("pub_time in", values, "pubTime");
            return (Criteria) this;
        }

        public Criteria andPubTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("pub_time not in", values, "pubTime");
            return (Criteria) this;
        }

        public Criteria andPubTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pub_time between", value1, value2, "pubTime");
            return (Criteria) this;
        }

        public Criteria andPubTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pub_time not between", value1, value2, "pubTime");
            return (Criteria) this;
        }

        public Criteria andNoticeIsNull() {
            addCriterion("notice is null");
            return (Criteria) this;
        }

        public Criteria andNoticeIsNotNull() {
            addCriterion("notice is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeEqualTo(String value) {
            addCriterion("notice =", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeNotEqualTo(String value) {
            addCriterion("notice <>", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeGreaterThan(String value) {
            addCriterion("notice >", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeGreaterThanOrEqualTo(String value) {
            addCriterion("notice >=", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeLessThan(String value) {
            addCriterion("notice <", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeLessThanOrEqualTo(String value) {
            addCriterion("notice <=", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeLike(String value) {
            addCriterion("notice like", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeNotLike(String value) {
            addCriterion("notice not like", value, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeIn(List<String> values) {
            addCriterion("notice in", values, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeNotIn(List<String> values) {
            addCriterion("notice not in", values, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeBetween(String value1, String value2) {
            addCriterion("notice between", value1, value2, "notice");
            return (Criteria) this;
        }

        public Criteria andNoticeNotBetween(String value1, String value2) {
            addCriterion("notice not between", value1, value2, "notice");
            return (Criteria) this;
        }

        public Criteria andTradeIsNull() {
            addCriterion("trade is null");
            return (Criteria) this;
        }

        public Criteria andTradeIsNotNull() {
            addCriterion("trade is not null");
            return (Criteria) this;
        }

        public Criteria andTradeEqualTo(String value) {
            addCriterion("trade =", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeNotEqualTo(String value) {
            addCriterion("trade <>", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeGreaterThan(String value) {
            addCriterion("trade >", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeGreaterThanOrEqualTo(String value) {
            addCriterion("trade >=", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeLessThan(String value) {
            addCriterion("trade <", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeLessThanOrEqualTo(String value) {
            addCriterion("trade <=", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeLike(String value) {
            addCriterion("trade like", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeNotLike(String value) {
            addCriterion("trade not like", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeIn(List<String> values) {
            addCriterion("trade in", values, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeNotIn(List<String> values) {
            addCriterion("trade not in", values, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeBetween(String value1, String value2) {
            addCriterion("trade between", value1, value2, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeNotBetween(String value1, String value2) {
            addCriterion("trade not between", value1, value2, "trade");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIsNull() {
            addCriterion("customer_info is null");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIsNotNull() {
            addCriterion("customer_info is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoEqualTo(String value) {
            addCriterion("customer_info =", value, "customerInfo");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoNotEqualTo(String value) {
            addCriterion("customer_info <>", value, "customerInfo");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoGreaterThan(String value) {
            addCriterion("customer_info >", value, "customerInfo");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoGreaterThanOrEqualTo(String value) {
            addCriterion("customer_info >=", value, "customerInfo");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoLessThan(String value) {
            addCriterion("customer_info <", value, "customerInfo");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoLessThanOrEqualTo(String value) {
            addCriterion("customer_info <=", value, "customerInfo");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoLike(String value) {
            addCriterion("customer_info like", value, "customerInfo");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoNotLike(String value) {
            addCriterion("customer_info not like", value, "customerInfo");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoIn(List<String> values) {
            addCriterion("customer_info in", values, "customerInfo");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoNotIn(List<String> values) {
            addCriterion("customer_info not in", values, "customerInfo");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoBetween(String value1, String value2) {
            addCriterion("customer_info between", value1, value2, "customerInfo");
            return (Criteria) this;
        }

        public Criteria andCustomerInfoNotBetween(String value1, String value2) {
            addCriterion("customer_info not between", value1, value2, "customerInfo");
            return (Criteria) this;
        }

        public Criteria andManualIsNull() {
            addCriterion("manual is null");
            return (Criteria) this;
        }

        public Criteria andManualIsNotNull() {
            addCriterion("manual is not null");
            return (Criteria) this;
        }

        public Criteria andManualEqualTo(String value) {
            addCriterion("manual =", value, "manual");
            return (Criteria) this;
        }

        public Criteria andManualNotEqualTo(String value) {
            addCriterion("manual <>", value, "manual");
            return (Criteria) this;
        }

        public Criteria andManualGreaterThan(String value) {
            addCriterion("manual >", value, "manual");
            return (Criteria) this;
        }

        public Criteria andManualGreaterThanOrEqualTo(String value) {
            addCriterion("manual >=", value, "manual");
            return (Criteria) this;
        }

        public Criteria andManualLessThan(String value) {
            addCriterion("manual <", value, "manual");
            return (Criteria) this;
        }

        public Criteria andManualLessThanOrEqualTo(String value) {
            addCriterion("manual <=", value, "manual");
            return (Criteria) this;
        }

        public Criteria andManualLike(String value) {
            addCriterion("manual like", value, "manual");
            return (Criteria) this;
        }

        public Criteria andManualNotLike(String value) {
            addCriterion("manual not like", value, "manual");
            return (Criteria) this;
        }

        public Criteria andManualIn(List<String> values) {
            addCriterion("manual in", values, "manual");
            return (Criteria) this;
        }

        public Criteria andManualNotIn(List<String> values) {
            addCriterion("manual not in", values, "manual");
            return (Criteria) this;
        }

        public Criteria andManualBetween(String value1, String value2) {
            addCriterion("manual between", value1, value2, "manual");
            return (Criteria) this;
        }

        public Criteria andManualNotBetween(String value1, String value2) {
            addCriterion("manual not between", value1, value2, "manual");
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
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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

        public Criteria andOprateModeIsNull() {
            addCriterion("oprate_mode is null");
            return (Criteria) this;
        }

        public Criteria andOprateModeIsNotNull() {
            addCriterion("oprate_mode is not null");
            return (Criteria) this;
        }

        public Criteria andOprateModeEqualTo(String value) {
            addCriterion("oprate_mode =", value, "oprateMode");
            return (Criteria) this;
        }

        public Criteria andOprateModeNotEqualTo(String value) {
            addCriterion("oprate_mode <>", value, "oprateMode");
            return (Criteria) this;
        }

        public Criteria andOprateModeGreaterThan(String value) {
            addCriterion("oprate_mode >", value, "oprateMode");
            return (Criteria) this;
        }

        public Criteria andOprateModeGreaterThanOrEqualTo(String value) {
            addCriterion("oprate_mode >=", value, "oprateMode");
            return (Criteria) this;
        }

        public Criteria andOprateModeLessThan(String value) {
            addCriterion("oprate_mode <", value, "oprateMode");
            return (Criteria) this;
        }

        public Criteria andOprateModeLessThanOrEqualTo(String value) {
            addCriterion("oprate_mode <=", value, "oprateMode");
            return (Criteria) this;
        }

        public Criteria andOprateModeLike(String value) {
            addCriterion("oprate_mode like", value, "oprateMode");
            return (Criteria) this;
        }

        public Criteria andOprateModeNotLike(String value) {
            addCriterion("oprate_mode not like", value, "oprateMode");
            return (Criteria) this;
        }

        public Criteria andOprateModeIn(List<String> values) {
            addCriterion("oprate_mode in", values, "oprateMode");
            return (Criteria) this;
        }

        public Criteria andOprateModeNotIn(List<String> values) {
            addCriterion("oprate_mode not in", values, "oprateMode");
            return (Criteria) this;
        }

        public Criteria andOprateModeBetween(String value1, String value2) {
            addCriterion("oprate_mode between", value1, value2, "oprateMode");
            return (Criteria) this;
        }

        public Criteria andOprateModeNotBetween(String value1, String value2) {
            addCriterion("oprate_mode not between", value1, value2, "oprateMode");
            return (Criteria) this;
        }

        public Criteria andLimitTypeIsNull() {
            addCriterion("limit_type is null");
            return (Criteria) this;
        }

        public Criteria andLimitTypeIsNotNull() {
            addCriterion("limit_type is not null");
            return (Criteria) this;
        }

        public Criteria andLimitTypeEqualTo(String value) {
            addCriterion("limit_type =", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeNotEqualTo(String value) {
            addCriterion("limit_type <>", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeGreaterThan(String value) {
            addCriterion("limit_type >", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeGreaterThanOrEqualTo(String value) {
            addCriterion("limit_type >=", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeLessThan(String value) {
            addCriterion("limit_type <", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeLessThanOrEqualTo(String value) {
            addCriterion("limit_type <=", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeLike(String value) {
            addCriterion("limit_type like", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeNotLike(String value) {
            addCriterion("limit_type not like", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeIn(List<String> values) {
            addCriterion("limit_type in", values, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeNotIn(List<String> values) {
            addCriterion("limit_type not in", values, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeBetween(String value1, String value2) {
            addCriterion("limit_type between", value1, value2, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeNotBetween(String value1, String value2) {
            addCriterion("limit_type not between", value1, value2, "limitType");
            return (Criteria) this;
        }

        public Criteria andRegisCodeIsNull() {
            addCriterion("regis_code is null");
            return (Criteria) this;
        }

        public Criteria andRegisCodeIsNotNull() {
            addCriterion("regis_code is not null");
            return (Criteria) this;
        }

        public Criteria andRegisCodeEqualTo(String value) {
            addCriterion("regis_code =", value, "regisCode");
            return (Criteria) this;
        }

        public Criteria andRegisCodeNotEqualTo(String value) {
            addCriterion("regis_code <>", value, "regisCode");
            return (Criteria) this;
        }

        public Criteria andRegisCodeGreaterThan(String value) {
            addCriterion("regis_code >", value, "regisCode");
            return (Criteria) this;
        }

        public Criteria andRegisCodeGreaterThanOrEqualTo(String value) {
            addCriterion("regis_code >=", value, "regisCode");
            return (Criteria) this;
        }

        public Criteria andRegisCodeLessThan(String value) {
            addCriterion("regis_code <", value, "regisCode");
            return (Criteria) this;
        }

        public Criteria andRegisCodeLessThanOrEqualTo(String value) {
            addCriterion("regis_code <=", value, "regisCode");
            return (Criteria) this;
        }

        public Criteria andRegisCodeLike(String value) {
            addCriterion("regis_code like", value, "regisCode");
            return (Criteria) this;
        }

        public Criteria andRegisCodeNotLike(String value) {
            addCriterion("regis_code not like", value, "regisCode");
            return (Criteria) this;
        }

        public Criteria andRegisCodeIn(List<String> values) {
            addCriterion("regis_code in", values, "regisCode");
            return (Criteria) this;
        }

        public Criteria andRegisCodeNotIn(List<String> values) {
            addCriterion("regis_code not in", values, "regisCode");
            return (Criteria) this;
        }

        public Criteria andRegisCodeBetween(String value1, String value2) {
            addCriterion("regis_code between", value1, value2, "regisCode");
            return (Criteria) this;
        }

        public Criteria andRegisCodeNotBetween(String value1, String value2) {
            addCriterion("regis_code not between", value1, value2, "regisCode");
            return (Criteria) this;
        }

        public Criteria andProStartDateIsNull() {
            addCriterion("pro_start_date is null");
            return (Criteria) this;
        }

        public Criteria andProStartDateIsNotNull() {
            addCriterion("pro_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andProStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("pro_start_date =", value, "proStartDate");
            return (Criteria) this;
        }

        public Criteria andProStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("pro_start_date <>", value, "proStartDate");
            return (Criteria) this;
        }

        public Criteria andProStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("pro_start_date >", value, "proStartDate");
            return (Criteria) this;
        }

        public Criteria andProStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pro_start_date >=", value, "proStartDate");
            return (Criteria) this;
        }

        public Criteria andProStartDateLessThan(Date value) {
            addCriterionForJDBCDate("pro_start_date <", value, "proStartDate");
            return (Criteria) this;
        }

        public Criteria andProStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pro_start_date <=", value, "proStartDate");
            return (Criteria) this;
        }

        public Criteria andProStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("pro_start_date in", values, "proStartDate");
            return (Criteria) this;
        }

        public Criteria andProStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("pro_start_date not in", values, "proStartDate");
            return (Criteria) this;
        }

        public Criteria andProStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pro_start_date between", value1, value2, "proStartDate");
            return (Criteria) this;
        }

        public Criteria andProStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pro_start_date not between", value1, value2, "proStartDate");
            return (Criteria) this;
        }

        public Criteria andProEndDateIsNull() {
            addCriterion("pro_end_date is null");
            return (Criteria) this;
        }

        public Criteria andProEndDateIsNotNull() {
            addCriterion("pro_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andProEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("pro_end_date =", value, "proEndDate");
            return (Criteria) this;
        }

        public Criteria andProEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("pro_end_date <>", value, "proEndDate");
            return (Criteria) this;
        }

        public Criteria andProEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("pro_end_date >", value, "proEndDate");
            return (Criteria) this;
        }

        public Criteria andProEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pro_end_date >=", value, "proEndDate");
            return (Criteria) this;
        }

        public Criteria andProEndDateLessThan(Date value) {
            addCriterionForJDBCDate("pro_end_date <", value, "proEndDate");
            return (Criteria) this;
        }

        public Criteria andProEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pro_end_date <=", value, "proEndDate");
            return (Criteria) this;
        }

        public Criteria andProEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("pro_end_date in", values, "proEndDate");
            return (Criteria) this;
        }

        public Criteria andProEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("pro_end_date not in", values, "proEndDate");
            return (Criteria) this;
        }

        public Criteria andProEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pro_end_date between", value1, value2, "proEndDate");
            return (Criteria) this;
        }

        public Criteria andProEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pro_end_date not between", value1, value2, "proEndDate");
            return (Criteria) this;
        }

        public Criteria andDaysIsNull() {
            addCriterion("days is null");
            return (Criteria) this;
        }

        public Criteria andDaysIsNotNull() {
            addCriterion("days is not null");
            return (Criteria) this;
        }

        public Criteria andDaysEqualTo(Integer value) {
            addCriterion("days =", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotEqualTo(Integer value) {
            addCriterion("days <>", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThan(Integer value) {
            addCriterion("days >", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("days >=", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLessThan(Integer value) {
            addCriterion("days <", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLessThanOrEqualTo(Integer value) {
            addCriterion("days <=", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysIn(List<Integer> values) {
            addCriterion("days in", values, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotIn(List<Integer> values) {
            addCriterion("days not in", values, "days");
            return (Criteria) this;
        }

        public Criteria andDaysBetween(Integer value1, Integer value2) {
            addCriterion("days between", value1, value2, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("days not between", value1, value2, "days");
            return (Criteria) this;
        }

        public Criteria andMaxProfitIsNull() {
            addCriterion("max_profit is null");
            return (Criteria) this;
        }

        public Criteria andMaxProfitIsNotNull() {
            addCriterion("max_profit is not null");
            return (Criteria) this;
        }

        public Criteria andMaxProfitEqualTo(Double value) {
            addCriterion("max_profit =", value, "maxProfit");
            return (Criteria) this;
        }

        public Criteria andMaxProfitNotEqualTo(Double value) {
            addCriterion("max_profit <>", value, "maxProfit");
            return (Criteria) this;
        }

        public Criteria andMaxProfitGreaterThan(Double value) {
            addCriterion("max_profit >", value, "maxProfit");
            return (Criteria) this;
        }

        public Criteria andMaxProfitGreaterThanOrEqualTo(Double value) {
            addCriterion("max_profit >=", value, "maxProfit");
            return (Criteria) this;
        }

        public Criteria andMaxProfitLessThan(Double value) {
            addCriterion("max_profit <", value, "maxProfit");
            return (Criteria) this;
        }

        public Criteria andMaxProfitLessThanOrEqualTo(Double value) {
            addCriterion("max_profit <=", value, "maxProfit");
            return (Criteria) this;
        }

        public Criteria andMaxProfitIn(List<Double> values) {
            addCriterion("max_profit in", values, "maxProfit");
            return (Criteria) this;
        }

        public Criteria andMaxProfitNotIn(List<Double> values) {
            addCriterion("max_profit not in", values, "maxProfit");
            return (Criteria) this;
        }

        public Criteria andMaxProfitBetween(Double value1, Double value2) {
            addCriterion("max_profit between", value1, value2, "maxProfit");
            return (Criteria) this;
        }

        public Criteria andMaxProfitNotBetween(Double value1, Double value2) {
            addCriterion("max_profit not between", value1, value2, "maxProfit");
            return (Criteria) this;
        }

        public Criteria andMinProfitIsNull() {
            addCriterion("min_profit is null");
            return (Criteria) this;
        }

        public Criteria andMinProfitIsNotNull() {
            addCriterion("min_profit is not null");
            return (Criteria) this;
        }

        public Criteria andMinProfitEqualTo(Double value) {
            addCriterion("min_profit =", value, "minProfit");
            return (Criteria) this;
        }

        public Criteria andMinProfitNotEqualTo(Double value) {
            addCriterion("min_profit <>", value, "minProfit");
            return (Criteria) this;
        }

        public Criteria andMinProfitGreaterThan(Double value) {
            addCriterion("min_profit >", value, "minProfit");
            return (Criteria) this;
        }

        public Criteria andMinProfitGreaterThanOrEqualTo(Double value) {
            addCriterion("min_profit >=", value, "minProfit");
            return (Criteria) this;
        }

        public Criteria andMinProfitLessThan(Double value) {
            addCriterion("min_profit <", value, "minProfit");
            return (Criteria) this;
        }

        public Criteria andMinProfitLessThanOrEqualTo(Double value) {
            addCriterion("min_profit <=", value, "minProfit");
            return (Criteria) this;
        }

        public Criteria andMinProfitIn(List<Double> values) {
            addCriterion("min_profit in", values, "minProfit");
            return (Criteria) this;
        }

        public Criteria andMinProfitNotIn(List<Double> values) {
            addCriterion("min_profit not in", values, "minProfit");
            return (Criteria) this;
        }

        public Criteria andMinProfitBetween(Double value1, Double value2) {
            addCriterion("min_profit between", value1, value2, "minProfit");
            return (Criteria) this;
        }

        public Criteria andMinProfitNotBetween(Double value1, Double value2) {
            addCriterion("min_profit not between", value1, value2, "minProfit");
            return (Criteria) this;
        }

        public Criteria andActProfitIsNull() {
            addCriterion("act_profit is null");
            return (Criteria) this;
        }

        public Criteria andActProfitIsNotNull() {
            addCriterion("act_profit is not null");
            return (Criteria) this;
        }

        public Criteria andActProfitEqualTo(Double value) {
            addCriterion("act_profit =", value, "actProfit");
            return (Criteria) this;
        }

        public Criteria andActProfitNotEqualTo(Double value) {
            addCriterion("act_profit <>", value, "actProfit");
            return (Criteria) this;
        }

        public Criteria andActProfitGreaterThan(Double value) {
            addCriterion("act_profit >", value, "actProfit");
            return (Criteria) this;
        }

        public Criteria andActProfitGreaterThanOrEqualTo(Double value) {
            addCriterion("act_profit >=", value, "actProfit");
            return (Criteria) this;
        }

        public Criteria andActProfitLessThan(Double value) {
            addCriterion("act_profit <", value, "actProfit");
            return (Criteria) this;
        }

        public Criteria andActProfitLessThanOrEqualTo(Double value) {
            addCriterion("act_profit <=", value, "actProfit");
            return (Criteria) this;
        }

        public Criteria andActProfitIn(List<Double> values) {
            addCriterion("act_profit in", values, "actProfit");
            return (Criteria) this;
        }

        public Criteria andActProfitNotIn(List<Double> values) {
            addCriterion("act_profit not in", values, "actProfit");
            return (Criteria) this;
        }

        public Criteria andActProfitBetween(Double value1, Double value2) {
            addCriterion("act_profit between", value1, value2, "actProfit");
            return (Criteria) this;
        }

        public Criteria andActProfitNotBetween(Double value1, Double value2) {
            addCriterion("act_profit not between", value1, value2, "actProfit");
            return (Criteria) this;
        }

        public Criteria andAssetTypeIsNull() {
            addCriterion("asset_type is null");
            return (Criteria) this;
        }

        public Criteria andAssetTypeIsNotNull() {
            addCriterion("asset_type is not null");
            return (Criteria) this;
        }

        public Criteria andAssetTypeEqualTo(String value) {
            addCriterion("asset_type =", value, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeNotEqualTo(String value) {
            addCriterion("asset_type <>", value, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeGreaterThan(String value) {
            addCriterion("asset_type >", value, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeGreaterThanOrEqualTo(String value) {
            addCriterion("asset_type >=", value, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeLessThan(String value) {
            addCriterion("asset_type <", value, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeLessThanOrEqualTo(String value) {
            addCriterion("asset_type <=", value, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeLike(String value) {
            addCriterion("asset_type like", value, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeNotLike(String value) {
            addCriterion("asset_type not like", value, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeIn(List<String> values) {
            addCriterion("asset_type in", values, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeNotIn(List<String> values) {
            addCriterion("asset_type not in", values, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeBetween(String value1, String value2) {
            addCriterion("asset_type between", value1, value2, "assetType");
            return (Criteria) this;
        }

        public Criteria andAssetTypeNotBetween(String value1, String value2) {
            addCriterion("asset_type not between", value1, value2, "assetType");
            return (Criteria) this;
        }

        public Criteria andInitWorthIsNull() {
            addCriterion("init_worth is null");
            return (Criteria) this;
        }

        public Criteria andInitWorthIsNotNull() {
            addCriterion("init_worth is not null");
            return (Criteria) this;
        }

        public Criteria andInitWorthEqualTo(String value) {
            addCriterion("init_worth =", value, "initWorth");
            return (Criteria) this;
        }

        public Criteria andInitWorthNotEqualTo(String value) {
            addCriterion("init_worth <>", value, "initWorth");
            return (Criteria) this;
        }

        public Criteria andInitWorthGreaterThan(String value) {
            addCriterion("init_worth >", value, "initWorth");
            return (Criteria) this;
        }

        public Criteria andInitWorthGreaterThanOrEqualTo(String value) {
            addCriterion("init_worth >=", value, "initWorth");
            return (Criteria) this;
        }

        public Criteria andInitWorthLessThan(String value) {
            addCriterion("init_worth <", value, "initWorth");
            return (Criteria) this;
        }

        public Criteria andInitWorthLessThanOrEqualTo(String value) {
            addCriterion("init_worth <=", value, "initWorth");
            return (Criteria) this;
        }

        public Criteria andInitWorthLike(String value) {
            addCriterion("init_worth like", value, "initWorth");
            return (Criteria) this;
        }

        public Criteria andInitWorthNotLike(String value) {
            addCriterion("init_worth not like", value, "initWorth");
            return (Criteria) this;
        }

        public Criteria andInitWorthIn(List<String> values) {
            addCriterion("init_worth in", values, "initWorth");
            return (Criteria) this;
        }

        public Criteria andInitWorthNotIn(List<String> values) {
            addCriterion("init_worth not in", values, "initWorth");
            return (Criteria) this;
        }

        public Criteria andInitWorthBetween(String value1, String value2) {
            addCriterion("init_worth between", value1, value2, "initWorth");
            return (Criteria) this;
        }

        public Criteria andInitWorthNotBetween(String value1, String value2) {
            addCriterion("init_worth not between", value1, value2, "initWorth");
            return (Criteria) this;
        }

        public Criteria andProWorthIsNull() {
            addCriterion("pro_worth is null");
            return (Criteria) this;
        }

        public Criteria andProWorthIsNotNull() {
            addCriterion("pro_worth is not null");
            return (Criteria) this;
        }

        public Criteria andProWorthEqualTo(String value) {
            addCriterion("pro_worth =", value, "proWorth");
            return (Criteria) this;
        }

        public Criteria andProWorthNotEqualTo(String value) {
            addCriterion("pro_worth <>", value, "proWorth");
            return (Criteria) this;
        }

        public Criteria andProWorthGreaterThan(String value) {
            addCriterion("pro_worth >", value, "proWorth");
            return (Criteria) this;
        }

        public Criteria andProWorthGreaterThanOrEqualTo(String value) {
            addCriterion("pro_worth >=", value, "proWorth");
            return (Criteria) this;
        }

        public Criteria andProWorthLessThan(String value) {
            addCriterion("pro_worth <", value, "proWorth");
            return (Criteria) this;
        }

        public Criteria andProWorthLessThanOrEqualTo(String value) {
            addCriterion("pro_worth <=", value, "proWorth");
            return (Criteria) this;
        }

        public Criteria andProWorthLike(String value) {
            addCriterion("pro_worth like", value, "proWorth");
            return (Criteria) this;
        }

        public Criteria andProWorthNotLike(String value) {
            addCriterion("pro_worth not like", value, "proWorth");
            return (Criteria) this;
        }

        public Criteria andProWorthIn(List<String> values) {
            addCriterion("pro_worth in", values, "proWorth");
            return (Criteria) this;
        }

        public Criteria andProWorthNotIn(List<String> values) {
            addCriterion("pro_worth not in", values, "proWorth");
            return (Criteria) this;
        }

        public Criteria andProWorthBetween(String value1, String value2) {
            addCriterion("pro_worth between", value1, value2, "proWorth");
            return (Criteria) this;
        }

        public Criteria andProWorthNotBetween(String value1, String value2) {
            addCriterion("pro_worth not between", value1, value2, "proWorth");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("currency is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("currency is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("currency =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("currency <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("currency >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("currency >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("currency <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("currency <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("currency like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("currency not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("currency in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("currency not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("currency between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("currency not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andBusStartDateIsNull() {
            addCriterion("bus_start_date is null");
            return (Criteria) this;
        }

        public Criteria andBusStartDateIsNotNull() {
            addCriterion("bus_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andBusStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("bus_start_date =", value, "busStartDate");
            return (Criteria) this;
        }

        public Criteria andBusStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("bus_start_date <>", value, "busStartDate");
            return (Criteria) this;
        }

        public Criteria andBusStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("bus_start_date >", value, "busStartDate");
            return (Criteria) this;
        }

        public Criteria andBusStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bus_start_date >=", value, "busStartDate");
            return (Criteria) this;
        }

        public Criteria andBusStartDateLessThan(Date value) {
            addCriterionForJDBCDate("bus_start_date <", value, "busStartDate");
            return (Criteria) this;
        }

        public Criteria andBusStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bus_start_date <=", value, "busStartDate");
            return (Criteria) this;
        }

        public Criteria andBusStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("bus_start_date in", values, "busStartDate");
            return (Criteria) this;
        }

        public Criteria andBusStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("bus_start_date not in", values, "busStartDate");
            return (Criteria) this;
        }

        public Criteria andBusStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bus_start_date between", value1, value2, "busStartDate");
            return (Criteria) this;
        }

        public Criteria andBusStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bus_start_date not between", value1, value2, "busStartDate");
            return (Criteria) this;
        }

        public Criteria andBusEndDateIsNull() {
            addCriterion("bus_end_date is null");
            return (Criteria) this;
        }

        public Criteria andBusEndDateIsNotNull() {
            addCriterion("bus_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andBusEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("bus_end_date =", value, "busEndDate");
            return (Criteria) this;
        }

        public Criteria andBusEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("bus_end_date <>", value, "busEndDate");
            return (Criteria) this;
        }

        public Criteria andBusEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("bus_end_date >", value, "busEndDate");
            return (Criteria) this;
        }

        public Criteria andBusEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bus_end_date >=", value, "busEndDate");
            return (Criteria) this;
        }

        public Criteria andBusEndDateLessThan(Date value) {
            addCriterionForJDBCDate("bus_end_date <", value, "busEndDate");
            return (Criteria) this;
        }

        public Criteria andBusEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bus_end_date <=", value, "busEndDate");
            return (Criteria) this;
        }

        public Criteria andBusEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("bus_end_date in", values, "busEndDate");
            return (Criteria) this;
        }

        public Criteria andBusEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("bus_end_date not in", values, "busEndDate");
            return (Criteria) this;
        }

        public Criteria andBusEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bus_end_date between", value1, value2, "busEndDate");
            return (Criteria) this;
        }

        public Criteria andBusEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bus_end_date not between", value1, value2, "busEndDate");
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