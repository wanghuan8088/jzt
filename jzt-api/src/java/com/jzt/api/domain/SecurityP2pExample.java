package com.jzt.api.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SecurityP2pExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SecurityP2pExample() {
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

        public Criteria andP2pIdIsNull() {
            addCriterion("p2p_id is null");
            return (Criteria) this;
        }

        public Criteria andP2pIdIsNotNull() {
            addCriterion("p2p_id is not null");
            return (Criteria) this;
        }

        public Criteria andP2pIdEqualTo(Integer value) {
            addCriterion("p2p_id =", value, "p2pId");
            return (Criteria) this;
        }

        public Criteria andP2pIdNotEqualTo(Integer value) {
            addCriterion("p2p_id <>", value, "p2pId");
            return (Criteria) this;
        }

        public Criteria andP2pIdGreaterThan(Integer value) {
            addCriterion("p2p_id >", value, "p2pId");
            return (Criteria) this;
        }

        public Criteria andP2pIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("p2p_id >=", value, "p2pId");
            return (Criteria) this;
        }

        public Criteria andP2pIdLessThan(Integer value) {
            addCriterion("p2p_id <", value, "p2pId");
            return (Criteria) this;
        }

        public Criteria andP2pIdLessThanOrEqualTo(Integer value) {
            addCriterion("p2p_id <=", value, "p2pId");
            return (Criteria) this;
        }

        public Criteria andP2pIdIn(List<Integer> values) {
            addCriterion("p2p_id in", values, "p2pId");
            return (Criteria) this;
        }

        public Criteria andP2pIdNotIn(List<Integer> values) {
            addCriterion("p2p_id not in", values, "p2pId");
            return (Criteria) this;
        }

        public Criteria andP2pIdBetween(Integer value1, Integer value2) {
            addCriterion("p2p_id between", value1, value2, "p2pId");
            return (Criteria) this;
        }

        public Criteria andP2pIdNotBetween(Integer value1, Integer value2) {
            addCriterion("p2p_id not between", value1, value2, "p2pId");
            return (Criteria) this;
        }

        public Criteria andTenderSecurityIsNull() {
            addCriterion("tender_security is null");
            return (Criteria) this;
        }

        public Criteria andTenderSecurityIsNotNull() {
            addCriterion("tender_security is not null");
            return (Criteria) this;
        }

        public Criteria andTenderSecurityEqualTo(String value) {
            addCriterion("tender_security =", value, "tenderSecurity");
            return (Criteria) this;
        }

        public Criteria andTenderSecurityNotEqualTo(String value) {
            addCriterion("tender_security <>", value, "tenderSecurity");
            return (Criteria) this;
        }

        public Criteria andTenderSecurityGreaterThan(String value) {
            addCriterion("tender_security >", value, "tenderSecurity");
            return (Criteria) this;
        }

        public Criteria andTenderSecurityGreaterThanOrEqualTo(String value) {
            addCriterion("tender_security >=", value, "tenderSecurity");
            return (Criteria) this;
        }

        public Criteria andTenderSecurityLessThan(String value) {
            addCriterion("tender_security <", value, "tenderSecurity");
            return (Criteria) this;
        }

        public Criteria andTenderSecurityLessThanOrEqualTo(String value) {
            addCriterion("tender_security <=", value, "tenderSecurity");
            return (Criteria) this;
        }

        public Criteria andTenderSecurityLike(String value) {
            addCriterion("tender_security like", value, "tenderSecurity");
            return (Criteria) this;
        }

        public Criteria andTenderSecurityNotLike(String value) {
            addCriterion("tender_security not like", value, "tenderSecurity");
            return (Criteria) this;
        }

        public Criteria andTenderSecurityIn(List<String> values) {
            addCriterion("tender_security in", values, "tenderSecurity");
            return (Criteria) this;
        }

        public Criteria andTenderSecurityNotIn(List<String> values) {
            addCriterion("tender_security not in", values, "tenderSecurity");
            return (Criteria) this;
        }

        public Criteria andTenderSecurityBetween(String value1, String value2) {
            addCriterion("tender_security between", value1, value2, "tenderSecurity");
            return (Criteria) this;
        }

        public Criteria andTenderSecurityNotBetween(String value1, String value2) {
            addCriterion("tender_security not between", value1, value2, "tenderSecurity");
            return (Criteria) this;
        }

        public Criteria andSecurityModeIsNull() {
            addCriterion("security_mode is null");
            return (Criteria) this;
        }

        public Criteria andSecurityModeIsNotNull() {
            addCriterion("security_mode is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityModeEqualTo(String value) {
            addCriterion("security_mode =", value, "securityMode");
            return (Criteria) this;
        }

        public Criteria andSecurityModeNotEqualTo(String value) {
            addCriterion("security_mode <>", value, "securityMode");
            return (Criteria) this;
        }

        public Criteria andSecurityModeGreaterThan(String value) {
            addCriterion("security_mode >", value, "securityMode");
            return (Criteria) this;
        }

        public Criteria andSecurityModeGreaterThanOrEqualTo(String value) {
            addCriterion("security_mode >=", value, "securityMode");
            return (Criteria) this;
        }

        public Criteria andSecurityModeLessThan(String value) {
            addCriterion("security_mode <", value, "securityMode");
            return (Criteria) this;
        }

        public Criteria andSecurityModeLessThanOrEqualTo(String value) {
            addCriterion("security_mode <=", value, "securityMode");
            return (Criteria) this;
        }

        public Criteria andSecurityModeLike(String value) {
            addCriterion("security_mode like", value, "securityMode");
            return (Criteria) this;
        }

        public Criteria andSecurityModeNotLike(String value) {
            addCriterion("security_mode not like", value, "securityMode");
            return (Criteria) this;
        }

        public Criteria andSecurityModeIn(List<String> values) {
            addCriterion("security_mode in", values, "securityMode");
            return (Criteria) this;
        }

        public Criteria andSecurityModeNotIn(List<String> values) {
            addCriterion("security_mode not in", values, "securityMode");
            return (Criteria) this;
        }

        public Criteria andSecurityModeBetween(String value1, String value2) {
            addCriterion("security_mode between", value1, value2, "securityMode");
            return (Criteria) this;
        }

        public Criteria andSecurityModeNotBetween(String value1, String value2) {
            addCriterion("security_mode not between", value1, value2, "securityMode");
            return (Criteria) this;
        }

        public Criteria andSecurityModeUrlIsNull() {
            addCriterion("security_mode_url is null");
            return (Criteria) this;
        }

        public Criteria andSecurityModeUrlIsNotNull() {
            addCriterion("security_mode_url is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityModeUrlEqualTo(String value) {
            addCriterion("security_mode_url =", value, "securityModeUrl");
            return (Criteria) this;
        }

        public Criteria andSecurityModeUrlNotEqualTo(String value) {
            addCriterion("security_mode_url <>", value, "securityModeUrl");
            return (Criteria) this;
        }

        public Criteria andSecurityModeUrlGreaterThan(String value) {
            addCriterion("security_mode_url >", value, "securityModeUrl");
            return (Criteria) this;
        }

        public Criteria andSecurityModeUrlGreaterThanOrEqualTo(String value) {
            addCriterion("security_mode_url >=", value, "securityModeUrl");
            return (Criteria) this;
        }

        public Criteria andSecurityModeUrlLessThan(String value) {
            addCriterion("security_mode_url <", value, "securityModeUrl");
            return (Criteria) this;
        }

        public Criteria andSecurityModeUrlLessThanOrEqualTo(String value) {
            addCriterion("security_mode_url <=", value, "securityModeUrl");
            return (Criteria) this;
        }

        public Criteria andSecurityModeUrlLike(String value) {
            addCriterion("security_mode_url like", value, "securityModeUrl");
            return (Criteria) this;
        }

        public Criteria andSecurityModeUrlNotLike(String value) {
            addCriterion("security_mode_url not like", value, "securityModeUrl");
            return (Criteria) this;
        }

        public Criteria andSecurityModeUrlIn(List<String> values) {
            addCriterion("security_mode_url in", values, "securityModeUrl");
            return (Criteria) this;
        }

        public Criteria andSecurityModeUrlNotIn(List<String> values) {
            addCriterion("security_mode_url not in", values, "securityModeUrl");
            return (Criteria) this;
        }

        public Criteria andSecurityModeUrlBetween(String value1, String value2) {
            addCriterion("security_mode_url between", value1, value2, "securityModeUrl");
            return (Criteria) this;
        }

        public Criteria andSecurityModeUrlNotBetween(String value1, String value2) {
            addCriterion("security_mode_url not between", value1, value2, "securityModeUrl");
            return (Criteria) this;
        }

        public Criteria andGuaranteeInstitutionsIsNull() {
            addCriterion("guarantee_institutions is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeInstitutionsIsNotNull() {
            addCriterion("guarantee_institutions is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeInstitutionsEqualTo(String value) {
            addCriterion("guarantee_institutions =", value, "guaranteeInstitutions");
            return (Criteria) this;
        }

        public Criteria andGuaranteeInstitutionsNotEqualTo(String value) {
            addCriterion("guarantee_institutions <>", value, "guaranteeInstitutions");
            return (Criteria) this;
        }

        public Criteria andGuaranteeInstitutionsGreaterThan(String value) {
            addCriterion("guarantee_institutions >", value, "guaranteeInstitutions");
            return (Criteria) this;
        }

        public Criteria andGuaranteeInstitutionsGreaterThanOrEqualTo(String value) {
            addCriterion("guarantee_institutions >=", value, "guaranteeInstitutions");
            return (Criteria) this;
        }

        public Criteria andGuaranteeInstitutionsLessThan(String value) {
            addCriterion("guarantee_institutions <", value, "guaranteeInstitutions");
            return (Criteria) this;
        }

        public Criteria andGuaranteeInstitutionsLessThanOrEqualTo(String value) {
            addCriterion("guarantee_institutions <=", value, "guaranteeInstitutions");
            return (Criteria) this;
        }

        public Criteria andGuaranteeInstitutionsLike(String value) {
            addCriterion("guarantee_institutions like", value, "guaranteeInstitutions");
            return (Criteria) this;
        }

        public Criteria andGuaranteeInstitutionsNotLike(String value) {
            addCriterion("guarantee_institutions not like", value, "guaranteeInstitutions");
            return (Criteria) this;
        }

        public Criteria andGuaranteeInstitutionsIn(List<String> values) {
            addCriterion("guarantee_institutions in", values, "guaranteeInstitutions");
            return (Criteria) this;
        }

        public Criteria andGuaranteeInstitutionsNotIn(List<String> values) {
            addCriterion("guarantee_institutions not in", values, "guaranteeInstitutions");
            return (Criteria) this;
        }

        public Criteria andGuaranteeInstitutionsBetween(String value1, String value2) {
            addCriterion("guarantee_institutions between", value1, value2, "guaranteeInstitutions");
            return (Criteria) this;
        }

        public Criteria andGuaranteeInstitutionsNotBetween(String value1, String value2) {
            addCriterion("guarantee_institutions not between", value1, value2, "guaranteeInstitutions");
            return (Criteria) this;
        }

        public Criteria andRiskReserveInitIsNull() {
            addCriterion("risk_reserve_init is null");
            return (Criteria) this;
        }

        public Criteria andRiskReserveInitIsNotNull() {
            addCriterion("risk_reserve_init is not null");
            return (Criteria) this;
        }

        public Criteria andRiskReserveInitEqualTo(Double value) {
            addCriterion("risk_reserve_init =", value, "riskReserveInit");
            return (Criteria) this;
        }

        public Criteria andRiskReserveInitNotEqualTo(Double value) {
            addCriterion("risk_reserve_init <>", value, "riskReserveInit");
            return (Criteria) this;
        }

        public Criteria andRiskReserveInitGreaterThan(Double value) {
            addCriterion("risk_reserve_init >", value, "riskReserveInit");
            return (Criteria) this;
        }

        public Criteria andRiskReserveInitGreaterThanOrEqualTo(Double value) {
            addCriterion("risk_reserve_init >=", value, "riskReserveInit");
            return (Criteria) this;
        }

        public Criteria andRiskReserveInitLessThan(Double value) {
            addCriterion("risk_reserve_init <", value, "riskReserveInit");
            return (Criteria) this;
        }

        public Criteria andRiskReserveInitLessThanOrEqualTo(Double value) {
            addCriterion("risk_reserve_init <=", value, "riskReserveInit");
            return (Criteria) this;
        }

        public Criteria andRiskReserveInitIn(List<Double> values) {
            addCriterion("risk_reserve_init in", values, "riskReserveInit");
            return (Criteria) this;
        }

        public Criteria andRiskReserveInitNotIn(List<Double> values) {
            addCriterion("risk_reserve_init not in", values, "riskReserveInit");
            return (Criteria) this;
        }

        public Criteria andRiskReserveInitBetween(Double value1, Double value2) {
            addCriterion("risk_reserve_init between", value1, value2, "riskReserveInit");
            return (Criteria) this;
        }

        public Criteria andRiskReserveInitNotBetween(Double value1, Double value2) {
            addCriterion("risk_reserve_init not between", value1, value2, "riskReserveInit");
            return (Criteria) this;
        }

        public Criteria andTrustFundsIsNull() {
            addCriterion("trust_funds is null");
            return (Criteria) this;
        }

        public Criteria andTrustFundsIsNotNull() {
            addCriterion("trust_funds is not null");
            return (Criteria) this;
        }

        public Criteria andTrustFundsEqualTo(String value) {
            addCriterion("trust_funds =", value, "trustFunds");
            return (Criteria) this;
        }

        public Criteria andTrustFundsNotEqualTo(String value) {
            addCriterion("trust_funds <>", value, "trustFunds");
            return (Criteria) this;
        }

        public Criteria andTrustFundsGreaterThan(String value) {
            addCriterion("trust_funds >", value, "trustFunds");
            return (Criteria) this;
        }

        public Criteria andTrustFundsGreaterThanOrEqualTo(String value) {
            addCriterion("trust_funds >=", value, "trustFunds");
            return (Criteria) this;
        }

        public Criteria andTrustFundsLessThan(String value) {
            addCriterion("trust_funds <", value, "trustFunds");
            return (Criteria) this;
        }

        public Criteria andTrustFundsLessThanOrEqualTo(String value) {
            addCriterion("trust_funds <=", value, "trustFunds");
            return (Criteria) this;
        }

        public Criteria andTrustFundsLike(String value) {
            addCriterion("trust_funds like", value, "trustFunds");
            return (Criteria) this;
        }

        public Criteria andTrustFundsNotLike(String value) {
            addCriterion("trust_funds not like", value, "trustFunds");
            return (Criteria) this;
        }

        public Criteria andTrustFundsIn(List<String> values) {
            addCriterion("trust_funds in", values, "trustFunds");
            return (Criteria) this;
        }

        public Criteria andTrustFundsNotIn(List<String> values) {
            addCriterion("trust_funds not in", values, "trustFunds");
            return (Criteria) this;
        }

        public Criteria andTrustFundsBetween(String value1, String value2) {
            addCriterion("trust_funds between", value1, value2, "trustFunds");
            return (Criteria) this;
        }

        public Criteria andTrustFundsNotBetween(String value1, String value2) {
            addCriterion("trust_funds not between", value1, value2, "trustFunds");
            return (Criteria) this;
        }

        public Criteria andCustodianInstitutionIsNull() {
            addCriterion("custodian_institution is null");
            return (Criteria) this;
        }

        public Criteria andCustodianInstitutionIsNotNull() {
            addCriterion("custodian_institution is not null");
            return (Criteria) this;
        }

        public Criteria andCustodianInstitutionEqualTo(String value) {
            addCriterion("custodian_institution =", value, "custodianInstitution");
            return (Criteria) this;
        }

        public Criteria andCustodianInstitutionNotEqualTo(String value) {
            addCriterion("custodian_institution <>", value, "custodianInstitution");
            return (Criteria) this;
        }

        public Criteria andCustodianInstitutionGreaterThan(String value) {
            addCriterion("custodian_institution >", value, "custodianInstitution");
            return (Criteria) this;
        }

        public Criteria andCustodianInstitutionGreaterThanOrEqualTo(String value) {
            addCriterion("custodian_institution >=", value, "custodianInstitution");
            return (Criteria) this;
        }

        public Criteria andCustodianInstitutionLessThan(String value) {
            addCriterion("custodian_institution <", value, "custodianInstitution");
            return (Criteria) this;
        }

        public Criteria andCustodianInstitutionLessThanOrEqualTo(String value) {
            addCriterion("custodian_institution <=", value, "custodianInstitution");
            return (Criteria) this;
        }

        public Criteria andCustodianInstitutionLike(String value) {
            addCriterion("custodian_institution like", value, "custodianInstitution");
            return (Criteria) this;
        }

        public Criteria andCustodianInstitutionNotLike(String value) {
            addCriterion("custodian_institution not like", value, "custodianInstitution");
            return (Criteria) this;
        }

        public Criteria andCustodianInstitutionIn(List<String> values) {
            addCriterion("custodian_institution in", values, "custodianInstitution");
            return (Criteria) this;
        }

        public Criteria andCustodianInstitutionNotIn(List<String> values) {
            addCriterion("custodian_institution not in", values, "custodianInstitution");
            return (Criteria) this;
        }

        public Criteria andCustodianInstitutionBetween(String value1, String value2) {
            addCriterion("custodian_institution between", value1, value2, "custodianInstitution");
            return (Criteria) this;
        }

        public Criteria andCustodianInstitutionNotBetween(String value1, String value2) {
            addCriterion("custodian_institution not between", value1, value2, "custodianInstitution");
            return (Criteria) this;
        }

        public Criteria andTrustFundsTuoIsNull() {
            addCriterion("trust_funds_tuo is null");
            return (Criteria) this;
        }

        public Criteria andTrustFundsTuoIsNotNull() {
            addCriterion("trust_funds_tuo is not null");
            return (Criteria) this;
        }

        public Criteria andTrustFundsTuoEqualTo(String value) {
            addCriterion("trust_funds_tuo =", value, "trustFundsTuo");
            return (Criteria) this;
        }

        public Criteria andTrustFundsTuoNotEqualTo(String value) {
            addCriterion("trust_funds_tuo <>", value, "trustFundsTuo");
            return (Criteria) this;
        }

        public Criteria andTrustFundsTuoGreaterThan(String value) {
            addCriterion("trust_funds_tuo >", value, "trustFundsTuo");
            return (Criteria) this;
        }

        public Criteria andTrustFundsTuoGreaterThanOrEqualTo(String value) {
            addCriterion("trust_funds_tuo >=", value, "trustFundsTuo");
            return (Criteria) this;
        }

        public Criteria andTrustFundsTuoLessThan(String value) {
            addCriterion("trust_funds_tuo <", value, "trustFundsTuo");
            return (Criteria) this;
        }

        public Criteria andTrustFundsTuoLessThanOrEqualTo(String value) {
            addCriterion("trust_funds_tuo <=", value, "trustFundsTuo");
            return (Criteria) this;
        }

        public Criteria andTrustFundsTuoLike(String value) {
            addCriterion("trust_funds_tuo like", value, "trustFundsTuo");
            return (Criteria) this;
        }

        public Criteria andTrustFundsTuoNotLike(String value) {
            addCriterion("trust_funds_tuo not like", value, "trustFundsTuo");
            return (Criteria) this;
        }

        public Criteria andTrustFundsTuoIn(List<String> values) {
            addCriterion("trust_funds_tuo in", values, "trustFundsTuo");
            return (Criteria) this;
        }

        public Criteria andTrustFundsTuoNotIn(List<String> values) {
            addCriterion("trust_funds_tuo not in", values, "trustFundsTuo");
            return (Criteria) this;
        }

        public Criteria andTrustFundsTuoBetween(String value1, String value2) {
            addCriterion("trust_funds_tuo between", value1, value2, "trustFundsTuo");
            return (Criteria) this;
        }

        public Criteria andTrustFundsTuoNotBetween(String value1, String value2) {
            addCriterion("trust_funds_tuo not between", value1, value2, "trustFundsTuo");
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