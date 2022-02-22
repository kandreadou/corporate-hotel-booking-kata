package com.codurance.service;

import com.codurance.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompanyServiceTest {

    /**
     * Employees should not be duplicated.
     */
    @Test
    void testNotDuplicated() {
        EmployeeRepository repo = EmployeeRepository.getInstance();
        CompanyService service = new CompanyService();
        service.addEmployee("Skilton", "John");
        int sizeBefore = repo.count();
        service.addEmployee("Hilton",  "John");
        int sizeAfter = repo.count();
        assertEquals(sizeBefore, sizeAfter);
    }
}
