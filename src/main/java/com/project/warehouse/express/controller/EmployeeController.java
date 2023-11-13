package com.project.warehouse.express.controller;

import com.project.warehouse.express.dto.EmployeesDto;
import com.project.warehouse.express.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin
@RestController
@RequestMapping ("/employees")
public class EmployeeController {

    @Autowired
    public EmployeeService employeeService;

    @GetMapping(value = "/getEmployeeDetails")
    public List<EmployeesDto> getEmployeeDetails(){
        return employeeService.getEmployeeDetails();
    }



}

