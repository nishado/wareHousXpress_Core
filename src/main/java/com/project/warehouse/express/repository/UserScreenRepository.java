package com.project.warehouse.express.repository;

import com.project.warehouse.express.entity.UserScreen;
import com.project.warehouse.express.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserScreenRepository extends JpaRepository<UserScreen, Integer> {
    List<UserScreen> findByUser(Users user);
}
