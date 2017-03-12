package com.jzt.api.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CompanyExample {
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

    public CompanyExample() {
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

        public Criteria andArtificialPersonIsNull() {
            addCriterion("artificial_person is null");
            return (Criteria) this;
        }

        public Criteria andArtificialPersonIsNotNull() {
            addCriterion("artificial_person is not null");
            return (Criteria) this;
        }

        public Criteria andArtificialPersonEqualTo(String value) {
            addCriterion("artificial_person =", value, "artificialPerson");
            return (Criteria) this;
        }

        public Criteria andArtificialPersonNotEqualTo(String value) {
            addCriterion("artificial_person <>", value, "artificialPerson");
            return (Criteria) this;
        }

        public Criteria andArtificialPersonGreaterThan(String value) {
            addCriterion("artificial_person >", value, "artificialPerson");
            return (Criteria) this;
        }

        public Criteria andArtificialPersonGreaterThanOrEqualTo(String value) {
            addCriterion("artificial_person >=", value, "artificialPerson");
            return (Criteria) this;
        }

        public Criteria andArtificialPersonLessThan(String value) {
            addCriterion("artificial_person <", value, "artificialPerson");
            return (Criteria) this;
        }

        public Criteria andArtificialPersonLessThanOrEqualTo(String value) {
            addCriterion("artificial_person <=", value, "artificialPerson");
            return (Criteria) this;
        }

        public Criteria andArtificialPersonLike(String value) {
            addCriterion("artificial_person like", value, "artificialPerson");
            return (Criteria) this;
        }

        public Criteria andArtificialPersonNotLike(String value) {
            addCriterion("artificial_person not like", value, "artificialPerson");
            return (Criteria) this;
        }

        public Criteria andArtificialPersonIn(List<String> values) {
            addCriterion("artificial_person in", values, "artificialPerson");
            return (Criteria) this;
        }

        public Criteria andArtificialPersonNotIn(List<String> values) {
            addCriterion("artificial_person not in", values, "artificialPerson");
            return (Criteria) this;
        }

        public Criteria andArtificialPersonBetween(String value1, String value2) {
            addCriterion("artificial_person between", value1, value2, "artificialPerson");
            return (Criteria) this;
        }

        public Criteria andArtificialPersonNotBetween(String value1, String value2) {
            addCriterion("artificial_person not between", value1, value2, "artificialPerson");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalIsNull() {
            addCriterion("registered_capital is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalIsNotNull() {
            addCriterion("registered_capital is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalEqualTo(Double value) {
            addCriterion("registered_capital =", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotEqualTo(Double value) {
            addCriterion("registered_capital <>", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalGreaterThan(Double value) {
            addCriterion("registered_capital >", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalGreaterThanOrEqualTo(Double value) {
            addCriterion("registered_capital >=", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalLessThan(Double value) {
            addCriterion("registered_capital <", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalLessThanOrEqualTo(Double value) {
            addCriterion("registered_capital <=", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalIn(List<Double> values) {
            addCriterion("registered_capital in", values, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotIn(List<Double> values) {
            addCriterion("registered_capital not in", values, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalBetween(Double value1, Double value2) {
            addCriterion("registered_capital between", value1, value2, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotBetween(Double value1, Double value2) {
            addCriterion("registered_capital not between", value1, value2, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andContributedCapitalIsNull() {
            addCriterion("contributed_capital is null");
            return (Criteria) this;
        }

        public Criteria andContributedCapitalIsNotNull() {
            addCriterion("contributed_capital is not null");
            return (Criteria) this;
        }

        public Criteria andContributedCapitalEqualTo(Double value) {
            addCriterion("contributed_capital =", value, "contributedCapital");
            return (Criteria) this;
        }

        public Criteria andContributedCapitalNotEqualTo(Double value) {
            addCriterion("contributed_capital <>", value, "contributedCapital");
            return (Criteria) this;
        }

        public Criteria andContributedCapitalGreaterThan(Double value) {
            addCriterion("contributed_capital >", value, "contributedCapital");
            return (Criteria) this;
        }

        public Criteria andContributedCapitalGreaterThanOrEqualTo(Double value) {
            addCriterion("contributed_capital >=", value, "contributedCapital");
            return (Criteria) this;
        }

        public Criteria andContributedCapitalLessThan(Double value) {
            addCriterion("contributed_capital <", value, "contributedCapital");
            return (Criteria) this;
        }

        public Criteria andContributedCapitalLessThanOrEqualTo(Double value) {
            addCriterion("contributed_capital <=", value, "contributedCapital");
            return (Criteria) this;
        }

        public Criteria andContributedCapitalIn(List<Double> values) {
            addCriterion("contributed_capital in", values, "contributedCapital");
            return (Criteria) this;
        }

        public Criteria andContributedCapitalNotIn(List<Double> values) {
            addCriterion("contributed_capital not in", values, "contributedCapital");
            return (Criteria) this;
        }

        public Criteria andContributedCapitalBetween(Double value1, Double value2) {
            addCriterion("contributed_capital between", value1, value2, "contributedCapital");
            return (Criteria) this;
        }

        public Criteria andContributedCapitalNotBetween(Double value1, Double value2) {
            addCriterion("contributed_capital not between", value1, value2, "contributedCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressIsNull() {
            addCriterion("registered_address is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressIsNotNull() {
            addCriterion("registered_address is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressEqualTo(String value) {
            addCriterion("registered_address =", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotEqualTo(String value) {
            addCriterion("registered_address <>", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressGreaterThan(String value) {
            addCriterion("registered_address >", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressGreaterThanOrEqualTo(String value) {
            addCriterion("registered_address >=", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressLessThan(String value) {
            addCriterion("registered_address <", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressLessThanOrEqualTo(String value) {
            addCriterion("registered_address <=", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressLike(String value) {
            addCriterion("registered_address like", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotLike(String value) {
            addCriterion("registered_address not like", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressIn(List<String> values) {
            addCriterion("registered_address in", values, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotIn(List<String> values) {
            addCriterion("registered_address not in", values, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressBetween(String value1, String value2) {
            addCriterion("registered_address between", value1, value2, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotBetween(String value1, String value2) {
            addCriterion("registered_address not between", value1, value2, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andOpeningDateIsNull() {
            addCriterion("opening_date is null");
            return (Criteria) this;
        }

        public Criteria andOpeningDateIsNotNull() {
            addCriterion("opening_date is not null");
            return (Criteria) this;
        }

        public Criteria andOpeningDateEqualTo(Date value) {
            addCriterionForJDBCDate("opening_date =", value, "openingDate");
            return (Criteria) this;
        }

        public Criteria andOpeningDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("opening_date <>", value, "openingDate");
            return (Criteria) this;
        }

        public Criteria andOpeningDateGreaterThan(Date value) {
            addCriterionForJDBCDate("opening_date >", value, "openingDate");
            return (Criteria) this;
        }

        public Criteria andOpeningDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("opening_date >=", value, "openingDate");
            return (Criteria) this;
        }

        public Criteria andOpeningDateLessThan(Date value) {
            addCriterionForJDBCDate("opening_date <", value, "openingDate");
            return (Criteria) this;
        }

        public Criteria andOpeningDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("opening_date <=", value, "openingDate");
            return (Criteria) this;
        }

        public Criteria andOpeningDateIn(List<Date> values) {
            addCriterionForJDBCDate("opening_date in", values, "openingDate");
            return (Criteria) this;
        }

        public Criteria andOpeningDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("opening_date not in", values, "openingDate");
            return (Criteria) this;
        }

        public Criteria andOpeningDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("opening_date between", value1, value2, "openingDate");
            return (Criteria) this;
        }

        public Criteria andOpeningDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("opening_date not between", value1, value2, "openingDate");
            return (Criteria) this;
        }

        public Criteria andApprovedDateIsNull() {
            addCriterion("approved_date is null");
            return (Criteria) this;
        }

        public Criteria andApprovedDateIsNotNull() {
            addCriterion("approved_date is not null");
            return (Criteria) this;
        }

        public Criteria andApprovedDateEqualTo(Date value) {
            addCriterionForJDBCDate("approved_date =", value, "approvedDate");
            return (Criteria) this;
        }

        public Criteria andApprovedDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("approved_date <>", value, "approvedDate");
            return (Criteria) this;
        }

        public Criteria andApprovedDateGreaterThan(Date value) {
            addCriterionForJDBCDate("approved_date >", value, "approvedDate");
            return (Criteria) this;
        }

        public Criteria andApprovedDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("approved_date >=", value, "approvedDate");
            return (Criteria) this;
        }

        public Criteria andApprovedDateLessThan(Date value) {
            addCriterionForJDBCDate("approved_date <", value, "approvedDate");
            return (Criteria) this;
        }

        public Criteria andApprovedDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("approved_date <=", value, "approvedDate");
            return (Criteria) this;
        }

        public Criteria andApprovedDateIn(List<Date> values) {
            addCriterionForJDBCDate("approved_date in", values, "approvedDate");
            return (Criteria) this;
        }

        public Criteria andApprovedDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("approved_date not in", values, "approvedDate");
            return (Criteria) this;
        }

        public Criteria andApprovedDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("approved_date between", value1, value2, "approvedDate");
            return (Criteria) this;
        }

        public Criteria andApprovedDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("approved_date not between", value1, value2, "approvedDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationAuthorityIsNull() {
            addCriterion("registration_authority is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationAuthorityIsNotNull() {
            addCriterion("registration_authority is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationAuthorityEqualTo(String value) {
            addCriterion("registration_authority =", value, "registrationAuthority");
            return (Criteria) this;
        }

        public Criteria andRegistrationAuthorityNotEqualTo(String value) {
            addCriterion("registration_authority <>", value, "registrationAuthority");
            return (Criteria) this;
        }

        public Criteria andRegistrationAuthorityGreaterThan(String value) {
            addCriterion("registration_authority >", value, "registrationAuthority");
            return (Criteria) this;
        }

        public Criteria andRegistrationAuthorityGreaterThanOrEqualTo(String value) {
            addCriterion("registration_authority >=", value, "registrationAuthority");
            return (Criteria) this;
        }

        public Criteria andRegistrationAuthorityLessThan(String value) {
            addCriterion("registration_authority <", value, "registrationAuthority");
            return (Criteria) this;
        }

        public Criteria andRegistrationAuthorityLessThanOrEqualTo(String value) {
            addCriterion("registration_authority <=", value, "registrationAuthority");
            return (Criteria) this;
        }

        public Criteria andRegistrationAuthorityLike(String value) {
            addCriterion("registration_authority like", value, "registrationAuthority");
            return (Criteria) this;
        }

        public Criteria andRegistrationAuthorityNotLike(String value) {
            addCriterion("registration_authority not like", value, "registrationAuthority");
            return (Criteria) this;
        }

        public Criteria andRegistrationAuthorityIn(List<String> values) {
            addCriterion("registration_authority in", values, "registrationAuthority");
            return (Criteria) this;
        }

        public Criteria andRegistrationAuthorityNotIn(List<String> values) {
            addCriterion("registration_authority not in", values, "registrationAuthority");
            return (Criteria) this;
        }

        public Criteria andRegistrationAuthorityBetween(String value1, String value2) {
            addCriterion("registration_authority between", value1, value2, "registrationAuthority");
            return (Criteria) this;
        }

        public Criteria andRegistrationAuthorityNotBetween(String value1, String value2) {
            addCriterion("registration_authority not between", value1, value2, "registrationAuthority");
            return (Criteria) this;
        }

        public Criteria andHasAnnualReportIsNull() {
            addCriterion("has_annual_report is null");
            return (Criteria) this;
        }

        public Criteria andHasAnnualReportIsNotNull() {
            addCriterion("has_annual_report is not null");
            return (Criteria) this;
        }

        public Criteria andHasAnnualReportEqualTo(Integer value) {
            addCriterion("has_annual_report =", value, "hasAnnualReport");
            return (Criteria) this;
        }

        public Criteria andHasAnnualReportNotEqualTo(Integer value) {
            addCriterion("has_annual_report <>", value, "hasAnnualReport");
            return (Criteria) this;
        }

        public Criteria andHasAnnualReportGreaterThan(Integer value) {
            addCriterion("has_annual_report >", value, "hasAnnualReport");
            return (Criteria) this;
        }

        public Criteria andHasAnnualReportGreaterThanOrEqualTo(Integer value) {
            addCriterion("has_annual_report >=", value, "hasAnnualReport");
            return (Criteria) this;
        }

        public Criteria andHasAnnualReportLessThan(Integer value) {
            addCriterion("has_annual_report <", value, "hasAnnualReport");
            return (Criteria) this;
        }

        public Criteria andHasAnnualReportLessThanOrEqualTo(Integer value) {
            addCriterion("has_annual_report <=", value, "hasAnnualReport");
            return (Criteria) this;
        }

        public Criteria andHasAnnualReportIn(List<Integer> values) {
            addCriterion("has_annual_report in", values, "hasAnnualReport");
            return (Criteria) this;
        }

        public Criteria andHasAnnualReportNotIn(List<Integer> values) {
            addCriterion("has_annual_report not in", values, "hasAnnualReport");
            return (Criteria) this;
        }

        public Criteria andHasAnnualReportBetween(Integer value1, Integer value2) {
            addCriterion("has_annual_report between", value1, value2, "hasAnnualReport");
            return (Criteria) this;
        }

        public Criteria andHasAnnualReportNotBetween(Integer value1, Integer value2) {
            addCriterion("has_annual_report not between", value1, value2, "hasAnnualReport");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceIsNull() {
            addCriterion("business_licence is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceIsNotNull() {
            addCriterion("business_licence is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceEqualTo(String value) {
            addCriterion("business_licence =", value, "businessLicence");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNotEqualTo(String value) {
            addCriterion("business_licence <>", value, "businessLicence");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceGreaterThan(String value) {
            addCriterion("business_licence >", value, "businessLicence");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceGreaterThanOrEqualTo(String value) {
            addCriterion("business_licence >=", value, "businessLicence");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceLessThan(String value) {
            addCriterion("business_licence <", value, "businessLicence");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceLessThanOrEqualTo(String value) {
            addCriterion("business_licence <=", value, "businessLicence");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceLike(String value) {
            addCriterion("business_licence like", value, "businessLicence");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNotLike(String value) {
            addCriterion("business_licence not like", value, "businessLicence");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceIn(List<String> values) {
            addCriterion("business_licence in", values, "businessLicence");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNotIn(List<String> values) {
            addCriterion("business_licence not in", values, "businessLicence");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceBetween(String value1, String value2) {
            addCriterion("business_licence between", value1, value2, "businessLicence");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenceNotBetween(String value1, String value2) {
            addCriterion("business_licence not between", value1, value2, "businessLicence");
            return (Criteria) this;
        }

        public Criteria andLicenceImgIsNull() {
            addCriterion("licence_img is null");
            return (Criteria) this;
        }

        public Criteria andLicenceImgIsNotNull() {
            addCriterion("licence_img is not null");
            return (Criteria) this;
        }

        public Criteria andLicenceImgEqualTo(String value) {
            addCriterion("licence_img =", value, "licenceImg");
            return (Criteria) this;
        }

        public Criteria andLicenceImgNotEqualTo(String value) {
            addCriterion("licence_img <>", value, "licenceImg");
            return (Criteria) this;
        }

        public Criteria andLicenceImgGreaterThan(String value) {
            addCriterion("licence_img >", value, "licenceImg");
            return (Criteria) this;
        }

        public Criteria andLicenceImgGreaterThanOrEqualTo(String value) {
            addCriterion("licence_img >=", value, "licenceImg");
            return (Criteria) this;
        }

        public Criteria andLicenceImgLessThan(String value) {
            addCriterion("licence_img <", value, "licenceImg");
            return (Criteria) this;
        }

        public Criteria andLicenceImgLessThanOrEqualTo(String value) {
            addCriterion("licence_img <=", value, "licenceImg");
            return (Criteria) this;
        }

        public Criteria andLicenceImgLike(String value) {
            addCriterion("licence_img like", value, "licenceImg");
            return (Criteria) this;
        }

        public Criteria andLicenceImgNotLike(String value) {
            addCriterion("licence_img not like", value, "licenceImg");
            return (Criteria) this;
        }

        public Criteria andLicenceImgIn(List<String> values) {
            addCriterion("licence_img in", values, "licenceImg");
            return (Criteria) this;
        }

        public Criteria andLicenceImgNotIn(List<String> values) {
            addCriterion("licence_img not in", values, "licenceImg");
            return (Criteria) this;
        }

        public Criteria andLicenceImgBetween(String value1, String value2) {
            addCriterion("licence_img between", value1, value2, "licenceImg");
            return (Criteria) this;
        }

        public Criteria andLicenceImgNotBetween(String value1, String value2) {
            addCriterion("licence_img not between", value1, value2, "licenceImg");
            return (Criteria) this;
        }

        public Criteria andInstitutionalFrameworkIsNull() {
            addCriterion("institutional_framework is null");
            return (Criteria) this;
        }

        public Criteria andInstitutionalFrameworkIsNotNull() {
            addCriterion("institutional_framework is not null");
            return (Criteria) this;
        }

        public Criteria andInstitutionalFrameworkEqualTo(String value) {
            addCriterion("institutional_framework =", value, "institutionalFramework");
            return (Criteria) this;
        }

        public Criteria andInstitutionalFrameworkNotEqualTo(String value) {
            addCriterion("institutional_framework <>", value, "institutionalFramework");
            return (Criteria) this;
        }

        public Criteria andInstitutionalFrameworkGreaterThan(String value) {
            addCriterion("institutional_framework >", value, "institutionalFramework");
            return (Criteria) this;
        }

        public Criteria andInstitutionalFrameworkGreaterThanOrEqualTo(String value) {
            addCriterion("institutional_framework >=", value, "institutionalFramework");
            return (Criteria) this;
        }

        public Criteria andInstitutionalFrameworkLessThan(String value) {
            addCriterion("institutional_framework <", value, "institutionalFramework");
            return (Criteria) this;
        }

        public Criteria andInstitutionalFrameworkLessThanOrEqualTo(String value) {
            addCriterion("institutional_framework <=", value, "institutionalFramework");
            return (Criteria) this;
        }

        public Criteria andInstitutionalFrameworkLike(String value) {
            addCriterion("institutional_framework like", value, "institutionalFramework");
            return (Criteria) this;
        }

        public Criteria andInstitutionalFrameworkNotLike(String value) {
            addCriterion("institutional_framework not like", value, "institutionalFramework");
            return (Criteria) this;
        }

        public Criteria andInstitutionalFrameworkIn(List<String> values) {
            addCriterion("institutional_framework in", values, "institutionalFramework");
            return (Criteria) this;
        }

        public Criteria andInstitutionalFrameworkNotIn(List<String> values) {
            addCriterion("institutional_framework not in", values, "institutionalFramework");
            return (Criteria) this;
        }

        public Criteria andInstitutionalFrameworkBetween(String value1, String value2) {
            addCriterion("institutional_framework between", value1, value2, "institutionalFramework");
            return (Criteria) this;
        }

        public Criteria andInstitutionalFrameworkNotBetween(String value1, String value2) {
            addCriterion("institutional_framework not between", value1, value2, "institutionalFramework");
            return (Criteria) this;
        }

        public Criteria andInstitutionalImgIsNull() {
            addCriterion("institutional_img is null");
            return (Criteria) this;
        }

        public Criteria andInstitutionalImgIsNotNull() {
            addCriterion("institutional_img is not null");
            return (Criteria) this;
        }

        public Criteria andInstitutionalImgEqualTo(String value) {
            addCriterion("institutional_img =", value, "institutionalImg");
            return (Criteria) this;
        }

        public Criteria andInstitutionalImgNotEqualTo(String value) {
            addCriterion("institutional_img <>", value, "institutionalImg");
            return (Criteria) this;
        }

        public Criteria andInstitutionalImgGreaterThan(String value) {
            addCriterion("institutional_img >", value, "institutionalImg");
            return (Criteria) this;
        }

        public Criteria andInstitutionalImgGreaterThanOrEqualTo(String value) {
            addCriterion("institutional_img >=", value, "institutionalImg");
            return (Criteria) this;
        }

        public Criteria andInstitutionalImgLessThan(String value) {
            addCriterion("institutional_img <", value, "institutionalImg");
            return (Criteria) this;
        }

        public Criteria andInstitutionalImgLessThanOrEqualTo(String value) {
            addCriterion("institutional_img <=", value, "institutionalImg");
            return (Criteria) this;
        }

        public Criteria andInstitutionalImgLike(String value) {
            addCriterion("institutional_img like", value, "institutionalImg");
            return (Criteria) this;
        }

        public Criteria andInstitutionalImgNotLike(String value) {
            addCriterion("institutional_img not like", value, "institutionalImg");
            return (Criteria) this;
        }

        public Criteria andInstitutionalImgIn(List<String> values) {
            addCriterion("institutional_img in", values, "institutionalImg");
            return (Criteria) this;
        }

        public Criteria andInstitutionalImgNotIn(List<String> values) {
            addCriterion("institutional_img not in", values, "institutionalImg");
            return (Criteria) this;
        }

        public Criteria andInstitutionalImgBetween(String value1, String value2) {
            addCriterion("institutional_img between", value1, value2, "institutionalImg");
            return (Criteria) this;
        }

        public Criteria andInstitutionalImgNotBetween(String value1, String value2) {
            addCriterion("institutional_img not between", value1, value2, "institutionalImg");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationNumIsNull() {
            addCriterion("tax_registration_num is null");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationNumIsNotNull() {
            addCriterion("tax_registration_num is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationNumEqualTo(String value) {
            addCriterion("tax_registration_num =", value, "taxRegistrationNum");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationNumNotEqualTo(String value) {
            addCriterion("tax_registration_num <>", value, "taxRegistrationNum");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationNumGreaterThan(String value) {
            addCriterion("tax_registration_num >", value, "taxRegistrationNum");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationNumGreaterThanOrEqualTo(String value) {
            addCriterion("tax_registration_num >=", value, "taxRegistrationNum");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationNumLessThan(String value) {
            addCriterion("tax_registration_num <", value, "taxRegistrationNum");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationNumLessThanOrEqualTo(String value) {
            addCriterion("tax_registration_num <=", value, "taxRegistrationNum");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationNumLike(String value) {
            addCriterion("tax_registration_num like", value, "taxRegistrationNum");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationNumNotLike(String value) {
            addCriterion("tax_registration_num not like", value, "taxRegistrationNum");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationNumIn(List<String> values) {
            addCriterion("tax_registration_num in", values, "taxRegistrationNum");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationNumNotIn(List<String> values) {
            addCriterion("tax_registration_num not in", values, "taxRegistrationNum");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationNumBetween(String value1, String value2) {
            addCriterion("tax_registration_num between", value1, value2, "taxRegistrationNum");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationNumNotBetween(String value1, String value2) {
            addCriterion("tax_registration_num not between", value1, value2, "taxRegistrationNum");
            return (Criteria) this;
        }

        public Criteria andTaxImgIsNull() {
            addCriterion("tax_img is null");
            return (Criteria) this;
        }

        public Criteria andTaxImgIsNotNull() {
            addCriterion("tax_img is not null");
            return (Criteria) this;
        }

        public Criteria andTaxImgEqualTo(String value) {
            addCriterion("tax_img =", value, "taxImg");
            return (Criteria) this;
        }

        public Criteria andTaxImgNotEqualTo(String value) {
            addCriterion("tax_img <>", value, "taxImg");
            return (Criteria) this;
        }

        public Criteria andTaxImgGreaterThan(String value) {
            addCriterion("tax_img >", value, "taxImg");
            return (Criteria) this;
        }

        public Criteria andTaxImgGreaterThanOrEqualTo(String value) {
            addCriterion("tax_img >=", value, "taxImg");
            return (Criteria) this;
        }

        public Criteria andTaxImgLessThan(String value) {
            addCriterion("tax_img <", value, "taxImg");
            return (Criteria) this;
        }

        public Criteria andTaxImgLessThanOrEqualTo(String value) {
            addCriterion("tax_img <=", value, "taxImg");
            return (Criteria) this;
        }

        public Criteria andTaxImgLike(String value) {
            addCriterion("tax_img like", value, "taxImg");
            return (Criteria) this;
        }

        public Criteria andTaxImgNotLike(String value) {
            addCriterion("tax_img not like", value, "taxImg");
            return (Criteria) this;
        }

        public Criteria andTaxImgIn(List<String> values) {
            addCriterion("tax_img in", values, "taxImg");
            return (Criteria) this;
        }

        public Criteria andTaxImgNotIn(List<String> values) {
            addCriterion("tax_img not in", values, "taxImg");
            return (Criteria) this;
        }

        public Criteria andTaxImgBetween(String value1, String value2) {
            addCriterion("tax_img between", value1, value2, "taxImg");
            return (Criteria) this;
        }

        public Criteria andTaxImgNotBetween(String value1, String value2) {
            addCriterion("tax_img not between", value1, value2, "taxImg");
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