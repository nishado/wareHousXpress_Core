package com.project.warehouse.express.dto;

import java.util.Date;

public class UserScreenDto {
    private int id;
    private int userId;
    private String editBy;
    private Date editDate;
    private String createBy;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public boolean isDashboard() {
        return dashboard;
    }

    public void setDashboard(boolean dashboard) {
        this.dashboard = dashboard;
    }

    public boolean isStock() {
        return stock;
    }

    public void setStock(boolean stock) {
        this.stock = stock;
    }

    public boolean isSales() {
        return sales;
    }

    public void setSales(boolean sales) {
        this.sales = sales;
    }

    public boolean isCustomers() {
        return customers;
    }

    public void setCustomers(boolean customers) {
        this.customers = customers;
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

    public boolean isGratuity() {
        return gratuity;
    }

    public void setGratuity(boolean gratuity) {
        this.gratuity = gratuity;
    }
}
