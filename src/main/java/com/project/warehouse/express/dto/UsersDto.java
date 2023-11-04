package com.project.warehouse.express.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UsersDto {

    private long id;
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
}
