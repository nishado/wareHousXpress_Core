package com.project.warehouse.express.service;

import com.project.warehouse.express.dto.UserPrivilegesDto;
import com.project.warehouse.express.dto.UserScreenDto;
import com.project.warehouse.express.dto.UsersDto;
import com.project.warehouse.express.entity.Employees;
import com.project.warehouse.express.entity.UserPrivileges;
import com.project.warehouse.express.entity.Users;
import com.project.warehouse.express.entity.UserScreens;
import com.project.warehouse.express.repository.EmployeeRepository;
import com.project.warehouse.express.repository.UserPrivilegesRepository;
import com.project.warehouse.express.repository.UsersRepository;
import com.project.warehouse.express.repository.UserScreensRepository;
import com.project.warehouse.express.util.mapperUtils.UsersMapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UsersRepository usersRepository;
    @Autowired
    private UserScreensRepository userScreensRepository;
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private UserPrivilegesRepository userPrivilegesRepository;

    public List<UserScreenDto> authorizeUser(String username, String password) {
        List<UserScreenDto> dtoList = new ArrayList<>();
        Users user = usersRepository.findByUsernameAndPassword(username, password);
        if (user != null) {
            List<UserScreens> screens = userScreensRepository.findByUser(user);
            UserScreenDto dto = UsersMapperUtils.mapUserScreenDto(screens.get(0));
            dtoList.add(dto);
        }
        return dtoList;
    }

    public List<UsersDto> getUserDetailsWithUsername(String username) {
        List<UsersDto> dtoList = new ArrayList<>();
        Optional<Users> user = usersRepository.findOneByUsername(username);
        user.ifPresent(usr -> {
            UsersDto dto = UsersMapperUtils.mapUsersDto(usr, employeeRepository);
            dtoList.add(dto);
        });
        return dtoList;
    }

    public List<UsersDto> getUserDetailsWithEmpCode(String empCode) {
        List<UsersDto> dtoList = new ArrayList<>();
        Optional<Employees> employee = employeeRepository.findByEmpCode(empCode);
        employee.ifPresent(emp -> {
            Optional<Users> user = usersRepository.findByEmpId(emp);
            user.ifPresent(usr -> {
                UsersDto dto = UsersMapperUtils.mapUsersDto(usr, employeeRepository);
                dtoList.add(dto);
            });
        });
        return dtoList;
    }

    public List<UserPrivilegesDto> getAPrivilegeForUser(String userName, String privilegeName) {
        List<UserPrivilegesDto> dtoList = new ArrayList<>();
        Optional<Users> user = usersRepository.findOneByUsername(userName);
        user.ifPresent(usr -> {
            Optional<UserPrivileges> privileges = userPrivilegesRepository.findByUserIdAndPrivilegeName(usr, privilegeName);
            privileges.ifPresent(priv -> {
                UserPrivilegesDto dto = UsersMapperUtils.mapUserPrivilegesDto(priv, employeeRepository);
                dtoList.add(dto);
            });
        });
        return dtoList;
    }

    public List<UserPrivilegesDto> getAllPrivilegesForUser(String empCode) {
        List<UserPrivilegesDto> dtoList = new ArrayList<>();
        Optional<Employees> employee = employeeRepository.findByEmpCode(empCode);
        employee.ifPresent(emp -> {
            Optional<Users> user = usersRepository.findByEmpId(emp);
            user.ifPresent(usr -> {
                List<UserPrivileges> userPrivileges = userPrivilegesRepository.findAllByUserId(usr);
                for (UserPrivileges privilege : userPrivileges) {
                    UserPrivilegesDto dto = UsersMapperUtils.mapUserPrivilegesDto(privilege, employeeRepository);
                    dtoList.add(dto);
                }
            });
        });
        return dtoList;
    }

}
