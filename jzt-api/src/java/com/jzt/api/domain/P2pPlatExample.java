package com.jzt.api.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class P2pPlatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public P2pPlatExample() {
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

        public Criteria andIsAutoBidIsNull() {
            addCriterion("is_auto_bid is null");
            return (Criteria) this;
        }

        public Criteria andIsAutoBidIsNotNull() {
            addCriterion("is_auto_bid is not null");
            return (Criteria) this;
        }

        public Criteria andIsAutoBidEqualTo(Integer value) {
            addCriterion("is_auto_bid =", value, "isAutoBid");
            return (Criteria) this;
        }

        public Criteria andIsAutoBidNotEqualTo(Integer value) {
            addCriterion("is_auto_bid <>", value, "isAutoBid");
            return (Criteria) this;
        }

        public Criteria andIsAutoBidGreaterThan(Integer value) {
            addCriterion("is_auto_bid >", value, "isAutoBid");
            return (Criteria) this;
        }

        public Criteria andIsAutoBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_auto_bid >=", value, "isAutoBid");
            return (Criteria) this;
        }

        public Criteria andIsAutoBidLessThan(Integer value) {
            addCriterion("is_auto_bid <", value, "isAutoBid");
            return (Criteria) this;
        }

        public Criteria andIsAutoBidLessThanOrEqualTo(Integer value) {
            addCriterion("is_auto_bid <=", value, "isAutoBid");
            return (Criteria) this;
        }

        public Criteria andIsAutoBidIn(List<Integer> values) {
            addCriterion("is_auto_bid in", values, "isAutoBid");
            return (Criteria) this;
        }

        public Criteria andIsAutoBidNotIn(List<Integer> values) {
            addCriterion("is_auto_bid not in", values, "isAutoBid");
            return (Criteria) this;
        }

        public Criteria andIsAutoBidBetween(Integer value1, Integer value2) {
            addCriterion("is_auto_bid between", value1, value2, "isAutoBid");
            return (Criteria) this;
        }

        public Criteria andIsAutoBidNotBetween(Integer value1, Integer value2) {
            addCriterion("is_auto_bid not between", value1, value2, "isAutoBid");
            return (Criteria) this;
        }

        public Criteria andIsEquitableAssignmentIsNull() {
            addCriterion("is_equitable_assignment is null");
            return (Criteria) this;
        }

        public Criteria andIsEquitableAssignmentIsNotNull() {
            addCriterion("is_equitable_assignment is not null");
            return (Criteria) this;
        }

        public Criteria andIsEquitableAssignmentEqualTo(Integer value) {
            addCriterion("is_equitable_assignment =", value, "isEquitableAssignment");
            return (Criteria) this;
        }

        public Criteria andIsEquitableAssignmentNotEqualTo(Integer value) {
            addCriterion("is_equitable_assignment <>", value, "isEquitableAssignment");
            return (Criteria) this;
        }

        public Criteria andIsEquitableAssignmentGreaterThan(Integer value) {
            addCriterion("is_equitable_assignment >", value, "isEquitableAssignment");
            return (Criteria) this;
        }

        public Criteria andIsEquitableAssignmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_equitable_assignment >=", value, "isEquitableAssignment");
            return (Criteria) this;
        }

        public Criteria andIsEquitableAssignmentLessThan(Integer value) {
            addCriterion("is_equitable_assignment <", value, "isEquitableAssignment");
            return (Criteria) this;
        }

        public Criteria andIsEquitableAssignmentLessThanOrEqualTo(Integer value) {
            addCriterion("is_equitable_assignment <=", value, "isEquitableAssignment");
            return (Criteria) this;
        }

        public Criteria andIsEquitableAssignmentIn(List<Integer> values) {
            addCriterion("is_equitable_assignment in", values, "isEquitableAssignment");
            return (Criteria) this;
        }

        public Criteria andIsEquitableAssignmentNotIn(List<Integer> values) {
            addCriterion("is_equitable_assignment not in", values, "isEquitableAssignment");
            return (Criteria) this;
        }

        public Criteria andIsEquitableAssignmentBetween(Integer value1, Integer value2) {
            addCriterion("is_equitable_assignment between", value1, value2, "isEquitableAssignment");
            return (Criteria) this;
        }

        public Criteria andIsEquitableAssignmentNotBetween(Integer value1, Integer value2) {
            addCriterion("is_equitable_assignment not between", value1, value2, "isEquitableAssignment");
            return (Criteria) this;
        }

        public Criteria andManageFeeIsNull() {
            addCriterion("manage_fee is null");
            return (Criteria) this;
        }

        public Criteria andManageFeeIsNotNull() {
            addCriterion("manage_fee is not null");
            return (Criteria) this;
        }

        public Criteria andManageFeeEqualTo(String value) {
            addCriterion("manage_fee =", value, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeNotEqualTo(String value) {
            addCriterion("manage_fee <>", value, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeGreaterThan(String value) {
            addCriterion("manage_fee >", value, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeGreaterThanOrEqualTo(String value) {
            addCriterion("manage_fee >=", value, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeLessThan(String value) {
            addCriterion("manage_fee <", value, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeLessThanOrEqualTo(String value) {
            addCriterion("manage_fee <=", value, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeLike(String value) {
            addCriterion("manage_fee like", value, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeNotLike(String value) {
            addCriterion("manage_fee not like", value, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeIn(List<String> values) {
            addCriterion("manage_fee in", values, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeNotIn(List<String> values) {
            addCriterion("manage_fee not in", values, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeBetween(String value1, String value2) {
            addCriterion("manage_fee between", value1, value2, "manageFee");
            return (Criteria) this;
        }

        public Criteria andManageFeeNotBetween(String value1, String value2) {
            addCriterion("manage_fee not between", value1, value2, "manageFee");
            return (Criteria) this;
        }

        public Criteria andPrepaidFeeIsNull() {
            addCriterion("prepaid_fee is null");
            return (Criteria) this;
        }

        public Criteria andPrepaidFeeIsNotNull() {
            addCriterion("prepaid_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPrepaidFeeEqualTo(String value) {
            addCriterion("prepaid_fee =", value, "prepaidFee");
            return (Criteria) this;
        }

        public Criteria andPrepaidFeeNotEqualTo(String value) {
            addCriterion("prepaid_fee <>", value, "prepaidFee");
            return (Criteria) this;
        }

        public Criteria andPrepaidFeeGreaterThan(String value) {
            addCriterion("prepaid_fee >", value, "prepaidFee");
            return (Criteria) this;
        }

        public Criteria andPrepaidFeeGreaterThanOrEqualTo(String value) {
            addCriterion("prepaid_fee >=", value, "prepaidFee");
            return (Criteria) this;
        }

        public Criteria andPrepaidFeeLessThan(String value) {
            addCriterion("prepaid_fee <", value, "prepaidFee");
            return (Criteria) this;
        }

        public Criteria andPrepaidFeeLessThanOrEqualTo(String value) {
            addCriterion("prepaid_fee <=", value, "prepaidFee");
            return (Criteria) this;
        }

        public Criteria andPrepaidFeeLike(String value) {
            addCriterion("prepaid_fee like", value, "prepaidFee");
            return (Criteria) this;
        }

        public Criteria andPrepaidFeeNotLike(String value) {
            addCriterion("prepaid_fee not like", value, "prepaidFee");
            return (Criteria) this;
        }

        public Criteria andPrepaidFeeIn(List<String> values) {
            addCriterion("prepaid_fee in", values, "prepaidFee");
            return (Criteria) this;
        }

        public Criteria andPrepaidFeeNotIn(List<String> values) {
            addCriterion("prepaid_fee not in", values, "prepaidFee");
            return (Criteria) this;
        }

        public Criteria andPrepaidFeeBetween(String value1, String value2) {
            addCriterion("prepaid_fee between", value1, value2, "prepaidFee");
            return (Criteria) this;
        }

        public Criteria andPrepaidFeeNotBetween(String value1, String value2) {
            addCriterion("prepaid_fee not between", value1, value2, "prepaidFee");
            return (Criteria) this;
        }

        public Criteria andCashWithdrawalFeeIsNull() {
            addCriterion("cash_withdrawal_fee is null");
            return (Criteria) this;
        }

        public Criteria andCashWithdrawalFeeIsNotNull() {
            addCriterion("cash_withdrawal_fee is not null");
            return (Criteria) this;
        }

        public Criteria andCashWithdrawalFeeEqualTo(String value) {
            addCriterion("cash_withdrawal_fee =", value, "cashWithdrawalFee");
            return (Criteria) this;
        }

        public Criteria andCashWithdrawalFeeNotEqualTo(String value) {
            addCriterion("cash_withdrawal_fee <>", value, "cashWithdrawalFee");
            return (Criteria) this;
        }

        public Criteria andCashWithdrawalFeeGreaterThan(String value) {
            addCriterion("cash_withdrawal_fee >", value, "cashWithdrawalFee");
            return (Criteria) this;
        }

        public Criteria andCashWithdrawalFeeGreaterThanOrEqualTo(String value) {
            addCriterion("cash_withdrawal_fee >=", value, "cashWithdrawalFee");
            return (Criteria) this;
        }

        public Criteria andCashWithdrawalFeeLessThan(String value) {
            addCriterion("cash_withdrawal_fee <", value, "cashWithdrawalFee");
            return (Criteria) this;
        }

        public Criteria andCashWithdrawalFeeLessThanOrEqualTo(String value) {
            addCriterion("cash_withdrawal_fee <=", value, "cashWithdrawalFee");
            return (Criteria) this;
        }

        public Criteria andCashWithdrawalFeeLike(String value) {
            addCriterion("cash_withdrawal_fee like", value, "cashWithdrawalFee");
            return (Criteria) this;
        }

        public Criteria andCashWithdrawalFeeNotLike(String value) {
            addCriterion("cash_withdrawal_fee not like", value, "cashWithdrawalFee");
            return (Criteria) this;
        }

        public Criteria andCashWithdrawalFeeIn(List<String> values) {
            addCriterion("cash_withdrawal_fee in", values, "cashWithdrawalFee");
            return (Criteria) this;
        }

        public Criteria andCashWithdrawalFeeNotIn(List<String> values) {
            addCriterion("cash_withdrawal_fee not in", values, "cashWithdrawalFee");
            return (Criteria) this;
        }

        public Criteria andCashWithdrawalFeeBetween(String value1, String value2) {
            addCriterion("cash_withdrawal_fee between", value1, value2, "cashWithdrawalFee");
            return (Criteria) this;
        }

        public Criteria andCashWithdrawalFeeNotBetween(String value1, String value2) {
            addCriterion("cash_withdrawal_fee not between", value1, value2, "cashWithdrawalFee");
            return (Criteria) this;
        }

        public Criteria andVipFeeIsNull() {
            addCriterion("vip_fee is null");
            return (Criteria) this;
        }

        public Criteria andVipFeeIsNotNull() {
            addCriterion("vip_fee is not null");
            return (Criteria) this;
        }

        public Criteria andVipFeeEqualTo(String value) {
            addCriterion("vip_fee =", value, "vipFee");
            return (Criteria) this;
        }

        public Criteria andVipFeeNotEqualTo(String value) {
            addCriterion("vip_fee <>", value, "vipFee");
            return (Criteria) this;
        }

        public Criteria andVipFeeGreaterThan(String value) {
            addCriterion("vip_fee >", value, "vipFee");
            return (Criteria) this;
        }

        public Criteria andVipFeeGreaterThanOrEqualTo(String value) {
            addCriterion("vip_fee >=", value, "vipFee");
            return (Criteria) this;
        }

        public Criteria andVipFeeLessThan(String value) {
            addCriterion("vip_fee <", value, "vipFee");
            return (Criteria) this;
        }

        public Criteria andVipFeeLessThanOrEqualTo(String value) {
            addCriterion("vip_fee <=", value, "vipFee");
            return (Criteria) this;
        }

        public Criteria andVipFeeLike(String value) {
            addCriterion("vip_fee like", value, "vipFee");
            return (Criteria) this;
        }

        public Criteria andVipFeeNotLike(String value) {
            addCriterion("vip_fee not like", value, "vipFee");
            return (Criteria) this;
        }

        public Criteria andVipFeeIn(List<String> values) {
            addCriterion("vip_fee in", values, "vipFee");
            return (Criteria) this;
        }

        public Criteria andVipFeeNotIn(List<String> values) {
            addCriterion("vip_fee not in", values, "vipFee");
            return (Criteria) this;
        }

        public Criteria andVipFeeBetween(String value1, String value2) {
            addCriterion("vip_fee between", value1, value2, "vipFee");
            return (Criteria) this;
        }

        public Criteria andVipFeeNotBetween(String value1, String value2) {
            addCriterion("vip_fee not between", value1, value2, "vipFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeIsNull() {
            addCriterion("transfer_fee is null");
            return (Criteria) this;
        }

        public Criteria andTransferFeeIsNotNull() {
            addCriterion("transfer_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTransferFeeEqualTo(String value) {
            addCriterion("transfer_fee =", value, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeNotEqualTo(String value) {
            addCriterion("transfer_fee <>", value, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeGreaterThan(String value) {
            addCriterion("transfer_fee >", value, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeGreaterThanOrEqualTo(String value) {
            addCriterion("transfer_fee >=", value, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeLessThan(String value) {
            addCriterion("transfer_fee <", value, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeLessThanOrEqualTo(String value) {
            addCriterion("transfer_fee <=", value, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeLike(String value) {
            addCriterion("transfer_fee like", value, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeNotLike(String value) {
            addCriterion("transfer_fee not like", value, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeIn(List<String> values) {
            addCriterion("transfer_fee in", values, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeNotIn(List<String> values) {
            addCriterion("transfer_fee not in", values, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeBetween(String value1, String value2) {
            addCriterion("transfer_fee between", value1, value2, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeNotBetween(String value1, String value2) {
            addCriterion("transfer_fee not between", value1, value2, "transferFee");
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