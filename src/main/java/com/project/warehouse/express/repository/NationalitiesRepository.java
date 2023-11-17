package com.project.warehouse.express.repository;

import com.project.warehouse.express.entity.Nationalities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NationalitiesRepository extends JpaRepository<Nationalities, Long> {

    Nationalities findByName(String name);

}
