package com.project.warehouse.express.repository;

import com.project.warehouse.express.entity.Employees;
import com.project.warehouse.express.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Integer> {

    Users findByUsernameAndPassword(String UserName, String password);
    Optional<Users> findByEmpId(Employees empId);
    Optional<Users> findOneByUsername(String UserName);

}
