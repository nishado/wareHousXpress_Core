package com.project.warehouse.express.service;

import com.project.warehouse.express.dto.StockDto;
import com.project.warehouse.express.entity.StockTotal;
import com.project.warehouse.express.repository.StockRepository;
import com.project.warehouse.express.util.mappers.StockMapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StockService {

    private final StockRepository stockRepository;

    @Autowired
    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public List<StockDto> getTotalStock() {
        List<StockDto> dtoList = new ArrayList<>();
        List<StockTotal> totalStock = stockRepository.findAll();
        for (StockTotal stock : totalStock) {
            dtoList.add(StockMapperUtils.mapStockTotalDto(stock));
        }
        return dtoList;
    }

}