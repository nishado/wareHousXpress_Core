package com.project.warehouse.express.controller;

import com.project.warehouse.express.dto.EmployeesDto;
import com.project.warehouse.express.dto.UserScreenDto;
import com.project.warehouse.express.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @GetMapping(value = "/getTopStudents")
    public List<EmployeesDto> getTopStudents(){
        return employeeService.getTopStudents();
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

    @PostMapping (
            value = "/saveEmployeeDetails",
            consumes = "application/json"
    )
    public ResponseEntity<String> saveOrUpdateEmployees(@RequestBody EmployeesDto emp){
        boolean isExisting = emp.getId() != null && emp.getId() > 0;
        employeeService.createOrUpdateEmployee(emp,!isExisting);
        String message = emp.getName() + " is added successfully with employee code: " + emp.getEmpCode();
        return ResponseEntity.ok(message);
    }


}

