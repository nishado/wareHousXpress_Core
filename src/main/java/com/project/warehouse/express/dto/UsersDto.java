package com.project.warehouse.express.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UsersDto {

    private long id;
    private int userId;
    private String password;
    private String name;
    private String editBy;
    private Date editDate;
    private String createBy;
    private Date createDate;
    private String empCode;

}
