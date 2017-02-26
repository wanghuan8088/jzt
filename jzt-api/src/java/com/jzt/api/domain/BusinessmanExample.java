package com.jzt.api.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BusinessmanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BusinessmanExample() {
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

        public Criteria andComStruIdIsNull() {
            addCriterion("com_stru_id is null");
            return (Criteria) this;
        }

        public Criteria andComStruIdIsNotNull() {
            addCriterion("com_stru_id is not null");
            return (Criteria) this;
        }

        public Criteria andComStruIdEqualTo(Integer value) {
            addCriterion("com_stru_id =", value, "comStruId");
            return (Criteria) this;
        }

        public Criteria andComStruIdNotEqualTo(Integer value) {
            addCriterion("com_stru_id <>", value, "comStruId");
            return (Criteria) this;
        }

        public Criteria andComStruIdGreaterThan(Integer value) {
            addCriterion("com_stru_id >", value, "comStruId");
            return (Criteria) this;
        }

        public Criteria andComStruIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("com_stru_id >=", value, "comStruId");
            return (Criteria) this;
        }

        public Criteria andComStruIdLessThan(Integer value) {
            addCriterion("com_stru_id <", value, "comStruId");
            return (Criteria) this;
        }

        public Criteria andComStruIdLessThanOrEqualTo(Integer value) {
            addCriterion("com_stru_id <=", value, "comStruId");
            return (Criteria) this;
        }

        public Criteria andComStruIdIn(List<Integer> values) {
            addCriterion("com_stru_id in", values, "comStruId");
            return (Criteria) this;
        }

        public Criteria andComStruIdNotIn(List<Integer> values) {
            addCriterion("com_stru_id not in", values, "comStruId");
            return (Criteria) this;
        }

        public Criteria andComStruIdBetween(Integer value1, Integer value2) {
            addCriterion("com_stru_id between", value1, value2, "comStruId");
            return (Criteria) this;
        }

        public Criteria andComStruIdNotBetween(Integer value1, Integer value2) {
            addCriterion("com_stru_id not between", value1, value2, "comStruId");
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

        public Criteria andImgDirIsNull() {
            addCriterion("img_dir is null");
            return (Criteria) this;
        }

        public Criteria andImgDirIsNotNull() {
            addCriterion("img_dir is not null");
            return (Criteria) this;
        }

        public Criteria andImgDirEqualTo(String value) {
            addCriterion("img_dir =", value, "imgDir");
            return (Criteria) this;
        }

        public Criteria andImgDirNotEqualTo(String value) {
            addCriterion("img_dir <>", value, "imgDir");
            return (Criteria) this;
        }

        public Criteria andImgDirGreaterThan(String value) {
            addCriterion("img_dir >", value, "imgDir");
            return (Criteria) this;
        }

        public Criteria andImgDirGreaterThanOrEqualTo(String value) {
            addCriterion("img_dir >=", value, "imgDir");
            return (Criteria) this;
        }

        public Criteria andImgDirLessThan(String value) {
            addCriterion("img_dir <", value, "imgDir");
            return (Criteria) this;
        }

        public Criteria andImgDirLessThanOrEqualTo(String value) {
            addCriterion("img_dir <=", value, "imgDir");
            return (Criteria) this;
        }

        public Criteria andImgDirLike(String value) {
            addCriterion("img_dir like", value, "imgDir");
            return (Criteria) this;
        }

        public Criteria andImgDirNotLike(String value) {
            addCriterion("img_dir not like", value, "imgDir");
            return (Criteria) this;
        }

        public Criteria andImgDirIn(List<String> values) {
            addCriterion("img_dir in", values, "imgDir");
            return (Criteria) this;
        }

        public Criteria andImgDirNotIn(List<String> values) {
            addCriterion("img_dir not in", values, "imgDir");
            return (Criteria) this;
        }

        public Criteria andImgDirBetween(String value1, String value2) {
            addCriterion("img_dir between", value1, value2, "imgDir");
            return (Criteria) this;
        }

        public Criteria andImgDirNotBetween(String value1, String value2) {
            addCriterion("img_dir not between", value1, value2, "imgDir");
            return (Criteria) this;
        }

        public Criteria andImgIsNull() {
            addCriterion("img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("img like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("img not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("img not between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andPostIsNull() {
            addCriterion("post is null");
            return (Criteria) this;
        }

        public Criteria andPostIsNotNull() {
            addCriterion("post is not null");
            return (Criteria) this;
        }

        public Criteria andPostEqualTo(String value) {
            addCriterion("post =", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotEqualTo(String value) {
            addCriterion("post <>", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThan(String value) {
            addCriterion("post >", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThanOrEqualTo(String value) {
            addCriterion("post >=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThan(String value) {
            addCriterion("post <", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThanOrEqualTo(String value) {
            addCriterion("post <=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLike(String value) {
            addCriterion("post like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotLike(String value) {
            addCriterion("post not like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostIn(List<String> values) {
            addCriterion("post in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotIn(List<String> values) {
            addCriterion("post not in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostBetween(String value1, String value2) {
            addCriterion("post between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotBetween(String value1, String value2) {
            addCriterion("post not between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(Integer value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(Integer value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(Integer value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(Integer value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(Integer value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(Integer value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<Integer> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<Integer> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(Integer value1, Integer value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(Integer value1, Integer value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeIsNull() {
            addCriterion("school_type is null");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeIsNotNull() {
            addCriterion("school_type is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeEqualTo(Integer value) {
            addCriterion("school_type =", value, "schoolType");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeNotEqualTo(Integer value) {
            addCriterion("school_type <>", value, "schoolType");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeGreaterThan(Integer value) {
            addCriterion("school_type >", value, "schoolType");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("school_type >=", value, "schoolType");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeLessThan(Integer value) {
            addCriterion("school_type <", value, "schoolType");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeLessThanOrEqualTo(Integer value) {
            addCriterion("school_type <=", value, "schoolType");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeIn(List<Integer> values) {
            addCriterion("school_type in", values, "schoolType");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeNotIn(List<Integer> values) {
            addCriterion("school_type not in", values, "schoolType");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeBetween(Integer value1, Integer value2) {
            addCriterion("school_type between", value1, value2, "schoolType");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("school_type not between", value1, value2, "schoolType");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("school is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("school is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("school =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("school <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("school >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("school >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("school <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("school <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("school like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("school not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("school in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("school not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("school between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("school not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolType2IsNull() {
            addCriterion("school_type2 is null");
            return (Criteria) this;
        }

        public Criteria andSchoolType2IsNotNull() {
            addCriterion("school_type2 is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolType2EqualTo(Integer value) {
            addCriterion("school_type2 =", value, "schoolType2");
            return (Criteria) this;
        }

        public Criteria andSchoolType2NotEqualTo(Integer value) {
            addCriterion("school_type2 <>", value, "schoolType2");
            return (Criteria) this;
        }

        public Criteria andSchoolType2GreaterThan(Integer value) {
            addCriterion("school_type2 >", value, "schoolType2");
            return (Criteria) this;
        }

        public Criteria andSchoolType2GreaterThanOrEqualTo(Integer value) {
            addCriterion("school_type2 >=", value, "schoolType2");
            return (Criteria) this;
        }

        public Criteria andSchoolType2LessThan(Integer value) {
            addCriterion("school_type2 <", value, "schoolType2");
            return (Criteria) this;
        }

        public Criteria andSchoolType2LessThanOrEqualTo(Integer value) {
            addCriterion("school_type2 <=", value, "schoolType2");
            return (Criteria) this;
        }

        public Criteria andSchoolType2In(List<Integer> values) {
            addCriterion("school_type2 in", values, "schoolType2");
            return (Criteria) this;
        }

        public Criteria andSchoolType2NotIn(List<Integer> values) {
            addCriterion("school_type2 not in", values, "schoolType2");
            return (Criteria) this;
        }

        public Criteria andSchoolType2Between(Integer value1, Integer value2) {
            addCriterion("school_type2 between", value1, value2, "schoolType2");
            return (Criteria) this;
        }

        public Criteria andSchoolType2NotBetween(Integer value1, Integer value2) {
            addCriterion("school_type2 not between", value1, value2, "schoolType2");
            return (Criteria) this;
        }

        public Criteria andSchool2IsNull() {
            addCriterion("school2 is null");
            return (Criteria) this;
        }

        public Criteria andSchool2IsNotNull() {
            addCriterion("school2 is not null");
            return (Criteria) this;
        }

        public Criteria andSchool2EqualTo(String value) {
            addCriterion("school2 =", value, "school2");
            return (Criteria) this;
        }

        public Criteria andSchool2NotEqualTo(String value) {
            addCriterion("school2 <>", value, "school2");
            return (Criteria) this;
        }

        public Criteria andSchool2GreaterThan(String value) {
            addCriterion("school2 >", value, "school2");
            return (Criteria) this;
        }

        public Criteria andSchool2GreaterThanOrEqualTo(String value) {
            addCriterion("school2 >=", value, "school2");
            return (Criteria) this;
        }

        public Criteria andSchool2LessThan(String value) {
            addCriterion("school2 <", value, "school2");
            return (Criteria) this;
        }

        public Criteria andSchool2LessThanOrEqualTo(String value) {
            addCriterion("school2 <=", value, "school2");
            return (Criteria) this;
        }

        public Criteria andSchool2Like(String value) {
            addCriterion("school2 like", value, "school2");
            return (Criteria) this;
        }

        public Criteria andSchool2NotLike(String value) {
            addCriterion("school2 not like", value, "school2");
            return (Criteria) this;
        }

        public Criteria andSchool2In(List<String> values) {
            addCriterion("school2 in", values, "school2");
            return (Criteria) this;
        }

        public Criteria andSchool2NotIn(List<String> values) {
            addCriterion("school2 not in", values, "school2");
            return (Criteria) this;
        }

        public Criteria andSchool2Between(String value1, String value2) {
            addCriterion("school2 between", value1, value2, "school2");
            return (Criteria) this;
        }

        public Criteria andSchool2NotBetween(String value1, String value2) {
            addCriterion("school2 not between", value1, value2, "school2");
            return (Criteria) this;
        }

        public Criteria andHasProfessionalCertificateIsNull() {
            addCriterion("has_professional_certificate is null");
            return (Criteria) this;
        }

        public Criteria andHasProfessionalCertificateIsNotNull() {
            addCriterion("has_professional_certificate is not null");
            return (Criteria) this;
        }

        public Criteria andHasProfessionalCertificateEqualTo(Integer value) {
            addCriterion("has_professional_certificate =", value, "hasProfessionalCertificate");
            return (Criteria) this;
        }

        public Criteria andHasProfessionalCertificateNotEqualTo(Integer value) {
            addCriterion("has_professional_certificate <>", value, "hasProfessionalCertificate");
            return (Criteria) this;
        }

        public Criteria andHasProfessionalCertificateGreaterThan(Integer value) {
            addCriterion("has_professional_certificate >", value, "hasProfessionalCertificate");
            return (Criteria) this;
        }

        public Criteria andHasProfessionalCertificateGreaterThanOrEqualTo(Integer value) {
            addCriterion("has_professional_certificate >=", value, "hasProfessionalCertificate");
            return (Criteria) this;
        }

        public Criteria andHasProfessionalCertificateLessThan(Integer value) {
            addCriterion("has_professional_certificate <", value, "hasProfessionalCertificate");
            return (Criteria) this;
        }

        public Criteria andHasProfessionalCertificateLessThanOrEqualTo(Integer value) {
            addCriterion("has_professional_certificate <=", value, "hasProfessionalCertificate");
            return (Criteria) this;
        }

        public Criteria andHasProfessionalCertificateIn(List<Integer> values) {
            addCriterion("has_professional_certificate in", values, "hasProfessionalCertificate");
            return (Criteria) this;
        }

        public Criteria andHasProfessionalCertificateNotIn(List<Integer> values) {
            addCriterion("has_professional_certificate not in", values, "hasProfessionalCertificate");
            return (Criteria) this;
        }

        public Criteria andHasProfessionalCertificateBetween(Integer value1, Integer value2) {
            addCriterion("has_professional_certificate between", value1, value2, "hasProfessionalCertificate");
            return (Criteria) this;
        }

        public Criteria andHasProfessionalCertificateNotBetween(Integer value1, Integer value2) {
            addCriterion("has_professional_certificate not between", value1, value2, "hasProfessionalCertificate");
            return (Criteria) this;
        }

        public Criteria andProfessionalCertificateIsNull() {
            addCriterion("professional_certificate is null");
            return (Criteria) this;
        }

        public Criteria andProfessionalCertificateIsNotNull() {
            addCriterion("professional_certificate is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionalCertificateEqualTo(String value) {
            addCriterion("professional_certificate =", value, "professionalCertificate");
            return (Criteria) this;
        }

        public Criteria andProfessionalCertificateNotEqualTo(String value) {
            addCriterion("professional_certificate <>", value, "professionalCertificate");
            return (Criteria) this;
        }

        public Criteria andProfessionalCertificateGreaterThan(String value) {
            addCriterion("professional_certificate >", value, "professionalCertificate");
            return (Criteria) this;
        }

        public Criteria andProfessionalCertificateGreaterThanOrEqualTo(String value) {
            addCriterion("professional_certificate >=", value, "professionalCertificate");
            return (Criteria) this;
        }

        public Criteria andProfessionalCertificateLessThan(String value) {
            addCriterion("professional_certificate <", value, "professionalCertificate");
            return (Criteria) this;
        }

        public Criteria andProfessionalCertificateLessThanOrEqualTo(String value) {
            addCriterion("professional_certificate <=", value, "professionalCertificate");
            return (Criteria) this;
        }

        public Criteria andProfessionalCertificateLike(String value) {
            addCriterion("professional_certificate like", value, "professionalCertificate");
            return (Criteria) this;
        }

        public Criteria andProfessionalCertificateNotLike(String value) {
            addCriterion("professional_certificate not like", value, "professionalCertificate");
            return (Criteria) this;
        }

        public Criteria andProfessionalCertificateIn(List<String> values) {
            addCriterion("professional_certificate in", values, "professionalCertificate");
            return (Criteria) this;
        }

        public Criteria andProfessionalCertificateNotIn(List<String> values) {
            addCriterion("professional_certificate not in", values, "professionalCertificate");
            return (Criteria) this;
        }

        public Criteria andProfessionalCertificateBetween(String value1, String value2) {
            addCriterion("professional_certificate between", value1, value2, "professionalCertificate");
            return (Criteria) this;
        }

        public Criteria andProfessionalCertificateNotBetween(String value1, String value2) {
            addCriterion("professional_certificate not between", value1, value2, "professionalCertificate");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceIsNull() {
            addCriterion("work_experience is null");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceIsNotNull() {
            addCriterion("work_experience is not null");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceEqualTo(Integer value) {
            addCriterion("work_experience =", value, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceNotEqualTo(Integer value) {
            addCriterion("work_experience <>", value, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceGreaterThan(Integer value) {
            addCriterion("work_experience >", value, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceGreaterThanOrEqualTo(Integer value) {
            addCriterion("work_experience >=", value, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceLessThan(Integer value) {
            addCriterion("work_experience <", value, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceLessThanOrEqualTo(Integer value) {
            addCriterion("work_experience <=", value, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceIn(List<Integer> values) {
            addCriterion("work_experience in", values, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceNotIn(List<Integer> values) {
            addCriterion("work_experience not in", values, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceBetween(Integer value1, Integer value2) {
            addCriterion("work_experience between", value1, value2, "workExperience");
            return (Criteria) this;
        }

        public Criteria andWorkExperienceNotBetween(Integer value1, Integer value2) {
            addCriterion("work_experience not between", value1, value2, "workExperience");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeIsNull() {
            addCriterion("enterprise_type is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeIsNotNull() {
            addCriterion("enterprise_type is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeEqualTo(Integer value) {
            addCriterion("enterprise_type =", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeNotEqualTo(Integer value) {
            addCriterion("enterprise_type <>", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeGreaterThan(Integer value) {
            addCriterion("enterprise_type >", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("enterprise_type >=", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeLessThan(Integer value) {
            addCriterion("enterprise_type <", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeLessThanOrEqualTo(Integer value) {
            addCriterion("enterprise_type <=", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeIn(List<Integer> values) {
            addCriterion("enterprise_type in", values, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeNotIn(List<Integer> values) {
            addCriterion("enterprise_type not in", values, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_type between", value1, value2, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_type not between", value1, value2, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFieldIsNull() {
            addCriterion("enterprise_field is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFieldIsNotNull() {
            addCriterion("enterprise_field is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFieldEqualTo(Integer value) {
            addCriterion("enterprise_field =", value, "enterpriseField");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFieldNotEqualTo(Integer value) {
            addCriterion("enterprise_field <>", value, "enterpriseField");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFieldGreaterThan(Integer value) {
            addCriterion("enterprise_field >", value, "enterpriseField");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFieldGreaterThanOrEqualTo(Integer value) {
            addCriterion("enterprise_field >=", value, "enterpriseField");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFieldLessThan(Integer value) {
            addCriterion("enterprise_field <", value, "enterpriseField");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFieldLessThanOrEqualTo(Integer value) {
            addCriterion("enterprise_field <=", value, "enterpriseField");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFieldIn(List<Integer> values) {
            addCriterion("enterprise_field in", values, "enterpriseField");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFieldNotIn(List<Integer> values) {
            addCriterion("enterprise_field not in", values, "enterpriseField");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFieldBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_field between", value1, value2, "enterpriseField");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFieldNotBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_field not between", value1, value2, "enterpriseField");
            return (Criteria) this;
        }

        public Criteria andHasManagementWorkIsNull() {
            addCriterion("has_management_work is null");
            return (Criteria) this;
        }

        public Criteria andHasManagementWorkIsNotNull() {
            addCriterion("has_management_work is not null");
            return (Criteria) this;
        }

        public Criteria andHasManagementWorkEqualTo(Integer value) {
            addCriterion("has_management_work =", value, "hasManagementWork");
            return (Criteria) this;
        }

        public Criteria andHasManagementWorkNotEqualTo(Integer value) {
            addCriterion("has_management_work <>", value, "hasManagementWork");
            return (Criteria) this;
        }

        public Criteria andHasManagementWorkGreaterThan(Integer value) {
            addCriterion("has_management_work >", value, "hasManagementWork");
            return (Criteria) this;
        }

        public Criteria andHasManagementWorkGreaterThanOrEqualTo(Integer value) {
            addCriterion("has_management_work >=", value, "hasManagementWork");
            return (Criteria) this;
        }

        public Criteria andHasManagementWorkLessThan(Integer value) {
            addCriterion("has_management_work <", value, "hasManagementWork");
            return (Criteria) this;
        }

        public Criteria andHasManagementWorkLessThanOrEqualTo(Integer value) {
            addCriterion("has_management_work <=", value, "hasManagementWork");
            return (Criteria) this;
        }

        public Criteria andHasManagementWorkIn(List<Integer> values) {
            addCriterion("has_management_work in", values, "hasManagementWork");
            return (Criteria) this;
        }

        public Criteria andHasManagementWorkNotIn(List<Integer> values) {
            addCriterion("has_management_work not in", values, "hasManagementWork");
            return (Criteria) this;
        }

        public Criteria andHasManagementWorkBetween(Integer value1, Integer value2) {
            addCriterion("has_management_work between", value1, value2, "hasManagementWork");
            return (Criteria) this;
        }

        public Criteria andHasManagementWorkNotBetween(Integer value1, Integer value2) {
            addCriterion("has_management_work not between", value1, value2, "hasManagementWork");
            return (Criteria) this;
        }

        public Criteria andOtherIsNull() {
            addCriterion("other is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("other is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(String value) {
            addCriterion("other =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(String value) {
            addCriterion("other <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(String value) {
            addCriterion("other >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(String value) {
            addCriterion("other >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(String value) {
            addCriterion("other <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(String value) {
            addCriterion("other <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLike(String value) {
            addCriterion("other like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotLike(String value) {
            addCriterion("other not like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<String> values) {
            addCriterion("other in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<String> values) {
            addCriterion("other not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(String value1, String value2) {
            addCriterion("other between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(String value1, String value2) {
            addCriterion("other not between", value1, value2, "other");
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