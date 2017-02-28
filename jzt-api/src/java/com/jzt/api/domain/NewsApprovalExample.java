package com.jzt.api.domain;

import java.util.ArrayList;
import java.util.List;

public class NewsApprovalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsApprovalExample() {
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

        public Criteria andNidIsNull() {
            addCriterion("nId is null");
            return (Criteria) this;
        }

        public Criteria andNidIsNotNull() {
            addCriterion("nId is not null");
            return (Criteria) this;
        }

        public Criteria andNidEqualTo(Integer value) {
            addCriterion("nId =", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotEqualTo(Integer value) {
            addCriterion("nId <>", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThan(Integer value) {
            addCriterion("nId >", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThanOrEqualTo(Integer value) {
            addCriterion("nId >=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThan(Integer value) {
            addCriterion("nId <", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThanOrEqualTo(Integer value) {
            addCriterion("nId <=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidIn(List<Integer> values) {
            addCriterion("nId in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotIn(List<Integer> values) {
            addCriterion("nId not in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidBetween(Integer value1, Integer value2) {
            addCriterion("nId between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotBetween(Integer value1, Integer value2) {
            addCriterion("nId not between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andIscheckIsNull() {
            addCriterion("isCheck is null");
            return (Criteria) this;
        }

        public Criteria andIscheckIsNotNull() {
            addCriterion("isCheck is not null");
            return (Criteria) this;
        }

        public Criteria andIscheckEqualTo(Integer value) {
            addCriterion("isCheck =", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckNotEqualTo(Integer value) {
            addCriterion("isCheck <>", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckGreaterThan(Integer value) {
            addCriterion("isCheck >", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("isCheck >=", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckLessThan(Integer value) {
            addCriterion("isCheck <", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckLessThanOrEqualTo(Integer value) {
            addCriterion("isCheck <=", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckIn(List<Integer> values) {
            addCriterion("isCheck in", values, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckNotIn(List<Integer> values) {
            addCriterion("isCheck not in", values, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckBetween(Integer value1, Integer value2) {
            addCriterion("isCheck between", value1, value2, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckNotBetween(Integer value1, Integer value2) {
            addCriterion("isCheck not between", value1, value2, "ischeck");
            return (Criteria) this;
        }

        public Criteria andRelatedAdminIsNull() {
            addCriterion("related_admin is null");
            return (Criteria) this;
        }

        public Criteria andRelatedAdminIsNotNull() {
            addCriterion("related_admin is not null");
            return (Criteria) this;
        }

        public Criteria andRelatedAdminEqualTo(Integer value) {
            addCriterion("related_admin =", value, "relatedAdmin");
            return (Criteria) this;
        }

        public Criteria andRelatedAdminNotEqualTo(Integer value) {
            addCriterion("related_admin <>", value, "relatedAdmin");
            return (Criteria) this;
        }

        public Criteria andRelatedAdminGreaterThan(Integer value) {
            addCriterion("related_admin >", value, "relatedAdmin");
            return (Criteria) this;
        }

        public Criteria andRelatedAdminGreaterThanOrEqualTo(Integer value) {
            addCriterion("related_admin >=", value, "relatedAdmin");
            return (Criteria) this;
        }

        public Criteria andRelatedAdminLessThan(Integer value) {
            addCriterion("related_admin <", value, "relatedAdmin");
            return (Criteria) this;
        }

        public Criteria andRelatedAdminLessThanOrEqualTo(Integer value) {
            addCriterion("related_admin <=", value, "relatedAdmin");
            return (Criteria) this;
        }

        public Criteria andRelatedAdminIn(List<Integer> values) {
            addCriterion("related_admin in", values, "relatedAdmin");
            return (Criteria) this;
        }

        public Criteria andRelatedAdminNotIn(List<Integer> values) {
            addCriterion("related_admin not in", values, "relatedAdmin");
            return (Criteria) this;
        }

        public Criteria andRelatedAdminBetween(Integer value1, Integer value2) {
            addCriterion("related_admin between", value1, value2, "relatedAdmin");
            return (Criteria) this;
        }

        public Criteria andRelatedAdminNotBetween(Integer value1, Integer value2) {
            addCriterion("related_admin not between", value1, value2, "relatedAdmin");
            return (Criteria) this;
        }

        public Criteria andPolarityIsNull() {
            addCriterion("polarity is null");
            return (Criteria) this;
        }

        public Criteria andPolarityIsNotNull() {
            addCriterion("polarity is not null");
            return (Criteria) this;
        }

        public Criteria andPolarityEqualTo(Integer value) {
            addCriterion("polarity =", value, "polarity");
            return (Criteria) this;
        }

        public Criteria andPolarityNotEqualTo(Integer value) {
            addCriterion("polarity <>", value, "polarity");
            return (Criteria) this;
        }

        public Criteria andPolarityGreaterThan(Integer value) {
            addCriterion("polarity >", value, "polarity");
            return (Criteria) this;
        }

        public Criteria andPolarityGreaterThanOrEqualTo(Integer value) {
            addCriterion("polarity >=", value, "polarity");
            return (Criteria) this;
        }

        public Criteria andPolarityLessThan(Integer value) {
            addCriterion("polarity <", value, "polarity");
            return (Criteria) this;
        }

        public Criteria andPolarityLessThanOrEqualTo(Integer value) {
            addCriterion("polarity <=", value, "polarity");
            return (Criteria) this;
        }

        public Criteria andPolarityIn(List<Integer> values) {
            addCriterion("polarity in", values, "polarity");
            return (Criteria) this;
        }

        public Criteria andPolarityNotIn(List<Integer> values) {
            addCriterion("polarity not in", values, "polarity");
            return (Criteria) this;
        }

        public Criteria andPolarityBetween(Integer value1, Integer value2) {
            addCriterion("polarity between", value1, value2, "polarity");
            return (Criteria) this;
        }

        public Criteria andPolarityNotBetween(Integer value1, Integer value2) {
            addCriterion("polarity not between", value1, value2, "polarity");
            return (Criteria) this;
        }

        public Criteria andIsrecomIsNull() {
            addCriterion("isrecom is null");
            return (Criteria) this;
        }

        public Criteria andIsrecomIsNotNull() {
            addCriterion("isrecom is not null");
            return (Criteria) this;
        }

        public Criteria andIsrecomEqualTo(Integer value) {
            addCriterion("isrecom =", value, "isrecom");
            return (Criteria) this;
        }

        public Criteria andIsrecomNotEqualTo(Integer value) {
            addCriterion("isrecom <>", value, "isrecom");
            return (Criteria) this;
        }

        public Criteria andIsrecomGreaterThan(Integer value) {
            addCriterion("isrecom >", value, "isrecom");
            return (Criteria) this;
        }

        public Criteria andIsrecomGreaterThanOrEqualTo(Integer value) {
            addCriterion("isrecom >=", value, "isrecom");
            return (Criteria) this;
        }

        public Criteria andIsrecomLessThan(Integer value) {
            addCriterion("isrecom <", value, "isrecom");
            return (Criteria) this;
        }

        public Criteria andIsrecomLessThanOrEqualTo(Integer value) {
            addCriterion("isrecom <=", value, "isrecom");
            return (Criteria) this;
        }

        public Criteria andIsrecomIn(List<Integer> values) {
            addCriterion("isrecom in", values, "isrecom");
            return (Criteria) this;
        }

        public Criteria andIsrecomNotIn(List<Integer> values) {
            addCriterion("isrecom not in", values, "isrecom");
            return (Criteria) this;
        }

        public Criteria andIsrecomBetween(Integer value1, Integer value2) {
            addCriterion("isrecom between", value1, value2, "isrecom");
            return (Criteria) this;
        }

        public Criteria andIsrecomNotBetween(Integer value1, Integer value2) {
            addCriterion("isrecom not between", value1, value2, "isrecom");
            return (Criteria) this;
        }

        public Criteria andClickTimesIsNull() {
            addCriterion("click_times is null");
            return (Criteria) this;
        }

        public Criteria andClickTimesIsNotNull() {
            addCriterion("click_times is not null");
            return (Criteria) this;
        }

        public Criteria andClickTimesEqualTo(Integer value) {
            addCriterion("click_times =", value, "clickTimes");
            return (Criteria) this;
        }

        public Criteria andClickTimesNotEqualTo(Integer value) {
            addCriterion("click_times <>", value, "clickTimes");
            return (Criteria) this;
        }

        public Criteria andClickTimesGreaterThan(Integer value) {
            addCriterion("click_times >", value, "clickTimes");
            return (Criteria) this;
        }

        public Criteria andClickTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("click_times >=", value, "clickTimes");
            return (Criteria) this;
        }

        public Criteria andClickTimesLessThan(Integer value) {
            addCriterion("click_times <", value, "clickTimes");
            return (Criteria) this;
        }

        public Criteria andClickTimesLessThanOrEqualTo(Integer value) {
            addCriterion("click_times <=", value, "clickTimes");
            return (Criteria) this;
        }

        public Criteria andClickTimesIn(List<Integer> values) {
            addCriterion("click_times in", values, "clickTimes");
            return (Criteria) this;
        }

        public Criteria andClickTimesNotIn(List<Integer> values) {
            addCriterion("click_times not in", values, "clickTimes");
            return (Criteria) this;
        }

        public Criteria andClickTimesBetween(Integer value1, Integer value2) {
            addCriterion("click_times between", value1, value2, "clickTimes");
            return (Criteria) this;
        }

        public Criteria andClickTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("click_times not between", value1, value2, "clickTimes");
            return (Criteria) this;
        }

        public Criteria andIndexedIsNull() {
            addCriterion("indexed is null");
            return (Criteria) this;
        }

        public Criteria andIndexedIsNotNull() {
            addCriterion("indexed is not null");
            return (Criteria) this;
        }

        public Criteria andIndexedEqualTo(Integer value) {
            addCriterion("indexed =", value, "indexed");
            return (Criteria) this;
        }

        public Criteria andIndexedNotEqualTo(Integer value) {
            addCriterion("indexed <>", value, "indexed");
            return (Criteria) this;
        }

        public Criteria andIndexedGreaterThan(Integer value) {
            addCriterion("indexed >", value, "indexed");
            return (Criteria) this;
        }

        public Criteria andIndexedGreaterThanOrEqualTo(Integer value) {
            addCriterion("indexed >=", value, "indexed");
            return (Criteria) this;
        }

        public Criteria andIndexedLessThan(Integer value) {
            addCriterion("indexed <", value, "indexed");
            return (Criteria) this;
        }

        public Criteria andIndexedLessThanOrEqualTo(Integer value) {
            addCriterion("indexed <=", value, "indexed");
            return (Criteria) this;
        }

        public Criteria andIndexedIn(List<Integer> values) {
            addCriterion("indexed in", values, "indexed");
            return (Criteria) this;
        }

        public Criteria andIndexedNotIn(List<Integer> values) {
            addCriterion("indexed not in", values, "indexed");
            return (Criteria) this;
        }

        public Criteria andIndexedBetween(Integer value1, Integer value2) {
            addCriterion("indexed between", value1, value2, "indexed");
            return (Criteria) this;
        }

        public Criteria andIndexedNotBetween(Integer value1, Integer value2) {
            addCriterion("indexed not between", value1, value2, "indexed");
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