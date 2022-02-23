package com.codurance.model;

public class Employee {

    private String id;
    private String companyId;

    public Employee(String id, String companyId){
        this.id = id;
        this.companyId = companyId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
}
