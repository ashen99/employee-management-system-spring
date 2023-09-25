package com.ashen.employeeManagement.service;

import com.ashen.employeeManagement.model.Employee;
import com.ashen.employeeManagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    
}
