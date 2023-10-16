package com.project.warehouse.express.service;

import java.util.List;

public interface CrudServices<T, ID> {
    T create(T entity);
    T findById(ID id);
    List<T> findAll();
    T update(T entity);
    void delete(ID id);
}

