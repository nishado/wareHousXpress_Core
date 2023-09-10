package com.project.warehouse.express.dto;

import java.util.Date;

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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobile1() {
        return mobile1;
    }

    public void setMobile1(String mobile1) {
        this.mobile1 = mobile1;
    }

    public String getMobile2() {
        return mobile2;
    }

    public void setMobile2(String mobile2) {
        this.mobile2 = mobile2;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Date getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(Date joinedDate) {
        this.joinedDate = joinedDate;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}

