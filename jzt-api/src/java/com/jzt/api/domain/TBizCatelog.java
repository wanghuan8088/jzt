package com.jzt.api.domain;

import java.util.Date;

public class TBizCatelog extends BaseDomain {
    private Integer id;

    private Integer ownerId;

    private String catelog;

    private String type;

    private String sectype;

    private String bizName;

    private String bizDesc;

    private String bizAttr;

    private String bizAttr1;

    private String bizAttr2;

    private String bizAttr3;

    private String bizPic;

    private Date createtime;

    private Date updatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getCatelog() {
        return catelog;
    }

    public void setCatelog(String catelog) {
        this.catelog = catelog;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSectype() {
        return sectype;
    }

    public void setSectype(String sectype) {
        this.sectype = sectype;
    }

    public String getBizName() {
        return bizName;
    }

    public void setBizName(String bizName) {
        this.bizName = bizName;
    }

    public String getBizDesc() {
        return bizDesc;
    }

    public void setBizDesc(String bizDesc) {
        this.bizDesc = bizDesc;
    }

    public String getBizAttr() {
        return bizAttr;
    }

    public void setBizAttr(String bizAttr) {
        this.bizAttr = bizAttr;
    }

    public String getBizAttr1() {
        return bizAttr1;
    }

    public void setBizAttr1(String bizAttr1) {
        this.bizAttr1 = bizAttr1;
    }

    public String getBizAttr2() {
        return bizAttr2;
    }

    public void setBizAttr2(String bizAttr2) {
        this.bizAttr2 = bizAttr2;
    }

    public String getBizAttr3() {
        return bizAttr3;
    }

    public void setBizAttr3(String bizAttr3) {
        this.bizAttr3 = bizAttr3;
    }

    public String getBizPic() {
        return bizPic;
    }

    public void setBizPic(String bizPic) {
        this.bizPic = bizPic;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}