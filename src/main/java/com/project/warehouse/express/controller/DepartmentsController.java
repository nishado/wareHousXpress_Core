package com.project.warehouse.express.controller;


import com.project.warehouse.express.dto.BasicDto;
import com.project.warehouse.express.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/departments")
public class DepartmentsController {

    @Autowired
    DepartmentService departmentService;

    @GetMapping("/getDepartments")
    public List<BasicDto> getAllDepartments(){
        return departmentService.getAllDepartments();
    }
}
