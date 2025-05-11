package com.project.warehouse.express.controller;


import com.project.warehouse.express.dto.BasicDto;
import com.project.warehouse.express.service.NationalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/nationalities")
public class NationalityController {

    private final NationalityService nationalityService;

    @Autowired
    public NationalityController(NationalityService nationalityService) {
        this.nationalityService = nationalityService;
    }

    @GetMapping("/getEmployeeNationalities")
    public List<BasicDto> getAllCountries(){
        return nationalityService.getAllNationalities();
    }
}
