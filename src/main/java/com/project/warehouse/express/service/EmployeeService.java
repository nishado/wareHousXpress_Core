package com.project.warehouse.express.service;

import com.project.warehouse.express.dto.EmployeesDto;
import com.project.warehouse.express.dto.UserScreenDto;
import com.project.warehouse.express.entity.*;
import com.project.warehouse.express.repository.*;
import com.project.warehouse.express.util.mappers.DtoMapperUtils;
import com.project.warehouse.express.util.mappers.EmployeeDtoMapperUtils;
import com.project.warehouse.express.util.mappers.UsersMapperUtils;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final UsersRepository usersRepository;
    private final UserScreensRepository userScreensRepository;
    private final StatusRepository statusRepository;
    private final DepartmentsRepository departmentsRepository;
    private final NationalitiesRepository nationalitiesRepository;

    private final EmployeeDtoMapperUtils employeeDtoMapperUtils;


    public List<EmployeesDto> getEmployeeDetails() {
        List<EmployeesDto> dtoList = new ArrayList<>();
        List<Employees> employees = employeeRepository.findAll();
        for(Employees emp : employees) {
            dtoList.add(EmployeeDtoMapperUtils.mapEmployeesDto(emp));
        }
        return dtoList;
    }

    public void createOrUpdateEmployee(EmployeesDto dto, boolean isNew) {
        if (isNew){
            Employees emp = employeeDtoMapperUtils.mapDtoToEmployees(dto,new Employees());
            emp.setCreateDate(Date.valueOf(LocalDate.now()));
            employeeRepository.save(emp);
        }
        else {
            Employees e = employeeRepository.findById(dto.getId()).orElseThrow(()->new RuntimeException("emp not found"));
            e.setEditDate(Date.valueOf(LocalDate.now()));
            employeeRepository.save(employeeDtoMapperUtils.mapDtoToEmployees(dto,e));
        }

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
    public Nationalities findNationalityByName(String nationalityName) {
        return nationalitiesRepository.findByName(nationalityName).orElseThrow(()->new RuntimeException("Nationality not found"));
    }

}
