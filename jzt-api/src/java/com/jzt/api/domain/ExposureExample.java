package com.jzt.api.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExposureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExposureExample() {
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

        public Criteria andEidIsNull() {
            addCriterion("eid is null");
            return (Criteria) this;
        }

        public Criteria andEidIsNotNull() {
            addCriterion("eid is not null");
            return (Criteria) this;
        }

        public Criteria andEidEqualTo(Integer value) {
            addCriterion("eid =", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotEqualTo(Integer value) {
            addCriterion("eid <>", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThan(Integer value) {
            addCriterion("eid >", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThanOrEqualTo(Integer value) {
            addCriterion("eid >=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThan(Integer value) {
            addCriterion("eid <", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThanOrEqualTo(Integer value) {
            addCriterion("eid <=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidIn(List<Integer> values) {
            addCriterion("eid in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotIn(List<Integer> values) {
            addCriterion("eid not in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidBetween(Integer value1, Integer value2) {
            addCriterion("eid between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotBetween(Integer value1, Integer value2) {
            addCriterion("eid not between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductUrlIsNull() {
            addCriterion("product_url is null");
            return (Criteria) this;
        }

        public Criteria andProductUrlIsNotNull() {
            addCriterion("product_url is not null");
            return (Criteria) this;
        }

        public Criteria andProductUrlEqualTo(String value) {
            addCriterion("product_url =", value, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlNotEqualTo(String value) {
            addCriterion("product_url <>", value, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlGreaterThan(String value) {
            addCriterion("product_url >", value, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlGreaterThanOrEqualTo(String value) {
            addCriterion("product_url >=", value, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlLessThan(String value) {
            addCriterion("product_url <", value, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlLessThanOrEqualTo(String value) {
            addCriterion("product_url <=", value, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlLike(String value) {
            addCriterion("product_url like", value, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlNotLike(String value) {
            addCriterion("product_url not like", value, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlIn(List<String> values) {
            addCriterion("product_url in", values, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlNotIn(List<String> values) {
            addCriterion("product_url not in", values, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlBetween(String value1, String value2) {
            addCriterion("product_url between", value1, value2, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlNotBetween(String value1, String value2) {
            addCriterion("product_url not between", value1, value2, "productUrl");
            return (Criteria) this;
        }

        public Criteria andAgreeCntIsNull() {
            addCriterion("agree_cnt is null");
            return (Criteria) this;
        }

        public Criteria andAgreeCntIsNotNull() {
            addCriterion("agree_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andAgreeCntEqualTo(Integer value) {
            addCriterion("agree_cnt =", value, "agreeCnt");
            return (Criteria) this;
        }

        public Criteria andAgreeCntNotEqualTo(Integer value) {
            addCriterion("agree_cnt <>", value, "agreeCnt");
            return (Criteria) this;
        }

        public Criteria andAgreeCntGreaterThan(Integer value) {
            addCriterion("agree_cnt >", value, "agreeCnt");
            return (Criteria) this;
        }

        public Criteria andAgreeCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("agree_cnt >=", value, "agreeCnt");
            return (Criteria) this;
        }

        public Criteria andAgreeCntLessThan(Integer value) {
            addCriterion("agree_cnt <", value, "agreeCnt");
            return (Criteria) this;
        }

        public Criteria andAgreeCntLessThanOrEqualTo(Integer value) {
            addCriterion("agree_cnt <=", value, "agreeCnt");
            return (Criteria) this;
        }

        public Criteria andAgreeCntIn(List<Integer> values) {
            addCriterion("agree_cnt in", values, "agreeCnt");
            return (Criteria) this;
        }

        public Criteria andAgreeCntNotIn(List<Integer> values) {
            addCriterion("agree_cnt not in", values, "agreeCnt");
            return (Criteria) this;
        }

        public Criteria andAgreeCntBetween(Integer value1, Integer value2) {
            addCriterion("agree_cnt between", value1, value2, "agreeCnt");
            return (Criteria) this;
        }

        public Criteria andAgreeCntNotBetween(Integer value1, Integer value2) {
            addCriterion("agree_cnt not between", value1, value2, "agreeCnt");
            return (Criteria) this;
        }

        public Criteria andCommentCntIsNull() {
            addCriterion("comment_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCommentCntIsNotNull() {
            addCriterion("comment_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCommentCntEqualTo(Integer value) {
            addCriterion("comment_cnt =", value, "commentCnt");
            return (Criteria) this;
        }

        public Criteria andCommentCntNotEqualTo(Integer value) {
            addCriterion("comment_cnt <>", value, "commentCnt");
            return (Criteria) this;
        }

        public Criteria andCommentCntGreaterThan(Integer value) {
            addCriterion("comment_cnt >", value, "commentCnt");
            return (Criteria) this;
        }

        public Criteria andCommentCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_cnt >=", value, "commentCnt");
            return (Criteria) this;
        }

        public Criteria andCommentCntLessThan(Integer value) {
            addCriterion("comment_cnt <", value, "commentCnt");
            return (Criteria) this;
        }

        public Criteria andCommentCntLessThanOrEqualTo(Integer value) {
            addCriterion("comment_cnt <=", value, "commentCnt");
            return (Criteria) this;
        }

        public Criteria andCommentCntIn(List<Integer> values) {
            addCriterion("comment_cnt in", values, "commentCnt");
            return (Criteria) this;
        }

        public Criteria andCommentCntNotIn(List<Integer> values) {
            addCriterion("comment_cnt not in", values, "commentCnt");
            return (Criteria) this;
        }

        public Criteria andCommentCntBetween(Integer value1, Integer value2) {
            addCriterion("comment_cnt between", value1, value2, "commentCnt");
            return (Criteria) this;
        }

        public Criteria andCommentCntNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_cnt not between", value1, value2, "commentCnt");
            return (Criteria) this;
        }

        public Criteria andClickCntIsNull() {
            addCriterion("click_cnt is null");
            return (Criteria) this;
        }

        public Criteria andClickCntIsNotNull() {
            addCriterion("click_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andClickCntEqualTo(Integer value) {
            addCriterion("click_cnt =", value, "clickCnt");
            return (Criteria) this;
        }

        public Criteria andClickCntNotEqualTo(Integer value) {
            addCriterion("click_cnt <>", value, "clickCnt");
            return (Criteria) this;
        }

        public Criteria andClickCntGreaterThan(Integer value) {
            addCriterion("click_cnt >", value, "clickCnt");
            return (Criteria) this;
        }

        public Criteria andClickCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("click_cnt >=", value, "clickCnt");
            return (Criteria) this;
        }

        public Criteria andClickCntLessThan(Integer value) {
            addCriterion("click_cnt <", value, "clickCnt");
            return (Criteria) this;
        }

        public Criteria andClickCntLessThanOrEqualTo(Integer value) {
            addCriterion("click_cnt <=", value, "clickCnt");
            return (Criteria) this;
        }

        public Criteria andClickCntIn(List<Integer> values) {
            addCriterion("click_cnt in", values, "clickCnt");
            return (Criteria) this;
        }

        public Criteria andClickCntNotIn(List<Integer> values) {
            addCriterion("click_cnt not in", values, "clickCnt");
            return (Criteria) this;
        }

        public Criteria andClickCntBetween(Integer value1, Integer value2) {
            addCriterion("click_cnt between", value1, value2, "clickCnt");
            return (Criteria) this;
        }

        public Criteria andClickCntNotBetween(Integer value1, Integer value2) {
            addCriterion("click_cnt not between", value1, value2, "clickCnt");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNull() {
            addCriterion("created_date is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNotNull() {
            addCriterion("created_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateEqualTo(Date value) {
            addCriterion("created_date =", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotEqualTo(Date value) {
            addCriterion("created_date <>", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThan(Date value) {
            addCriterion("created_date >", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("created_date >=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThan(Date value) {
            addCriterion("created_date <", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThanOrEqualTo(Date value) {
            addCriterion("created_date <=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIn(List<Date> values) {
            addCriterion("created_date in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotIn(List<Date> values) {
            addCriterion("created_date not in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateBetween(Date value1, Date value2) {
            addCriterion("created_date between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotBetween(Date value1, Date value2) {
            addCriterion("created_date not between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIsNull() {
            addCriterion("last_update is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIsNotNull() {
            addCriterion("last_update is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateEqualTo(Date value) {
            addCriterion("last_update =", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotEqualTo(Date value) {
            addCriterion("last_update <>", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateGreaterThan(Date value) {
            addCriterion("last_update >", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update >=", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLessThan(Date value) {
            addCriterion("last_update <", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateLessThanOrEqualTo(Date value) {
            addCriterion("last_update <=", value, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateIn(List<Date> values) {
            addCriterion("last_update in", values, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotIn(List<Date> values) {
            addCriterion("last_update not in", values, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateBetween(Date value1, Date value2) {
            addCriterion("last_update between", value1, value2, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateNotBetween(Date value1, Date value2) {
            addCriterion("last_update not between", value1, value2, "lastUpdate");
            return (Criteria) this;
        }

        public Criteria andLastCommentEditorIsNull() {
            addCriterion("last_comment_editor is null");
            return (Criteria) this;
        }

        public Criteria andLastCommentEditorIsNotNull() {
            addCriterion("last_comment_editor is not null");
            return (Criteria) this;
        }

        public Criteria andLastCommentEditorEqualTo(String value) {
            addCriterion("last_comment_editor =", value, "lastCommentEditor");
            return (Criteria) this;
        }

        public Criteria andLastCommentEditorNotEqualTo(String value) {
            addCriterion("last_comment_editor <>", value, "lastCommentEditor");
            return (Criteria) this;
        }

        public Criteria andLastCommentEditorGreaterThan(String value) {
            addCriterion("last_comment_editor >", value, "lastCommentEditor");
            return (Criteria) this;
        }

        public Criteria andLastCommentEditorGreaterThanOrEqualTo(String value) {
            addCriterion("last_comment_editor >=", value, "lastCommentEditor");
            return (Criteria) this;
        }

        public Criteria andLastCommentEditorLessThan(String value) {
            addCriterion("last_comment_editor <", value, "lastCommentEditor");
            return (Criteria) this;
        }

        public Criteria andLastCommentEditorLessThanOrEqualTo(String value) {
            addCriterion("last_comment_editor <=", value, "lastCommentEditor");
            return (Criteria) this;
        }

        public Criteria andLastCommentEditorLike(String value) {
            addCriterion("last_comment_editor like", value, "lastCommentEditor");
            return (Criteria) this;
        }

        public Criteria andLastCommentEditorNotLike(String value) {
            addCriterion("last_comment_editor not like", value, "lastCommentEditor");
            return (Criteria) this;
        }

        public Criteria andLastCommentEditorIn(List<String> values) {
            addCriterion("last_comment_editor in", values, "lastCommentEditor");
            return (Criteria) this;
        }

        public Criteria andLastCommentEditorNotIn(List<String> values) {
            addCriterion("last_comment_editor not in", values, "lastCommentEditor");
            return (Criteria) this;
        }

        public Criteria andLastCommentEditorBetween(String value1, String value2) {
            addCriterion("last_comment_editor between", value1, value2, "lastCommentEditor");
            return (Criteria) this;
        }

        public Criteria andLastCommentEditorNotBetween(String value1, String value2) {
            addCriterion("last_comment_editor not between", value1, value2, "lastCommentEditor");
            return (Criteria) this;
        }

        public Criteria andLastCommentIsNull() {
            addCriterion("last_comment is null");
            return (Criteria) this;
        }

        public Criteria andLastCommentIsNotNull() {
            addCriterion("last_comment is not null");
            return (Criteria) this;
        }

        public Criteria andLastCommentEqualTo(Date value) {
            addCriterion("last_comment =", value, "lastComment");
            return (Criteria) this;
        }

        public Criteria andLastCommentNotEqualTo(Date value) {
            addCriterion("last_comment <>", value, "lastComment");
            return (Criteria) this;
        }

        public Criteria andLastCommentGreaterThan(Date value) {
            addCriterion("last_comment >", value, "lastComment");
            return (Criteria) this;
        }

        public Criteria andLastCommentGreaterThanOrEqualTo(Date value) {
            addCriterion("last_comment >=", value, "lastComment");
            return (Criteria) this;
        }

        public Criteria andLastCommentLessThan(Date value) {
            addCriterion("last_comment <", value, "lastComment");
            return (Criteria) this;
        }

        public Criteria andLastCommentLessThanOrEqualTo(Date value) {
            addCriterion("last_comment <=", value, "lastComment");
            return (Criteria) this;
        }

        public Criteria andLastCommentIn(List<Date> values) {
            addCriterion("last_comment in", values, "lastComment");
            return (Criteria) this;
        }

        public Criteria andLastCommentNotIn(List<Date> values) {
            addCriterion("last_comment not in", values, "lastComment");
            return (Criteria) this;
        }

        public Criteria andLastCommentBetween(Date value1, Date value2) {
            addCriterion("last_comment between", value1, value2, "lastComment");
            return (Criteria) this;
        }

        public Criteria andLastCommentNotBetween(Date value1, Date value2) {
            addCriterion("last_comment not between", value1, value2, "lastComment");
            return (Criteria) this;
        }

        public Criteria andCheckedDateIsNull() {
            addCriterion("checked_date is null");
            return (Criteria) this;
        }

        public Criteria andCheckedDateIsNotNull() {
            addCriterion("checked_date is not null");
            return (Criteria) this;
        }

        public Criteria andCheckedDateEqualTo(Date value) {
            addCriterion("checked_date =", value, "checkedDate");
            return (Criteria) this;
        }

        public Criteria andCheckedDateNotEqualTo(Date value) {
            addCriterion("checked_date <>", value, "checkedDate");
            return (Criteria) this;
        }

        public Criteria andCheckedDateGreaterThan(Date value) {
            addCriterion("checked_date >", value, "checkedDate");
            return (Criteria) this;
        }

        public Criteria andCheckedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("checked_date >=", value, "checkedDate");
            return (Criteria) this;
        }

        public Criteria andCheckedDateLessThan(Date value) {
            addCriterion("checked_date <", value, "checkedDate");
            return (Criteria) this;
        }

        public Criteria andCheckedDateLessThanOrEqualTo(Date value) {
            addCriterion("checked_date <=", value, "checkedDate");
            return (Criteria) this;
        }

        public Criteria andCheckedDateIn(List<Date> values) {
            addCriterion("checked_date in", values, "checkedDate");
            return (Criteria) this;
        }

        public Criteria andCheckedDateNotIn(List<Date> values) {
            addCriterion("checked_date not in", values, "checkedDate");
            return (Criteria) this;
        }

        public Criteria andCheckedDateBetween(Date value1, Date value2) {
            addCriterion("checked_date between", value1, value2, "checkedDate");
            return (Criteria) this;
        }

        public Criteria andCheckedDateNotBetween(Date value1, Date value2) {
            addCriterion("checked_date not between", value1, value2, "checkedDate");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIsNull() {
            addCriterion("author_id is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIsNotNull() {
            addCriterion("author_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorIdEqualTo(Integer value) {
            addCriterion("author_id =", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotEqualTo(Integer value) {
            addCriterion("author_id <>", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdGreaterThan(Integer value) {
            addCriterion("author_id >", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("author_id >=", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLessThan(Integer value) {
            addCriterion("author_id <", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdLessThanOrEqualTo(Integer value) {
            addCriterion("author_id <=", value, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdIn(List<Integer> values) {
            addCriterion("author_id in", values, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotIn(List<Integer> values) {
            addCriterion("author_id not in", values, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdBetween(Integer value1, Integer value2) {
            addCriterion("author_id between", value1, value2, "authorId");
            return (Criteria) this;
        }

        public Criteria andAuthorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("author_id not between", value1, value2, "authorId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Integer value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Integer value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Integer value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Integer value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Integer> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Integer> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andHotValueIsNull() {
            addCriterion("hot_value is null");
            return (Criteria) this;
        }

        public Criteria andHotValueIsNotNull() {
            addCriterion("hot_value is not null");
            return (Criteria) this;
        }

        public Criteria andHotValueEqualTo(Double value) {
            addCriterion("hot_value =", value, "hotValue");
            return (Criteria) this;
        }

        public Criteria andHotValueNotEqualTo(Double value) {
            addCriterion("hot_value <>", value, "hotValue");
            return (Criteria) this;
        }

        public Criteria andHotValueGreaterThan(Double value) {
            addCriterion("hot_value >", value, "hotValue");
            return (Criteria) this;
        }

        public Criteria andHotValueGreaterThanOrEqualTo(Double value) {
            addCriterion("hot_value >=", value, "hotValue");
            return (Criteria) this;
        }

        public Criteria andHotValueLessThan(Double value) {
            addCriterion("hot_value <", value, "hotValue");
            return (Criteria) this;
        }

        public Criteria andHotValueLessThanOrEqualTo(Double value) {
            addCriterion("hot_value <=", value, "hotValue");
            return (Criteria) this;
        }

        public Criteria andHotValueIn(List<Double> values) {
            addCriterion("hot_value in", values, "hotValue");
            return (Criteria) this;
        }

        public Criteria andHotValueNotIn(List<Double> values) {
            addCriterion("hot_value not in", values, "hotValue");
            return (Criteria) this;
        }

        public Criteria andHotValueBetween(Double value1, Double value2) {
            addCriterion("hot_value between", value1, value2, "hotValue");
            return (Criteria) this;
        }

        public Criteria andHotValueNotBetween(Double value1, Double value2) {
            addCriterion("hot_value not between", value1, value2, "hotValue");
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