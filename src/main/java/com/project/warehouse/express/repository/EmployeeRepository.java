package com.project.warehouse.express.repository;

import com.project.warehouse.express.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employees, Long> {
}
