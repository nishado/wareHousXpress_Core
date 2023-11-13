package com.project.warehouse.express.service;

import com.project.warehouse.express.entity.Employees;
import com.project.warehouse.express.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    public EmployeeRepository employeeRepository;
    public List<Employees> getAllEmployees() {
        return employeeRepository.findAll();
    }

}
