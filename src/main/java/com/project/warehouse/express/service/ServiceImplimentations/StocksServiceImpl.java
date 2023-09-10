package com.project.warehouse.express.service.ServiceImplimentations;

import com.project.warehouse.express.entity.Stocks;
import com.project.warehouse.express.repository.StocksRepository;
import com.project.warehouse.express.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StocksServiceImpl implements StockService {
    private final StocksRepository stockRepository;

    @Autowired
    public StocksServiceImpl(StocksRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    @Override
    public Stocks create(Stocks entity) {
        return stockRepository.save(entity);
    }

    @Override
    public Stocks findById(Long id) {
        return stockRepository.findById(id).orElse(null);
    }

    @Override
    public List<Stocks> findAll() {
        return stockRepository.findAll();
    }

    @Override
    public Stocks update(Stocks entity) {
        return stockRepository.save(entity);
    }

    @Override
    public void delete(Long id) {
        stockRepository.deleteById(id);
    }
}