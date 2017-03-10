package com.jzt.api.domain;

import java.util.ArrayList;
import java.util.List;

public class BankEvalCopyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankEvalCopyExample() {
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

        public Criteria andPersonSurvivalScaleIsNull() {
            addCriterion("person_survival_scale is null");
            return (Criteria) this;
        }

        public Criteria andPersonSurvivalScaleIsNotNull() {
            addCriterion("person_survival_scale is not null");
            return (Criteria) this;
        }

        public Criteria andPersonSurvivalScaleEqualTo(Double value) {
            addCriterion("person_survival_scale =", value, "personSurvivalScale");
            return (Criteria) this;
        }

        public Criteria andPersonSurvivalScaleNotEqualTo(Double value) {
            addCriterion("person_survival_scale <>", value, "personSurvivalScale");
            return (Criteria) this;
        }

        public Criteria andPersonSurvivalScaleGreaterThan(Double value) {
            addCriterion("person_survival_scale >", value, "personSurvivalScale");
            return (Criteria) this;
        }

        public Criteria andPersonSurvivalScaleGreaterThanOrEqualTo(Double value) {
            addCriterion("person_survival_scale >=", value, "personSurvivalScale");
            return (Criteria) this;
        }

        public Criteria andPersonSurvivalScaleLessThan(Double value) {
            addCriterion("person_survival_scale <", value, "personSurvivalScale");
            return (Criteria) this;
        }

        public Criteria andPersonSurvivalScaleLessThanOrEqualTo(Double value) {
            addCriterion("person_survival_scale <=", value, "personSurvivalScale");
            return (Criteria) this;
        }

        public Criteria andPersonSurvivalScaleIn(List<Double> values) {
            addCriterion("person_survival_scale in", values, "personSurvivalScale");
            return (Criteria) this;
        }

        public Criteria andPersonSurvivalScaleNotIn(List<Double> values) {
            addCriterion("person_survival_scale not in", values, "personSurvivalScale");
            return (Criteria) this;
        }

        public Criteria andPersonSurvivalScaleBetween(Double value1, Double value2) {
            addCriterion("person_survival_scale between", value1, value2, "personSurvivalScale");
            return (Criteria) this;
        }

        public Criteria andPersonSurvivalScaleNotBetween(Double value1, Double value2) {
            addCriterion("person_survival_scale not between", value1, value2, "personSurvivalScale");
            return (Criteria) this;
        }

        public Criteria andPersonSurvivalScaleRateIsNull() {
            addCriterion("person_survival_scale_rate is null");
            return (Criteria) this;
        }

        public Criteria andPersonSurvivalScaleRateIsNotNull() {
            addCriterion("person_survival_scale_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPersonSurvivalScaleRateEqualTo(Double value) {
            addCriterion("person_survival_scale_rate =", value, "personSurvivalScaleRate");
            return (Criteria) this;
        }

        public Criteria andPersonSurvivalScaleRateNotEqualTo(Double value) {
            addCriterion("person_survival_scale_rate <>", value, "personSurvivalScaleRate");
            return (Criteria) this;
        }

        public Criteria andPersonSurvivalScaleRateGreaterThan(Double value) {
            addCriterion("person_survival_scale_rate >", value, "personSurvivalScaleRate");
            return (Criteria) this;
        }

        public Criteria andPersonSurvivalScaleRateGreaterThanOrEqualTo(Double value) {
            addCriterion("person_survival_scale_rate >=", value, "personSurvivalScaleRate");
            return (Criteria) this;
        }

        public Criteria andPersonSurvivalScaleRateLessThan(Double value) {
            addCriterion("person_survival_scale_rate <", value, "personSurvivalScaleRate");
            return (Criteria) this;
        }

        public Criteria andPersonSurvivalScaleRateLessThanOrEqualTo(Double value) {
            addCriterion("person_survival_scale_rate <=", value, "personSurvivalScaleRate");
            return (Criteria) this;
        }

        public Criteria andPersonSurvivalScaleRateIn(List<Double> values) {
            addCriterion("person_survival_scale_rate in", values, "personSurvivalScaleRate");
            return (Criteria) this;
        }

        public Criteria andPersonSurvivalScaleRateNotIn(List<Double> values) {
            addCriterion("person_survival_scale_rate not in", values, "personSurvivalScaleRate");
            return (Criteria) this;
        }

        public Criteria andPersonSurvivalScaleRateBetween(Double value1, Double value2) {
            addCriterion("person_survival_scale_rate between", value1, value2, "personSurvivalScaleRate");
            return (Criteria) this;
        }

        public Criteria andPersonSurvivalScaleRateNotBetween(Double value1, Double value2) {
            addCriterion("person_survival_scale_rate not between", value1, value2, "personSurvivalScaleRate");
            return (Criteria) this;
        }

        public Criteria andPersonDailyProductIsNull() {
            addCriterion("person_daily_product is null");
            return (Criteria) this;
        }

        public Criteria andPersonDailyProductIsNotNull() {
            addCriterion("person_daily_product is not null");
            return (Criteria) this;
        }

        public Criteria andPersonDailyProductEqualTo(Double value) {
            addCriterion("person_daily_product =", value, "personDailyProduct");
            return (Criteria) this;
        }

        public Criteria andPersonDailyProductNotEqualTo(Double value) {
            addCriterion("person_daily_product <>", value, "personDailyProduct");
            return (Criteria) this;
        }

        public Criteria andPersonDailyProductGreaterThan(Double value) {
            addCriterion("person_daily_product >", value, "personDailyProduct");
            return (Criteria) this;
        }

        public Criteria andPersonDailyProductGreaterThanOrEqualTo(Double value) {
            addCriterion("person_daily_product >=", value, "personDailyProduct");
            return (Criteria) this;
        }

        public Criteria andPersonDailyProductLessThan(Double value) {
            addCriterion("person_daily_product <", value, "personDailyProduct");
            return (Criteria) this;
        }

        public Criteria andPersonDailyProductLessThanOrEqualTo(Double value) {
            addCriterion("person_daily_product <=", value, "personDailyProduct");
            return (Criteria) this;
        }

        public Criteria andPersonDailyProductIn(List<Double> values) {
            addCriterion("person_daily_product in", values, "personDailyProduct");
            return (Criteria) this;
        }

        public Criteria andPersonDailyProductNotIn(List<Double> values) {
            addCriterion("person_daily_product not in", values, "personDailyProduct");
            return (Criteria) this;
        }

        public Criteria andPersonDailyProductBetween(Double value1, Double value2) {
            addCriterion("person_daily_product between", value1, value2, "personDailyProduct");
            return (Criteria) this;
        }

        public Criteria andPersonDailyProductNotBetween(Double value1, Double value2) {
            addCriterion("person_daily_product not between", value1, value2, "personDailyProduct");
            return (Criteria) this;
        }

        public Criteria andAgencySurvivalScaleIsNull() {
            addCriterion("agency_survival_scale is null");
            return (Criteria) this;
        }

        public Criteria andAgencySurvivalScaleIsNotNull() {
            addCriterion("agency_survival_scale is not null");
            return (Criteria) this;
        }

        public Criteria andAgencySurvivalScaleEqualTo(Double value) {
            addCriterion("agency_survival_scale =", value, "agencySurvivalScale");
            return (Criteria) this;
        }

        public Criteria andAgencySurvivalScaleNotEqualTo(Double value) {
            addCriterion("agency_survival_scale <>", value, "agencySurvivalScale");
            return (Criteria) this;
        }

        public Criteria andAgencySurvivalScaleGreaterThan(Double value) {
            addCriterion("agency_survival_scale >", value, "agencySurvivalScale");
            return (Criteria) this;
        }

        public Criteria andAgencySurvivalScaleGreaterThanOrEqualTo(Double value) {
            addCriterion("agency_survival_scale >=", value, "agencySurvivalScale");
            return (Criteria) this;
        }

        public Criteria andAgencySurvivalScaleLessThan(Double value) {
            addCriterion("agency_survival_scale <", value, "agencySurvivalScale");
            return (Criteria) this;
        }

        public Criteria andAgencySurvivalScaleLessThanOrEqualTo(Double value) {
            addCriterion("agency_survival_scale <=", value, "agencySurvivalScale");
            return (Criteria) this;
        }

        public Criteria andAgencySurvivalScaleIn(List<Double> values) {
            addCriterion("agency_survival_scale in", values, "agencySurvivalScale");
            return (Criteria) this;
        }

        public Criteria andAgencySurvivalScaleNotIn(List<Double> values) {
            addCriterion("agency_survival_scale not in", values, "agencySurvivalScale");
            return (Criteria) this;
        }

        public Criteria andAgencySurvivalScaleBetween(Double value1, Double value2) {
            addCriterion("agency_survival_scale between", value1, value2, "agencySurvivalScale");
            return (Criteria) this;
        }

        public Criteria andAgencySurvivalScaleNotBetween(Double value1, Double value2) {
            addCriterion("agency_survival_scale not between", value1, value2, "agencySurvivalScale");
            return (Criteria) this;
        }

        public Criteria andAgencySurvivalScaleRateIsNull() {
            addCriterion("agency_survival_scale_rate is null");
            return (Criteria) this;
        }

        public Criteria andAgencySurvivalScaleRateIsNotNull() {
            addCriterion("agency_survival_scale_rate is not null");
            return (Criteria) this;
        }

        public Criteria andAgencySurvivalScaleRateEqualTo(Double value) {
            addCriterion("agency_survival_scale_rate =", value, "agencySurvivalScaleRate");
            return (Criteria) this;
        }

        public Criteria andAgencySurvivalScaleRateNotEqualTo(Double value) {
            addCriterion("agency_survival_scale_rate <>", value, "agencySurvivalScaleRate");
            return (Criteria) this;
        }

        public Criteria andAgencySurvivalScaleRateGreaterThan(Double value) {
            addCriterion("agency_survival_scale_rate >", value, "agencySurvivalScaleRate");
            return (Criteria) this;
        }

        public Criteria andAgencySurvivalScaleRateGreaterThanOrEqualTo(Double value) {
            addCriterion("agency_survival_scale_rate >=", value, "agencySurvivalScaleRate");
            return (Criteria) this;
        }

        public Criteria andAgencySurvivalScaleRateLessThan(Double value) {
            addCriterion("agency_survival_scale_rate <", value, "agencySurvivalScaleRate");
            return (Criteria) this;
        }

        public Criteria andAgencySurvivalScaleRateLessThanOrEqualTo(Double value) {
            addCriterion("agency_survival_scale_rate <=", value, "agencySurvivalScaleRate");
            return (Criteria) this;
        }

        public Criteria andAgencySurvivalScaleRateIn(List<Double> values) {
            addCriterion("agency_survival_scale_rate in", values, "agencySurvivalScaleRate");
            return (Criteria) this;
        }

        public Criteria andAgencySurvivalScaleRateNotIn(List<Double> values) {
            addCriterion("agency_survival_scale_rate not in", values, "agencySurvivalScaleRate");
            return (Criteria) this;
        }

        public Criteria andAgencySurvivalScaleRateBetween(Double value1, Double value2) {
            addCriterion("agency_survival_scale_rate between", value1, value2, "agencySurvivalScaleRate");
            return (Criteria) this;
        }

        public Criteria andAgencySurvivalScaleRateNotBetween(Double value1, Double value2) {
            addCriterion("agency_survival_scale_rate not between", value1, value2, "agencySurvivalScaleRate");
            return (Criteria) this;
        }

        public Criteria andPeerSurvivalScaleIsNull() {
            addCriterion("peer_survival_scale is null");
            return (Criteria) this;
        }

        public Criteria andPeerSurvivalScaleIsNotNull() {
            addCriterion("peer_survival_scale is not null");
            return (Criteria) this;
        }

        public Criteria andPeerSurvivalScaleEqualTo(Double value) {
            addCriterion("peer_survival_scale =", value, "peerSurvivalScale");
            return (Criteria) this;
        }

        public Criteria andPeerSurvivalScaleNotEqualTo(Double value) {
            addCriterion("peer_survival_scale <>", value, "peerSurvivalScale");
            return (Criteria) this;
        }

        public Criteria andPeerSurvivalScaleGreaterThan(Double value) {
            addCriterion("peer_survival_scale >", value, "peerSurvivalScale");
            return (Criteria) this;
        }

        public Criteria andPeerSurvivalScaleGreaterThanOrEqualTo(Double value) {
            addCriterion("peer_survival_scale >=", value, "peerSurvivalScale");
            return (Criteria) this;
        }

        public Criteria andPeerSurvivalScaleLessThan(Double value) {
            addCriterion("peer_survival_scale <", value, "peerSurvivalScale");
            return (Criteria) this;
        }

        public Criteria andPeerSurvivalScaleLessThanOrEqualTo(Double value) {
            addCriterion("peer_survival_scale <=", value, "peerSurvivalScale");
            return (Criteria) this;
        }

        public Criteria andPeerSurvivalScaleIn(List<Double> values) {
            addCriterion("peer_survival_scale in", values, "peerSurvivalScale");
            return (Criteria) this;
        }

        public Criteria andPeerSurvivalScaleNotIn(List<Double> values) {
            addCriterion("peer_survival_scale not in", values, "peerSurvivalScale");
            return (Criteria) this;
        }

        public Criteria andPeerSurvivalScaleBetween(Double value1, Double value2) {
            addCriterion("peer_survival_scale between", value1, value2, "peerSurvivalScale");
            return (Criteria) this;
        }

        public Criteria andPeerSurvivalScaleNotBetween(Double value1, Double value2) {
            addCriterion("peer_survival_scale not between", value1, value2, "peerSurvivalScale");
            return (Criteria) this;
        }

        public Criteria andPeerSurvivalScaleRateIsNull() {
            addCriterion("peer_survival_scale_rate is null");
            return (Criteria) this;
        }

        public Criteria andPeerSurvivalScaleRateIsNotNull() {
            addCriterion("peer_survival_scale_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPeerSurvivalScaleRateEqualTo(Double value) {
            addCriterion("peer_survival_scale_rate =", value, "peerSurvivalScaleRate");
            return (Criteria) this;
        }

        public Criteria andPeerSurvivalScaleRateNotEqualTo(Double value) {
            addCriterion("peer_survival_scale_rate <>", value, "peerSurvivalScaleRate");
            return (Criteria) this;
        }

        public Criteria andPeerSurvivalScaleRateGreaterThan(Double value) {
            addCriterion("peer_survival_scale_rate >", value, "peerSurvivalScaleRate");
            return (Criteria) this;
        }

        public Criteria andPeerSurvivalScaleRateGreaterThanOrEqualTo(Double value) {
            addCriterion("peer_survival_scale_rate >=", value, "peerSurvivalScaleRate");
            return (Criteria) this;
        }

        public Criteria andPeerSurvivalScaleRateLessThan(Double value) {
            addCriterion("peer_survival_scale_rate <", value, "peerSurvivalScaleRate");
            return (Criteria) this;
        }

        public Criteria andPeerSurvivalScaleRateLessThanOrEqualTo(Double value) {
            addCriterion("peer_survival_scale_rate <=", value, "peerSurvivalScaleRate");
            return (Criteria) this;
        }

        public Criteria andPeerSurvivalScaleRateIn(List<Double> values) {
            addCriterion("peer_survival_scale_rate in", values, "peerSurvivalScaleRate");
            return (Criteria) this;
        }

        public Criteria andPeerSurvivalScaleRateNotIn(List<Double> values) {
            addCriterion("peer_survival_scale_rate not in", values, "peerSurvivalScaleRate");
            return (Criteria) this;
        }

        public Criteria andPeerSurvivalScaleRateBetween(Double value1, Double value2) {
            addCriterion("peer_survival_scale_rate between", value1, value2, "peerSurvivalScaleRate");
            return (Criteria) this;
        }

        public Criteria andPeerSurvivalScaleRateNotBetween(Double value1, Double value2) {
            addCriterion("peer_survival_scale_rate not between", value1, value2, "peerSurvivalScaleRate");
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

        public Criteria andPersonExpectIsNull() {
            addCriterion("person_expect is null");
            return (Criteria) this;
        }

        public Criteria andPersonExpectIsNotNull() {
            addCriterion("person_expect is not null");
            return (Criteria) this;
        }

        public Criteria andPersonExpectEqualTo(Double value) {
            addCriterion("person_expect =", value, "personExpect");
            return (Criteria) this;
        }

        public Criteria andPersonExpectNotEqualTo(Double value) {
            addCriterion("person_expect <>", value, "personExpect");
            return (Criteria) this;
        }

        public Criteria andPersonExpectGreaterThan(Double value) {
            addCriterion("person_expect >", value, "personExpect");
            return (Criteria) this;
        }

        public Criteria andPersonExpectGreaterThanOrEqualTo(Double value) {
            addCriterion("person_expect >=", value, "personExpect");
            return (Criteria) this;
        }

        public Criteria andPersonExpectLessThan(Double value) {
            addCriterion("person_expect <", value, "personExpect");
            return (Criteria) this;
        }

        public Criteria andPersonExpectLessThanOrEqualTo(Double value) {
            addCriterion("person_expect <=", value, "personExpect");
            return (Criteria) this;
        }

        public Criteria andPersonExpectIn(List<Double> values) {
            addCriterion("person_expect in", values, "personExpect");
            return (Criteria) this;
        }

        public Criteria andPersonExpectNotIn(List<Double> values) {
            addCriterion("person_expect not in", values, "personExpect");
            return (Criteria) this;
        }

        public Criteria andPersonExpectBetween(Double value1, Double value2) {
            addCriterion("person_expect between", value1, value2, "personExpect");
            return (Criteria) this;
        }

        public Criteria andPersonExpectNotBetween(Double value1, Double value2) {
            addCriterion("person_expect not between", value1, value2, "personExpect");
            return (Criteria) this;
        }

        public Criteria andAgencyExpectIsNull() {
            addCriterion("agency_expect is null");
            return (Criteria) this;
        }

        public Criteria andAgencyExpectIsNotNull() {
            addCriterion("agency_expect is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyExpectEqualTo(Double value) {
            addCriterion("agency_expect =", value, "agencyExpect");
            return (Criteria) this;
        }

        public Criteria andAgencyExpectNotEqualTo(Double value) {
            addCriterion("agency_expect <>", value, "agencyExpect");
            return (Criteria) this;
        }

        public Criteria andAgencyExpectGreaterThan(Double value) {
            addCriterion("agency_expect >", value, "agencyExpect");
            return (Criteria) this;
        }

        public Criteria andAgencyExpectGreaterThanOrEqualTo(Double value) {
            addCriterion("agency_expect >=", value, "agencyExpect");
            return (Criteria) this;
        }

        public Criteria andAgencyExpectLessThan(Double value) {
            addCriterion("agency_expect <", value, "agencyExpect");
            return (Criteria) this;
        }

        public Criteria andAgencyExpectLessThanOrEqualTo(Double value) {
            addCriterion("agency_expect <=", value, "agencyExpect");
            return (Criteria) this;
        }

        public Criteria andAgencyExpectIn(List<Double> values) {
            addCriterion("agency_expect in", values, "agencyExpect");
            return (Criteria) this;
        }

        public Criteria andAgencyExpectNotIn(List<Double> values) {
            addCriterion("agency_expect not in", values, "agencyExpect");
            return (Criteria) this;
        }

        public Criteria andAgencyExpectBetween(Double value1, Double value2) {
            addCriterion("agency_expect between", value1, value2, "agencyExpect");
            return (Criteria) this;
        }

        public Criteria andAgencyExpectNotBetween(Double value1, Double value2) {
            addCriterion("agency_expect not between", value1, value2, "agencyExpect");
            return (Criteria) this;
        }

        public Criteria andPeerExpectIsNull() {
            addCriterion("peer_expect is null");
            return (Criteria) this;
        }

        public Criteria andPeerExpectIsNotNull() {
            addCriterion("peer_expect is not null");
            return (Criteria) this;
        }

        public Criteria andPeerExpectEqualTo(Double value) {
            addCriterion("peer_expect =", value, "peerExpect");
            return (Criteria) this;
        }

        public Criteria andPeerExpectNotEqualTo(Double value) {
            addCriterion("peer_expect <>", value, "peerExpect");
            return (Criteria) this;
        }

        public Criteria andPeerExpectGreaterThan(Double value) {
            addCriterion("peer_expect >", value, "peerExpect");
            return (Criteria) this;
        }

        public Criteria andPeerExpectGreaterThanOrEqualTo(Double value) {
            addCriterion("peer_expect >=", value, "peerExpect");
            return (Criteria) this;
        }

        public Criteria andPeerExpectLessThan(Double value) {
            addCriterion("peer_expect <", value, "peerExpect");
            return (Criteria) this;
        }

        public Criteria andPeerExpectLessThanOrEqualTo(Double value) {
            addCriterion("peer_expect <=", value, "peerExpect");
            return (Criteria) this;
        }

        public Criteria andPeerExpectIn(List<Double> values) {
            addCriterion("peer_expect in", values, "peerExpect");
            return (Criteria) this;
        }

        public Criteria andPeerExpectNotIn(List<Double> values) {
            addCriterion("peer_expect not in", values, "peerExpect");
            return (Criteria) this;
        }

        public Criteria andPeerExpectBetween(Double value1, Double value2) {
            addCriterion("peer_expect between", value1, value2, "peerExpect");
            return (Criteria) this;
        }

        public Criteria andPeerExpectNotBetween(Double value1, Double value2) {
            addCriterion("peer_expect not between", value1, value2, "peerExpect");
            return (Criteria) this;
        }

        public Criteria andValueTypeIsNull() {
            addCriterion("value_type is null");
            return (Criteria) this;
        }

        public Criteria andValueTypeIsNotNull() {
            addCriterion("value_type is not null");
            return (Criteria) this;
        }

        public Criteria andValueTypeEqualTo(Double value) {
            addCriterion("value_type =", value, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeNotEqualTo(Double value) {
            addCriterion("value_type <>", value, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeGreaterThan(Double value) {
            addCriterion("value_type >", value, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeGreaterThanOrEqualTo(Double value) {
            addCriterion("value_type >=", value, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeLessThan(Double value) {
            addCriterion("value_type <", value, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeLessThanOrEqualTo(Double value) {
            addCriterion("value_type <=", value, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeIn(List<Double> values) {
            addCriterion("value_type in", values, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeNotIn(List<Double> values) {
            addCriterion("value_type not in", values, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeBetween(Double value1, Double value2) {
            addCriterion("value_type between", value1, value2, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeNotBetween(Double value1, Double value2) {
            addCriterion("value_type not between", value1, value2, "valueType");
            return (Criteria) this;
        }

        public Criteria andStarRateIsNull() {
            addCriterion("star_rate is null");
            return (Criteria) this;
        }

        public Criteria andStarRateIsNotNull() {
            addCriterion("star_rate is not null");
            return (Criteria) this;
        }

        public Criteria andStarRateEqualTo(Double value) {
            addCriterion("star_rate =", value, "starRate");
            return (Criteria) this;
        }

        public Criteria andStarRateNotEqualTo(Double value) {
            addCriterion("star_rate <>", value, "starRate");
            return (Criteria) this;
        }

        public Criteria andStarRateGreaterThan(Double value) {
            addCriterion("star_rate >", value, "starRate");
            return (Criteria) this;
        }

        public Criteria andStarRateGreaterThanOrEqualTo(Double value) {
            addCriterion("star_rate >=", value, "starRate");
            return (Criteria) this;
        }

        public Criteria andStarRateLessThan(Double value) {
            addCriterion("star_rate <", value, "starRate");
            return (Criteria) this;
        }

        public Criteria andStarRateLessThanOrEqualTo(Double value) {
            addCriterion("star_rate <=", value, "starRate");
            return (Criteria) this;
        }

        public Criteria andStarRateIn(List<Double> values) {
            addCriterion("star_rate in", values, "starRate");
            return (Criteria) this;
        }

        public Criteria andStarRateNotIn(List<Double> values) {
            addCriterion("star_rate not in", values, "starRate");
            return (Criteria) this;
        }

        public Criteria andStarRateBetween(Double value1, Double value2) {
            addCriterion("star_rate between", value1, value2, "starRate");
            return (Criteria) this;
        }

        public Criteria andStarRateNotBetween(Double value1, Double value2) {
            addCriterion("star_rate not between", value1, value2, "starRate");
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

        public Criteria andProfitProductIsNull() {
            addCriterion("profit_product is null");
            return (Criteria) this;
        }

        public Criteria andProfitProductIsNotNull() {
            addCriterion("profit_product is not null");
            return (Criteria) this;
        }

        public Criteria andProfitProductEqualTo(Double value) {
            addCriterion("profit_product =", value, "profitProduct");
            return (Criteria) this;
        }

        public Criteria andProfitProductNotEqualTo(Double value) {
            addCriterion("profit_product <>", value, "profitProduct");
            return (Criteria) this;
        }

        public Criteria andProfitProductGreaterThan(Double value) {
            addCriterion("profit_product >", value, "profitProduct");
            return (Criteria) this;
        }

        public Criteria andProfitProductGreaterThanOrEqualTo(Double value) {
            addCriterion("profit_product >=", value, "profitProduct");
            return (Criteria) this;
        }

        public Criteria andProfitProductLessThan(Double value) {
            addCriterion("profit_product <", value, "profitProduct");
            return (Criteria) this;
        }

        public Criteria andProfitProductLessThanOrEqualTo(Double value) {
            addCriterion("profit_product <=", value, "profitProduct");
            return (Criteria) this;
        }

        public Criteria andProfitProductIn(List<Double> values) {
            addCriterion("profit_product in", values, "profitProduct");
            return (Criteria) this;
        }

        public Criteria andProfitProductNotIn(List<Double> values) {
            addCriterion("profit_product not in", values, "profitProduct");
            return (Criteria) this;
        }

        public Criteria andProfitProductBetween(Double value1, Double value2) {
            addCriterion("profit_product between", value1, value2, "profitProduct");
            return (Criteria) this;
        }

        public Criteria andProfitProductNotBetween(Double value1, Double value2) {
            addCriterion("profit_product not between", value1, value2, "profitProduct");
            return (Criteria) this;
        }

        public Criteria andRiskProvisionIsNull() {
            addCriterion("risk_provision is null");
            return (Criteria) this;
        }

        public Criteria andRiskProvisionIsNotNull() {
            addCriterion("risk_provision is not null");
            return (Criteria) this;
        }

        public Criteria andRiskProvisionEqualTo(Double value) {
            addCriterion("risk_provision =", value, "riskProvision");
            return (Criteria) this;
        }

        public Criteria andRiskProvisionNotEqualTo(Double value) {
            addCriterion("risk_provision <>", value, "riskProvision");
            return (Criteria) this;
        }

        public Criteria andRiskProvisionGreaterThan(Double value) {
            addCriterion("risk_provision >", value, "riskProvision");
            return (Criteria) this;
        }

        public Criteria andRiskProvisionGreaterThanOrEqualTo(Double value) {
            addCriterion("risk_provision >=", value, "riskProvision");
            return (Criteria) this;
        }

        public Criteria andRiskProvisionLessThan(Double value) {
            addCriterion("risk_provision <", value, "riskProvision");
            return (Criteria) this;
        }

        public Criteria andRiskProvisionLessThanOrEqualTo(Double value) {
            addCriterion("risk_provision <=", value, "riskProvision");
            return (Criteria) this;
        }

        public Criteria andRiskProvisionIn(List<Double> values) {
            addCriterion("risk_provision in", values, "riskProvision");
            return (Criteria) this;
        }

        public Criteria andRiskProvisionNotIn(List<Double> values) {
            addCriterion("risk_provision not in", values, "riskProvision");
            return (Criteria) this;
        }

        public Criteria andRiskProvisionBetween(Double value1, Double value2) {
            addCriterion("risk_provision between", value1, value2, "riskProvision");
            return (Criteria) this;
        }

        public Criteria andRiskProvisionNotBetween(Double value1, Double value2) {
            addCriterion("risk_provision not between", value1, value2, "riskProvision");
            return (Criteria) this;
        }

        public Criteria andRiskManageIsNull() {
            addCriterion("risk_manage is null");
            return (Criteria) this;
        }

        public Criteria andRiskManageIsNotNull() {
            addCriterion("risk_manage is not null");
            return (Criteria) this;
        }

        public Criteria andRiskManageEqualTo(Double value) {
            addCriterion("risk_manage =", value, "riskManage");
            return (Criteria) this;
        }

        public Criteria andRiskManageNotEqualTo(Double value) {
            addCriterion("risk_manage <>", value, "riskManage");
            return (Criteria) this;
        }

        public Criteria andRiskManageGreaterThan(Double value) {
            addCriterion("risk_manage >", value, "riskManage");
            return (Criteria) this;
        }

        public Criteria andRiskManageGreaterThanOrEqualTo(Double value) {
            addCriterion("risk_manage >=", value, "riskManage");
            return (Criteria) this;
        }

        public Criteria andRiskManageLessThan(Double value) {
            addCriterion("risk_manage <", value, "riskManage");
            return (Criteria) this;
        }

        public Criteria andRiskManageLessThanOrEqualTo(Double value) {
            addCriterion("risk_manage <=", value, "riskManage");
            return (Criteria) this;
        }

        public Criteria andRiskManageIn(List<Double> values) {
            addCriterion("risk_manage in", values, "riskManage");
            return (Criteria) this;
        }

        public Criteria andRiskManageNotIn(List<Double> values) {
            addCriterion("risk_manage not in", values, "riskManage");
            return (Criteria) this;
        }

        public Criteria andRiskManageBetween(Double value1, Double value2) {
            addCriterion("risk_manage between", value1, value2, "riskManage");
            return (Criteria) this;
        }

        public Criteria andRiskManageNotBetween(Double value1, Double value2) {
            addCriterion("risk_manage not between", value1, value2, "riskManage");
            return (Criteria) this;
        }

        public Criteria andRiskAdjustIsNull() {
            addCriterion("risk_adjust is null");
            return (Criteria) this;
        }

        public Criteria andRiskAdjustIsNotNull() {
            addCriterion("risk_adjust is not null");
            return (Criteria) this;
        }

        public Criteria andRiskAdjustEqualTo(Double value) {
            addCriterion("risk_adjust =", value, "riskAdjust");
            return (Criteria) this;
        }

        public Criteria andRiskAdjustNotEqualTo(Double value) {
            addCriterion("risk_adjust <>", value, "riskAdjust");
            return (Criteria) this;
        }

        public Criteria andRiskAdjustGreaterThan(Double value) {
            addCriterion("risk_adjust >", value, "riskAdjust");
            return (Criteria) this;
        }

        public Criteria andRiskAdjustGreaterThanOrEqualTo(Double value) {
            addCriterion("risk_adjust >=", value, "riskAdjust");
            return (Criteria) this;
        }

        public Criteria andRiskAdjustLessThan(Double value) {
            addCriterion("risk_adjust <", value, "riskAdjust");
            return (Criteria) this;
        }

        public Criteria andRiskAdjustLessThanOrEqualTo(Double value) {
            addCriterion("risk_adjust <=", value, "riskAdjust");
            return (Criteria) this;
        }

        public Criteria andRiskAdjustIn(List<Double> values) {
            addCriterion("risk_adjust in", values, "riskAdjust");
            return (Criteria) this;
        }

        public Criteria andRiskAdjustNotIn(List<Double> values) {
            addCriterion("risk_adjust not in", values, "riskAdjust");
            return (Criteria) this;
        }

        public Criteria andRiskAdjustBetween(Double value1, Double value2) {
            addCriterion("risk_adjust between", value1, value2, "riskAdjust");
            return (Criteria) this;
        }

        public Criteria andRiskAdjustNotBetween(Double value1, Double value2) {
            addCriterion("risk_adjust not between", value1, value2, "riskAdjust");
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

        public Criteria andLimitTypeIsNull() {
            addCriterion("limit_type is null");
            return (Criteria) this;
        }

        public Criteria andLimitTypeIsNotNull() {
            addCriterion("limit_type is not null");
            return (Criteria) this;
        }

        public Criteria andLimitTypeEqualTo(Double value) {
            addCriterion("limit_type =", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeNotEqualTo(Double value) {
            addCriterion("limit_type <>", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeGreaterThan(Double value) {
            addCriterion("limit_type >", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeGreaterThanOrEqualTo(Double value) {
            addCriterion("limit_type >=", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeLessThan(Double value) {
            addCriterion("limit_type <", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeLessThanOrEqualTo(Double value) {
            addCriterion("limit_type <=", value, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeIn(List<Double> values) {
            addCriterion("limit_type in", values, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeNotIn(List<Double> values) {
            addCriterion("limit_type not in", values, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeBetween(Double value1, Double value2) {
            addCriterion("limit_type between", value1, value2, "limitType");
            return (Criteria) this;
        }

        public Criteria andLimitTypeNotBetween(Double value1, Double value2) {
            addCriterion("limit_type not between", value1, value2, "limitType");
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