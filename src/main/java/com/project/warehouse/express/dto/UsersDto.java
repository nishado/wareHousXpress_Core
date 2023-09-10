package com.project.warehouse.express.dto;

import java.util.Date;

public class UsersDto {

    private int id;
    private int userCd;
    private String password;
    private String name;
    private String editBy;
    private Date editDt;
    private String createBy;
    private Date createDate;
    private String empCode;

    public UsersDto() {
    }

    public UsersDto(int id, short userCd, String password, String name, String editBy, Date editDt, String createBy, Date createDate, String empCode) {
        this.id = id;
        this.userCd = userCd;
        this.password = password;
        this.name = name;
        this.editBy = editBy;
        this.editDt = editDt;
        this.createBy = createBy;
        this.createDate = createDate;
        this.empCode = empCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserCd() {
        return userCd;
    }

    public void setUserCd(int userCd) {
        this.userCd = userCd;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEditBy() {
        return editBy;
    }

    public void setEditBy(String editBy) {
        this.editBy = editBy;
    }

    public Date getEditDt() {
        return editDt;
    }

    public void setEditDt(Date editDt) {
        this.editDt = editDt;
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

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }
}
