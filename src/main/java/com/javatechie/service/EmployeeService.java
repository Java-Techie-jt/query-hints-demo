package com.javatechie.service;

import com.javatechie.entity.Employee;
import com.javatechie.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Long fetchEmployees(){
        return repository.count();
    }

    public List<Employee> getEmployeesBySalary(double salary){
        return repository.findEmployeesWithSalaryGreaterThan(salary);
    }
}
