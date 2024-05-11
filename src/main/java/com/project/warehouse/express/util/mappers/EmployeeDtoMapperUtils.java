package com.project.warehouse.express.util.mappers;

import com.project.warehouse.express.dto.EmployeesDto;
import com.project.warehouse.express.entity.Departments;
import com.project.warehouse.express.entity.Employees;
import com.project.warehouse.express.entity.Statuses;
import com.project.warehouse.express.entity.Users;
import com.project.warehouse.express.service.DepartmentService;
import com.project.warehouse.express.service.NationalityService;
import com.project.warehouse.express.service.StatusService;
import com.project.warehouse.express.service.UserService;
import com.project.warehouse.express.util.DateTimeUtils;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.text.ParseException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;

import static org.apache.commons.lang3.time.DateUtils.parseDate;

@Component
public class EmployeeDtoMapperUtils {

    @Autowired
    public DepartmentService departmentService;
    @Autowired
    public StatusService statusService;
    @Autowired
    public NationalityService nationalityService;
    @Autowired
    public UserService userService;
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
        return dto;
    }
    public Employees mapDtoToEmployees(EmployeesDto dto,Employees emp){
        emp.setEmpCode(dto.getEmpCode());
        // Split name into first and last
        String[] nameParts = dto.getName().split(" ");
        emp.setFirstName(nameParts[0]);
        if (nameParts.length > 1) {
            emp.setLastName(nameParts[1]);
        }
        emp.setMobile1(dto.getMobile1());
        emp.setMobile2(dto.getMobile2());
        emp.setDepartments(departmentService.findDepartmentByName(dto.getDepartment()));
        emp.setStatuses(statusService.findStatusByName(dto.getStatus()));
        emp.setNationalities(nationalityService.findByName(dto.getNationality()));
        try {
            emp.setDob(Date.from(Instant.now()));
        }
        catch (Exception p){
            p.getMessage();
        }
        try {
            emp.setJoinedDate(Date.from(Instant.now()));
        }
        catch (Exception p){
            p.getMessage();
        }
        emp.setEditBy(userService.getUserByName(dto.getEditBy()));
        emp.setEditDate(dto.getEditDate());
        emp.setCreateBy(userService.getUserByName(dto.getEditBy()));
        return emp;
    }

}
