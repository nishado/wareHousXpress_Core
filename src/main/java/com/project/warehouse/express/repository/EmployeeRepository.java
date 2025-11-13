package com.project.warehouse.express.repository;

import com.project.warehouse.express.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employees, Long> {

    Optional<Employees> findByEmpCode(String empCode);

    @Query(value = "select * from marks where subject=?1 and std=?2 order by score", nativeQuery = true)
    List<Employees> getTopStudents(String subject, int std);
}
