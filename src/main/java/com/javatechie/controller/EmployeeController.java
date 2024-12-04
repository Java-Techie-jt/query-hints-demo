package com.javatechie.controller;

import com.javatechie.entity.Employee;
import com.javatechie.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/count")
    public ResponseEntity<String> getTotalEmployeeCount() {
        return ResponseEntity.ok("Total employees record counts =" + service.fetchEmployees());
    }

    @GetMapping("/salary/{amount}")
    public ResponseEntity<List<Employee>> getEmployeesBySalaryRange(@PathVariable double amount) {
        return ResponseEntity.ok(service.getEmployeesBySalary(amount));
    }
}
