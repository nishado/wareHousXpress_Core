package com.project.warehouse.express.service.ServiceImplimentations;

import com.project.warehouse.express.entity.Employees;
import com.project.warehouse.express.repository.EmployeeRepository;
import com.project.warehouse.express.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employees create(Employees entity) {
        return employeeRepository.save(entity);
    }

    @Override
    public Employees findById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Employees> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employees update(Employees entity) {
        return employeeRepository.save(entity);
    }

    @Override
    public void delete(Long id) {
        employeeRepository.deleteById(id);
    }
}