package com.project.warehouse.express.util;

import com.project.warehouse.express.dto.UserScreenDto;
import com.project.warehouse.express.entity.UserScreen;

public class DtoMapperUtil {

    public static UserScreenDto mapUserScreenDto(UserScreen screen) {
        UserScreenDto dto = new UserScreenDto();
        if (screen.getId() > 0) {
            dto.setId(screen.getId());
        }
        dto.setUserId(screen.getUser().getId());
        dto.setEditBy(screen.getEditBy());
        dto.setEditDate(screen.getEditDate());
        dto.setCreateBy(screen.getCreateBy());
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
}
