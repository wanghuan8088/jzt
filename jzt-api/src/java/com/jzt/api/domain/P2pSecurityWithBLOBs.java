package com.jzt.api.domain;

public class P2pSecurityWithBLOBs extends P2pSecurity {
    private String emergencyFunds;

    private String riskReserveRule;

    private String riskReserveInstitution;

    private String thirdPaymentInstitution;

    private String custodianInstitutionTuo;

    public String getEmergencyFunds() {
        return emergencyFunds;
    }

    public void setEmergencyFunds(String emergencyFunds) {
        this.emergencyFunds = emergencyFunds;
    }

    public String getRiskReserveRule() {
        return riskReserveRule;
    }

    public void setRiskReserveRule(String riskReserveRule) {
        this.riskReserveRule = riskReserveRule;
    }

    public String getRiskReserveInstitution() {
        return riskReserveInstitution;
    }

    public void setRiskReserveInstitution(String riskReserveInstitution) {
        this.riskReserveInstitution = riskReserveInstitution;
    }

    public String getThirdPaymentInstitution() {
        return thirdPaymentInstitution;
    }

    public void setThirdPaymentInstitution(String thirdPaymentInstitution) {
        this.thirdPaymentInstitution = thirdPaymentInstitution;
    }

    public String getCustodianInstitutionTuo() {
        return custodianInstitutionTuo;
    }

    public void setCustodianInstitutionTuo(String custodianInstitutionTuo) {
        this.custodianInstitutionTuo = custodianInstitutionTuo;
    }
}