package com.project.warehouse.express.service;

import com.project.warehouse.express.entity.Stocks;

public interface StockService extends CrudServices<Stocks, Long> {
    Stocks create(Stocks entity);
}
