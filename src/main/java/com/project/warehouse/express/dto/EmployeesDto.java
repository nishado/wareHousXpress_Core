package com.project.warehouse.express.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class EmployeesDto {
    private Long id;
    private String empCode;
    private String name;
    private String mobile1;
    private String mobile2;
    private String department;
    private String status;
    private String nationality;
    private String birthDt;
    private String joinDt;
    private String editBy;
    private Date editDate;
    private String createBy;
    private Date createDate;
}

