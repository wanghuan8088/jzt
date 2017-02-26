package com.jzt.api.domain;

import java.util.Date;

public class CompanyStructure {
    private Integer id;

    private Integer companyId;

    private Integer staffNuk;

    private Integer branchNum;

    private String creditInstitution;

    private Date createTime;

    private Date updateTime;

    private Integer isDelete;

    private String companyStruc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getStaffNuk() {
        return staffNuk;
    }

    public void setStaffNuk(Integer staffNuk) {
        this.staffNuk = staffNuk;
    }

    public Integer getBranchNum() {
        return branchNum;
    }

    public void setBranchNum(Integer branchNum) {
        this.branchNum = branchNum;
    }

    public String getCreditInstitution() {
        return creditInstitution;
    }

    public void setCreditInstitution(String creditInstitution) {
        this.creditInstitution = creditInstitution;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getCompanyStruc() {
        return companyStruc;
    }

    public void setCompanyStruc(String companyStruc) {
        this.companyStruc = companyStruc;
    }
}