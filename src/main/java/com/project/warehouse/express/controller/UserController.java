package com.project.warehouse.express.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.project.warehouse.express.entity.UserScreen;
import com.project.warehouse.express.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(
            value = "/authorizeUser",
            produces = "application/json",
            consumes = "application/json"
    )
    public List<UserScreen> authorizeUser(
            @RequestParam String userName,
            @RequestParam String password
    ) {
        return userService.authorizeUser(userName, password);
    }
}