package com.project.warehouse.express.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class StockDto {

    private String batchCode;
    private String productCode;
    private String productName;
    private String unit;
    private Double quantity;
    private Double unitCost;
    private Double unitPrice;
    private String editBy;
    private Date editDate;
    private String createBy;
    private Date createDate;

}
