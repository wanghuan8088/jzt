package com.jzt.api.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class P2pDynamicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public P2pDynamicExample() {
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

        public Criteria andTotalTurnoverIsNull() {
            addCriterion("total_turnover is null");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverIsNotNull() {
            addCriterion("total_turnover is not null");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverEqualTo(Float value) {
            addCriterion("total_turnover =", value, "totalTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverNotEqualTo(Float value) {
            addCriterion("total_turnover <>", value, "totalTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverGreaterThan(Float value) {
            addCriterion("total_turnover >", value, "totalTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverGreaterThanOrEqualTo(Float value) {
            addCriterion("total_turnover >=", value, "totalTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverLessThan(Float value) {
            addCriterion("total_turnover <", value, "totalTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverLessThanOrEqualTo(Float value) {
            addCriterion("total_turnover <=", value, "totalTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverIn(List<Float> values) {
            addCriterion("total_turnover in", values, "totalTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverNotIn(List<Float> values) {
            addCriterion("total_turnover not in", values, "totalTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverBetween(Float value1, Float value2) {
            addCriterion("total_turnover between", value1, value2, "totalTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverNotBetween(Float value1, Float value2) {
            addCriterion("total_turnover not between", value1, value2, "totalTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverDayIsNull() {
            addCriterion("total_turnover_day is null");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverDayIsNotNull() {
            addCriterion("total_turnover_day is not null");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverDayEqualTo(Float value) {
            addCriterion("total_turnover_day =", value, "totalTurnoverDay");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverDayNotEqualTo(Float value) {
            addCriterion("total_turnover_day <>", value, "totalTurnoverDay");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverDayGreaterThan(Float value) {
            addCriterion("total_turnover_day >", value, "totalTurnoverDay");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverDayGreaterThanOrEqualTo(Float value) {
            addCriterion("total_turnover_day >=", value, "totalTurnoverDay");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverDayLessThan(Float value) {
            addCriterion("total_turnover_day <", value, "totalTurnoverDay");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverDayLessThanOrEqualTo(Float value) {
            addCriterion("total_turnover_day <=", value, "totalTurnoverDay");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverDayIn(List<Float> values) {
            addCriterion("total_turnover_day in", values, "totalTurnoverDay");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverDayNotIn(List<Float> values) {
            addCriterion("total_turnover_day not in", values, "totalTurnoverDay");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverDayBetween(Float value1, Float value2) {
            addCriterion("total_turnover_day between", value1, value2, "totalTurnoverDay");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverDayNotBetween(Float value1, Float value2) {
            addCriterion("total_turnover_day not between", value1, value2, "totalTurnoverDay");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverWeekIsNull() {
            addCriterion("total_turnover_week is null");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverWeekIsNotNull() {
            addCriterion("total_turnover_week is not null");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverWeekEqualTo(Float value) {
            addCriterion("total_turnover_week =", value, "totalTurnoverWeek");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverWeekNotEqualTo(Float value) {
            addCriterion("total_turnover_week <>", value, "totalTurnoverWeek");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverWeekGreaterThan(Float value) {
            addCriterion("total_turnover_week >", value, "totalTurnoverWeek");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverWeekGreaterThanOrEqualTo(Float value) {
            addCriterion("total_turnover_week >=", value, "totalTurnoverWeek");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverWeekLessThan(Float value) {
            addCriterion("total_turnover_week <", value, "totalTurnoverWeek");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverWeekLessThanOrEqualTo(Float value) {
            addCriterion("total_turnover_week <=", value, "totalTurnoverWeek");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverWeekIn(List<Float> values) {
            addCriterion("total_turnover_week in", values, "totalTurnoverWeek");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverWeekNotIn(List<Float> values) {
            addCriterion("total_turnover_week not in", values, "totalTurnoverWeek");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverWeekBetween(Float value1, Float value2) {
            addCriterion("total_turnover_week between", value1, value2, "totalTurnoverWeek");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverWeekNotBetween(Float value1, Float value2) {
            addCriterion("total_turnover_week not between", value1, value2, "totalTurnoverWeek");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverMonthIsNull() {
            addCriterion("total_turnover_month is null");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverMonthIsNotNull() {
            addCriterion("total_turnover_month is not null");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverMonthEqualTo(Float value) {
            addCriterion("total_turnover_month =", value, "totalTurnoverMonth");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverMonthNotEqualTo(Float value) {
            addCriterion("total_turnover_month <>", value, "totalTurnoverMonth");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverMonthGreaterThan(Float value) {
            addCriterion("total_turnover_month >", value, "totalTurnoverMonth");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverMonthGreaterThanOrEqualTo(Float value) {
            addCriterion("total_turnover_month >=", value, "totalTurnoverMonth");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverMonthLessThan(Float value) {
            addCriterion("total_turnover_month <", value, "totalTurnoverMonth");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverMonthLessThanOrEqualTo(Float value) {
            addCriterion("total_turnover_month <=", value, "totalTurnoverMonth");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverMonthIn(List<Float> values) {
            addCriterion("total_turnover_month in", values, "totalTurnoverMonth");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverMonthNotIn(List<Float> values) {
            addCriterion("total_turnover_month not in", values, "totalTurnoverMonth");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverMonthBetween(Float value1, Float value2) {
            addCriterion("total_turnover_month between", value1, value2, "totalTurnoverMonth");
            return (Criteria) this;
        }

        public Criteria andTotalTurnoverMonthNotBetween(Float value1, Float value2) {
            addCriterion("total_turnover_month not between", value1, value2, "totalTurnoverMonth");
            return (Criteria) this;
        }

        public Criteria andTotalUnrepayAmountIsNull() {
            addCriterion("total_unrepay_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalUnrepayAmountIsNotNull() {
            addCriterion("total_unrepay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalUnrepayAmountEqualTo(Float value) {
            addCriterion("total_unrepay_amount =", value, "totalUnrepayAmount");
            return (Criteria) this;
        }

        public Criteria andTotalUnrepayAmountNotEqualTo(Float value) {
            addCriterion("total_unrepay_amount <>", value, "totalUnrepayAmount");
            return (Criteria) this;
        }

        public Criteria andTotalUnrepayAmountGreaterThan(Float value) {
            addCriterion("total_unrepay_amount >", value, "totalUnrepayAmount");
            return (Criteria) this;
        }

        public Criteria andTotalUnrepayAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("total_unrepay_amount >=", value, "totalUnrepayAmount");
            return (Criteria) this;
        }

        public Criteria andTotalUnrepayAmountLessThan(Float value) {
            addCriterion("total_unrepay_amount <", value, "totalUnrepayAmount");
            return (Criteria) this;
        }

        public Criteria andTotalUnrepayAmountLessThanOrEqualTo(Float value) {
            addCriterion("total_unrepay_amount <=", value, "totalUnrepayAmount");
            return (Criteria) this;
        }

        public Criteria andTotalUnrepayAmountIn(List<Float> values) {
            addCriterion("total_unrepay_amount in", values, "totalUnrepayAmount");
            return (Criteria) this;
        }

        public Criteria andTotalUnrepayAmountNotIn(List<Float> values) {
            addCriterion("total_unrepay_amount not in", values, "totalUnrepayAmount");
            return (Criteria) this;
        }

        public Criteria andTotalUnrepayAmountBetween(Float value1, Float value2) {
            addCriterion("total_unrepay_amount between", value1, value2, "totalUnrepayAmount");
            return (Criteria) this;
        }

        public Criteria andTotalUnrepayAmountNotBetween(Float value1, Float value2) {
            addCriterion("total_unrepay_amount not between", value1, value2, "totalUnrepayAmount");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateIsNull() {
            addCriterion("avg_interest_rate is null");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateIsNotNull() {
            addCriterion("avg_interest_rate is not null");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateEqualTo(Float value) {
            addCriterion("avg_interest_rate =", value, "avgInterestRate");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateNotEqualTo(Float value) {
            addCriterion("avg_interest_rate <>", value, "avgInterestRate");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateGreaterThan(Float value) {
            addCriterion("avg_interest_rate >", value, "avgInterestRate");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateGreaterThanOrEqualTo(Float value) {
            addCriterion("avg_interest_rate >=", value, "avgInterestRate");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateLessThan(Float value) {
            addCriterion("avg_interest_rate <", value, "avgInterestRate");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateLessThanOrEqualTo(Float value) {
            addCriterion("avg_interest_rate <=", value, "avgInterestRate");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateIn(List<Float> values) {
            addCriterion("avg_interest_rate in", values, "avgInterestRate");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateNotIn(List<Float> values) {
            addCriterion("avg_interest_rate not in", values, "avgInterestRate");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateBetween(Float value1, Float value2) {
            addCriterion("avg_interest_rate between", value1, value2, "avgInterestRate");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateNotBetween(Float value1, Float value2) {
            addCriterion("avg_interest_rate not between", value1, value2, "avgInterestRate");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateDayIsNull() {
            addCriterion("avg_interest_rate_day is null");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateDayIsNotNull() {
            addCriterion("avg_interest_rate_day is not null");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateDayEqualTo(Float value) {
            addCriterion("avg_interest_rate_day =", value, "avgInterestRateDay");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateDayNotEqualTo(Float value) {
            addCriterion("avg_interest_rate_day <>", value, "avgInterestRateDay");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateDayGreaterThan(Float value) {
            addCriterion("avg_interest_rate_day >", value, "avgInterestRateDay");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateDayGreaterThanOrEqualTo(Float value) {
            addCriterion("avg_interest_rate_day >=", value, "avgInterestRateDay");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateDayLessThan(Float value) {
            addCriterion("avg_interest_rate_day <", value, "avgInterestRateDay");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateDayLessThanOrEqualTo(Float value) {
            addCriterion("avg_interest_rate_day <=", value, "avgInterestRateDay");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateDayIn(List<Float> values) {
            addCriterion("avg_interest_rate_day in", values, "avgInterestRateDay");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateDayNotIn(List<Float> values) {
            addCriterion("avg_interest_rate_day not in", values, "avgInterestRateDay");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateDayBetween(Float value1, Float value2) {
            addCriterion("avg_interest_rate_day between", value1, value2, "avgInterestRateDay");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateDayNotBetween(Float value1, Float value2) {
            addCriterion("avg_interest_rate_day not between", value1, value2, "avgInterestRateDay");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateWeekIsNull() {
            addCriterion("avg_interest_rate_week is null");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateWeekIsNotNull() {
            addCriterion("avg_interest_rate_week is not null");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateWeekEqualTo(Float value) {
            addCriterion("avg_interest_rate_week =", value, "avgInterestRateWeek");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateWeekNotEqualTo(Float value) {
            addCriterion("avg_interest_rate_week <>", value, "avgInterestRateWeek");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateWeekGreaterThan(Float value) {
            addCriterion("avg_interest_rate_week >", value, "avgInterestRateWeek");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateWeekGreaterThanOrEqualTo(Float value) {
            addCriterion("avg_interest_rate_week >=", value, "avgInterestRateWeek");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateWeekLessThan(Float value) {
            addCriterion("avg_interest_rate_week <", value, "avgInterestRateWeek");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateWeekLessThanOrEqualTo(Float value) {
            addCriterion("avg_interest_rate_week <=", value, "avgInterestRateWeek");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateWeekIn(List<Float> values) {
            addCriterion("avg_interest_rate_week in", values, "avgInterestRateWeek");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateWeekNotIn(List<Float> values) {
            addCriterion("avg_interest_rate_week not in", values, "avgInterestRateWeek");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateWeekBetween(Float value1, Float value2) {
            addCriterion("avg_interest_rate_week between", value1, value2, "avgInterestRateWeek");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateWeekNotBetween(Float value1, Float value2) {
            addCriterion("avg_interest_rate_week not between", value1, value2, "avgInterestRateWeek");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateMonthIsNull() {
            addCriterion("avg_interest_rate_month is null");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateMonthIsNotNull() {
            addCriterion("avg_interest_rate_month is not null");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateMonthEqualTo(Float value) {
            addCriterion("avg_interest_rate_month =", value, "avgInterestRateMonth");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateMonthNotEqualTo(Float value) {
            addCriterion("avg_interest_rate_month <>", value, "avgInterestRateMonth");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateMonthGreaterThan(Float value) {
            addCriterion("avg_interest_rate_month >", value, "avgInterestRateMonth");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateMonthGreaterThanOrEqualTo(Float value) {
            addCriterion("avg_interest_rate_month >=", value, "avgInterestRateMonth");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateMonthLessThan(Float value) {
            addCriterion("avg_interest_rate_month <", value, "avgInterestRateMonth");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateMonthLessThanOrEqualTo(Float value) {
            addCriterion("avg_interest_rate_month <=", value, "avgInterestRateMonth");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateMonthIn(List<Float> values) {
            addCriterion("avg_interest_rate_month in", values, "avgInterestRateMonth");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateMonthNotIn(List<Float> values) {
            addCriterion("avg_interest_rate_month not in", values, "avgInterestRateMonth");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateMonthBetween(Float value1, Float value2) {
            addCriterion("avg_interest_rate_month between", value1, value2, "avgInterestRateMonth");
            return (Criteria) this;
        }

        public Criteria andAvgInterestRateMonthNotBetween(Float value1, Float value2) {
            addCriterion("avg_interest_rate_month not between", value1, value2, "avgInterestRateMonth");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentIsNull() {
            addCriterion("total_investment is null");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentIsNotNull() {
            addCriterion("total_investment is not null");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentEqualTo(Integer value) {
            addCriterion("total_investment =", value, "totalInvestment");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentNotEqualTo(Integer value) {
            addCriterion("total_investment <>", value, "totalInvestment");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentGreaterThan(Integer value) {
            addCriterion("total_investment >", value, "totalInvestment");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_investment >=", value, "totalInvestment");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentLessThan(Integer value) {
            addCriterion("total_investment <", value, "totalInvestment");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentLessThanOrEqualTo(Integer value) {
            addCriterion("total_investment <=", value, "totalInvestment");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentIn(List<Integer> values) {
            addCriterion("total_investment in", values, "totalInvestment");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentNotIn(List<Integer> values) {
            addCriterion("total_investment not in", values, "totalInvestment");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentBetween(Integer value1, Integer value2) {
            addCriterion("total_investment between", value1, value2, "totalInvestment");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentNotBetween(Integer value1, Integer value2) {
            addCriterion("total_investment not between", value1, value2, "totalInvestment");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentDayIsNull() {
            addCriterion("total_investment_day is null");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentDayIsNotNull() {
            addCriterion("total_investment_day is not null");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentDayEqualTo(Integer value) {
            addCriterion("total_investment_day =", value, "totalInvestmentDay");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentDayNotEqualTo(Integer value) {
            addCriterion("total_investment_day <>", value, "totalInvestmentDay");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentDayGreaterThan(Integer value) {
            addCriterion("total_investment_day >", value, "totalInvestmentDay");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_investment_day >=", value, "totalInvestmentDay");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentDayLessThan(Integer value) {
            addCriterion("total_investment_day <", value, "totalInvestmentDay");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentDayLessThanOrEqualTo(Integer value) {
            addCriterion("total_investment_day <=", value, "totalInvestmentDay");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentDayIn(List<Integer> values) {
            addCriterion("total_investment_day in", values, "totalInvestmentDay");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentDayNotIn(List<Integer> values) {
            addCriterion("total_investment_day not in", values, "totalInvestmentDay");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentDayBetween(Integer value1, Integer value2) {
            addCriterion("total_investment_day between", value1, value2, "totalInvestmentDay");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentDayNotBetween(Integer value1, Integer value2) {
            addCriterion("total_investment_day not between", value1, value2, "totalInvestmentDay");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentWeekIsNull() {
            addCriterion("total_investment_week is null");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentWeekIsNotNull() {
            addCriterion("total_investment_week is not null");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentWeekEqualTo(Integer value) {
            addCriterion("total_investment_week =", value, "totalInvestmentWeek");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentWeekNotEqualTo(Integer value) {
            addCriterion("total_investment_week <>", value, "totalInvestmentWeek");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentWeekGreaterThan(Integer value) {
            addCriterion("total_investment_week >", value, "totalInvestmentWeek");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentWeekGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_investment_week >=", value, "totalInvestmentWeek");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentWeekLessThan(Integer value) {
            addCriterion("total_investment_week <", value, "totalInvestmentWeek");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentWeekLessThanOrEqualTo(Integer value) {
            addCriterion("total_investment_week <=", value, "totalInvestmentWeek");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentWeekIn(List<Integer> values) {
            addCriterion("total_investment_week in", values, "totalInvestmentWeek");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentWeekNotIn(List<Integer> values) {
            addCriterion("total_investment_week not in", values, "totalInvestmentWeek");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentWeekBetween(Integer value1, Integer value2) {
            addCriterion("total_investment_week between", value1, value2, "totalInvestmentWeek");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentWeekNotBetween(Integer value1, Integer value2) {
            addCriterion("total_investment_week not between", value1, value2, "totalInvestmentWeek");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentMonthIsNull() {
            addCriterion("total_investment_month is null");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentMonthIsNotNull() {
            addCriterion("total_investment_month is not null");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentMonthEqualTo(Integer value) {
            addCriterion("total_investment_month =", value, "totalInvestmentMonth");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentMonthNotEqualTo(Integer value) {
            addCriterion("total_investment_month <>", value, "totalInvestmentMonth");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentMonthGreaterThan(Integer value) {
            addCriterion("total_investment_month >", value, "totalInvestmentMonth");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_investment_month >=", value, "totalInvestmentMonth");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentMonthLessThan(Integer value) {
            addCriterion("total_investment_month <", value, "totalInvestmentMonth");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentMonthLessThanOrEqualTo(Integer value) {
            addCriterion("total_investment_month <=", value, "totalInvestmentMonth");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentMonthIn(List<Integer> values) {
            addCriterion("total_investment_month in", values, "totalInvestmentMonth");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentMonthNotIn(List<Integer> values) {
            addCriterion("total_investment_month not in", values, "totalInvestmentMonth");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentMonthBetween(Integer value1, Integer value2) {
            addCriterion("total_investment_month between", value1, value2, "totalInvestmentMonth");
            return (Criteria) this;
        }

        public Criteria andTotalInvestmentMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("total_investment_month not between", value1, value2, "totalInvestmentMonth");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerIsNull() {
            addCriterion("total_borrower is null");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerIsNotNull() {
            addCriterion("total_borrower is not null");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerEqualTo(Integer value) {
            addCriterion("total_borrower =", value, "totalBorrower");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerNotEqualTo(Integer value) {
            addCriterion("total_borrower <>", value, "totalBorrower");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerGreaterThan(Integer value) {
            addCriterion("total_borrower >", value, "totalBorrower");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_borrower >=", value, "totalBorrower");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerLessThan(Integer value) {
            addCriterion("total_borrower <", value, "totalBorrower");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerLessThanOrEqualTo(Integer value) {
            addCriterion("total_borrower <=", value, "totalBorrower");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerIn(List<Integer> values) {
            addCriterion("total_borrower in", values, "totalBorrower");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerNotIn(List<Integer> values) {
            addCriterion("total_borrower not in", values, "totalBorrower");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerBetween(Integer value1, Integer value2) {
            addCriterion("total_borrower between", value1, value2, "totalBorrower");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerNotBetween(Integer value1, Integer value2) {
            addCriterion("total_borrower not between", value1, value2, "totalBorrower");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerDayIsNull() {
            addCriterion("total_borrower_day is null");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerDayIsNotNull() {
            addCriterion("total_borrower_day is not null");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerDayEqualTo(Integer value) {
            addCriterion("total_borrower_day =", value, "totalBorrowerDay");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerDayNotEqualTo(Integer value) {
            addCriterion("total_borrower_day <>", value, "totalBorrowerDay");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerDayGreaterThan(Integer value) {
            addCriterion("total_borrower_day >", value, "totalBorrowerDay");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_borrower_day >=", value, "totalBorrowerDay");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerDayLessThan(Integer value) {
            addCriterion("total_borrower_day <", value, "totalBorrowerDay");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerDayLessThanOrEqualTo(Integer value) {
            addCriterion("total_borrower_day <=", value, "totalBorrowerDay");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerDayIn(List<Integer> values) {
            addCriterion("total_borrower_day in", values, "totalBorrowerDay");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerDayNotIn(List<Integer> values) {
            addCriterion("total_borrower_day not in", values, "totalBorrowerDay");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerDayBetween(Integer value1, Integer value2) {
            addCriterion("total_borrower_day between", value1, value2, "totalBorrowerDay");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerDayNotBetween(Integer value1, Integer value2) {
            addCriterion("total_borrower_day not between", value1, value2, "totalBorrowerDay");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerWeekIsNull() {
            addCriterion("total_borrower_week is null");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerWeekIsNotNull() {
            addCriterion("total_borrower_week is not null");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerWeekEqualTo(Integer value) {
            addCriterion("total_borrower_week =", value, "totalBorrowerWeek");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerWeekNotEqualTo(Integer value) {
            addCriterion("total_borrower_week <>", value, "totalBorrowerWeek");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerWeekGreaterThan(Integer value) {
            addCriterion("total_borrower_week >", value, "totalBorrowerWeek");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerWeekGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_borrower_week >=", value, "totalBorrowerWeek");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerWeekLessThan(Integer value) {
            addCriterion("total_borrower_week <", value, "totalBorrowerWeek");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerWeekLessThanOrEqualTo(Integer value) {
            addCriterion("total_borrower_week <=", value, "totalBorrowerWeek");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerWeekIn(List<Integer> values) {
            addCriterion("total_borrower_week in", values, "totalBorrowerWeek");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerWeekNotIn(List<Integer> values) {
            addCriterion("total_borrower_week not in", values, "totalBorrowerWeek");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerWeekBetween(Integer value1, Integer value2) {
            addCriterion("total_borrower_week between", value1, value2, "totalBorrowerWeek");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerWeekNotBetween(Integer value1, Integer value2) {
            addCriterion("total_borrower_week not between", value1, value2, "totalBorrowerWeek");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerMonthIsNull() {
            addCriterion("total_borrower_month is null");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerMonthIsNotNull() {
            addCriterion("total_borrower_month is not null");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerMonthEqualTo(Integer value) {
            addCriterion("total_borrower_month =", value, "totalBorrowerMonth");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerMonthNotEqualTo(Integer value) {
            addCriterion("total_borrower_month <>", value, "totalBorrowerMonth");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerMonthGreaterThan(Integer value) {
            addCriterion("total_borrower_month >", value, "totalBorrowerMonth");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_borrower_month >=", value, "totalBorrowerMonth");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerMonthLessThan(Integer value) {
            addCriterion("total_borrower_month <", value, "totalBorrowerMonth");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerMonthLessThanOrEqualTo(Integer value) {
            addCriterion("total_borrower_month <=", value, "totalBorrowerMonth");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerMonthIn(List<Integer> values) {
            addCriterion("total_borrower_month in", values, "totalBorrowerMonth");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerMonthNotIn(List<Integer> values) {
            addCriterion("total_borrower_month not in", values, "totalBorrowerMonth");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerMonthBetween(Integer value1, Integer value2) {
            addCriterion("total_borrower_month between", value1, value2, "totalBorrowerMonth");
            return (Criteria) this;
        }

        public Criteria andTotalBorrowerMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("total_borrower_month not between", value1, value2, "totalBorrowerMonth");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodIsNull() {
            addCriterion("avg_repay_period is null");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodIsNotNull() {
            addCriterion("avg_repay_period is not null");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodEqualTo(Float value) {
            addCriterion("avg_repay_period =", value, "avgRepayPeriod");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodNotEqualTo(Float value) {
            addCriterion("avg_repay_period <>", value, "avgRepayPeriod");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodGreaterThan(Float value) {
            addCriterion("avg_repay_period >", value, "avgRepayPeriod");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodGreaterThanOrEqualTo(Float value) {
            addCriterion("avg_repay_period >=", value, "avgRepayPeriod");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodLessThan(Float value) {
            addCriterion("avg_repay_period <", value, "avgRepayPeriod");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodLessThanOrEqualTo(Float value) {
            addCriterion("avg_repay_period <=", value, "avgRepayPeriod");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodIn(List<Float> values) {
            addCriterion("avg_repay_period in", values, "avgRepayPeriod");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodNotIn(List<Float> values) {
            addCriterion("avg_repay_period not in", values, "avgRepayPeriod");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodBetween(Float value1, Float value2) {
            addCriterion("avg_repay_period between", value1, value2, "avgRepayPeriod");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodNotBetween(Float value1, Float value2) {
            addCriterion("avg_repay_period not between", value1, value2, "avgRepayPeriod");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodDayIsNull() {
            addCriterion("avg_repay_period_day is null");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodDayIsNotNull() {
            addCriterion("avg_repay_period_day is not null");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodDayEqualTo(Float value) {
            addCriterion("avg_repay_period_day =", value, "avgRepayPeriodDay");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodDayNotEqualTo(Float value) {
            addCriterion("avg_repay_period_day <>", value, "avgRepayPeriodDay");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodDayGreaterThan(Float value) {
            addCriterion("avg_repay_period_day >", value, "avgRepayPeriodDay");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodDayGreaterThanOrEqualTo(Float value) {
            addCriterion("avg_repay_period_day >=", value, "avgRepayPeriodDay");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodDayLessThan(Float value) {
            addCriterion("avg_repay_period_day <", value, "avgRepayPeriodDay");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodDayLessThanOrEqualTo(Float value) {
            addCriterion("avg_repay_period_day <=", value, "avgRepayPeriodDay");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodDayIn(List<Float> values) {
            addCriterion("avg_repay_period_day in", values, "avgRepayPeriodDay");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodDayNotIn(List<Float> values) {
            addCriterion("avg_repay_period_day not in", values, "avgRepayPeriodDay");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodDayBetween(Float value1, Float value2) {
            addCriterion("avg_repay_period_day between", value1, value2, "avgRepayPeriodDay");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodDayNotBetween(Float value1, Float value2) {
            addCriterion("avg_repay_period_day not between", value1, value2, "avgRepayPeriodDay");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodWeekIsNull() {
            addCriterion("avg_repay_period_week is null");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodWeekIsNotNull() {
            addCriterion("avg_repay_period_week is not null");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodWeekEqualTo(Float value) {
            addCriterion("avg_repay_period_week =", value, "avgRepayPeriodWeek");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodWeekNotEqualTo(Float value) {
            addCriterion("avg_repay_period_week <>", value, "avgRepayPeriodWeek");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodWeekGreaterThan(Float value) {
            addCriterion("avg_repay_period_week >", value, "avgRepayPeriodWeek");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodWeekGreaterThanOrEqualTo(Float value) {
            addCriterion("avg_repay_period_week >=", value, "avgRepayPeriodWeek");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodWeekLessThan(Float value) {
            addCriterion("avg_repay_period_week <", value, "avgRepayPeriodWeek");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodWeekLessThanOrEqualTo(Float value) {
            addCriterion("avg_repay_period_week <=", value, "avgRepayPeriodWeek");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodWeekIn(List<Float> values) {
            addCriterion("avg_repay_period_week in", values, "avgRepayPeriodWeek");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodWeekNotIn(List<Float> values) {
            addCriterion("avg_repay_period_week not in", values, "avgRepayPeriodWeek");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodWeekBetween(Float value1, Float value2) {
            addCriterion("avg_repay_period_week between", value1, value2, "avgRepayPeriodWeek");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodWeekNotBetween(Float value1, Float value2) {
            addCriterion("avg_repay_period_week not between", value1, value2, "avgRepayPeriodWeek");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodMonthIsNull() {
            addCriterion("avg_repay_period_month is null");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodMonthIsNotNull() {
            addCriterion("avg_repay_period_month is not null");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodMonthEqualTo(Float value) {
            addCriterion("avg_repay_period_month =", value, "avgRepayPeriodMonth");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodMonthNotEqualTo(Float value) {
            addCriterion("avg_repay_period_month <>", value, "avgRepayPeriodMonth");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodMonthGreaterThan(Float value) {
            addCriterion("avg_repay_period_month >", value, "avgRepayPeriodMonth");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodMonthGreaterThanOrEqualTo(Float value) {
            addCriterion("avg_repay_period_month >=", value, "avgRepayPeriodMonth");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodMonthLessThan(Float value) {
            addCriterion("avg_repay_period_month <", value, "avgRepayPeriodMonth");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodMonthLessThanOrEqualTo(Float value) {
            addCriterion("avg_repay_period_month <=", value, "avgRepayPeriodMonth");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodMonthIn(List<Float> values) {
            addCriterion("avg_repay_period_month in", values, "avgRepayPeriodMonth");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodMonthNotIn(List<Float> values) {
            addCriterion("avg_repay_period_month not in", values, "avgRepayPeriodMonth");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodMonthBetween(Float value1, Float value2) {
            addCriterion("avg_repay_period_month between", value1, value2, "avgRepayPeriodMonth");
            return (Criteria) this;
        }

        public Criteria andAvgRepayPeriodMonthNotBetween(Float value1, Float value2) {
            addCriterion("avg_repay_period_month not between", value1, value2, "avgRepayPeriodMonth");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonIsNull() {
            addCriterion("ivestment_amount_per_person is null");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonIsNotNull() {
            addCriterion("ivestment_amount_per_person is not null");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonEqualTo(Float value) {
            addCriterion("ivestment_amount_per_person =", value, "ivestmentAmountPerPerson");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonNotEqualTo(Float value) {
            addCriterion("ivestment_amount_per_person <>", value, "ivestmentAmountPerPerson");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonGreaterThan(Float value) {
            addCriterion("ivestment_amount_per_person >", value, "ivestmentAmountPerPerson");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonGreaterThanOrEqualTo(Float value) {
            addCriterion("ivestment_amount_per_person >=", value, "ivestmentAmountPerPerson");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonLessThan(Float value) {
            addCriterion("ivestment_amount_per_person <", value, "ivestmentAmountPerPerson");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonLessThanOrEqualTo(Float value) {
            addCriterion("ivestment_amount_per_person <=", value, "ivestmentAmountPerPerson");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonIn(List<Float> values) {
            addCriterion("ivestment_amount_per_person in", values, "ivestmentAmountPerPerson");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonNotIn(List<Float> values) {
            addCriterion("ivestment_amount_per_person not in", values, "ivestmentAmountPerPerson");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonBetween(Float value1, Float value2) {
            addCriterion("ivestment_amount_per_person between", value1, value2, "ivestmentAmountPerPerson");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonNotBetween(Float value1, Float value2) {
            addCriterion("ivestment_amount_per_person not between", value1, value2, "ivestmentAmountPerPerson");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonDayIsNull() {
            addCriterion("ivestment_amount_per_person_day is null");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonDayIsNotNull() {
            addCriterion("ivestment_amount_per_person_day is not null");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonDayEqualTo(Float value) {
            addCriterion("ivestment_amount_per_person_day =", value, "ivestmentAmountPerPersonDay");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonDayNotEqualTo(Float value) {
            addCriterion("ivestment_amount_per_person_day <>", value, "ivestmentAmountPerPersonDay");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonDayGreaterThan(Float value) {
            addCriterion("ivestment_amount_per_person_day >", value, "ivestmentAmountPerPersonDay");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonDayGreaterThanOrEqualTo(Float value) {
            addCriterion("ivestment_amount_per_person_day >=", value, "ivestmentAmountPerPersonDay");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonDayLessThan(Float value) {
            addCriterion("ivestment_amount_per_person_day <", value, "ivestmentAmountPerPersonDay");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonDayLessThanOrEqualTo(Float value) {
            addCriterion("ivestment_amount_per_person_day <=", value, "ivestmentAmountPerPersonDay");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonDayIn(List<Float> values) {
            addCriterion("ivestment_amount_per_person_day in", values, "ivestmentAmountPerPersonDay");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonDayNotIn(List<Float> values) {
            addCriterion("ivestment_amount_per_person_day not in", values, "ivestmentAmountPerPersonDay");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonDayBetween(Float value1, Float value2) {
            addCriterion("ivestment_amount_per_person_day between", value1, value2, "ivestmentAmountPerPersonDay");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonDayNotBetween(Float value1, Float value2) {
            addCriterion("ivestment_amount_per_person_day not between", value1, value2, "ivestmentAmountPerPersonDay");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonWeekIsNull() {
            addCriterion("ivestment_amount_per_person_week is null");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonWeekIsNotNull() {
            addCriterion("ivestment_amount_per_person_week is not null");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonWeekEqualTo(Float value) {
            addCriterion("ivestment_amount_per_person_week =", value, "ivestmentAmountPerPersonWeek");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonWeekNotEqualTo(Float value) {
            addCriterion("ivestment_amount_per_person_week <>", value, "ivestmentAmountPerPersonWeek");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonWeekGreaterThan(Float value) {
            addCriterion("ivestment_amount_per_person_week >", value, "ivestmentAmountPerPersonWeek");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonWeekGreaterThanOrEqualTo(Float value) {
            addCriterion("ivestment_amount_per_person_week >=", value, "ivestmentAmountPerPersonWeek");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonWeekLessThan(Float value) {
            addCriterion("ivestment_amount_per_person_week <", value, "ivestmentAmountPerPersonWeek");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonWeekLessThanOrEqualTo(Float value) {
            addCriterion("ivestment_amount_per_person_week <=", value, "ivestmentAmountPerPersonWeek");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonWeekIn(List<Float> values) {
            addCriterion("ivestment_amount_per_person_week in", values, "ivestmentAmountPerPersonWeek");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonWeekNotIn(List<Float> values) {
            addCriterion("ivestment_amount_per_person_week not in", values, "ivestmentAmountPerPersonWeek");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonWeekBetween(Float value1, Float value2) {
            addCriterion("ivestment_amount_per_person_week between", value1, value2, "ivestmentAmountPerPersonWeek");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonWeekNotBetween(Float value1, Float value2) {
            addCriterion("ivestment_amount_per_person_week not between", value1, value2, "ivestmentAmountPerPersonWeek");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonMonthIsNull() {
            addCriterion("ivestment_amount_per_person_month is null");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonMonthIsNotNull() {
            addCriterion("ivestment_amount_per_person_month is not null");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonMonthEqualTo(Float value) {
            addCriterion("ivestment_amount_per_person_month =", value, "ivestmentAmountPerPersonMonth");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonMonthNotEqualTo(Float value) {
            addCriterion("ivestment_amount_per_person_month <>", value, "ivestmentAmountPerPersonMonth");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonMonthGreaterThan(Float value) {
            addCriterion("ivestment_amount_per_person_month >", value, "ivestmentAmountPerPersonMonth");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonMonthGreaterThanOrEqualTo(Float value) {
            addCriterion("ivestment_amount_per_person_month >=", value, "ivestmentAmountPerPersonMonth");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonMonthLessThan(Float value) {
            addCriterion("ivestment_amount_per_person_month <", value, "ivestmentAmountPerPersonMonth");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonMonthLessThanOrEqualTo(Float value) {
            addCriterion("ivestment_amount_per_person_month <=", value, "ivestmentAmountPerPersonMonth");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonMonthIn(List<Float> values) {
            addCriterion("ivestment_amount_per_person_month in", values, "ivestmentAmountPerPersonMonth");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonMonthNotIn(List<Float> values) {
            addCriterion("ivestment_amount_per_person_month not in", values, "ivestmentAmountPerPersonMonth");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonMonthBetween(Float value1, Float value2) {
            addCriterion("ivestment_amount_per_person_month between", value1, value2, "ivestmentAmountPerPersonMonth");
            return (Criteria) this;
        }

        public Criteria andIvestmentAmountPerPersonMonthNotBetween(Float value1, Float value2) {
            addCriterion("ivestment_amount_per_person_month not between", value1, value2, "ivestmentAmountPerPersonMonth");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonIsNull() {
            addCriterion("borrow_amount_per_person is null");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonIsNotNull() {
            addCriterion("borrow_amount_per_person is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonEqualTo(Float value) {
            addCriterion("borrow_amount_per_person =", value, "borrowAmountPerPerson");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonNotEqualTo(Float value) {
            addCriterion("borrow_amount_per_person <>", value, "borrowAmountPerPerson");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonGreaterThan(Float value) {
            addCriterion("borrow_amount_per_person >", value, "borrowAmountPerPerson");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonGreaterThanOrEqualTo(Float value) {
            addCriterion("borrow_amount_per_person >=", value, "borrowAmountPerPerson");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonLessThan(Float value) {
            addCriterion("borrow_amount_per_person <", value, "borrowAmountPerPerson");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonLessThanOrEqualTo(Float value) {
            addCriterion("borrow_amount_per_person <=", value, "borrowAmountPerPerson");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonIn(List<Float> values) {
            addCriterion("borrow_amount_per_person in", values, "borrowAmountPerPerson");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonNotIn(List<Float> values) {
            addCriterion("borrow_amount_per_person not in", values, "borrowAmountPerPerson");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonBetween(Float value1, Float value2) {
            addCriterion("borrow_amount_per_person between", value1, value2, "borrowAmountPerPerson");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonNotBetween(Float value1, Float value2) {
            addCriterion("borrow_amount_per_person not between", value1, value2, "borrowAmountPerPerson");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonDayIsNull() {
            addCriterion("borrow_amount_per_person_day is null");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonDayIsNotNull() {
            addCriterion("borrow_amount_per_person_day is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonDayEqualTo(Float value) {
            addCriterion("borrow_amount_per_person_day =", value, "borrowAmountPerPersonDay");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonDayNotEqualTo(Float value) {
            addCriterion("borrow_amount_per_person_day <>", value, "borrowAmountPerPersonDay");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonDayGreaterThan(Float value) {
            addCriterion("borrow_amount_per_person_day >", value, "borrowAmountPerPersonDay");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonDayGreaterThanOrEqualTo(Float value) {
            addCriterion("borrow_amount_per_person_day >=", value, "borrowAmountPerPersonDay");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonDayLessThan(Float value) {
            addCriterion("borrow_amount_per_person_day <", value, "borrowAmountPerPersonDay");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonDayLessThanOrEqualTo(Float value) {
            addCriterion("borrow_amount_per_person_day <=", value, "borrowAmountPerPersonDay");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonDayIn(List<Float> values) {
            addCriterion("borrow_amount_per_person_day in", values, "borrowAmountPerPersonDay");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonDayNotIn(List<Float> values) {
            addCriterion("borrow_amount_per_person_day not in", values, "borrowAmountPerPersonDay");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonDayBetween(Float value1, Float value2) {
            addCriterion("borrow_amount_per_person_day between", value1, value2, "borrowAmountPerPersonDay");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonDayNotBetween(Float value1, Float value2) {
            addCriterion("borrow_amount_per_person_day not between", value1, value2, "borrowAmountPerPersonDay");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonWeekIsNull() {
            addCriterion("borrow_amount_per_person_week is null");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonWeekIsNotNull() {
            addCriterion("borrow_amount_per_person_week is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonWeekEqualTo(Float value) {
            addCriterion("borrow_amount_per_person_week =", value, "borrowAmountPerPersonWeek");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonWeekNotEqualTo(Float value) {
            addCriterion("borrow_amount_per_person_week <>", value, "borrowAmountPerPersonWeek");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonWeekGreaterThan(Float value) {
            addCriterion("borrow_amount_per_person_week >", value, "borrowAmountPerPersonWeek");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonWeekGreaterThanOrEqualTo(Float value) {
            addCriterion("borrow_amount_per_person_week >=", value, "borrowAmountPerPersonWeek");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonWeekLessThan(Float value) {
            addCriterion("borrow_amount_per_person_week <", value, "borrowAmountPerPersonWeek");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonWeekLessThanOrEqualTo(Float value) {
            addCriterion("borrow_amount_per_person_week <=", value, "borrowAmountPerPersonWeek");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonWeekIn(List<Float> values) {
            addCriterion("borrow_amount_per_person_week in", values, "borrowAmountPerPersonWeek");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonWeekNotIn(List<Float> values) {
            addCriterion("borrow_amount_per_person_week not in", values, "borrowAmountPerPersonWeek");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonWeekBetween(Float value1, Float value2) {
            addCriterion("borrow_amount_per_person_week between", value1, value2, "borrowAmountPerPersonWeek");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonWeekNotBetween(Float value1, Float value2) {
            addCriterion("borrow_amount_per_person_week not between", value1, value2, "borrowAmountPerPersonWeek");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonMonthIsNull() {
            addCriterion("borrow_amount_per_person_month is null");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonMonthIsNotNull() {
            addCriterion("borrow_amount_per_person_month is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonMonthEqualTo(Float value) {
            addCriterion("borrow_amount_per_person_month =", value, "borrowAmountPerPersonMonth");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonMonthNotEqualTo(Float value) {
            addCriterion("borrow_amount_per_person_month <>", value, "borrowAmountPerPersonMonth");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonMonthGreaterThan(Float value) {
            addCriterion("borrow_amount_per_person_month >", value, "borrowAmountPerPersonMonth");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonMonthGreaterThanOrEqualTo(Float value) {
            addCriterion("borrow_amount_per_person_month >=", value, "borrowAmountPerPersonMonth");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonMonthLessThan(Float value) {
            addCriterion("borrow_amount_per_person_month <", value, "borrowAmountPerPersonMonth");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonMonthLessThanOrEqualTo(Float value) {
            addCriterion("borrow_amount_per_person_month <=", value, "borrowAmountPerPersonMonth");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonMonthIn(List<Float> values) {
            addCriterion("borrow_amount_per_person_month in", values, "borrowAmountPerPersonMonth");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonMonthNotIn(List<Float> values) {
            addCriterion("borrow_amount_per_person_month not in", values, "borrowAmountPerPersonMonth");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonMonthBetween(Float value1, Float value2) {
            addCriterion("borrow_amount_per_person_month between", value1, value2, "borrowAmountPerPersonMonth");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountPerPersonMonthNotBetween(Float value1, Float value2) {
            addCriterion("borrow_amount_per_person_month not between", value1, value2, "borrowAmountPerPersonMonth");
            return (Criteria) this;
        }

        public Criteria andToptenRateIsNull() {
            addCriterion("topten_rate is null");
            return (Criteria) this;
        }

        public Criteria andToptenRateIsNotNull() {
            addCriterion("topten_rate is not null");
            return (Criteria) this;
        }

        public Criteria andToptenRateEqualTo(Float value) {
            addCriterion("topten_rate =", value, "toptenRate");
            return (Criteria) this;
        }

        public Criteria andToptenRateNotEqualTo(Float value) {
            addCriterion("topten_rate <>", value, "toptenRate");
            return (Criteria) this;
        }

        public Criteria andToptenRateGreaterThan(Float value) {
            addCriterion("topten_rate >", value, "toptenRate");
            return (Criteria) this;
        }

        public Criteria andToptenRateGreaterThanOrEqualTo(Float value) {
            addCriterion("topten_rate >=", value, "toptenRate");
            return (Criteria) this;
        }

        public Criteria andToptenRateLessThan(Float value) {
            addCriterion("topten_rate <", value, "toptenRate");
            return (Criteria) this;
        }

        public Criteria andToptenRateLessThanOrEqualTo(Float value) {
            addCriterion("topten_rate <=", value, "toptenRate");
            return (Criteria) this;
        }

        public Criteria andToptenRateIn(List<Float> values) {
            addCriterion("topten_rate in", values, "toptenRate");
            return (Criteria) this;
        }

        public Criteria andToptenRateNotIn(List<Float> values) {
            addCriterion("topten_rate not in", values, "toptenRate");
            return (Criteria) this;
        }

        public Criteria andToptenRateBetween(Float value1, Float value2) {
            addCriterion("topten_rate between", value1, value2, "toptenRate");
            return (Criteria) this;
        }

        public Criteria andToptenRateNotBetween(Float value1, Float value2) {
            addCriterion("topten_rate not between", value1, value2, "toptenRate");
            return (Criteria) this;
        }

        public Criteria andToptenBorrowIsNull() {
            addCriterion("topten_borrow is null");
            return (Criteria) this;
        }

        public Criteria andToptenBorrowIsNotNull() {
            addCriterion("topten_borrow is not null");
            return (Criteria) this;
        }

        public Criteria andToptenBorrowEqualTo(Float value) {
            addCriterion("topten_borrow =", value, "toptenBorrow");
            return (Criteria) this;
        }

        public Criteria andToptenBorrowNotEqualTo(Float value) {
            addCriterion("topten_borrow <>", value, "toptenBorrow");
            return (Criteria) this;
        }

        public Criteria andToptenBorrowGreaterThan(Float value) {
            addCriterion("topten_borrow >", value, "toptenBorrow");
            return (Criteria) this;
        }

        public Criteria andToptenBorrowGreaterThanOrEqualTo(Float value) {
            addCriterion("topten_borrow >=", value, "toptenBorrow");
            return (Criteria) this;
        }

        public Criteria andToptenBorrowLessThan(Float value) {
            addCriterion("topten_borrow <", value, "toptenBorrow");
            return (Criteria) this;
        }

        public Criteria andToptenBorrowLessThanOrEqualTo(Float value) {
            addCriterion("topten_borrow <=", value, "toptenBorrow");
            return (Criteria) this;
        }

        public Criteria andToptenBorrowIn(List<Float> values) {
            addCriterion("topten_borrow in", values, "toptenBorrow");
            return (Criteria) this;
        }

        public Criteria andToptenBorrowNotIn(List<Float> values) {
            addCriterion("topten_borrow not in", values, "toptenBorrow");
            return (Criteria) this;
        }

        public Criteria andToptenBorrowBetween(Float value1, Float value2) {
            addCriterion("topten_borrow between", value1, value2, "toptenBorrow");
            return (Criteria) this;
        }

        public Criteria andToptenBorrowNotBetween(Float value1, Float value2) {
            addCriterion("topten_borrow not between", value1, value2, "toptenBorrow");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountIsNull() {
            addCriterion("time_weight_amount is null");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountIsNotNull() {
            addCriterion("time_weight_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountEqualTo(Float value) {
            addCriterion("time_weight_amount =", value, "timeWeightAmount");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountNotEqualTo(Float value) {
            addCriterion("time_weight_amount <>", value, "timeWeightAmount");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountGreaterThan(Float value) {
            addCriterion("time_weight_amount >", value, "timeWeightAmount");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("time_weight_amount >=", value, "timeWeightAmount");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountLessThan(Float value) {
            addCriterion("time_weight_amount <", value, "timeWeightAmount");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountLessThanOrEqualTo(Float value) {
            addCriterion("time_weight_amount <=", value, "timeWeightAmount");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountIn(List<Float> values) {
            addCriterion("time_weight_amount in", values, "timeWeightAmount");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountNotIn(List<Float> values) {
            addCriterion("time_weight_amount not in", values, "timeWeightAmount");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountBetween(Float value1, Float value2) {
            addCriterion("time_weight_amount between", value1, value2, "timeWeightAmount");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountNotBetween(Float value1, Float value2) {
            addCriterion("time_weight_amount not between", value1, value2, "timeWeightAmount");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountDayIsNull() {
            addCriterion("time_weight_amount_day is null");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountDayIsNotNull() {
            addCriterion("time_weight_amount_day is not null");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountDayEqualTo(Float value) {
            addCriterion("time_weight_amount_day =", value, "timeWeightAmountDay");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountDayNotEqualTo(Float value) {
            addCriterion("time_weight_amount_day <>", value, "timeWeightAmountDay");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountDayGreaterThan(Float value) {
            addCriterion("time_weight_amount_day >", value, "timeWeightAmountDay");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountDayGreaterThanOrEqualTo(Float value) {
            addCriterion("time_weight_amount_day >=", value, "timeWeightAmountDay");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountDayLessThan(Float value) {
            addCriterion("time_weight_amount_day <", value, "timeWeightAmountDay");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountDayLessThanOrEqualTo(Float value) {
            addCriterion("time_weight_amount_day <=", value, "timeWeightAmountDay");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountDayIn(List<Float> values) {
            addCriterion("time_weight_amount_day in", values, "timeWeightAmountDay");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountDayNotIn(List<Float> values) {
            addCriterion("time_weight_amount_day not in", values, "timeWeightAmountDay");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountDayBetween(Float value1, Float value2) {
            addCriterion("time_weight_amount_day between", value1, value2, "timeWeightAmountDay");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountDayNotBetween(Float value1, Float value2) {
            addCriterion("time_weight_amount_day not between", value1, value2, "timeWeightAmountDay");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountWeekIsNull() {
            addCriterion("time_weight_amount_week is null");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountWeekIsNotNull() {
            addCriterion("time_weight_amount_week is not null");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountWeekEqualTo(Float value) {
            addCriterion("time_weight_amount_week =", value, "timeWeightAmountWeek");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountWeekNotEqualTo(Float value) {
            addCriterion("time_weight_amount_week <>", value, "timeWeightAmountWeek");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountWeekGreaterThan(Float value) {
            addCriterion("time_weight_amount_week >", value, "timeWeightAmountWeek");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountWeekGreaterThanOrEqualTo(Float value) {
            addCriterion("time_weight_amount_week >=", value, "timeWeightAmountWeek");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountWeekLessThan(Float value) {
            addCriterion("time_weight_amount_week <", value, "timeWeightAmountWeek");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountWeekLessThanOrEqualTo(Float value) {
            addCriterion("time_weight_amount_week <=", value, "timeWeightAmountWeek");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountWeekIn(List<Float> values) {
            addCriterion("time_weight_amount_week in", values, "timeWeightAmountWeek");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountWeekNotIn(List<Float> values) {
            addCriterion("time_weight_amount_week not in", values, "timeWeightAmountWeek");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountWeekBetween(Float value1, Float value2) {
            addCriterion("time_weight_amount_week between", value1, value2, "timeWeightAmountWeek");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountWeekNotBetween(Float value1, Float value2) {
            addCriterion("time_weight_amount_week not between", value1, value2, "timeWeightAmountWeek");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountMonthIsNull() {
            addCriterion("time_weight_amount_month is null");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountMonthIsNotNull() {
            addCriterion("time_weight_amount_month is not null");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountMonthEqualTo(Float value) {
            addCriterion("time_weight_amount_month =", value, "timeWeightAmountMonth");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountMonthNotEqualTo(Float value) {
            addCriterion("time_weight_amount_month <>", value, "timeWeightAmountMonth");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountMonthGreaterThan(Float value) {
            addCriterion("time_weight_amount_month >", value, "timeWeightAmountMonth");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountMonthGreaterThanOrEqualTo(Float value) {
            addCriterion("time_weight_amount_month >=", value, "timeWeightAmountMonth");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountMonthLessThan(Float value) {
            addCriterion("time_weight_amount_month <", value, "timeWeightAmountMonth");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountMonthLessThanOrEqualTo(Float value) {
            addCriterion("time_weight_amount_month <=", value, "timeWeightAmountMonth");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountMonthIn(List<Float> values) {
            addCriterion("time_weight_amount_month in", values, "timeWeightAmountMonth");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountMonthNotIn(List<Float> values) {
            addCriterion("time_weight_amount_month not in", values, "timeWeightAmountMonth");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountMonthBetween(Float value1, Float value2) {
            addCriterion("time_weight_amount_month between", value1, value2, "timeWeightAmountMonth");
            return (Criteria) this;
        }

        public Criteria andTimeWeightAmountMonthNotBetween(Float value1, Float value2) {
            addCriterion("time_weight_amount_month not between", value1, value2, "timeWeightAmountMonth");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountIsNull() {
            addCriterion("borrow_amount is null");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountIsNotNull() {
            addCriterion("borrow_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountEqualTo(Integer value) {
            addCriterion("borrow_amount =", value, "borrowAmount");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountNotEqualTo(Integer value) {
            addCriterion("borrow_amount <>", value, "borrowAmount");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountGreaterThan(Integer value) {
            addCriterion("borrow_amount >", value, "borrowAmount");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrow_amount >=", value, "borrowAmount");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountLessThan(Integer value) {
            addCriterion("borrow_amount <", value, "borrowAmount");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountLessThanOrEqualTo(Integer value) {
            addCriterion("borrow_amount <=", value, "borrowAmount");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountIn(List<Integer> values) {
            addCriterion("borrow_amount in", values, "borrowAmount");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountNotIn(List<Integer> values) {
            addCriterion("borrow_amount not in", values, "borrowAmount");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountBetween(Integer value1, Integer value2) {
            addCriterion("borrow_amount between", value1, value2, "borrowAmount");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("borrow_amount not between", value1, value2, "borrowAmount");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountDayIsNull() {
            addCriterion("borrow_amount_day is null");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountDayIsNotNull() {
            addCriterion("borrow_amount_day is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountDayEqualTo(Integer value) {
            addCriterion("borrow_amount_day =", value, "borrowAmountDay");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountDayNotEqualTo(Integer value) {
            addCriterion("borrow_amount_day <>", value, "borrowAmountDay");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountDayGreaterThan(Integer value) {
            addCriterion("borrow_amount_day >", value, "borrowAmountDay");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrow_amount_day >=", value, "borrowAmountDay");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountDayLessThan(Integer value) {
            addCriterion("borrow_amount_day <", value, "borrowAmountDay");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountDayLessThanOrEqualTo(Integer value) {
            addCriterion("borrow_amount_day <=", value, "borrowAmountDay");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountDayIn(List<Integer> values) {
            addCriterion("borrow_amount_day in", values, "borrowAmountDay");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountDayNotIn(List<Integer> values) {
            addCriterion("borrow_amount_day not in", values, "borrowAmountDay");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountDayBetween(Integer value1, Integer value2) {
            addCriterion("borrow_amount_day between", value1, value2, "borrowAmountDay");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountDayNotBetween(Integer value1, Integer value2) {
            addCriterion("borrow_amount_day not between", value1, value2, "borrowAmountDay");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountWeekIsNull() {
            addCriterion("borrow_amount_week is null");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountWeekIsNotNull() {
            addCriterion("borrow_amount_week is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountWeekEqualTo(Integer value) {
            addCriterion("borrow_amount_week =", value, "borrowAmountWeek");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountWeekNotEqualTo(Integer value) {
            addCriterion("borrow_amount_week <>", value, "borrowAmountWeek");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountWeekGreaterThan(Integer value) {
            addCriterion("borrow_amount_week >", value, "borrowAmountWeek");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountWeekGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrow_amount_week >=", value, "borrowAmountWeek");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountWeekLessThan(Integer value) {
            addCriterion("borrow_amount_week <", value, "borrowAmountWeek");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountWeekLessThanOrEqualTo(Integer value) {
            addCriterion("borrow_amount_week <=", value, "borrowAmountWeek");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountWeekIn(List<Integer> values) {
            addCriterion("borrow_amount_week in", values, "borrowAmountWeek");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountWeekNotIn(List<Integer> values) {
            addCriterion("borrow_amount_week not in", values, "borrowAmountWeek");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountWeekBetween(Integer value1, Integer value2) {
            addCriterion("borrow_amount_week between", value1, value2, "borrowAmountWeek");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountWeekNotBetween(Integer value1, Integer value2) {
            addCriterion("borrow_amount_week not between", value1, value2, "borrowAmountWeek");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountMonthIsNull() {
            addCriterion("borrow_amount_month is null");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountMonthIsNotNull() {
            addCriterion("borrow_amount_month is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountMonthEqualTo(Integer value) {
            addCriterion("borrow_amount_month =", value, "borrowAmountMonth");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountMonthNotEqualTo(Integer value) {
            addCriterion("borrow_amount_month <>", value, "borrowAmountMonth");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountMonthGreaterThan(Integer value) {
            addCriterion("borrow_amount_month >", value, "borrowAmountMonth");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrow_amount_month >=", value, "borrowAmountMonth");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountMonthLessThan(Integer value) {
            addCriterion("borrow_amount_month <", value, "borrowAmountMonth");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountMonthLessThanOrEqualTo(Integer value) {
            addCriterion("borrow_amount_month <=", value, "borrowAmountMonth");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountMonthIn(List<Integer> values) {
            addCriterion("borrow_amount_month in", values, "borrowAmountMonth");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountMonthNotIn(List<Integer> values) {
            addCriterion("borrow_amount_month not in", values, "borrowAmountMonth");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountMonthBetween(Integer value1, Integer value2) {
            addCriterion("borrow_amount_month between", value1, value2, "borrowAmountMonth");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("borrow_amount_month not between", value1, value2, "borrowAmountMonth");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidIsNull() {
            addCriterion("time_for_full_bid is null");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidIsNotNull() {
            addCriterion("time_for_full_bid is not null");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidEqualTo(Float value) {
            addCriterion("time_for_full_bid =", value, "timeForFullBid");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidNotEqualTo(Float value) {
            addCriterion("time_for_full_bid <>", value, "timeForFullBid");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidGreaterThan(Float value) {
            addCriterion("time_for_full_bid >", value, "timeForFullBid");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidGreaterThanOrEqualTo(Float value) {
            addCriterion("time_for_full_bid >=", value, "timeForFullBid");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidLessThan(Float value) {
            addCriterion("time_for_full_bid <", value, "timeForFullBid");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidLessThanOrEqualTo(Float value) {
            addCriterion("time_for_full_bid <=", value, "timeForFullBid");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidIn(List<Float> values) {
            addCriterion("time_for_full_bid in", values, "timeForFullBid");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidNotIn(List<Float> values) {
            addCriterion("time_for_full_bid not in", values, "timeForFullBid");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidBetween(Float value1, Float value2) {
            addCriterion("time_for_full_bid between", value1, value2, "timeForFullBid");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidNotBetween(Float value1, Float value2) {
            addCriterion("time_for_full_bid not between", value1, value2, "timeForFullBid");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidDayIsNull() {
            addCriterion("time_for_full_bid_day is null");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidDayIsNotNull() {
            addCriterion("time_for_full_bid_day is not null");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidDayEqualTo(Float value) {
            addCriterion("time_for_full_bid_day =", value, "timeForFullBidDay");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidDayNotEqualTo(Float value) {
            addCriterion("time_for_full_bid_day <>", value, "timeForFullBidDay");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidDayGreaterThan(Float value) {
            addCriterion("time_for_full_bid_day >", value, "timeForFullBidDay");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidDayGreaterThanOrEqualTo(Float value) {
            addCriterion("time_for_full_bid_day >=", value, "timeForFullBidDay");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidDayLessThan(Float value) {
            addCriterion("time_for_full_bid_day <", value, "timeForFullBidDay");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidDayLessThanOrEqualTo(Float value) {
            addCriterion("time_for_full_bid_day <=", value, "timeForFullBidDay");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidDayIn(List<Float> values) {
            addCriterion("time_for_full_bid_day in", values, "timeForFullBidDay");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidDayNotIn(List<Float> values) {
            addCriterion("time_for_full_bid_day not in", values, "timeForFullBidDay");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidDayBetween(Float value1, Float value2) {
            addCriterion("time_for_full_bid_day between", value1, value2, "timeForFullBidDay");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidDayNotBetween(Float value1, Float value2) {
            addCriterion("time_for_full_bid_day not between", value1, value2, "timeForFullBidDay");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidWeekIsNull() {
            addCriterion("time_for_full_bid_week is null");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidWeekIsNotNull() {
            addCriterion("time_for_full_bid_week is not null");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidWeekEqualTo(Float value) {
            addCriterion("time_for_full_bid_week =", value, "timeForFullBidWeek");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidWeekNotEqualTo(Float value) {
            addCriterion("time_for_full_bid_week <>", value, "timeForFullBidWeek");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidWeekGreaterThan(Float value) {
            addCriterion("time_for_full_bid_week >", value, "timeForFullBidWeek");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidWeekGreaterThanOrEqualTo(Float value) {
            addCriterion("time_for_full_bid_week >=", value, "timeForFullBidWeek");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidWeekLessThan(Float value) {
            addCriterion("time_for_full_bid_week <", value, "timeForFullBidWeek");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidWeekLessThanOrEqualTo(Float value) {
            addCriterion("time_for_full_bid_week <=", value, "timeForFullBidWeek");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidWeekIn(List<Float> values) {
            addCriterion("time_for_full_bid_week in", values, "timeForFullBidWeek");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidWeekNotIn(List<Float> values) {
            addCriterion("time_for_full_bid_week not in", values, "timeForFullBidWeek");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidWeekBetween(Float value1, Float value2) {
            addCriterion("time_for_full_bid_week between", value1, value2, "timeForFullBidWeek");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidWeekNotBetween(Float value1, Float value2) {
            addCriterion("time_for_full_bid_week not between", value1, value2, "timeForFullBidWeek");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidMonthIsNull() {
            addCriterion("time_for_full_bid_month is null");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidMonthIsNotNull() {
            addCriterion("time_for_full_bid_month is not null");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidMonthEqualTo(Float value) {
            addCriterion("time_for_full_bid_month =", value, "timeForFullBidMonth");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidMonthNotEqualTo(Float value) {
            addCriterion("time_for_full_bid_month <>", value, "timeForFullBidMonth");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidMonthGreaterThan(Float value) {
            addCriterion("time_for_full_bid_month >", value, "timeForFullBidMonth");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidMonthGreaterThanOrEqualTo(Float value) {
            addCriterion("time_for_full_bid_month >=", value, "timeForFullBidMonth");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidMonthLessThan(Float value) {
            addCriterion("time_for_full_bid_month <", value, "timeForFullBidMonth");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidMonthLessThanOrEqualTo(Float value) {
            addCriterion("time_for_full_bid_month <=", value, "timeForFullBidMonth");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidMonthIn(List<Float> values) {
            addCriterion("time_for_full_bid_month in", values, "timeForFullBidMonth");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidMonthNotIn(List<Float> values) {
            addCriterion("time_for_full_bid_month not in", values, "timeForFullBidMonth");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidMonthBetween(Float value1, Float value2) {
            addCriterion("time_for_full_bid_month between", value1, value2, "timeForFullBidMonth");
            return (Criteria) this;
        }

        public Criteria andTimeForFullBidMonthNotBetween(Float value1, Float value2) {
            addCriterion("time_for_full_bid_month not between", value1, value2, "timeForFullBidMonth");
            return (Criteria) this;
        }

        public Criteria andMonthNetIncomeIsNull() {
            addCriterion("month_net_income is null");
            return (Criteria) this;
        }

        public Criteria andMonthNetIncomeIsNotNull() {
            addCriterion("month_net_income is not null");
            return (Criteria) this;
        }

        public Criteria andMonthNetIncomeEqualTo(Float value) {
            addCriterion("month_net_income =", value, "monthNetIncome");
            return (Criteria) this;
        }

        public Criteria andMonthNetIncomeNotEqualTo(Float value) {
            addCriterion("month_net_income <>", value, "monthNetIncome");
            return (Criteria) this;
        }

        public Criteria andMonthNetIncomeGreaterThan(Float value) {
            addCriterion("month_net_income >", value, "monthNetIncome");
            return (Criteria) this;
        }

        public Criteria andMonthNetIncomeGreaterThanOrEqualTo(Float value) {
            addCriterion("month_net_income >=", value, "monthNetIncome");
            return (Criteria) this;
        }

        public Criteria andMonthNetIncomeLessThan(Float value) {
            addCriterion("month_net_income <", value, "monthNetIncome");
            return (Criteria) this;
        }

        public Criteria andMonthNetIncomeLessThanOrEqualTo(Float value) {
            addCriterion("month_net_income <=", value, "monthNetIncome");
            return (Criteria) this;
        }

        public Criteria andMonthNetIncomeIn(List<Float> values) {
            addCriterion("month_net_income in", values, "monthNetIncome");
            return (Criteria) this;
        }

        public Criteria andMonthNetIncomeNotIn(List<Float> values) {
            addCriterion("month_net_income not in", values, "monthNetIncome");
            return (Criteria) this;
        }

        public Criteria andMonthNetIncomeBetween(Float value1, Float value2) {
            addCriterion("month_net_income between", value1, value2, "monthNetIncome");
            return (Criteria) this;
        }

        public Criteria andMonthNetIncomeNotBetween(Float value1, Float value2) {
            addCriterion("month_net_income not between", value1, value2, "monthNetIncome");
            return (Criteria) this;
        }

        public Criteria andAccountedRevenueIn60DaysIsNull() {
            addCriterion("accounted_revenue_in_60_days is null");
            return (Criteria) this;
        }

        public Criteria andAccountedRevenueIn60DaysIsNotNull() {
            addCriterion("accounted_revenue_in_60_days is not null");
            return (Criteria) this;
        }

        public Criteria andAccountedRevenueIn60DaysEqualTo(Float value) {
            addCriterion("accounted_revenue_in_60_days =", value, "accountedRevenueIn60Days");
            return (Criteria) this;
        }

        public Criteria andAccountedRevenueIn60DaysNotEqualTo(Float value) {
            addCriterion("accounted_revenue_in_60_days <>", value, "accountedRevenueIn60Days");
            return (Criteria) this;
        }

        public Criteria andAccountedRevenueIn60DaysGreaterThan(Float value) {
            addCriterion("accounted_revenue_in_60_days >", value, "accountedRevenueIn60Days");
            return (Criteria) this;
        }

        public Criteria andAccountedRevenueIn60DaysGreaterThanOrEqualTo(Float value) {
            addCriterion("accounted_revenue_in_60_days >=", value, "accountedRevenueIn60Days");
            return (Criteria) this;
        }

        public Criteria andAccountedRevenueIn60DaysLessThan(Float value) {
            addCriterion("accounted_revenue_in_60_days <", value, "accountedRevenueIn60Days");
            return (Criteria) this;
        }

        public Criteria andAccountedRevenueIn60DaysLessThanOrEqualTo(Float value) {
            addCriterion("accounted_revenue_in_60_days <=", value, "accountedRevenueIn60Days");
            return (Criteria) this;
        }

        public Criteria andAccountedRevenueIn60DaysIn(List<Float> values) {
            addCriterion("accounted_revenue_in_60_days in", values, "accountedRevenueIn60Days");
            return (Criteria) this;
        }

        public Criteria andAccountedRevenueIn60DaysNotIn(List<Float> values) {
            addCriterion("accounted_revenue_in_60_days not in", values, "accountedRevenueIn60Days");
            return (Criteria) this;
        }

        public Criteria andAccountedRevenueIn60DaysBetween(Float value1, Float value2) {
            addCriterion("accounted_revenue_in_60_days between", value1, value2, "accountedRevenueIn60Days");
            return (Criteria) this;
        }

        public Criteria andAccountedRevenueIn60DaysNotBetween(Float value1, Float value2) {
            addCriterion("accounted_revenue_in_60_days not between", value1, value2, "accountedRevenueIn60Days");
            return (Criteria) this;
        }

        public Criteria andCapitalLeverIsNull() {
            addCriterion("capital_lever is null");
            return (Criteria) this;
        }

        public Criteria andCapitalLeverIsNotNull() {
            addCriterion("capital_lever is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalLeverEqualTo(Float value) {
            addCriterion("capital_lever =", value, "capitalLever");
            return (Criteria) this;
        }

        public Criteria andCapitalLeverNotEqualTo(Float value) {
            addCriterion("capital_lever <>", value, "capitalLever");
            return (Criteria) this;
        }

        public Criteria andCapitalLeverGreaterThan(Float value) {
            addCriterion("capital_lever >", value, "capitalLever");
            return (Criteria) this;
        }

        public Criteria andCapitalLeverGreaterThanOrEqualTo(Float value) {
            addCriterion("capital_lever >=", value, "capitalLever");
            return (Criteria) this;
        }

        public Criteria andCapitalLeverLessThan(Float value) {
            addCriterion("capital_lever <", value, "capitalLever");
            return (Criteria) this;
        }

        public Criteria andCapitalLeverLessThanOrEqualTo(Float value) {
            addCriterion("capital_lever <=", value, "capitalLever");
            return (Criteria) this;
        }

        public Criteria andCapitalLeverIn(List<Float> values) {
            addCriterion("capital_lever in", values, "capitalLever");
            return (Criteria) this;
        }

        public Criteria andCapitalLeverNotIn(List<Float> values) {
            addCriterion("capital_lever not in", values, "capitalLever");
            return (Criteria) this;
        }

        public Criteria andCapitalLeverBetween(Float value1, Float value2) {
            addCriterion("capital_lever between", value1, value2, "capitalLever");
            return (Criteria) this;
        }

        public Criteria andCapitalLeverNotBetween(Float value1, Float value2) {
            addCriterion("capital_lever not between", value1, value2, "capitalLever");
            return (Criteria) this;
        }

        public Criteria andServiceTimeIsNull() {
            addCriterion("service_time is null");
            return (Criteria) this;
        }

        public Criteria andServiceTimeIsNotNull() {
            addCriterion("service_time is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTimeEqualTo(Integer value) {
            addCriterion("service_time =", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeNotEqualTo(Integer value) {
            addCriterion("service_time <>", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeGreaterThan(Integer value) {
            addCriterion("service_time >", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_time >=", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeLessThan(Integer value) {
            addCriterion("service_time <", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeLessThanOrEqualTo(Integer value) {
            addCriterion("service_time <=", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeIn(List<Integer> values) {
            addCriterion("service_time in", values, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeNotIn(List<Integer> values) {
            addCriterion("service_time not in", values, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeBetween(Integer value1, Integer value2) {
            addCriterion("service_time between", value1, value2, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("service_time not between", value1, value2, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterionForJDBCDate("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterionForJDBCDate("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterionForJDBCDate("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_date not between", value1, value2, "updateDate");
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