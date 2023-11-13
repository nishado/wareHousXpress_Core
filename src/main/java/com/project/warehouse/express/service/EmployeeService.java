package com.project.warehouse.express.service;

import com.project.warehouse.express.dto.EmployeesDto;
import com.project.warehouse.express.dto.UserScreenDto;
import com.project.warehouse.express.entity.Employees;
import com.project.warehouse.express.entity.UserScreens;
import com.project.warehouse.express.entity.Users;
import com.project.warehouse.express.repository.EmployeeRepository;
import com.project.warehouse.express.repository.UserScreensRepository;
import com.project.warehouse.express.repository.UsersRepository;
import com.project.warehouse.express.util.DtoMapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    public EmployeeRepository employeeRepository;
    @Autowired
    public UsersRepository usersRepository;
    @Autowired
    public UserScreensRepository userScreensRepository;

    public List<EmployeesDto> getEmployeeDetails() {
        List<EmployeesDto> dtoList = new ArrayList<>();
        List<Employees> employees = employeeRepository.findAll();
        for(Employees emp : employees) {
            dtoList.add(DtoMapperUtils.mapEmployeesDto(emp, employeeRepository));
        }
        return dtoList;
    }

    public List<UserScreenDto> getScreensForEmployee(String empCode) {
        List<UserScreenDto> dtoList = new ArrayList<>();
        Optional<Employees> employee = employeeRepository.findByEmpCode(empCode);
        employee.ifPresent(emp -> {
            Optional<Users> user = usersRepository.findByEmpId(emp);
            user.ifPresent(usr -> {
                List<UserScreens> screens = userScreensRepository.findByUser(usr);
                UserScreenDto dto = DtoMapperUtils.mapUserScreenDto(screens.get(0));
                dtoList.add(dto);
            });
        });
        return dtoList;
    }

}
