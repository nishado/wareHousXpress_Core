package com.project.warehouse.express.util.mappers;

import com.project.warehouse.express.dto.StockDto;
import com.project.warehouse.express.entity.StockTotal;


public class StockMapperUtils {

    private StockMapperUtils() {
        throw new IllegalStateException("Utility class instantiated.");
    }

    public static StockDto mapStockTotalDto(StockTotal stock) {

        StockDto dto = new StockDto();
        dto.setBatchCode(stock.getBatchId().getBatchCode());
        dto.setProductCode(stock.getBatchId().getProductId().getCode());
        dto.setProductName(stock.getBatchId().getProductId().getName());
        dto.setUnit(stock.getBatchId().getUnitId().getCode());
        dto.setQuantity(stock.getBatchId().getQuantity());
        dto.setUnitCost(stock.getBatchId().getUnitCost());
        dto.setUnitPrice(stock.getBatchId().getUnitPrice());
        dto.setEditBy(stock.getEditBy().getUsername());
        dto.setEditDate(stock.getEditDate());
        dto.setCreateBy(stock.getCreateBy().getUsername());
        dto.setCreateDate(stock.getCreateDate());
        return dto;

    }

}
