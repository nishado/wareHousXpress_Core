package com.project.warehouse.express.service;

import com.project.warehouse.express.entity.Employees;
import com.project.warehouse.express.entity.Stocks;

import java.util.List;

public interface CrudServices<T, ID> {
    T create(T entity);
    T findById(ID id);
    List<T> findAll();
    T update(T entity);
    void delete(ID id);
}

