package com.codurance.service;

public interface CompanyService {

    void addEmployee(String companyId, String employeeId);

    void deleteEmployee(String employeeId);
}
