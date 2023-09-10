package com.project.warehouse.express.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user_screen", uniqueConstraints = @UniqueConstraint(columnNames = "user_id"))
public class UserScreen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_id", nullable = false)
    private short userId;

    @OneToOne(mappedBy = "userScreen")
    private Users users;

    @Column(name = "dashboard", nullable = false)
    private boolean dashboard;

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

    @Column(name = "clients", nullable = false)
    private boolean clients;

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

    public short getUserId() {
        return userId;
    }

    public void setUserId(short userId) {
        this.userId = userId;
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

    public boolean isClients() {
        return clients;
    }

    public void setClients(boolean clients) {
        this.clients = clients;
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
}
