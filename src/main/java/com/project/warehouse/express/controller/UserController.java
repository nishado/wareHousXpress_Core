package com.project.warehouse.express.controller;

import com.project.warehouse.express.dto.UserScreenDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.project.warehouse.express.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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
            produces = "application/json"
    )
    public List<UserScreenDto> authorizeUser(
            @RequestParam String username,
            @RequestParam String password
    ) {
        return userService.authorizeUser(username, password);
    }
}