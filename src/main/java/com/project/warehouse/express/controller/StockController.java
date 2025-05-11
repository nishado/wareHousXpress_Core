package com.project.warehouse.express.controller;

import com.project.warehouse.express.dto.StockDto;
import com.project.warehouse.express.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@RestController
@RequestMapping ("/stock")
public class StockController {

    private final StockService stockService;

    @Autowired
    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping(
            value = "/getTotalStock",
            produces = "application/json"
    )
    public List<StockDto> getTotalStock(){
        return stockService.getTotalStock();
    }

}

