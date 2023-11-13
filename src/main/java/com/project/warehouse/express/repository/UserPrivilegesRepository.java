package com.project.warehouse.express.repository;

import com.project.warehouse.express.entity.UserPrivileges;
import com.project.warehouse.express.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface UserPrivilegesRepository extends JpaRepository<UserPrivileges, Integer> {

    Optional<UserPrivileges> findByUserIdAndPrivilegeName(Users user, String privilegeName);
    List<UserPrivileges> findAllByUserId(Users user);

}
