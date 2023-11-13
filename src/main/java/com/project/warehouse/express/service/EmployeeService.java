package com.project.warehouse.express.service;

import com.project.warehouse.express.dto.EmployeesDto;
import com.project.warehouse.express.entity.Employees;
import com.project.warehouse.express.repository.EmployeeRepository;
import com.project.warehouse.express.util.DtoMapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    public EmployeeRepository employeeRepository;
    public List<EmployeesDto> getEmployeeDetails() {
        List<EmployeesDto> dtoList = new ArrayList<>();
        List<Employees> employees = employeeRepository.findAll();
        for(Employees emp : employees) {
            dtoList.add(DtoMapperUtils.mapEmployeesDto(emp, employeeRepository));
        }
        return dtoList;
    }

}
