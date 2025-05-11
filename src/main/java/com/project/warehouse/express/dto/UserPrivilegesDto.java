package com.project.warehouse.express.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UserPrivilegesDto {

    private long id;
    private int userId;
    private String privilegeName;
    private Boolean viewPrivilege;
    private Boolean addPrivilege;
    private Boolean editPrivilege;
    private Boolean deletePrivilege;
    private String editBy;
    private Date editDate;
    private String createBy;
    private Date createDate;

}
