package com.project.warehouse.express.service.ServiceImplimentations;

import com.project.warehouse.express.entity.Stock;
import com.project.warehouse.express.repository.StockRepository;
import com.project.warehouse.express.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StocksServiceImpl implements StockService {
    private final StockRepository stockRepository;

    @Autowired
    public StocksServiceImpl(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    @Override
    public Stock create(Stock entity) {
        return stockRepository.save(entity);
    }

    @Override
    public Stock findById(Long id) {
        return stockRepository.findById(id).orElse(null);
    }

    @Override
    public List<Stock> findAll() {
        return stockRepository.findAll();
    }

    @Override
    public Stock update(Stock entity) {
        return stockRepository.save(entity);
    }

    @Override
    public void delete(Long id) {
        stockRepository.deleteById(id);
    }
}