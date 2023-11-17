package com.project.warehouse.express.repository;

import com.project.warehouse.express.entity.Departments;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DepartmentsRepository extends JpaRepository<Departments, Long> {

    Departments findByName(String name);

}
