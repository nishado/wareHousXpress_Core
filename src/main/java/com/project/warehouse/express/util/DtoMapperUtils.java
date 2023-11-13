package com.project.warehouse.express.util;

import com.project.warehouse.express.dto.EmployeesDto;
import com.project.warehouse.express.dto.UserScreenDto;
import com.project.warehouse.express.entity.Employees;
import com.project.warehouse.express.entity.UserScreens;
import com.project.warehouse.express.repository.EmployeeRepository;

import java.util.Optional;

public class DtoMapperUtils {

    public static UserScreenDto mapUserScreenDto(UserScreens screen) {
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

    public static EmployeesDto mapEmployeesDto(Employees employee, EmployeeRepository employeeRepository) {
        EmployeesDto dto = new EmployeesDto();
        dto.setId(employee.getId());
        dto.setEmpCode(employee.getEmpCode());
        dto.setName(employee.getName());
        dto.setMobile1(employee.getMobile1());
        dto.setMobile2(employee.getMobile2());
        dto.setDepartment(employee.getDepartment());
        dto.setStatus(employee.getStatus());
        dto.setNationality(employee.getNationality());
        dto.setBirthDt(DateTimeUtils.getDateStringInFormat(employee.getDob(), DateTimeUtils.DateFormatPattern.YEAR_MONTH_DAY));
        dto.setJoinDt(DateTimeUtils.getDateStringInFormat(employee.getJoinedDate(), DateTimeUtils.DateFormatPattern.YEAR_MONTH_DAY));
        dto.setEditDt(employee.getEditDate());
        dto.setCreateDt(employee.getCreateDate());

        Optional<Employees> createBy = employeeRepository.findById(employee.getCreateBy());
        createBy.ifPresent(crtBy -> dto.setCreateBy(crtBy.getName()));
        Optional<Employees> editBy = employeeRepository.findById(employee.getEditBy());
        editBy.ifPresent(edtBy -> dto.setEditBy(edtBy.getName()));
        return dto;
    }
}
