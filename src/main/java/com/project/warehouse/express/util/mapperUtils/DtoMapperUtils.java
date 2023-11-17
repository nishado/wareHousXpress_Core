package com.project.warehouse.express.util.mapperUtils;

import com.project.warehouse.express.dto.*;
import com.project.warehouse.express.entity.*;
import com.project.warehouse.express.repository.EmployeeRepository;
import com.project.warehouse.express.service.EmployeeService;
import com.project.warehouse.express.util.DateTimeUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.ParseException;
import java.util.Optional;

public class DtoMapperUtils {
    @Autowired
    public EmployeeService employeeService;


    public static EmployeesDto mapEmployeesDto(Employees employee, EmployeeRepository employeeRepository) {
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
        dto.setEditDt(employee.getEditDate());
        dto.setCreateDt(employee.getCreateDate());

        Optional<Employees> createBy = employeeRepository.findById(employee.getCreateBy());
        createBy.ifPresent(crtBy -> dto.setCreateBy(crtBy.getName()));
        Optional<Employees> editBy = employeeRepository.findById(employee.getEditBy());
        editBy.ifPresent(edtBy -> dto.setEditBy(edtBy.getName()));
        return dto;
    }

    public Employees mapToEmployees(EmployeesDto employeesDto) throws ParseException {

        Employees emp = new Employees();
        emp.setEmpCode(employeesDto.getEmpCode());
        emp.setMobile1(employeesDto.getMobile1());
        emp.setMobile2(employeesDto.getMobile2());

        Optional<Statuses> status = employeeService.findStatusByName(employeesDto.getStatus());
        status.ifPresent(emp::setStatuses);
        emp.setDepartments(employeeService.findDepartmentByName(employeesDto.getDepartment()));
        emp.setNationalities(employeeService.findNationalityByName(employeesDto.getNationality()));
        emp.setEditDate(employeesDto.getEditDt());
        emp.setCreateDate(employeesDto.getCreateDt());
//        emp.setDob(DateTimeUtils.getDateFromString(
//                employeesDto.getBirthDt(), DateTimeUtils.DateFormatPattern.YEAR_MONTH_DAY));
        emp.setDob(DateTimeUtils.getDateFromDateTimeString(employeesDto.getBirthDt()));
        emp.setJoinedDate(DateTimeUtils.getDateFromString(
                employeesDto.getJoinDt(), DateTimeUtils.DateFormatPattern.YEAR_MONTH_DAY));

        return emp;
    }

    public static BasicDto mapDeptDto(Departments departments) {

        BasicDto dto = new BasicDto();
        dto.setId(departments.getId());
        dto.setName(departments.getName());

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
