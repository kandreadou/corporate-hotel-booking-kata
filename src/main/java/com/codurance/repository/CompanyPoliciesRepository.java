package com.codurance.repository;

import com.codurance.model.CompanyPolicy;

public class CompanyPoliciesRepository extends AbstractRepository<CompanyPolicy> {

    private static CompanyPoliciesRepository singletonInstance;

    private CompanyPoliciesRepository() {
    }

    public static CompanyPoliciesRepository getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new CompanyPoliciesRepository();
        }
        return singletonInstance;
    }
}
