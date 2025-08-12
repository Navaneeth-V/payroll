package com.employee.payroll.service;

import com.employee.payroll.model.Employee;
import com.employee.payroll.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee addEmployee(Employee employee) {
        return this.employeeRepository.save(employee);
    }

    public Iterable<Employee> getAllEmployees() {
        return this.employeeRepository.findAll();
    }

    public Employee getEmployeeById(String id) {
        return this.employeeRepository.findById(id).orElse(null);
    }

    @Transactional
    public Employee updateEmployee(Employee employee) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(String.valueOf(employee.getId()));

        if(optionalEmployee.isPresent()) {
            return employeeRepository.save(employee);
        } else {
            return null;
        }
    }

    public void deleteEmployeeById(String id) {
        this.employeeRepository.deleteById(id);
    }

}
