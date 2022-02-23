package com.codurance.repository;

import com.codurance.model.EmployeePolicy;

public class EmployeePoliciesRepository extends AbstractRepository<EmployeePolicy> {

    private static EmployeePoliciesRepository singletonInstance;

    private EmployeePoliciesRepository() {
    }

    public static EmployeePoliciesRepository getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new EmployeePoliciesRepository();
        }
        return singletonInstance;
    }
}
