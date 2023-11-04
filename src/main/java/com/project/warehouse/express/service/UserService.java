package com.project.warehouse.express.service;

import com.project.warehouse.express.dto.UserScreenDto;
import com.project.warehouse.express.entity.Users;
import com.project.warehouse.express.entity.UserScreens;
import com.project.warehouse.express.repository.UsersRepository;
import com.project.warehouse.express.repository.UserScreensRepository;
import com.project.warehouse.express.util.DtoMapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final UsersRepository usersRepository;
    private final UserScreensRepository userScreensRepository;

    @Autowired
    public UserService(UsersRepository usersRepository, UserScreensRepository userScreensRepository) {
        this.usersRepository = usersRepository;
        this.userScreensRepository = userScreensRepository;
    }

    public List<UserScreenDto> authorizeUser(String username, String password) {
        List<UserScreenDto> dtoList = new ArrayList<>();
        Users user = usersRepository.findByUsernameAndPassword(username, password);
        if (user != null) {
            List<UserScreens> screens = userScreensRepository.findByUser(user);
            UserScreenDto dto = DtoMapperUtil.mapUserScreenDto(screens.get(0));
            dtoList.add(dto);
        }
        return dtoList;
    }
}
