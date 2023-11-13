package com.project.warehouse.express.entity;


import com.project.warehouse.express.util.StringUtils;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter

@Entity
@Table(name = "employees")
public class Employees extends BaseEntity {

    @Column(name = "emp_code", unique = true, nullable = false, length = 30)
    private String empCode;

    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;

    @Column(name = "last_name", length = 50)
    private String lastName;

    @Column(name = "mobile_1", length = 30)
    private String mobile1;

    @Column(name = "mobile_2", length = 30)
    private String mobile2;

    @Column(name = "nationality", length = 30)
    private String nationality;

    @Column(name = "department", length = 50)
    private String department;

    @Column(name = "status", length = 30)
    private String status;

    @Column(name = "dob")
    @Temporal(TemporalType.DATE)
    private Date dob;

    @Column(name = "joined_date")
    @Temporal(TemporalType.DATE)
    private Date joinedDate;

    public String getName(){
        String name = firstName + " " + StringUtils.getStringValue(lastName);
        return name.trim();
    }

}
