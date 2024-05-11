package com.project.warehouse.express.repository;

import com.project.warehouse.express.entity.Nationalities;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NationalitiesRepository extends JpaRepository<Nationalities, Long> {

    Optional<Nationalities> findByName(String name);

}
