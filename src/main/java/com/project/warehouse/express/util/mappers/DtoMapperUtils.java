package com.project.warehouse.express.util.mappers;

import com.project.warehouse.express.dto.*;
import com.project.warehouse.express.entity.*;
import com.project.warehouse.express.util.DateTimeUtils;

public class DtoMapperUtils {

    private DtoMapperUtils() {
        throw new IllegalStateException("Util class initialized.");
    }

    public static EmployeesDto mapEmployeesDto(Employees employee) {
        EmployeesDto dto = new EmployeesDto();
        dto.setId(employee.getId());
        dto.setEmpCode(employee.getEmpCode());
        dto.setName(employee.getName());
        dto.setMobile1(employee.getMobile1());
        dto.setMobile2(employee.getMobile2());
        if (employee.getDepartments() != null) {
            dto.setDepartment(employee.getDepartments().getName());
        }
        if (employee.getStatuses() != null) {
            dto.setStatus(employee.getStatuses().getName());
        }
        if (employee.getNationalities() != null) {
            dto.setNationality(employee.getNationalities().getName());
        }
        dto.setBirthDt(DateTimeUtils.getDateStringInFormat(employee.getDob(), DateTimeUtils.DateFormatPattern.YEAR_MONTH_DAY));
        dto.setJoinDt(DateTimeUtils.getDateStringInFormat(employee.getJoinedDate(), DateTimeUtils.DateFormatPattern.YEAR_MONTH_DAY));
        dto.setEditDate(employee.getEditDate());
        dto.setCreateDate(employee.getCreateDate());
        dto.setEditBy(employee.getEditBy().getUsername());
        dto.setCreateBy(employee.getCreateBy().getUsername());
        return dto;
    }

    public static BasicDto mapDeptDto(Departments departments) {

        BasicDto dto = new BasicDto();
        dto.setId(departments.getId());
        dto.setName(departments.getName());

        return dto;
    }

    public static BasicDto mapPrivDto(Privileges privileges) {

        BasicDto dto = new BasicDto();
        dto.setId(privileges.getId());
        dto.setName(privileges.getName());

        return dto;
    }

    public static BasicDto mapNationalityDto(Nationalities nationalities) {

        BasicDto dto = new BasicDto();
        dto.setId(nationalities.getId());
        dto.setName(nationalities.getName());

        return dto;
    }

    public static BasicDto mapStatusDto(Statuses statuses) {

        BasicDto dto = new BasicDto();
        dto.setId(statuses.getId());
        dto.setName(statuses.getName());

        return dto;
    }

}
