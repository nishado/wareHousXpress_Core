package com.project.warehouse.express.repository;

import com.project.warehouse.express.entity.Statuses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Statuses, Long> {
}
