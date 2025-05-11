package com.project.warehouse.express.controller;

import com.project.warehouse.express.dto.UserPrivilegesDto;
import com.project.warehouse.express.dto.UserScreenDto;
import com.project.warehouse.express.dto.UsersDto;
import org.springframework.web.bind.annotation.*;
import com.project.warehouse.express.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
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

    @GetMapping(
            value = "/getUserDetailsWithUsername",
            produces = "application/json"
    )
    public List<UsersDto> getUserDetailsWithUsername(
            @RequestParam String username
    ) {
        return userService.getUserDetailsWithUsername(username);
    }

    @GetMapping(
            value = "/getUserDetailsWithEmpCode",
            produces = "application/json"
    )
    public List<UsersDto> getUserDetailsWithEmpCode(
            @RequestParam String empCode
    ) {
        return userService.getUserDetailsWithEmpCode(empCode);
    }

    @GetMapping(
            value = "/getAPrivilegeForUser",
            produces = "application/json"
    )
    public List<UserPrivilegesDto> getAPrivilegeForUser(
            @RequestParam String userName,
            @RequestParam String privilegeName
    ) {
        return userService.getAPrivilegeForUser(userName, privilegeName);
    }

    @GetMapping(
            value = "/getAllPrivilegesForUser",
            produces = "application/json"
    )
    public List<UserPrivilegesDto> getAllPrivilegesForUser(
            @RequestParam String empCode
    ) {
        return userService.getAllPrivilegesForUser(empCode);
    }

}