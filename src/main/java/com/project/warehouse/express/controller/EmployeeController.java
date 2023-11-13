package com.project.warehouse.express.controller;

import com.project.warehouse.express.entity.Employees;
import com.project.warehouse.express.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/apis")
public class EmployeeController {

    @Autowired
    public EmployeeService employeeService;

    @CrossOrigin
    @GetMapping(value = "/getEmployeeDetails")
    public List<Employees> getEmployeesDetails(){
        return employeeService.getAllEmployees();
    }



}
