package com.project.warehouse.express.repository;

import com.project.warehouse.express.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    Users findByUsernameAndPassword(String UserName, String password);
}
