package com.codurance.service;

import com.codurance.model.CompanyPolicy;
import com.codurance.model.EmployeePolicy;
import com.codurance.model.RoomType;
import com.codurance.repository.CompanyPoliciesRepository;
import com.codurance.repository.EmployeePoliciesRepository;
import com.codurance.repository.EmployeeRepository;

import java.util.List;

public class BookingPolicyService {

    public void setCompanyPolicy(String companyId, List<RoomType> roomTypes) {
        CompanyPoliciesRepository.getInstance().save(companyId, new CompanyPolicy(companyId, roomTypes));
    }

    public void setEmployeePolicy(String employeeId, List<RoomType> roomTypes) {
        EmployeePoliciesRepository.getInstance().save(employeeId, new EmployeePolicy(employeeId, roomTypes));
    }

    public boolean isBookingAllowed(String employeeId, RoomType roomType) {
        String companyId = EmployeeRepository.getInstance().get(employeeId).getCompanyId();
        boolean allowedByCompany = CompanyPoliciesRepository.getInstance().get(companyId).isAllowed(roomType);
        if (allowedByCompany) {
            return true;
        } else {
            return EmployeePoliciesRepository.getInstance().get(companyId).isAllowed(roomType);
        }
    }
}
