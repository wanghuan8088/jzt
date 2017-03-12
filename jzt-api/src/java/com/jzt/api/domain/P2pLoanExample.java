package com.jzt.api.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class P2pLoanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

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

    public P2pLoanExample() {
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

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Integer value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Integer value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Integer value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Integer value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Integer value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Integer> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Integer> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Integer value1, Integer value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andInterestRateIsNull() {
            addCriterion("interest_rate is null");
            return (Criteria) this;
        }

        public Criteria andInterestRateIsNotNull() {
            addCriterion("interest_rate is not null");
            return (Criteria) this;
        }

        public Criteria andInterestRateEqualTo(Double value) {
            addCriterion("interest_rate =", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateNotEqualTo(Double value) {
            addCriterion("interest_rate <>", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateGreaterThan(Double value) {
            addCriterion("interest_rate >", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateGreaterThanOrEqualTo(Double value) {
            addCriterion("interest_rate >=", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateLessThan(Double value) {
            addCriterion("interest_rate <", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateLessThanOrEqualTo(Double value) {
            addCriterion("interest_rate <=", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateIn(List<Double> values) {
            addCriterion("interest_rate in", values, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateNotIn(List<Double> values) {
            addCriterion("interest_rate not in", values, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateBetween(Double value1, Double value2) {
            addCriterion("interest_rate between", value1, value2, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateNotBetween(Double value1, Double value2) {
            addCriterion("interest_rate not between", value1, value2, "interestRate");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterionForJDBCDate("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterionForJDBCDate("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterionForJDBCDate("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeIsNull() {
            addCriterion("limit_time is null");
            return (Criteria) this;
        }

        public Criteria andLimitTimeIsNotNull() {
            addCriterion("limit_time is not null");
            return (Criteria) this;
        }

        public Criteria andLimitTimeEqualTo(Integer value) {
            addCriterion("limit_time =", value, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeNotEqualTo(Integer value) {
            addCriterion("limit_time <>", value, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeGreaterThan(Integer value) {
            addCriterion("limit_time >", value, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("limit_time >=", value, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeLessThan(Integer value) {
            addCriterion("limit_time <", value, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeLessThanOrEqualTo(Integer value) {
            addCriterion("limit_time <=", value, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeIn(List<Integer> values) {
            addCriterion("limit_time in", values, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeNotIn(List<Integer> values) {
            addCriterion("limit_time not in", values, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeBetween(Integer value1, Integer value2) {
            addCriterion("limit_time between", value1, value2, "limitTime");
            return (Criteria) this;
        }

        public Criteria andLimitTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("limit_time not between", value1, value2, "limitTime");
            return (Criteria) this;
        }

        public Criteria andScheduleIsNull() {
            addCriterion("schedule is null");
            return (Criteria) this;
        }

        public Criteria andScheduleIsNotNull() {
            addCriterion("schedule is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleEqualTo(Double value) {
            addCriterion("schedule =", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleNotEqualTo(Double value) {
            addCriterion("schedule <>", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleGreaterThan(Double value) {
            addCriterion("schedule >", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleGreaterThanOrEqualTo(Double value) {
            addCriterion("schedule >=", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleLessThan(Double value) {
            addCriterion("schedule <", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleLessThanOrEqualTo(Double value) {
            addCriterion("schedule <=", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleIn(List<Double> values) {
            addCriterion("schedule in", values, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleNotIn(List<Double> values) {
            addCriterion("schedule not in", values, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleBetween(Double value1, Double value2) {
            addCriterion("schedule between", value1, value2, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleNotBetween(Double value1, Double value2) {
            addCriterion("schedule not between", value1, value2, "schedule");
            return (Criteria) this;
        }

        public Criteria andFirstdayInterestIsNull() {
            addCriterion("firstday_interest is null");
            return (Criteria) this;
        }

        public Criteria andFirstdayInterestIsNotNull() {
            addCriterion("firstday_interest is not null");
            return (Criteria) this;
        }

        public Criteria andFirstdayInterestEqualTo(Date value) {
            addCriterionForJDBCDate("firstday_interest =", value, "firstdayInterest");
            return (Criteria) this;
        }

        public Criteria andFirstdayInterestNotEqualTo(Date value) {
            addCriterionForJDBCDate("firstday_interest <>", value, "firstdayInterest");
            return (Criteria) this;
        }

        public Criteria andFirstdayInterestGreaterThan(Date value) {
            addCriterionForJDBCDate("firstday_interest >", value, "firstdayInterest");
            return (Criteria) this;
        }

        public Criteria andFirstdayInterestGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("firstday_interest >=", value, "firstdayInterest");
            return (Criteria) this;
        }

        public Criteria andFirstdayInterestLessThan(Date value) {
            addCriterionForJDBCDate("firstday_interest <", value, "firstdayInterest");
            return (Criteria) this;
        }

        public Criteria andFirstdayInterestLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("firstday_interest <=", value, "firstdayInterest");
            return (Criteria) this;
        }

        public Criteria andFirstdayInterestIn(List<Date> values) {
            addCriterionForJDBCDate("firstday_interest in", values, "firstdayInterest");
            return (Criteria) this;
        }

        public Criteria andFirstdayInterestNotIn(List<Date> values) {
            addCriterionForJDBCDate("firstday_interest not in", values, "firstdayInterest");
            return (Criteria) this;
        }

        public Criteria andFirstdayInterestBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("firstday_interest between", value1, value2, "firstdayInterest");
            return (Criteria) this;
        }

        public Criteria andFirstdayInterestNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("firstday_interest not between", value1, value2, "firstdayInterest");
            return (Criteria) this;
        }

        public Criteria andModeOfPaymentIsNull() {
            addCriterion("mode_of_payment is null");
            return (Criteria) this;
        }

        public Criteria andModeOfPaymentIsNotNull() {
            addCriterion("mode_of_payment is not null");
            return (Criteria) this;
        }

        public Criteria andModeOfPaymentEqualTo(String value) {
            addCriterion("mode_of_payment =", value, "modeOfPayment");
            return (Criteria) this;
        }

        public Criteria andModeOfPaymentNotEqualTo(String value) {
            addCriterion("mode_of_payment <>", value, "modeOfPayment");
            return (Criteria) this;
        }

        public Criteria andModeOfPaymentGreaterThan(String value) {
            addCriterion("mode_of_payment >", value, "modeOfPayment");
            return (Criteria) this;
        }

        public Criteria andModeOfPaymentGreaterThanOrEqualTo(String value) {
            addCriterion("mode_of_payment >=", value, "modeOfPayment");
            return (Criteria) this;
        }

        public Criteria andModeOfPaymentLessThan(String value) {
            addCriterion("mode_of_payment <", value, "modeOfPayment");
            return (Criteria) this;
        }

        public Criteria andModeOfPaymentLessThanOrEqualTo(String value) {
            addCriterion("mode_of_payment <=", value, "modeOfPayment");
            return (Criteria) this;
        }

        public Criteria andModeOfPaymentLike(String value) {
            addCriterion("mode_of_payment like", value, "modeOfPayment");
            return (Criteria) this;
        }

        public Criteria andModeOfPaymentNotLike(String value) {
            addCriterion("mode_of_payment not like", value, "modeOfPayment");
            return (Criteria) this;
        }

        public Criteria andModeOfPaymentIn(List<String> values) {
            addCriterion("mode_of_payment in", values, "modeOfPayment");
            return (Criteria) this;
        }

        public Criteria andModeOfPaymentNotIn(List<String> values) {
            addCriterion("mode_of_payment not in", values, "modeOfPayment");
            return (Criteria) this;
        }

        public Criteria andModeOfPaymentBetween(String value1, String value2) {
            addCriterion("mode_of_payment between", value1, value2, "modeOfPayment");
            return (Criteria) this;
        }

        public Criteria andModeOfPaymentNotBetween(String value1, String value2) {
            addCriterion("mode_of_payment not between", value1, value2, "modeOfPayment");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountIsNull() {
            addCriterion("purchase_amount is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountIsNotNull() {
            addCriterion("purchase_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountEqualTo(Integer value) {
            addCriterion("purchase_amount =", value, "purchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountNotEqualTo(Integer value) {
            addCriterion("purchase_amount <>", value, "purchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountGreaterThan(Integer value) {
            addCriterion("purchase_amount >", value, "purchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchase_amount >=", value, "purchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountLessThan(Integer value) {
            addCriterion("purchase_amount <", value, "purchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountLessThanOrEqualTo(Integer value) {
            addCriterion("purchase_amount <=", value, "purchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountIn(List<Integer> values) {
            addCriterion("purchase_amount in", values, "purchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountNotIn(List<Integer> values) {
            addCriterion("purchase_amount not in", values, "purchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountBetween(Integer value1, Integer value2) {
            addCriterion("purchase_amount between", value1, value2, "purchaseAmount");
            return (Criteria) this;
        }

        public Criteria andPurchaseAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("purchase_amount not between", value1, value2, "purchaseAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountIsNull() {
            addCriterion("limit_amount is null");
            return (Criteria) this;
        }

        public Criteria andLimitAmountIsNotNull() {
            addCriterion("limit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLimitAmountEqualTo(Integer value) {
            addCriterion("limit_amount =", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountNotEqualTo(Integer value) {
            addCriterion("limit_amount <>", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountGreaterThan(Integer value) {
            addCriterion("limit_amount >", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("limit_amount >=", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountLessThan(Integer value) {
            addCriterion("limit_amount <", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountLessThanOrEqualTo(Integer value) {
            addCriterion("limit_amount <=", value, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountIn(List<Integer> values) {
            addCriterion("limit_amount in", values, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountNotIn(List<Integer> values) {
            addCriterion("limit_amount not in", values, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountBetween(Integer value1, Integer value2) {
            addCriterion("limit_amount between", value1, value2, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andLimitAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("limit_amount not between", value1, value2, "limitAmount");
            return (Criteria) this;
        }

        public Criteria andDockProductIsNull() {
            addCriterion("dock_product is null");
            return (Criteria) this;
        }

        public Criteria andDockProductIsNotNull() {
            addCriterion("dock_product is not null");
            return (Criteria) this;
        }

        public Criteria andDockProductEqualTo(String value) {
            addCriterion("dock_product =", value, "dockProduct");
            return (Criteria) this;
        }

        public Criteria andDockProductNotEqualTo(String value) {
            addCriterion("dock_product <>", value, "dockProduct");
            return (Criteria) this;
        }

        public Criteria andDockProductGreaterThan(String value) {
            addCriterion("dock_product >", value, "dockProduct");
            return (Criteria) this;
        }

        public Criteria andDockProductGreaterThanOrEqualTo(String value) {
            addCriterion("dock_product >=", value, "dockProduct");
            return (Criteria) this;
        }

        public Criteria andDockProductLessThan(String value) {
            addCriterion("dock_product <", value, "dockProduct");
            return (Criteria) this;
        }

        public Criteria andDockProductLessThanOrEqualTo(String value) {
            addCriterion("dock_product <=", value, "dockProduct");
            return (Criteria) this;
        }

        public Criteria andDockProductLike(String value) {
            addCriterion("dock_product like", value, "dockProduct");
            return (Criteria) this;
        }

        public Criteria andDockProductNotLike(String value) {
            addCriterion("dock_product not like", value, "dockProduct");
            return (Criteria) this;
        }

        public Criteria andDockProductIn(List<String> values) {
            addCriterion("dock_product in", values, "dockProduct");
            return (Criteria) this;
        }

        public Criteria andDockProductNotIn(List<String> values) {
            addCriterion("dock_product not in", values, "dockProduct");
            return (Criteria) this;
        }

        public Criteria andDockProductBetween(String value1, String value2) {
            addCriterion("dock_product between", value1, value2, "dockProduct");
            return (Criteria) this;
        }

        public Criteria andDockProductNotBetween(String value1, String value2) {
            addCriterion("dock_product not between", value1, value2, "dockProduct");
            return (Criteria) this;
        }

        public Criteria andProtectionMeansIsNull() {
            addCriterion("protection_means is null");
            return (Criteria) this;
        }

        public Criteria andProtectionMeansIsNotNull() {
            addCriterion("protection_means is not null");
            return (Criteria) this;
        }

        public Criteria andProtectionMeansEqualTo(String value) {
            addCriterion("protection_means =", value, "protectionMeans");
            return (Criteria) this;
        }

        public Criteria andProtectionMeansNotEqualTo(String value) {
            addCriterion("protection_means <>", value, "protectionMeans");
            return (Criteria) this;
        }

        public Criteria andProtectionMeansGreaterThan(String value) {
            addCriterion("protection_means >", value, "protectionMeans");
            return (Criteria) this;
        }

        public Criteria andProtectionMeansGreaterThanOrEqualTo(String value) {
            addCriterion("protection_means >=", value, "protectionMeans");
            return (Criteria) this;
        }

        public Criteria andProtectionMeansLessThan(String value) {
            addCriterion("protection_means <", value, "protectionMeans");
            return (Criteria) this;
        }

        public Criteria andProtectionMeansLessThanOrEqualTo(String value) {
            addCriterion("protection_means <=", value, "protectionMeans");
            return (Criteria) this;
        }

        public Criteria andProtectionMeansLike(String value) {
            addCriterion("protection_means like", value, "protectionMeans");
            return (Criteria) this;
        }

        public Criteria andProtectionMeansNotLike(String value) {
            addCriterion("protection_means not like", value, "protectionMeans");
            return (Criteria) this;
        }

        public Criteria andProtectionMeansIn(List<String> values) {
            addCriterion("protection_means in", values, "protectionMeans");
            return (Criteria) this;
        }

        public Criteria andProtectionMeansNotIn(List<String> values) {
            addCriterion("protection_means not in", values, "protectionMeans");
            return (Criteria) this;
        }

        public Criteria andProtectionMeansBetween(String value1, String value2) {
            addCriterion("protection_means between", value1, value2, "protectionMeans");
            return (Criteria) this;
        }

        public Criteria andProtectionMeansNotBetween(String value1, String value2) {
            addCriterion("protection_means not between", value1, value2, "protectionMeans");
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

        public Criteria andProductUrlIsNull() {
            addCriterion("product_url is null");
            return (Criteria) this;
        }

        public Criteria andProductUrlIsNotNull() {
            addCriterion("product_url is not null");
            return (Criteria) this;
        }

        public Criteria andProductUrlEqualTo(String value) {
            addCriterion("product_url =", value, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlNotEqualTo(String value) {
            addCriterion("product_url <>", value, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlGreaterThan(String value) {
            addCriterion("product_url >", value, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlGreaterThanOrEqualTo(String value) {
            addCriterion("product_url >=", value, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlLessThan(String value) {
            addCriterion("product_url <", value, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlLessThanOrEqualTo(String value) {
            addCriterion("product_url <=", value, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlLike(String value) {
            addCriterion("product_url like", value, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlNotLike(String value) {
            addCriterion("product_url not like", value, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlIn(List<String> values) {
            addCriterion("product_url in", values, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlNotIn(List<String> values) {
            addCriterion("product_url not in", values, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlBetween(String value1, String value2) {
            addCriterion("product_url between", value1, value2, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlNotBetween(String value1, String value2) {
            addCriterion("product_url not between", value1, value2, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProtocolIsNull() {
            addCriterion("protocol is null");
            return (Criteria) this;
        }

        public Criteria andProtocolIsNotNull() {
            addCriterion("protocol is not null");
            return (Criteria) this;
        }

        public Criteria andProtocolEqualTo(String value) {
            addCriterion("protocol =", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolNotEqualTo(String value) {
            addCriterion("protocol <>", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolGreaterThan(String value) {
            addCriterion("protocol >", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolGreaterThanOrEqualTo(String value) {
            addCriterion("protocol >=", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolLessThan(String value) {
            addCriterion("protocol <", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolLessThanOrEqualTo(String value) {
            addCriterion("protocol <=", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolLike(String value) {
            addCriterion("protocol like", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolNotLike(String value) {
            addCriterion("protocol not like", value, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolIn(List<String> values) {
            addCriterion("protocol in", values, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolNotIn(List<String> values) {
            addCriterion("protocol not in", values, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolBetween(String value1, String value2) {
            addCriterion("protocol between", value1, value2, "protocol");
            return (Criteria) this;
        }

        public Criteria andProtocolNotBetween(String value1, String value2) {
            addCriterion("protocol not between", value1, value2, "protocol");
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