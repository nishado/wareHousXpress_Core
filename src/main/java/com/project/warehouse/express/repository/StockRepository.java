package com.project.warehouse.express.repository;

import com.project.warehouse.express.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long> {
}
