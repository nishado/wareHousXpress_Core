package com.project.warehouse.express.repository;

import com.project.warehouse.express.entity.UserScreens;
import com.project.warehouse.express.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserScreensRepository extends JpaRepository<UserScreens, Integer> {
    List<UserScreens> findByUser(Users user);
}
