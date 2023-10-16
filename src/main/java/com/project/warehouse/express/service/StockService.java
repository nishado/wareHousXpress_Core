package com.project.warehouse.express.service;

import com.project.warehouse.express.entity.Stock;

public interface StockService extends CrudServices<Stock, Long> {
    Stock create(Stock entity);
}
