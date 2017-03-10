package com.jzt.api.domain;

import java.util.Date;

public class P2pTrend {
    private Integer id;

    private Integer platId;

    private Date date;

    private Float turnover;

    private Float interestRate;

    private Float investmentAmount;

    private Float borrowAmount;

    private Integer numInvestment;

    private Integer numBorrower;

    private Float averageLoanPeriod;

    private Integer loanBid;

    private Float timeForFullBid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPlatId() {
        return platId;
    }

    public void setPlatId(Integer platId) {
        this.platId = platId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Float getTurnover() {
        return turnover;
    }

    public void setTurnover(Float turnover) {
        this.turnover = turnover;
    }

    public Float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Float interestRate) {
        this.interestRate = interestRate;
    }

    public Float getInvestmentAmount() {
        return investmentAmount;
    }

    public void setInvestmentAmount(Float investmentAmount) {
        this.investmentAmount = investmentAmount;
    }

    public Float getBorrowAmount() {
        return borrowAmount;
    }

    public void setBorrowAmount(Float borrowAmount) {
        this.borrowAmount = borrowAmount;
    }

    public Integer getNumInvestment() {
        return numInvestment;
    }

    public void setNumInvestment(Integer numInvestment) {
        this.numInvestment = numInvestment;
    }

    public Integer getNumBorrower() {
        return numBorrower;
    }

    public void setNumBorrower(Integer numBorrower) {
        this.numBorrower = numBorrower;
    }

    public Float getAverageLoanPeriod() {
        return averageLoanPeriod;
    }

    public void setAverageLoanPeriod(Float averageLoanPeriod) {
        this.averageLoanPeriod = averageLoanPeriod;
    }

    public Integer getLoanBid() {
        return loanBid;
    }

    public void setLoanBid(Integer loanBid) {
        this.loanBid = loanBid;
    }

    public Float getTimeForFullBid() {
        return timeForFullBid;
    }

    public void setTimeForFullBid(Float timeForFullBid) {
        this.timeForFullBid = timeForFullBid;
    }
}