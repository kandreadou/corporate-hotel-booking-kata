package com.codurance.repository;

import com.codurance.model.Employee;

public class EmployeeRepository extends AbstractRepository<Employee> {

    private static EmployeeRepository singletonInstance;

    private EmployeeRepository() {
    }

    public static EmployeeRepository getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new EmployeeRepository();
        }
        return singletonInstance;
    }
}
