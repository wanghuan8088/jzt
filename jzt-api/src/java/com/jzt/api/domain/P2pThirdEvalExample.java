package com.jzt.api.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class P2pThirdEvalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public P2pThirdEvalExample() {
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

        public Criteria andPidIsNull() {
            addCriterion("pId is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pId is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pId =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pId <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pId >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pId >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pId <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pId <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pId in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pId not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pId between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pId not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andDevelopmentRateIsNull() {
            addCriterion("development_rate is null");
            return (Criteria) this;
        }

        public Criteria andDevelopmentRateIsNotNull() {
            addCriterion("development_rate is not null");
            return (Criteria) this;
        }

        public Criteria andDevelopmentRateEqualTo(Float value) {
            addCriterion("development_rate =", value, "developmentRate");
            return (Criteria) this;
        }

        public Criteria andDevelopmentRateNotEqualTo(Float value) {
            addCriterion("development_rate <>", value, "developmentRate");
            return (Criteria) this;
        }

        public Criteria andDevelopmentRateGreaterThan(Float value) {
            addCriterion("development_rate >", value, "developmentRate");
            return (Criteria) this;
        }

        public Criteria andDevelopmentRateGreaterThanOrEqualTo(Float value) {
            addCriterion("development_rate >=", value, "developmentRate");
            return (Criteria) this;
        }

        public Criteria andDevelopmentRateLessThan(Float value) {
            addCriterion("development_rate <", value, "developmentRate");
            return (Criteria) this;
        }

        public Criteria andDevelopmentRateLessThanOrEqualTo(Float value) {
            addCriterion("development_rate <=", value, "developmentRate");
            return (Criteria) this;
        }

        public Criteria andDevelopmentRateIn(List<Float> values) {
            addCriterion("development_rate in", values, "developmentRate");
            return (Criteria) this;
        }

        public Criteria andDevelopmentRateNotIn(List<Float> values) {
            addCriterion("development_rate not in", values, "developmentRate");
            return (Criteria) this;
        }

        public Criteria andDevelopmentRateBetween(Float value1, Float value2) {
            addCriterion("development_rate between", value1, value2, "developmentRate");
            return (Criteria) this;
        }

        public Criteria andDevelopmentRateNotBetween(Float value1, Float value2) {
            addCriterion("development_rate not between", value1, value2, "developmentRate");
            return (Criteria) this;
        }

        public Criteria andMobilityIsNull() {
            addCriterion("mobility is null");
            return (Criteria) this;
        }

        public Criteria andMobilityIsNotNull() {
            addCriterion("mobility is not null");
            return (Criteria) this;
        }

        public Criteria andMobilityEqualTo(Float value) {
            addCriterion("mobility =", value, "mobility");
            return (Criteria) this;
        }

        public Criteria andMobilityNotEqualTo(Float value) {
            addCriterion("mobility <>", value, "mobility");
            return (Criteria) this;
        }

        public Criteria andMobilityGreaterThan(Float value) {
            addCriterion("mobility >", value, "mobility");
            return (Criteria) this;
        }

        public Criteria andMobilityGreaterThanOrEqualTo(Float value) {
            addCriterion("mobility >=", value, "mobility");
            return (Criteria) this;
        }

        public Criteria andMobilityLessThan(Float value) {
            addCriterion("mobility <", value, "mobility");
            return (Criteria) this;
        }

        public Criteria andMobilityLessThanOrEqualTo(Float value) {
            addCriterion("mobility <=", value, "mobility");
            return (Criteria) this;
        }

        public Criteria andMobilityIn(List<Float> values) {
            addCriterion("mobility in", values, "mobility");
            return (Criteria) this;
        }

        public Criteria andMobilityNotIn(List<Float> values) {
            addCriterion("mobility not in", values, "mobility");
            return (Criteria) this;
        }

        public Criteria andMobilityBetween(Float value1, Float value2) {
            addCriterion("mobility between", value1, value2, "mobility");
            return (Criteria) this;
        }

        public Criteria andMobilityNotBetween(Float value1, Float value2) {
            addCriterion("mobility not between", value1, value2, "mobility");
            return (Criteria) this;
        }

        public Criteria andTurnoverIsNull() {
            addCriterion("turnover is null");
            return (Criteria) this;
        }

        public Criteria andTurnoverIsNotNull() {
            addCriterion("turnover is not null");
            return (Criteria) this;
        }

        public Criteria andTurnoverEqualTo(Float value) {
            addCriterion("turnover =", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverNotEqualTo(Float value) {
            addCriterion("turnover <>", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverGreaterThan(Float value) {
            addCriterion("turnover >", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverGreaterThanOrEqualTo(Float value) {
            addCriterion("turnover >=", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverLessThan(Float value) {
            addCriterion("turnover <", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverLessThanOrEqualTo(Float value) {
            addCriterion("turnover <=", value, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverIn(List<Float> values) {
            addCriterion("turnover in", values, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverNotIn(List<Float> values) {
            addCriterion("turnover not in", values, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverBetween(Float value1, Float value2) {
            addCriterion("turnover between", value1, value2, "turnover");
            return (Criteria) this;
        }

        public Criteria andTurnoverNotBetween(Float value1, Float value2) {
            addCriterion("turnover not between", value1, value2, "turnover");
            return (Criteria) this;
        }

        public Criteria andBenefitIsNull() {
            addCriterion("benefit is null");
            return (Criteria) this;
        }

        public Criteria andBenefitIsNotNull() {
            addCriterion("benefit is not null");
            return (Criteria) this;
        }

        public Criteria andBenefitEqualTo(Float value) {
            addCriterion("benefit =", value, "benefit");
            return (Criteria) this;
        }

        public Criteria andBenefitNotEqualTo(Float value) {
            addCriterion("benefit <>", value, "benefit");
            return (Criteria) this;
        }

        public Criteria andBenefitGreaterThan(Float value) {
            addCriterion("benefit >", value, "benefit");
            return (Criteria) this;
        }

        public Criteria andBenefitGreaterThanOrEqualTo(Float value) {
            addCriterion("benefit >=", value, "benefit");
            return (Criteria) this;
        }

        public Criteria andBenefitLessThan(Float value) {
            addCriterion("benefit <", value, "benefit");
            return (Criteria) this;
        }

        public Criteria andBenefitLessThanOrEqualTo(Float value) {
            addCriterion("benefit <=", value, "benefit");
            return (Criteria) this;
        }

        public Criteria andBenefitIn(List<Float> values) {
            addCriterion("benefit in", values, "benefit");
            return (Criteria) this;
        }

        public Criteria andBenefitNotIn(List<Float> values) {
            addCriterion("benefit not in", values, "benefit");
            return (Criteria) this;
        }

        public Criteria andBenefitBetween(Float value1, Float value2) {
            addCriterion("benefit between", value1, value2, "benefit");
            return (Criteria) this;
        }

        public Criteria andBenefitNotBetween(Float value1, Float value2) {
            addCriterion("benefit not between", value1, value2, "benefit");
            return (Criteria) this;
        }

        public Criteria andDispersionIsNull() {
            addCriterion("dispersion is null");
            return (Criteria) this;
        }

        public Criteria andDispersionIsNotNull() {
            addCriterion("dispersion is not null");
            return (Criteria) this;
        }

        public Criteria andDispersionEqualTo(Float value) {
            addCriterion("dispersion =", value, "dispersion");
            return (Criteria) this;
        }

        public Criteria andDispersionNotEqualTo(Float value) {
            addCriterion("dispersion <>", value, "dispersion");
            return (Criteria) this;
        }

        public Criteria andDispersionGreaterThan(Float value) {
            addCriterion("dispersion >", value, "dispersion");
            return (Criteria) this;
        }

        public Criteria andDispersionGreaterThanOrEqualTo(Float value) {
            addCriterion("dispersion >=", value, "dispersion");
            return (Criteria) this;
        }

        public Criteria andDispersionLessThan(Float value) {
            addCriterion("dispersion <", value, "dispersion");
            return (Criteria) this;
        }

        public Criteria andDispersionLessThanOrEqualTo(Float value) {
            addCriterion("dispersion <=", value, "dispersion");
            return (Criteria) this;
        }

        public Criteria andDispersionIn(List<Float> values) {
            addCriterion("dispersion in", values, "dispersion");
            return (Criteria) this;
        }

        public Criteria andDispersionNotIn(List<Float> values) {
            addCriterion("dispersion not in", values, "dispersion");
            return (Criteria) this;
        }

        public Criteria andDispersionBetween(Float value1, Float value2) {
            addCriterion("dispersion between", value1, value2, "dispersion");
            return (Criteria) this;
        }

        public Criteria andDispersionNotBetween(Float value1, Float value2) {
            addCriterion("dispersion not between", value1, value2, "dispersion");
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

        public Criteria andPopularityIsNull() {
            addCriterion("popularity is null");
            return (Criteria) this;
        }

        public Criteria andPopularityIsNotNull() {
            addCriterion("popularity is not null");
            return (Criteria) this;
        }

        public Criteria andPopularityEqualTo(Float value) {
            addCriterion("popularity =", value, "popularity");
            return (Criteria) this;
        }

        public Criteria andPopularityNotEqualTo(Float value) {
            addCriterion("popularity <>", value, "popularity");
            return (Criteria) this;
        }

        public Criteria andPopularityGreaterThan(Float value) {
            addCriterion("popularity >", value, "popularity");
            return (Criteria) this;
        }

        public Criteria andPopularityGreaterThanOrEqualTo(Float value) {
            addCriterion("popularity >=", value, "popularity");
            return (Criteria) this;
        }

        public Criteria andPopularityLessThan(Float value) {
            addCriterion("popularity <", value, "popularity");
            return (Criteria) this;
        }

        public Criteria andPopularityLessThanOrEqualTo(Float value) {
            addCriterion("popularity <=", value, "popularity");
            return (Criteria) this;
        }

        public Criteria andPopularityIn(List<Float> values) {
            addCriterion("popularity in", values, "popularity");
            return (Criteria) this;
        }

        public Criteria andPopularityNotIn(List<Float> values) {
            addCriterion("popularity not in", values, "popularity");
            return (Criteria) this;
        }

        public Criteria andPopularityBetween(Float value1, Float value2) {
            addCriterion("popularity between", value1, value2, "popularity");
            return (Criteria) this;
        }

        public Criteria andPopularityNotBetween(Float value1, Float value2) {
            addCriterion("popularity not between", value1, value2, "popularity");
            return (Criteria) this;
        }

        public Criteria andTransparencyIsNull() {
            addCriterion("transparency is null");
            return (Criteria) this;
        }

        public Criteria andTransparencyIsNotNull() {
            addCriterion("transparency is not null");
            return (Criteria) this;
        }

        public Criteria andTransparencyEqualTo(Float value) {
            addCriterion("transparency =", value, "transparency");
            return (Criteria) this;
        }

        public Criteria andTransparencyNotEqualTo(Float value) {
            addCriterion("transparency <>", value, "transparency");
            return (Criteria) this;
        }

        public Criteria andTransparencyGreaterThan(Float value) {
            addCriterion("transparency >", value, "transparency");
            return (Criteria) this;
        }

        public Criteria andTransparencyGreaterThanOrEqualTo(Float value) {
            addCriterion("transparency >=", value, "transparency");
            return (Criteria) this;
        }

        public Criteria andTransparencyLessThan(Float value) {
            addCriterion("transparency <", value, "transparency");
            return (Criteria) this;
        }

        public Criteria andTransparencyLessThanOrEqualTo(Float value) {
            addCriterion("transparency <=", value, "transparency");
            return (Criteria) this;
        }

        public Criteria andTransparencyIn(List<Float> values) {
            addCriterion("transparency in", values, "transparency");
            return (Criteria) this;
        }

        public Criteria andTransparencyNotIn(List<Float> values) {
            addCriterion("transparency not in", values, "transparency");
            return (Criteria) this;
        }

        public Criteria andTransparencyBetween(Float value1, Float value2) {
            addCriterion("transparency between", value1, value2, "transparency");
            return (Criteria) this;
        }

        public Criteria andTransparencyNotBetween(Float value1, Float value2) {
            addCriterion("transparency not between", value1, value2, "transparency");
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