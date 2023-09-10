package com.project.warehouse.express.repository;

import com.project.warehouse.express.entity.Stocks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StocksRepository extends JpaRepository<Stocks, Long> {
}
