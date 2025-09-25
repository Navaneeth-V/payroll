package com.employee.payroll.service;

import com.employee.payroll.model.Employee;
import com.employee.payroll.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeService.class);

    EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee addEmployee(Employee employee) {
        LOGGER.info("Adding employee {}", employee);
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
            LOGGER.info("Updating employee {}", employee);
            return employeeRepository.save(employee);
        } else {
            LOGGER.info("Employee with id {} not found", employee.getId());
            return null;
        }
    }

    public void deleteEmployeeById(String id) {
        this.employeeRepository.deleteById(id);
        LOGGER.info("Employee with id {} deleted", id);
    }

}
