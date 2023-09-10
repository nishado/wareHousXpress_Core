package com.project.warehouse.express.mapper;

import com.project.warehouse.express.dto.UsersDto;
import com.project.warehouse.express.entity.Users;

public class UsersMapper {

    // Convert Users entity to UsersDto
    public static UsersDto mapToUsersDto(Users users) {
        if (users == null) {
            return null;
        }

        UsersDto usersDto = new UsersDto();
        usersDto.setId(users.getId());
        usersDto.setUserCd(users.getUserCode());
        usersDto.setPassword(users.getPassword());
        usersDto.setName(users.getUsername());
        usersDto.setEditBy(users.getEditBy());
        usersDto.setEditDt(users.getEditDt());
        usersDto.setCreateBy(users.getCreateBy());
        usersDto.setCreateDate(users.getCreateDate());
        usersDto.setEmpCode(users.getEmpCode());

        return usersDto;
    }

    // Convert UsersDTO to Users entity
    public static Users mapToUsers(UsersDto usersDto) {
        if (usersDto == null) {
            return null;
        }

        Users users = new Users();
        users.setId(usersDto.getId());
        users.setUserCode(usersDto.getUserCd());
        users.setPassword(usersDto.getPassword());
        users.setUsername(usersDto.getName());
        users.setEditBy(usersDto.getEditBy());
        users.setEditDt(usersDto.getEditDt());
        users.setCreateBy(usersDto.getCreateBy());
        users.setCreateDate(usersDto.getCreateDate());
        users.setEmpCode(usersDto.getEmpCode());

        return users;
    }
}
