package com.project.warehouse.express.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class EmployeesDto {
    private String firstName;
    private String lastName;
    private String mobile1;
    private String mobile2;
    private String nationality;
    private String department;
    private String status;
    private String dob;
    private Date joinedDate;
    private int createdBy;
    private Date createdDate;

    public EmployeesDto() {
    }

    public EmployeesDto(String firstName, String lastName, String mobile1, String mobile2, String nationality, String department, String status, String dob, Date joinedDate, int createdBy, Date createdDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile1 = mobile1;
        this.mobile2 = mobile2;
        this.nationality = nationality;
        this.department = department;
        this.status = status;
        this.dob = dob;
        this.joinedDate = joinedDate;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
    }


}

