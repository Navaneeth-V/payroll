package com.employee.payroll.model;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

import java.util.Set;

public class EmployeeValidationTest {

    private Validator validator;

//    @Before
//    void setUp() {
//        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
//        validator = factory.getValidator();
//    }

//    @Test
//    void validEmployee_hasNoViolations() {
//        Employee e = new Employee();
//        e.setName("John Doe");
//        e.setSalary(20000);
//        e.setDepartment("IT");
//        e.setDesignation("Developer");
//        e.setDepartmentId("D01");
//
//        Set<ConstraintViolation<Employee>> violations = validator.validate(e);
//        assertTrue(violations.isEmpty(), "Expected no validation violations for a valid employee");
//    }
//
//    @Test
//    void salaryBelowMin_shouldFailValidation() {
//        Employee e = new Employee();
//        e.setName("John Doe");
//        e.setSalary(5000); // ❌ invalid, less than 10000
//        e.setDepartment("IT");
//        e.setDesignation("Developer");
//        e.setDepartmentId("D01");
//
//        Set<ConstraintViolation<Employee>> violations = validator.validate(e);
//        assertFalse(violations.isEmpty());
//        assertTrue(violations.stream()
//                .anyMatch(v -> v.getPropertyPath().toString().equals("salary")
//                        && v.getMessage().contains("Salary cannot be less")));
//    }
//
//    @Test
//    void emptyName_shouldFailValidation() {
//        Employee e = new Employee();
//        e.setName(""); // ❌ invalid
//        e.setSalary(20000);
//        e.setDepartment("IT");
//        e.setDesignation("Developer");
//        e.setDepartmentId("D01");
//
//        Set<ConstraintViolation<Employee>> violations = validator.validate(e);
//        assertFalse(violations.isEmpty());
//        assertTrue(violations.stream()
//                .anyMatch(v -> v.getPropertyPath().toString().equals("name")
//                        && v.getMessage().contains("Name cannot be empty")));
//    }
}
