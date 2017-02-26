package com.jzt.api.domain;

import java.util.Date;

public class Exposure {
    private Integer eid;

    private String title;

    private String productName;

    private String productUrl;

    private Integer agreeCnt;

    private Integer commentCnt;

    private Integer clickCnt;

    private Date createdDate;

    private Date lastUpdate;

    private String lastCommentEditor;

    private Date lastComment;

    private Date checkedDate;

    private Integer authorId;

    private Integer adminId;

    private Integer state;

    private Double hotValue;

    private String content;

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public Integer getAgreeCnt() {
        return agreeCnt;
    }

    public void setAgreeCnt(Integer agreeCnt) {
        this.agreeCnt = agreeCnt;
    }

    public Integer getCommentCnt() {
        return commentCnt;
    }

    public void setCommentCnt(Integer commentCnt) {
        this.commentCnt = commentCnt;
    }

    public Integer getClickCnt() {
        return clickCnt;
    }

    public void setClickCnt(Integer clickCnt) {
        this.clickCnt = clickCnt;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getLastCommentEditor() {
        return lastCommentEditor;
    }

    public void setLastCommentEditor(String lastCommentEditor) {
        this.lastCommentEditor = lastCommentEditor;
    }

    public Date getLastComment() {
        return lastComment;
    }

    public void setLastComment(Date lastComment) {
        this.lastComment = lastComment;
    }

    public Date getCheckedDate() {
        return checkedDate;
    }

    public void setCheckedDate(Date checkedDate) {
        this.checkedDate = checkedDate;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Double getHotValue() {
        return hotValue;
    }

    public void setHotValue(Double hotValue) {
        this.hotValue = hotValue;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}