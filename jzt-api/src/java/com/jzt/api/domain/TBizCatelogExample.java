package com.jzt.api.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TBizCatelogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TBizCatelogExample() {
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

        public Criteria andOwnerIdIsNull() {
            addCriterion("owner_id is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIsNotNull() {
            addCriterion("owner_id is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerIdEqualTo(Integer value) {
            addCriterion("owner_id =", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotEqualTo(Integer value) {
            addCriterion("owner_id <>", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdGreaterThan(Integer value) {
            addCriterion("owner_id >", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("owner_id >=", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdLessThan(Integer value) {
            addCriterion("owner_id <", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdLessThanOrEqualTo(Integer value) {
            addCriterion("owner_id <=", value, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdIn(List<Integer> values) {
            addCriterion("owner_id in", values, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotIn(List<Integer> values) {
            addCriterion("owner_id not in", values, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdBetween(Integer value1, Integer value2) {
            addCriterion("owner_id between", value1, value2, "ownerId");
            return (Criteria) this;
        }

        public Criteria andOwnerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("owner_id not between", value1, value2, "ownerId");
            return (Criteria) this;
        }

        public Criteria andCatelogIsNull() {
            addCriterion("catelog is null");
            return (Criteria) this;
        }

        public Criteria andCatelogIsNotNull() {
            addCriterion("catelog is not null");
            return (Criteria) this;
        }

        public Criteria andCatelogEqualTo(String value) {
            addCriterion("catelog =", value, "catelog");
            return (Criteria) this;
        }

        public Criteria andCatelogNotEqualTo(String value) {
            addCriterion("catelog <>", value, "catelog");
            return (Criteria) this;
        }

        public Criteria andCatelogGreaterThan(String value) {
            addCriterion("catelog >", value, "catelog");
            return (Criteria) this;
        }

        public Criteria andCatelogGreaterThanOrEqualTo(String value) {
            addCriterion("catelog >=", value, "catelog");
            return (Criteria) this;
        }

        public Criteria andCatelogLessThan(String value) {
            addCriterion("catelog <", value, "catelog");
            return (Criteria) this;
        }

        public Criteria andCatelogLessThanOrEqualTo(String value) {
            addCriterion("catelog <=", value, "catelog");
            return (Criteria) this;
        }

        public Criteria andCatelogLike(String value) {
            addCriterion("catelog like", value, "catelog");
            return (Criteria) this;
        }

        public Criteria andCatelogNotLike(String value) {
            addCriterion("catelog not like", value, "catelog");
            return (Criteria) this;
        }

        public Criteria andCatelogIn(List<String> values) {
            addCriterion("catelog in", values, "catelog");
            return (Criteria) this;
        }

        public Criteria andCatelogNotIn(List<String> values) {
            addCriterion("catelog not in", values, "catelog");
            return (Criteria) this;
        }

        public Criteria andCatelogBetween(String value1, String value2) {
            addCriterion("catelog between", value1, value2, "catelog");
            return (Criteria) this;
        }

        public Criteria andCatelogNotBetween(String value1, String value2) {
            addCriterion("catelog not between", value1, value2, "catelog");
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

        public Criteria andSectypeIsNull() {
            addCriterion("sectype is null");
            return (Criteria) this;
        }

        public Criteria andSectypeIsNotNull() {
            addCriterion("sectype is not null");
            return (Criteria) this;
        }

        public Criteria andSectypeEqualTo(String value) {
            addCriterion("sectype =", value, "sectype");
            return (Criteria) this;
        }

        public Criteria andSectypeNotEqualTo(String value) {
            addCriterion("sectype <>", value, "sectype");
            return (Criteria) this;
        }

        public Criteria andSectypeGreaterThan(String value) {
            addCriterion("sectype >", value, "sectype");
            return (Criteria) this;
        }

        public Criteria andSectypeGreaterThanOrEqualTo(String value) {
            addCriterion("sectype >=", value, "sectype");
            return (Criteria) this;
        }

        public Criteria andSectypeLessThan(String value) {
            addCriterion("sectype <", value, "sectype");
            return (Criteria) this;
        }

        public Criteria andSectypeLessThanOrEqualTo(String value) {
            addCriterion("sectype <=", value, "sectype");
            return (Criteria) this;
        }

        public Criteria andSectypeLike(String value) {
            addCriterion("sectype like", value, "sectype");
            return (Criteria) this;
        }

        public Criteria andSectypeNotLike(String value) {
            addCriterion("sectype not like", value, "sectype");
            return (Criteria) this;
        }

        public Criteria andSectypeIn(List<String> values) {
            addCriterion("sectype in", values, "sectype");
            return (Criteria) this;
        }

        public Criteria andSectypeNotIn(List<String> values) {
            addCriterion("sectype not in", values, "sectype");
            return (Criteria) this;
        }

        public Criteria andSectypeBetween(String value1, String value2) {
            addCriterion("sectype between", value1, value2, "sectype");
            return (Criteria) this;
        }

        public Criteria andSectypeNotBetween(String value1, String value2) {
            addCriterion("sectype not between", value1, value2, "sectype");
            return (Criteria) this;
        }

        public Criteria andBizNameIsNull() {
            addCriterion("biz_name is null");
            return (Criteria) this;
        }

        public Criteria andBizNameIsNotNull() {
            addCriterion("biz_name is not null");
            return (Criteria) this;
        }

        public Criteria andBizNameEqualTo(String value) {
            addCriterion("biz_name =", value, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameNotEqualTo(String value) {
            addCriterion("biz_name <>", value, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameGreaterThan(String value) {
            addCriterion("biz_name >", value, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameGreaterThanOrEqualTo(String value) {
            addCriterion("biz_name >=", value, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameLessThan(String value) {
            addCriterion("biz_name <", value, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameLessThanOrEqualTo(String value) {
            addCriterion("biz_name <=", value, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameLike(String value) {
            addCriterion("biz_name like", value, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameNotLike(String value) {
            addCriterion("biz_name not like", value, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameIn(List<String> values) {
            addCriterion("biz_name in", values, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameNotIn(List<String> values) {
            addCriterion("biz_name not in", values, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameBetween(String value1, String value2) {
            addCriterion("biz_name between", value1, value2, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizNameNotBetween(String value1, String value2) {
            addCriterion("biz_name not between", value1, value2, "bizName");
            return (Criteria) this;
        }

        public Criteria andBizDescIsNull() {
            addCriterion("biz_desc is null");
            return (Criteria) this;
        }

        public Criteria andBizDescIsNotNull() {
            addCriterion("biz_desc is not null");
            return (Criteria) this;
        }

        public Criteria andBizDescEqualTo(String value) {
            addCriterion("biz_desc =", value, "bizDesc");
            return (Criteria) this;
        }

        public Criteria andBizDescNotEqualTo(String value) {
            addCriterion("biz_desc <>", value, "bizDesc");
            return (Criteria) this;
        }

        public Criteria andBizDescGreaterThan(String value) {
            addCriterion("biz_desc >", value, "bizDesc");
            return (Criteria) this;
        }

        public Criteria andBizDescGreaterThanOrEqualTo(String value) {
            addCriterion("biz_desc >=", value, "bizDesc");
            return (Criteria) this;
        }

        public Criteria andBizDescLessThan(String value) {
            addCriterion("biz_desc <", value, "bizDesc");
            return (Criteria) this;
        }

        public Criteria andBizDescLessThanOrEqualTo(String value) {
            addCriterion("biz_desc <=", value, "bizDesc");
            return (Criteria) this;
        }

        public Criteria andBizDescLike(String value) {
            addCriterion("biz_desc like", value, "bizDesc");
            return (Criteria) this;
        }

        public Criteria andBizDescNotLike(String value) {
            addCriterion("biz_desc not like", value, "bizDesc");
            return (Criteria) this;
        }

        public Criteria andBizDescIn(List<String> values) {
            addCriterion("biz_desc in", values, "bizDesc");
            return (Criteria) this;
        }

        public Criteria andBizDescNotIn(List<String> values) {
            addCriterion("biz_desc not in", values, "bizDesc");
            return (Criteria) this;
        }

        public Criteria andBizDescBetween(String value1, String value2) {
            addCriterion("biz_desc between", value1, value2, "bizDesc");
            return (Criteria) this;
        }

        public Criteria andBizDescNotBetween(String value1, String value2) {
            addCriterion("biz_desc not between", value1, value2, "bizDesc");
            return (Criteria) this;
        }

        public Criteria andBizAttrIsNull() {
            addCriterion("biz_attr is null");
            return (Criteria) this;
        }

        public Criteria andBizAttrIsNotNull() {
            addCriterion("biz_attr is not null");
            return (Criteria) this;
        }

        public Criteria andBizAttrEqualTo(String value) {
            addCriterion("biz_attr =", value, "bizAttr");
            return (Criteria) this;
        }

        public Criteria andBizAttrNotEqualTo(String value) {
            addCriterion("biz_attr <>", value, "bizAttr");
            return (Criteria) this;
        }

        public Criteria andBizAttrGreaterThan(String value) {
            addCriterion("biz_attr >", value, "bizAttr");
            return (Criteria) this;
        }

        public Criteria andBizAttrGreaterThanOrEqualTo(String value) {
            addCriterion("biz_attr >=", value, "bizAttr");
            return (Criteria) this;
        }

        public Criteria andBizAttrLessThan(String value) {
            addCriterion("biz_attr <", value, "bizAttr");
            return (Criteria) this;
        }

        public Criteria andBizAttrLessThanOrEqualTo(String value) {
            addCriterion("biz_attr <=", value, "bizAttr");
            return (Criteria) this;
        }

        public Criteria andBizAttrLike(String value) {
            addCriterion("biz_attr like", value, "bizAttr");
            return (Criteria) this;
        }

        public Criteria andBizAttrNotLike(String value) {
            addCriterion("biz_attr not like", value, "bizAttr");
            return (Criteria) this;
        }

        public Criteria andBizAttrIn(List<String> values) {
            addCriterion("biz_attr in", values, "bizAttr");
            return (Criteria) this;
        }

        public Criteria andBizAttrNotIn(List<String> values) {
            addCriterion("biz_attr not in", values, "bizAttr");
            return (Criteria) this;
        }

        public Criteria andBizAttrBetween(String value1, String value2) {
            addCriterion("biz_attr between", value1, value2, "bizAttr");
            return (Criteria) this;
        }

        public Criteria andBizAttrNotBetween(String value1, String value2) {
            addCriterion("biz_attr not between", value1, value2, "bizAttr");
            return (Criteria) this;
        }

        public Criteria andBizAttr1IsNull() {
            addCriterion("biz_attr1 is null");
            return (Criteria) this;
        }

        public Criteria andBizAttr1IsNotNull() {
            addCriterion("biz_attr1 is not null");
            return (Criteria) this;
        }

        public Criteria andBizAttr1EqualTo(String value) {
            addCriterion("biz_attr1 =", value, "bizAttr1");
            return (Criteria) this;
        }

        public Criteria andBizAttr1NotEqualTo(String value) {
            addCriterion("biz_attr1 <>", value, "bizAttr1");
            return (Criteria) this;
        }

        public Criteria andBizAttr1GreaterThan(String value) {
            addCriterion("biz_attr1 >", value, "bizAttr1");
            return (Criteria) this;
        }

        public Criteria andBizAttr1GreaterThanOrEqualTo(String value) {
            addCriterion("biz_attr1 >=", value, "bizAttr1");
            return (Criteria) this;
        }

        public Criteria andBizAttr1LessThan(String value) {
            addCriterion("biz_attr1 <", value, "bizAttr1");
            return (Criteria) this;
        }

        public Criteria andBizAttr1LessThanOrEqualTo(String value) {
            addCriterion("biz_attr1 <=", value, "bizAttr1");
            return (Criteria) this;
        }

        public Criteria andBizAttr1Like(String value) {
            addCriterion("biz_attr1 like", value, "bizAttr1");
            return (Criteria) this;
        }

        public Criteria andBizAttr1NotLike(String value) {
            addCriterion("biz_attr1 not like", value, "bizAttr1");
            return (Criteria) this;
        }

        public Criteria andBizAttr1In(List<String> values) {
            addCriterion("biz_attr1 in", values, "bizAttr1");
            return (Criteria) this;
        }

        public Criteria andBizAttr1NotIn(List<String> values) {
            addCriterion("biz_attr1 not in", values, "bizAttr1");
            return (Criteria) this;
        }

        public Criteria andBizAttr1Between(String value1, String value2) {
            addCriterion("biz_attr1 between", value1, value2, "bizAttr1");
            return (Criteria) this;
        }

        public Criteria andBizAttr1NotBetween(String value1, String value2) {
            addCriterion("biz_attr1 not between", value1, value2, "bizAttr1");
            return (Criteria) this;
        }

        public Criteria andBizAttr2IsNull() {
            addCriterion("biz_attr2 is null");
            return (Criteria) this;
        }

        public Criteria andBizAttr2IsNotNull() {
            addCriterion("biz_attr2 is not null");
            return (Criteria) this;
        }

        public Criteria andBizAttr2EqualTo(String value) {
            addCriterion("biz_attr2 =", value, "bizAttr2");
            return (Criteria) this;
        }

        public Criteria andBizAttr2NotEqualTo(String value) {
            addCriterion("biz_attr2 <>", value, "bizAttr2");
            return (Criteria) this;
        }

        public Criteria andBizAttr2GreaterThan(String value) {
            addCriterion("biz_attr2 >", value, "bizAttr2");
            return (Criteria) this;
        }

        public Criteria andBizAttr2GreaterThanOrEqualTo(String value) {
            addCriterion("biz_attr2 >=", value, "bizAttr2");
            return (Criteria) this;
        }

        public Criteria andBizAttr2LessThan(String value) {
            addCriterion("biz_attr2 <", value, "bizAttr2");
            return (Criteria) this;
        }

        public Criteria andBizAttr2LessThanOrEqualTo(String value) {
            addCriterion("biz_attr2 <=", value, "bizAttr2");
            return (Criteria) this;
        }

        public Criteria andBizAttr2Like(String value) {
            addCriterion("biz_attr2 like", value, "bizAttr2");
            return (Criteria) this;
        }

        public Criteria andBizAttr2NotLike(String value) {
            addCriterion("biz_attr2 not like", value, "bizAttr2");
            return (Criteria) this;
        }

        public Criteria andBizAttr2In(List<String> values) {
            addCriterion("biz_attr2 in", values, "bizAttr2");
            return (Criteria) this;
        }

        public Criteria andBizAttr2NotIn(List<String> values) {
            addCriterion("biz_attr2 not in", values, "bizAttr2");
            return (Criteria) this;
        }

        public Criteria andBizAttr2Between(String value1, String value2) {
            addCriterion("biz_attr2 between", value1, value2, "bizAttr2");
            return (Criteria) this;
        }

        public Criteria andBizAttr2NotBetween(String value1, String value2) {
            addCriterion("biz_attr2 not between", value1, value2, "bizAttr2");
            return (Criteria) this;
        }

        public Criteria andBizAttr3IsNull() {
            addCriterion("biz_attr3 is null");
            return (Criteria) this;
        }

        public Criteria andBizAttr3IsNotNull() {
            addCriterion("biz_attr3 is not null");
            return (Criteria) this;
        }

        public Criteria andBizAttr3EqualTo(String value) {
            addCriterion("biz_attr3 =", value, "bizAttr3");
            return (Criteria) this;
        }

        public Criteria andBizAttr3NotEqualTo(String value) {
            addCriterion("biz_attr3 <>", value, "bizAttr3");
            return (Criteria) this;
        }

        public Criteria andBizAttr3GreaterThan(String value) {
            addCriterion("biz_attr3 >", value, "bizAttr3");
            return (Criteria) this;
        }

        public Criteria andBizAttr3GreaterThanOrEqualTo(String value) {
            addCriterion("biz_attr3 >=", value, "bizAttr3");
            return (Criteria) this;
        }

        public Criteria andBizAttr3LessThan(String value) {
            addCriterion("biz_attr3 <", value, "bizAttr3");
            return (Criteria) this;
        }

        public Criteria andBizAttr3LessThanOrEqualTo(String value) {
            addCriterion("biz_attr3 <=", value, "bizAttr3");
            return (Criteria) this;
        }

        public Criteria andBizAttr3Like(String value) {
            addCriterion("biz_attr3 like", value, "bizAttr3");
            return (Criteria) this;
        }

        public Criteria andBizAttr3NotLike(String value) {
            addCriterion("biz_attr3 not like", value, "bizAttr3");
            return (Criteria) this;
        }

        public Criteria andBizAttr3In(List<String> values) {
            addCriterion("biz_attr3 in", values, "bizAttr3");
            return (Criteria) this;
        }

        public Criteria andBizAttr3NotIn(List<String> values) {
            addCriterion("biz_attr3 not in", values, "bizAttr3");
            return (Criteria) this;
        }

        public Criteria andBizAttr3Between(String value1, String value2) {
            addCriterion("biz_attr3 between", value1, value2, "bizAttr3");
            return (Criteria) this;
        }

        public Criteria andBizAttr3NotBetween(String value1, String value2) {
            addCriterion("biz_attr3 not between", value1, value2, "bizAttr3");
            return (Criteria) this;
        }

        public Criteria andBizPicIsNull() {
            addCriterion("biz_pic is null");
            return (Criteria) this;
        }

        public Criteria andBizPicIsNotNull() {
            addCriterion("biz_pic is not null");
            return (Criteria) this;
        }

        public Criteria andBizPicEqualTo(String value) {
            addCriterion("biz_pic =", value, "bizPic");
            return (Criteria) this;
        }

        public Criteria andBizPicNotEqualTo(String value) {
            addCriterion("biz_pic <>", value, "bizPic");
            return (Criteria) this;
        }

        public Criteria andBizPicGreaterThan(String value) {
            addCriterion("biz_pic >", value, "bizPic");
            return (Criteria) this;
        }

        public Criteria andBizPicGreaterThanOrEqualTo(String value) {
            addCriterion("biz_pic >=", value, "bizPic");
            return (Criteria) this;
        }

        public Criteria andBizPicLessThan(String value) {
            addCriterion("biz_pic <", value, "bizPic");
            return (Criteria) this;
        }

        public Criteria andBizPicLessThanOrEqualTo(String value) {
            addCriterion("biz_pic <=", value, "bizPic");
            return (Criteria) this;
        }

        public Criteria andBizPicLike(String value) {
            addCriterion("biz_pic like", value, "bizPic");
            return (Criteria) this;
        }

        public Criteria andBizPicNotLike(String value) {
            addCriterion("biz_pic not like", value, "bizPic");
            return (Criteria) this;
        }

        public Criteria andBizPicIn(List<String> values) {
            addCriterion("biz_pic in", values, "bizPic");
            return (Criteria) this;
        }

        public Criteria andBizPicNotIn(List<String> values) {
            addCriterion("biz_pic not in", values, "bizPic");
            return (Criteria) this;
        }

        public Criteria andBizPicBetween(String value1, String value2) {
            addCriterion("biz_pic between", value1, value2, "bizPic");
            return (Criteria) this;
        }

        public Criteria andBizPicNotBetween(String value1, String value2) {
            addCriterion("biz_pic not between", value1, value2, "bizPic");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
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