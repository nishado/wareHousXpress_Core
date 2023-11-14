package com.project.warehouse.express.controller;

import com.project.warehouse.express.dto.BasicDto;
import com.project.warehouse.express.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/statuses/getEmployeeStatuses")
public class StatusController {
    @Autowired
    public StatusService statusService;

    @GetMapping
    public List<BasicDto> getAllStatuses(){
        return statusService.getAllStatuses();
    }
}
