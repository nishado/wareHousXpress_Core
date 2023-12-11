package com.project.warehouse.express.service;

import com.project.warehouse.express.dto.EmployeesDto;
import com.project.warehouse.express.dto.UserScreenDto;
import com.project.warehouse.express.entity.*;
import com.project.warehouse.express.repository.*;
import com.project.warehouse.express.util.mappers.DtoMapperUtils;
import com.project.warehouse.express.util.mappers.UsersMapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final UsersRepository usersRepository;
    private final UserScreensRepository userScreensRepository;
    private final StatusRepository statusRepository;
    private final DepartmentsRepository departmentsRepository;
    private final NationalitiesRepository nationalitiesRepository;

    @Autowired
    public EmployeeService(
            EmployeeRepository employeeRepository,
            UsersRepository usersRepository,
            UserScreensRepository userScreensRepository,
            StatusRepository statusRepository,
            DepartmentsRepository departmentsRepository,
            NationalitiesRepository nationalitiesRepository
    ) {
        this.employeeRepository = employeeRepository;
        this.usersRepository = usersRepository;
        this.userScreensRepository = userScreensRepository;
        this.statusRepository = statusRepository;
        this.departmentsRepository = departmentsRepository;
        this.nationalitiesRepository = nationalitiesRepository;
    }

    public List<EmployeesDto> getEmployeeDetails() {
        List<EmployeesDto> dtoList = new ArrayList<>();
        List<Employees> employees = employeeRepository.findAll();
        for(Employees emp : employees) {
            dtoList.add(DtoMapperUtils.mapEmployeesDto(emp));
        }
        return dtoList;
    }

    public List<UserScreenDto> getScreensForEmployee(String empCode) {
        List<UserScreenDto> dtoList = new ArrayList<>();
        Optional<Employees> employee = employeeRepository.findByEmpCode(empCode);
        employee.ifPresent(emp -> {
            Optional<Users> user = usersRepository.findByEmpId(emp.getId());
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
