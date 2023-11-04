package com.project.warehouse.express.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter

public class UserScreenDto {
    private long id;
    private long userId;
    private Long editBy;
    private Date editDate;
    private Long createBy;
    private Date createDate;
    private boolean dashboard;
    private boolean stock;
    private boolean sales;
    private boolean customers;
    private boolean employees;
    private boolean attendance;
    private boolean salaryMaster;
    private boolean salaryPayout;
    private boolean leaveSalary;
    private boolean gratuity;
}
