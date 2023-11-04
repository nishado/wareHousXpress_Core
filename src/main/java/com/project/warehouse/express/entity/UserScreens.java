package com.project.warehouse.express.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "user_screens", uniqueConstraints = @UniqueConstraint(columnNames = "user_id"))
public class UserScreens extends BaseEntity {

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private Users user;

    @Column(name = "dashboard", nullable = false)
    private boolean dashboard;

    @Column(name = "stock", nullable = false)
    private boolean stock;

    @Column(name = "sales", nullable = false)
    private boolean sales;

    @Column(name = "employees", nullable = false)
    private boolean employees;

    @Column(name = "attendance", nullable = false)
    private boolean attendance;

    @Column(name = "salary_master", nullable = false)
    private boolean salaryMaster;

    @Column(name = "salary_payout", nullable = false)
    private boolean salaryPayout;

    @Column(name = "leave_salary", nullable = false)
    private boolean leaveSalary;

    @Column(name = "customers", nullable = false)
    private boolean customers;

    @Column(name = "gratuity", nullable = false)
    private boolean gratuity;

}
