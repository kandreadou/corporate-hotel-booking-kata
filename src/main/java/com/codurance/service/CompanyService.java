package com.codurance.service;

import com.codurance.model.Employee;
import com.codurance.repository.EmployeeRepository;

public class CompanyService {

    private EmployeeRepository repo;

    public CompanyService(){
        this.repo = EmployeeRepository.getInstance();
    }

    void addEmployee(String companyId, String employeeId) {
        this.repo.save(employeeId, new Employee(employeeId, companyId));
    }

    void deleteEmployee(String employeeId) {
        this.repo.delete(employeeId);
    }
}
