package com.project.warehouse.express.util.mappers;

import com.project.warehouse.express.dto.UserPrivilegesDto;
import com.project.warehouse.express.dto.UserScreenDto;
import com.project.warehouse.express.dto.UsersDto;
import com.project.warehouse.express.entity.UserPrivileges;
import com.project.warehouse.express.entity.UserScreens;
import com.project.warehouse.express.entity.Users;
import org.springframework.transaction.annotation.Transactional;

public class UsersMapperUtils {

    private UsersMapperUtils() {
        throw new IllegalStateException("Utility class instantiated.");
    }

    public static UserScreenDto mapUserScreenDto(UserScreens screen) {
        UserScreenDto dto = new UserScreenDto();
        if (screen.getId() > 0) {
            dto.setId(screen.getId());
        }
        dto.setUserId(screen.getUser().getId());
        dto.setEditBy(screen.getEditBy().getUsername());
        dto.setEditDate(screen.getEditDate());
        dto.setCreateBy(screen.getCreateBy().getUsername());
        dto.setCreateDate(screen.getCreateDate());
        dto.setDashboard(screen.isDashboard());
        dto.setStock(screen.isStock());
        dto.setSales(screen.isSales());
        dto.setCustomers(screen.isCustomers());
        dto.setEmployees(screen.isEmployees());
        dto.setAttendance(screen.isAttendance());
        dto.setSalaryMaster(screen.isSalaryMaster());
        dto.setSalaryPayout(screen.isSalaryPayout());
        dto.setLeaveSalary(screen.isLeaveSalary());
        dto.setGratuity(screen.isGratuity());
        return dto;
    }

    public static UsersDto mapUsersDto(Users user, String empCode) {
        UsersDto dto = new UsersDto();
        if (user.getId() > 0) {
            dto.setId(user.getId());
        }
        dto.setUserId(user.getUserCode());
        dto.setEmpCode(empCode);
        dto.setName(user.getUsername());
        dto.setEditDate(user.getEditDate());
        dto.setCreateDate(user.getCreateDate());
        dto.setCreateBy(user.getUsername());
        dto.setEditBy(user.getUsername());
        return dto;
    }


    @Transactional
    public static UserPrivilegesDto mapUserPrivilegesDto(UserPrivileges privileges) {
        UserPrivilegesDto dto = new UserPrivilegesDto();
        if (privileges.getId() > 0) {
            dto.setId(privileges.getId());
        }
        dto.setUserId(privileges.getUserId().getUserCode());
        dto.setPrivilegeName(privileges.getPrivilegeName());
        dto.setViewPrivilege(privileges.isViewPrivilege());
        dto.setAddPrivilege(privileges.isAddPrivilege());
        dto.setEditPrivilege(privileges.isEditPrivilege());
        dto.setDeletePrivilege(privileges.isDeletePrivilege());
        dto.setEditDate(privileges.getEditDate());
        dto.setCreateDate(privileges.getCreateDate());
        dto.setCreateBy(privileges.getCreateBy().getUsername());
        dto.setEditBy(privileges.getEditBy().getUsername());
        return dto;
    }

}
