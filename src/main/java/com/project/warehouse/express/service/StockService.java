package com.project.warehouse.express.service;

import com.project.warehouse.express.entity.StockTotal;

public interface StockService extends CrudServices<StockTotal, Long> {
    StockTotal create(StockTotal entity);
}
