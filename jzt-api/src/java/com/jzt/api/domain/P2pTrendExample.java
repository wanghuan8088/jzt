package com.jzt.api.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class P2pTrendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public P2pTrendExample() {
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

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterionForJDBCDate("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterionForJDBCDate("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterionForJDBCDate("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterionForJDBCDate("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date not between", value1, value2, "date");
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

        public Criteria andInterestRateIsNull() {
            addCriterion("interest_rate is null");
            return (Criteria) this;
        }

        public Criteria andInterestRateIsNotNull() {
            addCriterion("interest_rate is not null");
            return (Criteria) this;
        }

        public Criteria andInterestRateEqualTo(Float value) {
            addCriterion("interest_rate =", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateNotEqualTo(Float value) {
            addCriterion("interest_rate <>", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateGreaterThan(Float value) {
            addCriterion("interest_rate >", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateGreaterThanOrEqualTo(Float value) {
            addCriterion("interest_rate >=", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateLessThan(Float value) {
            addCriterion("interest_rate <", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateLessThanOrEqualTo(Float value) {
            addCriterion("interest_rate <=", value, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateIn(List<Float> values) {
            addCriterion("interest_rate in", values, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateNotIn(List<Float> values) {
            addCriterion("interest_rate not in", values, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateBetween(Float value1, Float value2) {
            addCriterion("interest_rate between", value1, value2, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateNotBetween(Float value1, Float value2) {
            addCriterion("interest_rate not between", value1, value2, "interestRate");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountIsNull() {
            addCriterion("investment_amount is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountIsNotNull() {
            addCriterion("investment_amount is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountEqualTo(Float value) {
            addCriterion("investment_amount =", value, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountNotEqualTo(Float value) {
            addCriterion("investment_amount <>", value, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountGreaterThan(Float value) {
            addCriterion("investment_amount >", value, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("investment_amount >=", value, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountLessThan(Float value) {
            addCriterion("investment_amount <", value, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountLessThanOrEqualTo(Float value) {
            addCriterion("investment_amount <=", value, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountIn(List<Float> values) {
            addCriterion("investment_amount in", values, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountNotIn(List<Float> values) {
            addCriterion("investment_amount not in", values, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountBetween(Float value1, Float value2) {
            addCriterion("investment_amount between", value1, value2, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountNotBetween(Float value1, Float value2) {
            addCriterion("investment_amount not between", value1, value2, "investmentAmount");
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

        public Criteria andBorrowAmountEqualTo(Float value) {
            addCriterion("borrow_amount =", value, "borrowAmount");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountNotEqualTo(Float value) {
            addCriterion("borrow_amount <>", value, "borrowAmount");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountGreaterThan(Float value) {
            addCriterion("borrow_amount >", value, "borrowAmount");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("borrow_amount >=", value, "borrowAmount");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountLessThan(Float value) {
            addCriterion("borrow_amount <", value, "borrowAmount");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountLessThanOrEqualTo(Float value) {
            addCriterion("borrow_amount <=", value, "borrowAmount");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountIn(List<Float> values) {
            addCriterion("borrow_amount in", values, "borrowAmount");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountNotIn(List<Float> values) {
            addCriterion("borrow_amount not in", values, "borrowAmount");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountBetween(Float value1, Float value2) {
            addCriterion("borrow_amount between", value1, value2, "borrowAmount");
            return (Criteria) this;
        }

        public Criteria andBorrowAmountNotBetween(Float value1, Float value2) {
            addCriterion("borrow_amount not between", value1, value2, "borrowAmount");
            return (Criteria) this;
        }

        public Criteria andNumInvestmentIsNull() {
            addCriterion("num_investment is null");
            return (Criteria) this;
        }

        public Criteria andNumInvestmentIsNotNull() {
            addCriterion("num_investment is not null");
            return (Criteria) this;
        }

        public Criteria andNumInvestmentEqualTo(Integer value) {
            addCriterion("num_investment =", value, "numInvestment");
            return (Criteria) this;
        }

        public Criteria andNumInvestmentNotEqualTo(Integer value) {
            addCriterion("num_investment <>", value, "numInvestment");
            return (Criteria) this;
        }

        public Criteria andNumInvestmentGreaterThan(Integer value) {
            addCriterion("num_investment >", value, "numInvestment");
            return (Criteria) this;
        }

        public Criteria andNumInvestmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_investment >=", value, "numInvestment");
            return (Criteria) this;
        }

        public Criteria andNumInvestmentLessThan(Integer value) {
            addCriterion("num_investment <", value, "numInvestment");
            return (Criteria) this;
        }

        public Criteria andNumInvestmentLessThanOrEqualTo(Integer value) {
            addCriterion("num_investment <=", value, "numInvestment");
            return (Criteria) this;
        }

        public Criteria andNumInvestmentIn(List<Integer> values) {
            addCriterion("num_investment in", values, "numInvestment");
            return (Criteria) this;
        }

        public Criteria andNumInvestmentNotIn(List<Integer> values) {
            addCriterion("num_investment not in", values, "numInvestment");
            return (Criteria) this;
        }

        public Criteria andNumInvestmentBetween(Integer value1, Integer value2) {
            addCriterion("num_investment between", value1, value2, "numInvestment");
            return (Criteria) this;
        }

        public Criteria andNumInvestmentNotBetween(Integer value1, Integer value2) {
            addCriterion("num_investment not between", value1, value2, "numInvestment");
            return (Criteria) this;
        }

        public Criteria andNumBorrowerIsNull() {
            addCriterion("num_borrower is null");
            return (Criteria) this;
        }

        public Criteria andNumBorrowerIsNotNull() {
            addCriterion("num_borrower is not null");
            return (Criteria) this;
        }

        public Criteria andNumBorrowerEqualTo(Integer value) {
            addCriterion("num_borrower =", value, "numBorrower");
            return (Criteria) this;
        }

        public Criteria andNumBorrowerNotEqualTo(Integer value) {
            addCriterion("num_borrower <>", value, "numBorrower");
            return (Criteria) this;
        }

        public Criteria andNumBorrowerGreaterThan(Integer value) {
            addCriterion("num_borrower >", value, "numBorrower");
            return (Criteria) this;
        }

        public Criteria andNumBorrowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_borrower >=", value, "numBorrower");
            return (Criteria) this;
        }

        public Criteria andNumBorrowerLessThan(Integer value) {
            addCriterion("num_borrower <", value, "numBorrower");
            return (Criteria) this;
        }

        public Criteria andNumBorrowerLessThanOrEqualTo(Integer value) {
            addCriterion("num_borrower <=", value, "numBorrower");
            return (Criteria) this;
        }

        public Criteria andNumBorrowerIn(List<Integer> values) {
            addCriterion("num_borrower in", values, "numBorrower");
            return (Criteria) this;
        }

        public Criteria andNumBorrowerNotIn(List<Integer> values) {
            addCriterion("num_borrower not in", values, "numBorrower");
            return (Criteria) this;
        }

        public Criteria andNumBorrowerBetween(Integer value1, Integer value2) {
            addCriterion("num_borrower between", value1, value2, "numBorrower");
            return (Criteria) this;
        }

        public Criteria andNumBorrowerNotBetween(Integer value1, Integer value2) {
            addCriterion("num_borrower not between", value1, value2, "numBorrower");
            return (Criteria) this;
        }

        public Criteria andAverageLoanPeriodIsNull() {
            addCriterion("average_loan_period is null");
            return (Criteria) this;
        }

        public Criteria andAverageLoanPeriodIsNotNull() {
            addCriterion("average_loan_period is not null");
            return (Criteria) this;
        }

        public Criteria andAverageLoanPeriodEqualTo(Float value) {
            addCriterion("average_loan_period =", value, "averageLoanPeriod");
            return (Criteria) this;
        }

        public Criteria andAverageLoanPeriodNotEqualTo(Float value) {
            addCriterion("average_loan_period <>", value, "averageLoanPeriod");
            return (Criteria) this;
        }

        public Criteria andAverageLoanPeriodGreaterThan(Float value) {
            addCriterion("average_loan_period >", value, "averageLoanPeriod");
            return (Criteria) this;
        }

        public Criteria andAverageLoanPeriodGreaterThanOrEqualTo(Float value) {
            addCriterion("average_loan_period >=", value, "averageLoanPeriod");
            return (Criteria) this;
        }

        public Criteria andAverageLoanPeriodLessThan(Float value) {
            addCriterion("average_loan_period <", value, "averageLoanPeriod");
            return (Criteria) this;
        }

        public Criteria andAverageLoanPeriodLessThanOrEqualTo(Float value) {
            addCriterion("average_loan_period <=", value, "averageLoanPeriod");
            return (Criteria) this;
        }

        public Criteria andAverageLoanPeriodIn(List<Float> values) {
            addCriterion("average_loan_period in", values, "averageLoanPeriod");
            return (Criteria) this;
        }

        public Criteria andAverageLoanPeriodNotIn(List<Float> values) {
            addCriterion("average_loan_period not in", values, "averageLoanPeriod");
            return (Criteria) this;
        }

        public Criteria andAverageLoanPeriodBetween(Float value1, Float value2) {
            addCriterion("average_loan_period between", value1, value2, "averageLoanPeriod");
            return (Criteria) this;
        }

        public Criteria andAverageLoanPeriodNotBetween(Float value1, Float value2) {
            addCriterion("average_loan_period not between", value1, value2, "averageLoanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanBidIsNull() {
            addCriterion("loan_bid is null");
            return (Criteria) this;
        }

        public Criteria andLoanBidIsNotNull() {
            addCriterion("loan_bid is not null");
            return (Criteria) this;
        }

        public Criteria andLoanBidEqualTo(Integer value) {
            addCriterion("loan_bid =", value, "loanBid");
            return (Criteria) this;
        }

        public Criteria andLoanBidNotEqualTo(Integer value) {
            addCriterion("loan_bid <>", value, "loanBid");
            return (Criteria) this;
        }

        public Criteria andLoanBidGreaterThan(Integer value) {
            addCriterion("loan_bid >", value, "loanBid");
            return (Criteria) this;
        }

        public Criteria andLoanBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("loan_bid >=", value, "loanBid");
            return (Criteria) this;
        }

        public Criteria andLoanBidLessThan(Integer value) {
            addCriterion("loan_bid <", value, "loanBid");
            return (Criteria) this;
        }

        public Criteria andLoanBidLessThanOrEqualTo(Integer value) {
            addCriterion("loan_bid <=", value, "loanBid");
            return (Criteria) this;
        }

        public Criteria andLoanBidIn(List<Integer> values) {
            addCriterion("loan_bid in", values, "loanBid");
            return (Criteria) this;
        }

        public Criteria andLoanBidNotIn(List<Integer> values) {
            addCriterion("loan_bid not in", values, "loanBid");
            return (Criteria) this;
        }

        public Criteria andLoanBidBetween(Integer value1, Integer value2) {
            addCriterion("loan_bid between", value1, value2, "loanBid");
            return (Criteria) this;
        }

        public Criteria andLoanBidNotBetween(Integer value1, Integer value2) {
            addCriterion("loan_bid not between", value1, value2, "loanBid");
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