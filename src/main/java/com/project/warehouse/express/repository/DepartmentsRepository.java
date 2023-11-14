package com.project.warehouse.express.repository;

import com.project.warehouse.express.entity.Departments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentsRepository extends JpaRepository<Departments, Long> {
}
