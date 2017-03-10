package com.jzt.api.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BankInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankInfoExample() {
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

        public Criteria andTotalProfitIsNull() {
            addCriterion("total_profit is null");
            return (Criteria) this;
        }

        public Criteria andTotalProfitIsNotNull() {
            addCriterion("total_profit is not null");
            return (Criteria) this;
        }

        public Criteria andTotalProfitEqualTo(Double value) {
            addCriterion("total_profit =", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitNotEqualTo(Double value) {
            addCriterion("total_profit <>", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitGreaterThan(Double value) {
            addCriterion("total_profit >", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitGreaterThanOrEqualTo(Double value) {
            addCriterion("total_profit >=", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitLessThan(Double value) {
            addCriterion("total_profit <", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitLessThanOrEqualTo(Double value) {
            addCriterion("total_profit <=", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitIn(List<Double> values) {
            addCriterion("total_profit in", values, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitNotIn(List<Double> values) {
            addCriterion("total_profit not in", values, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitBetween(Double value1, Double value2) {
            addCriterion("total_profit between", value1, value2, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitNotBetween(Double value1, Double value2) {
            addCriterion("total_profit not between", value1, value2, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalEquityIsNull() {
            addCriterion("total_equity is null");
            return (Criteria) this;
        }

        public Criteria andTotalEquityIsNotNull() {
            addCriterion("total_equity is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEquityEqualTo(Double value) {
            addCriterion("total_equity =", value, "totalEquity");
            return (Criteria) this;
        }

        public Criteria andTotalEquityNotEqualTo(Double value) {
            addCriterion("total_equity <>", value, "totalEquity");
            return (Criteria) this;
        }

        public Criteria andTotalEquityGreaterThan(Double value) {
            addCriterion("total_equity >", value, "totalEquity");
            return (Criteria) this;
        }

        public Criteria andTotalEquityGreaterThanOrEqualTo(Double value) {
            addCriterion("total_equity >=", value, "totalEquity");
            return (Criteria) this;
        }

        public Criteria andTotalEquityLessThan(Double value) {
            addCriterion("total_equity <", value, "totalEquity");
            return (Criteria) this;
        }

        public Criteria andTotalEquityLessThanOrEqualTo(Double value) {
            addCriterion("total_equity <=", value, "totalEquity");
            return (Criteria) this;
        }

        public Criteria andTotalEquityIn(List<Double> values) {
            addCriterion("total_equity in", values, "totalEquity");
            return (Criteria) this;
        }

        public Criteria andTotalEquityNotIn(List<Double> values) {
            addCriterion("total_equity not in", values, "totalEquity");
            return (Criteria) this;
        }

        public Criteria andTotalEquityBetween(Double value1, Double value2) {
            addCriterion("total_equity between", value1, value2, "totalEquity");
            return (Criteria) this;
        }

        public Criteria andTotalEquityNotBetween(Double value1, Double value2) {
            addCriterion("total_equity not between", value1, value2, "totalEquity");
            return (Criteria) this;
        }

        public Criteria andBadAssetIsNull() {
            addCriterion("bad_asset is null");
            return (Criteria) this;
        }

        public Criteria andBadAssetIsNotNull() {
            addCriterion("bad_asset is not null");
            return (Criteria) this;
        }

        public Criteria andBadAssetEqualTo(Double value) {
            addCriterion("bad_asset =", value, "badAsset");
            return (Criteria) this;
        }

        public Criteria andBadAssetNotEqualTo(Double value) {
            addCriterion("bad_asset <>", value, "badAsset");
            return (Criteria) this;
        }

        public Criteria andBadAssetGreaterThan(Double value) {
            addCriterion("bad_asset >", value, "badAsset");
            return (Criteria) this;
        }

        public Criteria andBadAssetGreaterThanOrEqualTo(Double value) {
            addCriterion("bad_asset >=", value, "badAsset");
            return (Criteria) this;
        }

        public Criteria andBadAssetLessThan(Double value) {
            addCriterion("bad_asset <", value, "badAsset");
            return (Criteria) this;
        }

        public Criteria andBadAssetLessThanOrEqualTo(Double value) {
            addCriterion("bad_asset <=", value, "badAsset");
            return (Criteria) this;
        }

        public Criteria andBadAssetIn(List<Double> values) {
            addCriterion("bad_asset in", values, "badAsset");
            return (Criteria) this;
        }

        public Criteria andBadAssetNotIn(List<Double> values) {
            addCriterion("bad_asset not in", values, "badAsset");
            return (Criteria) this;
        }

        public Criteria andBadAssetBetween(Double value1, Double value2) {
            addCriterion("bad_asset between", value1, value2, "badAsset");
            return (Criteria) this;
        }

        public Criteria andBadAssetNotBetween(Double value1, Double value2) {
            addCriterion("bad_asset not between", value1, value2, "badAsset");
            return (Criteria) this;
        }

        public Criteria andBadLoanRateIsNull() {
            addCriterion("bad_loan_rate is null");
            return (Criteria) this;
        }

        public Criteria andBadLoanRateIsNotNull() {
            addCriterion("bad_loan_rate is not null");
            return (Criteria) this;
        }

        public Criteria andBadLoanRateEqualTo(Double value) {
            addCriterion("bad_loan_rate =", value, "badLoanRate");
            return (Criteria) this;
        }

        public Criteria andBadLoanRateNotEqualTo(Double value) {
            addCriterion("bad_loan_rate <>", value, "badLoanRate");
            return (Criteria) this;
        }

        public Criteria andBadLoanRateGreaterThan(Double value) {
            addCriterion("bad_loan_rate >", value, "badLoanRate");
            return (Criteria) this;
        }

        public Criteria andBadLoanRateGreaterThanOrEqualTo(Double value) {
            addCriterion("bad_loan_rate >=", value, "badLoanRate");
            return (Criteria) this;
        }

        public Criteria andBadLoanRateLessThan(Double value) {
            addCriterion("bad_loan_rate <", value, "badLoanRate");
            return (Criteria) this;
        }

        public Criteria andBadLoanRateLessThanOrEqualTo(Double value) {
            addCriterion("bad_loan_rate <=", value, "badLoanRate");
            return (Criteria) this;
        }

        public Criteria andBadLoanRateIn(List<Double> values) {
            addCriterion("bad_loan_rate in", values, "badLoanRate");
            return (Criteria) this;
        }

        public Criteria andBadLoanRateNotIn(List<Double> values) {
            addCriterion("bad_loan_rate not in", values, "badLoanRate");
            return (Criteria) this;
        }

        public Criteria andBadLoanRateBetween(Double value1, Double value2) {
            addCriterion("bad_loan_rate between", value1, value2, "badLoanRate");
            return (Criteria) this;
        }

        public Criteria andBadLoanRateNotBetween(Double value1, Double value2) {
            addCriterion("bad_loan_rate not between", value1, value2, "badLoanRate");
            return (Criteria) this;
        }

        public Criteria andTotalProvisionIsNull() {
            addCriterion("total_provision is null");
            return (Criteria) this;
        }

        public Criteria andTotalProvisionIsNotNull() {
            addCriterion("total_provision is not null");
            return (Criteria) this;
        }

        public Criteria andTotalProvisionEqualTo(Double value) {
            addCriterion("total_provision =", value, "totalProvision");
            return (Criteria) this;
        }

        public Criteria andTotalProvisionNotEqualTo(Double value) {
            addCriterion("total_provision <>", value, "totalProvision");
            return (Criteria) this;
        }

        public Criteria andTotalProvisionGreaterThan(Double value) {
            addCriterion("total_provision >", value, "totalProvision");
            return (Criteria) this;
        }

        public Criteria andTotalProvisionGreaterThanOrEqualTo(Double value) {
            addCriterion("total_provision >=", value, "totalProvision");
            return (Criteria) this;
        }

        public Criteria andTotalProvisionLessThan(Double value) {
            addCriterion("total_provision <", value, "totalProvision");
            return (Criteria) this;
        }

        public Criteria andTotalProvisionLessThanOrEqualTo(Double value) {
            addCriterion("total_provision <=", value, "totalProvision");
            return (Criteria) this;
        }

        public Criteria andTotalProvisionIn(List<Double> values) {
            addCriterion("total_provision in", values, "totalProvision");
            return (Criteria) this;
        }

        public Criteria andTotalProvisionNotIn(List<Double> values) {
            addCriterion("total_provision not in", values, "totalProvision");
            return (Criteria) this;
        }

        public Criteria andTotalProvisionBetween(Double value1, Double value2) {
            addCriterion("total_provision between", value1, value2, "totalProvision");
            return (Criteria) this;
        }

        public Criteria andTotalProvisionNotBetween(Double value1, Double value2) {
            addCriterion("total_provision not between", value1, value2, "totalProvision");
            return (Criteria) this;
        }

        public Criteria andLossAssetIsNull() {
            addCriterion("loss_asset is null");
            return (Criteria) this;
        }

        public Criteria andLossAssetIsNotNull() {
            addCriterion("loss_asset is not null");
            return (Criteria) this;
        }

        public Criteria andLossAssetEqualTo(Double value) {
            addCriterion("loss_asset =", value, "lossAsset");
            return (Criteria) this;
        }

        public Criteria andLossAssetNotEqualTo(Double value) {
            addCriterion("loss_asset <>", value, "lossAsset");
            return (Criteria) this;
        }

        public Criteria andLossAssetGreaterThan(Double value) {
            addCriterion("loss_asset >", value, "lossAsset");
            return (Criteria) this;
        }

        public Criteria andLossAssetGreaterThanOrEqualTo(Double value) {
            addCriterion("loss_asset >=", value, "lossAsset");
            return (Criteria) this;
        }

        public Criteria andLossAssetLessThan(Double value) {
            addCriterion("loss_asset <", value, "lossAsset");
            return (Criteria) this;
        }

        public Criteria andLossAssetLessThanOrEqualTo(Double value) {
            addCriterion("loss_asset <=", value, "lossAsset");
            return (Criteria) this;
        }

        public Criteria andLossAssetIn(List<Double> values) {
            addCriterion("loss_asset in", values, "lossAsset");
            return (Criteria) this;
        }

        public Criteria andLossAssetNotIn(List<Double> values) {
            addCriterion("loss_asset not in", values, "lossAsset");
            return (Criteria) this;
        }

        public Criteria andLossAssetBetween(Double value1, Double value2) {
            addCriterion("loss_asset between", value1, value2, "lossAsset");
            return (Criteria) this;
        }

        public Criteria andLossAssetNotBetween(Double value1, Double value2) {
            addCriterion("loss_asset not between", value1, value2, "lossAsset");
            return (Criteria) this;
        }

        public Criteria andTotalAssetIsNull() {
            addCriterion("total_asset is null");
            return (Criteria) this;
        }

        public Criteria andTotalAssetIsNotNull() {
            addCriterion("total_asset is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAssetEqualTo(Double value) {
            addCriterion("total_asset =", value, "totalAsset");
            return (Criteria) this;
        }

        public Criteria andTotalAssetNotEqualTo(Double value) {
            addCriterion("total_asset <>", value, "totalAsset");
            return (Criteria) this;
        }

        public Criteria andTotalAssetGreaterThan(Double value) {
            addCriterion("total_asset >", value, "totalAsset");
            return (Criteria) this;
        }

        public Criteria andTotalAssetGreaterThanOrEqualTo(Double value) {
            addCriterion("total_asset >=", value, "totalAsset");
            return (Criteria) this;
        }

        public Criteria andTotalAssetLessThan(Double value) {
            addCriterion("total_asset <", value, "totalAsset");
            return (Criteria) this;
        }

        public Criteria andTotalAssetLessThanOrEqualTo(Double value) {
            addCriterion("total_asset <=", value, "totalAsset");
            return (Criteria) this;
        }

        public Criteria andTotalAssetIn(List<Double> values) {
            addCriterion("total_asset in", values, "totalAsset");
            return (Criteria) this;
        }

        public Criteria andTotalAssetNotIn(List<Double> values) {
            addCriterion("total_asset not in", values, "totalAsset");
            return (Criteria) this;
        }

        public Criteria andTotalAssetBetween(Double value1, Double value2) {
            addCriterion("total_asset between", value1, value2, "totalAsset");
            return (Criteria) this;
        }

        public Criteria andTotalAssetNotBetween(Double value1, Double value2) {
            addCriterion("total_asset not between", value1, value2, "totalAsset");
            return (Criteria) this;
        }

        public Criteria andTotalDepositIsNull() {
            addCriterion("total_deposit is null");
            return (Criteria) this;
        }

        public Criteria andTotalDepositIsNotNull() {
            addCriterion("total_deposit is not null");
            return (Criteria) this;
        }

        public Criteria andTotalDepositEqualTo(Double value) {
            addCriterion("total_deposit =", value, "totalDeposit");
            return (Criteria) this;
        }

        public Criteria andTotalDepositNotEqualTo(Double value) {
            addCriterion("total_deposit <>", value, "totalDeposit");
            return (Criteria) this;
        }

        public Criteria andTotalDepositGreaterThan(Double value) {
            addCriterion("total_deposit >", value, "totalDeposit");
            return (Criteria) this;
        }

        public Criteria andTotalDepositGreaterThanOrEqualTo(Double value) {
            addCriterion("total_deposit >=", value, "totalDeposit");
            return (Criteria) this;
        }

        public Criteria andTotalDepositLessThan(Double value) {
            addCriterion("total_deposit <", value, "totalDeposit");
            return (Criteria) this;
        }

        public Criteria andTotalDepositLessThanOrEqualTo(Double value) {
            addCriterion("total_deposit <=", value, "totalDeposit");
            return (Criteria) this;
        }

        public Criteria andTotalDepositIn(List<Double> values) {
            addCriterion("total_deposit in", values, "totalDeposit");
            return (Criteria) this;
        }

        public Criteria andTotalDepositNotIn(List<Double> values) {
            addCriterion("total_deposit not in", values, "totalDeposit");
            return (Criteria) this;
        }

        public Criteria andTotalDepositBetween(Double value1, Double value2) {
            addCriterion("total_deposit between", value1, value2, "totalDeposit");
            return (Criteria) this;
        }

        public Criteria andTotalDepositNotBetween(Double value1, Double value2) {
            addCriterion("total_deposit not between", value1, value2, "totalDeposit");
            return (Criteria) this;
        }

        public Criteria andTotalLoanIsNull() {
            addCriterion("total_loan is null");
            return (Criteria) this;
        }

        public Criteria andTotalLoanIsNotNull() {
            addCriterion("total_loan is not null");
            return (Criteria) this;
        }

        public Criteria andTotalLoanEqualTo(Double value) {
            addCriterion("total_loan =", value, "totalLoan");
            return (Criteria) this;
        }

        public Criteria andTotalLoanNotEqualTo(Double value) {
            addCriterion("total_loan <>", value, "totalLoan");
            return (Criteria) this;
        }

        public Criteria andTotalLoanGreaterThan(Double value) {
            addCriterion("total_loan >", value, "totalLoan");
            return (Criteria) this;
        }

        public Criteria andTotalLoanGreaterThanOrEqualTo(Double value) {
            addCriterion("total_loan >=", value, "totalLoan");
            return (Criteria) this;
        }

        public Criteria andTotalLoanLessThan(Double value) {
            addCriterion("total_loan <", value, "totalLoan");
            return (Criteria) this;
        }

        public Criteria andTotalLoanLessThanOrEqualTo(Double value) {
            addCriterion("total_loan <=", value, "totalLoan");
            return (Criteria) this;
        }

        public Criteria andTotalLoanIn(List<Double> values) {
            addCriterion("total_loan in", values, "totalLoan");
            return (Criteria) this;
        }

        public Criteria andTotalLoanNotIn(List<Double> values) {
            addCriterion("total_loan not in", values, "totalLoan");
            return (Criteria) this;
        }

        public Criteria andTotalLoanBetween(Double value1, Double value2) {
            addCriterion("total_loan between", value1, value2, "totalLoan");
            return (Criteria) this;
        }

        public Criteria andTotalLoanNotBetween(Double value1, Double value2) {
            addCriterion("total_loan not between", value1, value2, "totalLoan");
            return (Criteria) this;
        }

        public Criteria andTotalOtherIsNull() {
            addCriterion("total_other is null");
            return (Criteria) this;
        }

        public Criteria andTotalOtherIsNotNull() {
            addCriterion("total_other is not null");
            return (Criteria) this;
        }

        public Criteria andTotalOtherEqualTo(Double value) {
            addCriterion("total_other =", value, "totalOther");
            return (Criteria) this;
        }

        public Criteria andTotalOtherNotEqualTo(Double value) {
            addCriterion("total_other <>", value, "totalOther");
            return (Criteria) this;
        }

        public Criteria andTotalOtherGreaterThan(Double value) {
            addCriterion("total_other >", value, "totalOther");
            return (Criteria) this;
        }

        public Criteria andTotalOtherGreaterThanOrEqualTo(Double value) {
            addCriterion("total_other >=", value, "totalOther");
            return (Criteria) this;
        }

        public Criteria andTotalOtherLessThan(Double value) {
            addCriterion("total_other <", value, "totalOther");
            return (Criteria) this;
        }

        public Criteria andTotalOtherLessThanOrEqualTo(Double value) {
            addCriterion("total_other <=", value, "totalOther");
            return (Criteria) this;
        }

        public Criteria andTotalOtherIn(List<Double> values) {
            addCriterion("total_other in", values, "totalOther");
            return (Criteria) this;
        }

        public Criteria andTotalOtherNotIn(List<Double> values) {
            addCriterion("total_other not in", values, "totalOther");
            return (Criteria) this;
        }

        public Criteria andTotalOtherBetween(Double value1, Double value2) {
            addCriterion("total_other between", value1, value2, "totalOther");
            return (Criteria) this;
        }

        public Criteria andTotalOtherNotBetween(Double value1, Double value2) {
            addCriterion("total_other not between", value1, value2, "totalOther");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNull() {
            addCriterion("income is null");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNotNull() {
            addCriterion("income is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeEqualTo(Double value) {
            addCriterion("income =", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotEqualTo(Double value) {
            addCriterion("income <>", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThan(Double value) {
            addCriterion("income >", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThanOrEqualTo(Double value) {
            addCriterion("income >=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThan(Double value) {
            addCriterion("income <", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThanOrEqualTo(Double value) {
            addCriterion("income <=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeIn(List<Double> values) {
            addCriterion("income in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotIn(List<Double> values) {
            addCriterion("income not in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeBetween(Double value1, Double value2) {
            addCriterion("income between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotBetween(Double value1, Double value2) {
            addCriterion("income not between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andInterestIncomeIsNull() {
            addCriterion("interest_income is null");
            return (Criteria) this;
        }

        public Criteria andInterestIncomeIsNotNull() {
            addCriterion("interest_income is not null");
            return (Criteria) this;
        }

        public Criteria andInterestIncomeEqualTo(Double value) {
            addCriterion("interest_income =", value, "interestIncome");
            return (Criteria) this;
        }

        public Criteria andInterestIncomeNotEqualTo(Double value) {
            addCriterion("interest_income <>", value, "interestIncome");
            return (Criteria) this;
        }

        public Criteria andInterestIncomeGreaterThan(Double value) {
            addCriterion("interest_income >", value, "interestIncome");
            return (Criteria) this;
        }

        public Criteria andInterestIncomeGreaterThanOrEqualTo(Double value) {
            addCriterion("interest_income >=", value, "interestIncome");
            return (Criteria) this;
        }

        public Criteria andInterestIncomeLessThan(Double value) {
            addCriterion("interest_income <", value, "interestIncome");
            return (Criteria) this;
        }

        public Criteria andInterestIncomeLessThanOrEqualTo(Double value) {
            addCriterion("interest_income <=", value, "interestIncome");
            return (Criteria) this;
        }

        public Criteria andInterestIncomeIn(List<Double> values) {
            addCriterion("interest_income in", values, "interestIncome");
            return (Criteria) this;
        }

        public Criteria andInterestIncomeNotIn(List<Double> values) {
            addCriterion("interest_income not in", values, "interestIncome");
            return (Criteria) this;
        }

        public Criteria andInterestIncomeBetween(Double value1, Double value2) {
            addCriterion("interest_income between", value1, value2, "interestIncome");
            return (Criteria) this;
        }

        public Criteria andInterestIncomeNotBetween(Double value1, Double value2) {
            addCriterion("interest_income not between", value1, value2, "interestIncome");
            return (Criteria) this;
        }

        public Criteria andCommissionIsNull() {
            addCriterion("commission is null");
            return (Criteria) this;
        }

        public Criteria andCommissionIsNotNull() {
            addCriterion("commission is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionEqualTo(Double value) {
            addCriterion("commission =", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotEqualTo(Double value) {
            addCriterion("commission <>", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionGreaterThan(Double value) {
            addCriterion("commission >", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionGreaterThanOrEqualTo(Double value) {
            addCriterion("commission >=", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionLessThan(Double value) {
            addCriterion("commission <", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionLessThanOrEqualTo(Double value) {
            addCriterion("commission <=", value, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionIn(List<Double> values) {
            addCriterion("commission in", values, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotIn(List<Double> values) {
            addCriterion("commission not in", values, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionBetween(Double value1, Double value2) {
            addCriterion("commission between", value1, value2, "commission");
            return (Criteria) this;
        }

        public Criteria andCommissionNotBetween(Double value1, Double value2) {
            addCriterion("commission not between", value1, value2, "commission");
            return (Criteria) this;
        }

        public Criteria andStockholderNumIsNull() {
            addCriterion("stockholder_num is null");
            return (Criteria) this;
        }

        public Criteria andStockholderNumIsNotNull() {
            addCriterion("stockholder_num is not null");
            return (Criteria) this;
        }

        public Criteria andStockholderNumEqualTo(Integer value) {
            addCriterion("stockholder_num =", value, "stockholderNum");
            return (Criteria) this;
        }

        public Criteria andStockholderNumNotEqualTo(Integer value) {
            addCriterion("stockholder_num <>", value, "stockholderNum");
            return (Criteria) this;
        }

        public Criteria andStockholderNumGreaterThan(Integer value) {
            addCriterion("stockholder_num >", value, "stockholderNum");
            return (Criteria) this;
        }

        public Criteria andStockholderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("stockholder_num >=", value, "stockholderNum");
            return (Criteria) this;
        }

        public Criteria andStockholderNumLessThan(Integer value) {
            addCriterion("stockholder_num <", value, "stockholderNum");
            return (Criteria) this;
        }

        public Criteria andStockholderNumLessThanOrEqualTo(Integer value) {
            addCriterion("stockholder_num <=", value, "stockholderNum");
            return (Criteria) this;
        }

        public Criteria andStockholderNumIn(List<Integer> values) {
            addCriterion("stockholder_num in", values, "stockholderNum");
            return (Criteria) this;
        }

        public Criteria andStockholderNumNotIn(List<Integer> values) {
            addCriterion("stockholder_num not in", values, "stockholderNum");
            return (Criteria) this;
        }

        public Criteria andStockholderNumBetween(Integer value1, Integer value2) {
            addCriterion("stockholder_num between", value1, value2, "stockholderNum");
            return (Criteria) this;
        }

        public Criteria andStockholderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("stockholder_num not between", value1, value2, "stockholderNum");
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