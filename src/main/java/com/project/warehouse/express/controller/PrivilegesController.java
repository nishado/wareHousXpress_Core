package com.project.warehouse.express.controller;

import com.project.warehouse.express.dto.BasicDto;
import com.project.warehouse.express.service.PrivilegesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/privileges")

public class PrivilegesController {
    @Autowired
    public PrivilegesService privilegesService;

    @GetMapping("/getPrivileges")
    public List<BasicDto> findAllPrivileges(){
        return privilegesService.getAllPrivileges();
    }
}
