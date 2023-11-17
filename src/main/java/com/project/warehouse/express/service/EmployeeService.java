package com.project.warehouse.express.service;

import com.project.warehouse.express.dto.EmployeesDto;
import com.project.warehouse.express.dto.UserScreenDto;
import com.project.warehouse.express.entity.*;
import com.project.warehouse.express.repository.*;
import com.project.warehouse.express.util.mapperUtils.DtoMapperUtils;
import com.project.warehouse.express.util.mapperUtils.UsersMapperUtils;
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
    @Autowired
    public StatusRepository statusRepository;
    @Autowired
    public DepartmentsRepository departmentsRepository;
    @Autowired
    public NationalitiesRepository nationalitiesRepository;

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
                UserScreenDto dto = UsersMapperUtils.mapUserScreenDto(screens.get(0));
                dtoList.add(dto);
            });
        });
        return dtoList;
    }

    public Optional<Statuses> findStatusByName(String statusName) {
        return statusRepository.findByName(statusName);
    }

    public Departments findDepartmentByName(String departmentName) {
        return departmentsRepository.findByName(departmentName);
    }

    public Nationalities findNationalityByName(String nationalityName) {
        return nationalitiesRepository.findByName(nationalityName);
    }

}
