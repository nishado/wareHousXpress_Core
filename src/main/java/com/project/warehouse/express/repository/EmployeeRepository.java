package com.project.warehouse.express.repository;

import com.project.warehouse.express.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employees, Long> {

    Optional<Employees> findByEmpCode(String empCode);

}
