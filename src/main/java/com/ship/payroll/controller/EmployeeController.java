package com.ship.payroll.controller;

import com.ship.payroll.model.Employee;
import com.ship.payroll.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    public Iterable<Employee> getEmployees() {
        // sample API
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable String id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @PutMapping("/employee/{id}")
    public Employee updateEmployee(@PathVariable String id, @RequestBody Employee employee) {
        employee.setId(id);
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/employee/{id}")
    public ResponseEntity<Object> deleteEmployeeById(@PathVariable String id) {
        employeeService.deleteEmployeeById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
