package com.project.warehouse.express.controller;

import com.project.warehouse.express.dto.EmployeesDto;
import com.project.warehouse.express.dto.UserScreenDto;
import com.project.warehouse.express.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@RestController
@RequestMapping ("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(value = "/getEmployeeDetails")
    public List<EmployeesDto> getEmployeeDetails(){
        return employeeService.getEmployeeDetails();
    }

    @GetMapping(
            value = "/getScreensForEmployee",
            produces = "application/json"
    )
    public List<UserScreenDto> getScreensForEmployee(
            @RequestParam String empCode
    ) {
        return employeeService.getScreensForEmployee(empCode);
    }


}

