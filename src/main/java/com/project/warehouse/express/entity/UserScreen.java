package com.project.warehouse.express.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "user_screen", uniqueConstraints = @UniqueConstraint(columnNames = "user_id"))
public class UserScreen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "user_code", nullable = false)
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

    @Column(name = "edit_by", length = 20)
    private String editBy;

    @Column(name = "edit_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date editDate;

    @Column(name = "create_by", length = 20)
    private String createBy;

    @Column(name = "create_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;


    // Getter and Setter methods

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public boolean isDashboard() {
        return dashboard;
    }

    public void setDashboard(boolean dashboard) {
        this.dashboard = dashboard;
    }

    public boolean isEmployees() {
        return employees;
    }

    public void setEmployees(boolean employees) {
        this.employees = employees;
    }

    public boolean isAttendance() {
        return attendance;
    }

    public void setAttendance(boolean attendance) {
        this.attendance = attendance;
    }

    public boolean isSalaryMaster() {
        return salaryMaster;
    }

    public void setSalaryMaster(boolean salaryMaster) {
        this.salaryMaster = salaryMaster;
    }

    public boolean isSalaryPayout() {
        return salaryPayout;
    }

    public void setSalaryPayout(boolean salaryPayout) {
        this.salaryPayout = salaryPayout;
    }

    public boolean isLeaveSalary() {
        return leaveSalary;
    }

    public void setLeaveSalary(boolean leaveSalary) {
        this.leaveSalary = leaveSalary;
    }

    public boolean isCustomers() {
        return customers;
    }

    public void setCustomers(boolean customers) {
        this.customers = customers;
    }

    public boolean isGratuity() {
        return gratuity;
    }

    public void setGratuity(boolean gratuity) {
        this.gratuity = gratuity;
    }

    public String getEditBy() {
        return editBy;
    }

    public void setEditBy(String editBy) {
        this.editBy = editBy;
    }

    public Date getEditDate() {
        return editDate;
    }

    public void setEditDate(Date editDate) {
        this.editDate = editDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public boolean isStock() { return stock; }

    public void setStock(boolean stock) { this.stock = stock; }

    public boolean isSales() { return sales; }

    public void setSales(boolean sales) { this.sales = sales; }

}
