package com.jzt.api.domain;

public class CompanyWithBLOBs extends Company {
    private String businessScope;

    private String registeredCapitalChange;

    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
    }

    public String getRegisteredCapitalChange() {
        return registeredCapitalChange;
    }

    public void setRegisteredCapitalChange(String registeredCapitalChange) {
        this.registeredCapitalChange = registeredCapitalChange;
    }
}