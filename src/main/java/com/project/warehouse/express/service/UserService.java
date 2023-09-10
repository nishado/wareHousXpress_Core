package com.project.warehouse.express.service;

import com.project.warehouse.express.entity.Users;
import com.project.warehouse.express.entity.UserScreen;
import com.project.warehouse.express.repository.UsersRepository;
import com.project.warehouse.express.repository.UserScreenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final UsersRepository usersRepository;
    private final UserScreenRepository userScreenRepository;

    @Autowired
    public UserService(UsersRepository usersRepository, UserScreenRepository userScreenRepository) {
        this.usersRepository = usersRepository;
        this.userScreenRepository = userScreenRepository;
    }

    public List<UserScreen> authorizeUser(String userName, String password) {
        List<UserScreen> screens = new ArrayList<>();
        Users user = usersRepository.findByUserNameAndPassword(userName, password);
        if (user != null) {
            screens = userScreenRepository.findAll(); //
        }
        return screens;
    }
}
