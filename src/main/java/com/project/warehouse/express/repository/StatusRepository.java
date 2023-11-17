package com.project.warehouse.express.repository;

import com.project.warehouse.express.entity.Statuses;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StatusRepository extends JpaRepository<Statuses, Long> {

    Optional<Statuses> findByName(String status);
}
