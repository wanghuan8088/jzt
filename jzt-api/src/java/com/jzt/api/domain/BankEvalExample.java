package com.jzt.api.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BankEvalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankEvalExample() {
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

        public Criteria andBankIdIsNull() {
            addCriterion("bank_id is null");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNotNull() {
            addCriterion("bank_id is not null");
            return (Criteria) this;
        }

        public Criteria andBankIdEqualTo(Integer value) {
            addCriterion("bank_id =", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotEqualTo(Integer value) {
            addCriterion("bank_id <>", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThan(Integer value) {
            addCriterion("bank_id >", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bank_id >=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThan(Integer value) {
            addCriterion("bank_id <", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThanOrEqualTo(Integer value) {
            addCriterion("bank_id <=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdIn(List<Integer> values) {
            addCriterion("bank_id in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotIn(List<Integer> values) {
            addCriterion("bank_id not in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdBetween(Integer value1, Integer value2) {
            addCriterion("bank_id between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bank_id not between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andReleaseScoreIsNull() {
            addCriterion("release_score is null");
            return (Criteria) this;
        }

        public Criteria andReleaseScoreIsNotNull() {
            addCriterion("release_score is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseScoreEqualTo(Double value) {
            addCriterion("release_score =", value, "releaseScore");
            return (Criteria) this;
        }

        public Criteria andReleaseScoreNotEqualTo(Double value) {
            addCriterion("release_score <>", value, "releaseScore");
            return (Criteria) this;
        }

        public Criteria andReleaseScoreGreaterThan(Double value) {
            addCriterion("release_score >", value, "releaseScore");
            return (Criteria) this;
        }

        public Criteria andReleaseScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("release_score >=", value, "releaseScore");
            return (Criteria) this;
        }

        public Criteria andReleaseScoreLessThan(Double value) {
            addCriterion("release_score <", value, "releaseScore");
            return (Criteria) this;
        }

        public Criteria andReleaseScoreLessThanOrEqualTo(Double value) {
            addCriterion("release_score <=", value, "releaseScore");
            return (Criteria) this;
        }

        public Criteria andReleaseScoreIn(List<Double> values) {
            addCriterion("release_score in", values, "releaseScore");
            return (Criteria) this;
        }

        public Criteria andReleaseScoreNotIn(List<Double> values) {
            addCriterion("release_score not in", values, "releaseScore");
            return (Criteria) this;
        }

        public Criteria andReleaseScoreBetween(Double value1, Double value2) {
            addCriterion("release_score between", value1, value2, "releaseScore");
            return (Criteria) this;
        }

        public Criteria andReleaseScoreNotBetween(Double value1, Double value2) {
            addCriterion("release_score not between", value1, value2, "releaseScore");
            return (Criteria) this;
        }

        public Criteria andProfitScoreIsNull() {
            addCriterion("profit_score is null");
            return (Criteria) this;
        }

        public Criteria andProfitScoreIsNotNull() {
            addCriterion("profit_score is not null");
            return (Criteria) this;
        }

        public Criteria andProfitScoreEqualTo(Double value) {
            addCriterion("profit_score =", value, "profitScore");
            return (Criteria) this;
        }

        public Criteria andProfitScoreNotEqualTo(Double value) {
            addCriterion("profit_score <>", value, "profitScore");
            return (Criteria) this;
        }

        public Criteria andProfitScoreGreaterThan(Double value) {
            addCriterion("profit_score >", value, "profitScore");
            return (Criteria) this;
        }

        public Criteria andProfitScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("profit_score >=", value, "profitScore");
            return (Criteria) this;
        }

        public Criteria andProfitScoreLessThan(Double value) {
            addCriterion("profit_score <", value, "profitScore");
            return (Criteria) this;
        }

        public Criteria andProfitScoreLessThanOrEqualTo(Double value) {
            addCriterion("profit_score <=", value, "profitScore");
            return (Criteria) this;
        }

        public Criteria andProfitScoreIn(List<Double> values) {
            addCriterion("profit_score in", values, "profitScore");
            return (Criteria) this;
        }

        public Criteria andProfitScoreNotIn(List<Double> values) {
            addCriterion("profit_score not in", values, "profitScore");
            return (Criteria) this;
        }

        public Criteria andProfitScoreBetween(Double value1, Double value2) {
            addCriterion("profit_score between", value1, value2, "profitScore");
            return (Criteria) this;
        }

        public Criteria andProfitScoreNotBetween(Double value1, Double value2) {
            addCriterion("profit_score not between", value1, value2, "profitScore");
            return (Criteria) this;
        }

        public Criteria andRiskScoreIsNull() {
            addCriterion("risk_score is null");
            return (Criteria) this;
        }

        public Criteria andRiskScoreIsNotNull() {
            addCriterion("risk_score is not null");
            return (Criteria) this;
        }

        public Criteria andRiskScoreEqualTo(Double value) {
            addCriterion("risk_score =", value, "riskScore");
            return (Criteria) this;
        }

        public Criteria andRiskScoreNotEqualTo(Double value) {
            addCriterion("risk_score <>", value, "riskScore");
            return (Criteria) this;
        }

        public Criteria andRiskScoreGreaterThan(Double value) {
            addCriterion("risk_score >", value, "riskScore");
            return (Criteria) this;
        }

        public Criteria andRiskScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("risk_score >=", value, "riskScore");
            return (Criteria) this;
        }

        public Criteria andRiskScoreLessThan(Double value) {
            addCriterion("risk_score <", value, "riskScore");
            return (Criteria) this;
        }

        public Criteria andRiskScoreLessThanOrEqualTo(Double value) {
            addCriterion("risk_score <=", value, "riskScore");
            return (Criteria) this;
        }

        public Criteria andRiskScoreIn(List<Double> values) {
            addCriterion("risk_score in", values, "riskScore");
            return (Criteria) this;
        }

        public Criteria andRiskScoreNotIn(List<Double> values) {
            addCriterion("risk_score not in", values, "riskScore");
            return (Criteria) this;
        }

        public Criteria andRiskScoreBetween(Double value1, Double value2) {
            addCriterion("risk_score between", value1, value2, "riskScore");
            return (Criteria) this;
        }

        public Criteria andRiskScoreNotBetween(Double value1, Double value2) {
            addCriterion("risk_score not between", value1, value2, "riskScore");
            return (Criteria) this;
        }

        public Criteria andProductRichScoreIsNull() {
            addCriterion("product_rich_score is null");
            return (Criteria) this;
        }

        public Criteria andProductRichScoreIsNotNull() {
            addCriterion("product_rich_score is not null");
            return (Criteria) this;
        }

        public Criteria andProductRichScoreEqualTo(Double value) {
            addCriterion("product_rich_score =", value, "productRichScore");
            return (Criteria) this;
        }

        public Criteria andProductRichScoreNotEqualTo(Double value) {
            addCriterion("product_rich_score <>", value, "productRichScore");
            return (Criteria) this;
        }

        public Criteria andProductRichScoreGreaterThan(Double value) {
            addCriterion("product_rich_score >", value, "productRichScore");
            return (Criteria) this;
        }

        public Criteria andProductRichScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("product_rich_score >=", value, "productRichScore");
            return (Criteria) this;
        }

        public Criteria andProductRichScoreLessThan(Double value) {
            addCriterion("product_rich_score <", value, "productRichScore");
            return (Criteria) this;
        }

        public Criteria andProductRichScoreLessThanOrEqualTo(Double value) {
            addCriterion("product_rich_score <=", value, "productRichScore");
            return (Criteria) this;
        }

        public Criteria andProductRichScoreIn(List<Double> values) {
            addCriterion("product_rich_score in", values, "productRichScore");
            return (Criteria) this;
        }

        public Criteria andProductRichScoreNotIn(List<Double> values) {
            addCriterion("product_rich_score not in", values, "productRichScore");
            return (Criteria) this;
        }

        public Criteria andProductRichScoreBetween(Double value1, Double value2) {
            addCriterion("product_rich_score between", value1, value2, "productRichScore");
            return (Criteria) this;
        }

        public Criteria andProductRichScoreNotBetween(Double value1, Double value2) {
            addCriterion("product_rich_score not between", value1, value2, "productRichScore");
            return (Criteria) this;
        }

        public Criteria andInfoDisclosureScoreIsNull() {
            addCriterion("info_disclosure_score is null");
            return (Criteria) this;
        }

        public Criteria andInfoDisclosureScoreIsNotNull() {
            addCriterion("info_disclosure_score is not null");
            return (Criteria) this;
        }

        public Criteria andInfoDisclosureScoreEqualTo(Double value) {
            addCriterion("info_disclosure_score =", value, "infoDisclosureScore");
            return (Criteria) this;
        }

        public Criteria andInfoDisclosureScoreNotEqualTo(Double value) {
            addCriterion("info_disclosure_score <>", value, "infoDisclosureScore");
            return (Criteria) this;
        }

        public Criteria andInfoDisclosureScoreGreaterThan(Double value) {
            addCriterion("info_disclosure_score >", value, "infoDisclosureScore");
            return (Criteria) this;
        }

        public Criteria andInfoDisclosureScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("info_disclosure_score >=", value, "infoDisclosureScore");
            return (Criteria) this;
        }

        public Criteria andInfoDisclosureScoreLessThan(Double value) {
            addCriterion("info_disclosure_score <", value, "infoDisclosureScore");
            return (Criteria) this;
        }

        public Criteria andInfoDisclosureScoreLessThanOrEqualTo(Double value) {
            addCriterion("info_disclosure_score <=", value, "infoDisclosureScore");
            return (Criteria) this;
        }

        public Criteria andInfoDisclosureScoreIn(List<Double> values) {
            addCriterion("info_disclosure_score in", values, "infoDisclosureScore");
            return (Criteria) this;
        }

        public Criteria andInfoDisclosureScoreNotIn(List<Double> values) {
            addCriterion("info_disclosure_score not in", values, "infoDisclosureScore");
            return (Criteria) this;
        }

        public Criteria andInfoDisclosureScoreBetween(Double value1, Double value2) {
            addCriterion("info_disclosure_score between", value1, value2, "infoDisclosureScore");
            return (Criteria) this;
        }

        public Criteria andInfoDisclosureScoreNotBetween(Double value1, Double value2) {
            addCriterion("info_disclosure_score not between", value1, value2, "infoDisclosureScore");
            return (Criteria) this;
        }

        public Criteria andEvaluateScoreIsNull() {
            addCriterion("evaluate_score is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateScoreIsNotNull() {
            addCriterion("evaluate_score is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateScoreEqualTo(Double value) {
            addCriterion("evaluate_score =", value, "evaluateScore");
            return (Criteria) this;
        }

        public Criteria andEvaluateScoreNotEqualTo(Double value) {
            addCriterion("evaluate_score <>", value, "evaluateScore");
            return (Criteria) this;
        }

        public Criteria andEvaluateScoreGreaterThan(Double value) {
            addCriterion("evaluate_score >", value, "evaluateScore");
            return (Criteria) this;
        }

        public Criteria andEvaluateScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("evaluate_score >=", value, "evaluateScore");
            return (Criteria) this;
        }

        public Criteria andEvaluateScoreLessThan(Double value) {
            addCriterion("evaluate_score <", value, "evaluateScore");
            return (Criteria) this;
        }

        public Criteria andEvaluateScoreLessThanOrEqualTo(Double value) {
            addCriterion("evaluate_score <=", value, "evaluateScore");
            return (Criteria) this;
        }

        public Criteria andEvaluateScoreIn(List<Double> values) {
            addCriterion("evaluate_score in", values, "evaluateScore");
            return (Criteria) this;
        }

        public Criteria andEvaluateScoreNotIn(List<Double> values) {
            addCriterion("evaluate_score not in", values, "evaluateScore");
            return (Criteria) this;
        }

        public Criteria andEvaluateScoreBetween(Double value1, Double value2) {
            addCriterion("evaluate_score between", value1, value2, "evaluateScore");
            return (Criteria) this;
        }

        public Criteria andEvaluateScoreNotBetween(Double value1, Double value2) {
            addCriterion("evaluate_score not between", value1, value2, "evaluateScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIsNull() {
            addCriterion("total_score is null");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIsNotNull() {
            addCriterion("total_score is not null");
            return (Criteria) this;
        }

        public Criteria andTotalScoreEqualTo(Double value) {
            addCriterion("total_score =", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotEqualTo(Double value) {
            addCriterion("total_score <>", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreGreaterThan(Double value) {
            addCriterion("total_score >", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("total_score >=", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreLessThan(Double value) {
            addCriterion("total_score <", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreLessThanOrEqualTo(Double value) {
            addCriterion("total_score <=", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIn(List<Double> values) {
            addCriterion("total_score in", values, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotIn(List<Double> values) {
            addCriterion("total_score not in", values, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreBetween(Double value1, Double value2) {
            addCriterion("total_score between", value1, value2, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotBetween(Double value1, Double value2) {
            addCriterion("total_score not between", value1, value2, "totalScore");
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