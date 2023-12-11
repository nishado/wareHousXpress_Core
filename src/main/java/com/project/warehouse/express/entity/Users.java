package com.project.warehouse.express.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_by", nullable = false)
    private Long createBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date", nullable = false)
    private Date createDate;

    @Column(name = "edit_by", nullable = false)
    private Long editBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "edit_date", nullable = false)
    private Date editDate;

    @Column(name = "user_code", nullable = false, unique = true)
    private int userCode;

    @Column(name = "password", nullable = false, length = 20)
    private String password;

    @Column(name = "user_name", length = 50, nullable = false, unique = true)
    private String username;

    @Column(name = "emp_id", unique = true, nullable = false)
    private Long empId;

}


