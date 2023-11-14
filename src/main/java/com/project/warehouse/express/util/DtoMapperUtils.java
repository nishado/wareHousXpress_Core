package com.project.warehouse.express.util;

import com.project.warehouse.express.dto.EmployeesDto;
import com.project.warehouse.express.dto.UserPrivilegesDto;
import com.project.warehouse.express.dto.UserScreenDto;
import com.project.warehouse.express.dto.UsersDto;
import com.project.warehouse.express.entity.Employees;
import com.project.warehouse.express.entity.UserPrivileges;
import com.project.warehouse.express.entity.UserScreens;
import com.project.warehouse.express.entity.Users;
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

    public static UsersDto mapUsersDto(Users user, EmployeeRepository employeeRepository) {
        UsersDto dto = new UsersDto();
        if (user.getId() > 0) {
            dto.setId(user.getId());
        }
        dto.setUserId(user.getUserCode());
        dto.setEmpCode(user.getEmpId().getEmpCode());
        dto.setName(user.getUsername());
        dto.setEditDate(user.getEditDate());
        dto.setCreateDate(user.getCreateDate());
        Optional<Employees> createBy = employeeRepository.findById(user.getCreateBy());
        createBy.ifPresent(crtBy -> dto.setCreateBy(crtBy.getName()));
        Optional<Employees> editBy = employeeRepository.findById(user.getEditBy());
        editBy.ifPresent(edtBy -> dto.setEditBy(edtBy.getName()));
        return dto;
    }

    public static UserPrivilegesDto mapUserPrivilegesDto(UserPrivileges privileges, EmployeeRepository employeeRepository) {
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
        Optional<Employees> createBy = employeeRepository.findById(privileges.getCreateBy());
        createBy.ifPresent(crtBy -> dto.setCreateBy(crtBy.getName()));
        Optional<Employees> editBy = employeeRepository.findById(privileges.getEditBy());
        editBy.ifPresent(edtBy -> dto.setEditBy(edtBy.getName()));
        return dto;
    }

    public static EmployeesDto mapEmployeesDto(Employees employee, EmployeeRepository employeeRepository) {
        EmployeesDto dto = new EmployeesDto();
        dto.setId(employee.getId());
        dto.setEmpCode(employee.getEmpCode());
        dto.setName(employee.getName());
        dto.setMobile1(employee.getMobile1());
        dto.setMobile2(employee.getMobile2());
        if (employee.getDepartments() != null) {
            dto.setDepartment(employee.getDepartments().getDeptName());
        }
        if (employee.getStatuses() != null) {
            dto.setStatus(employee.getStatuses().getStatus());
        }
        if (employee.getCountries() != null) {
            dto.setNationality(employee.getCountries().getName());
        }
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
