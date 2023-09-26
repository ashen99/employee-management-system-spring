package com.ashen.employeeManagement.controller;

import com.ashen.employeeManagement.model.Employee;
import com.ashen.employeeManagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Employee addEmployee(@RequestBody Employee employee){
       return employeeService.addEmployee(employee);
    }

    @GetMapping
    public List<Employee> getEmployee(){
        return employeeService.findAllEmployee();
    }

    @PutMapping
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }

    public String deleteEmployee(@PathVariable String id){
        return employeeService.deleteEmployee(id);
    }



}
