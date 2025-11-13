package com.project.warehouse.express.util.mappers;

import com.project.warehouse.express.dto.EmployeesDto;
import com.project.warehouse.express.entity.Departments;
import com.project.warehouse.express.entity.Employees;
import com.project.warehouse.express.entity.Statuses;
import com.project.warehouse.express.entity.Users;
import com.project.warehouse.express.repository.DepartmentsRepository;
import com.project.warehouse.express.repository.EmployeeRepository;
import com.project.warehouse.express.repository.NationalitiesRepository;
import com.project.warehouse.express.repository.StatusRepository;
import com.project.warehouse.express.repository.UsersRepository;
import com.project.warehouse.express.service.DepartmentService;
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
import java.util.Optional;



@Component
public class EmployeeDtoMapperUtils {

    @Autowired
    public DepartmentService departmentService;

    @Autowired
    public DepartmentsRepository departmentsRepository;

    @Autowired
    public StatusRepository statusRepository;

    @Autowired
    public StatusService statusService;
    @Autowired
    public NationalitiesRepository nationalitiesRepository;
    @Autowired
    public UserService userService;

    @Autowired
    public UsersRepository usersRepository;
    @Autowired
    public EmployeeRepository employeeRepository;
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
            dto.setStatus(employee.getStatuses().getId());
        }
        if (employee.getNationalities() != null) {
            dto.setNatianalityId(employee.getNationalities().getId());
        }
        dto.setBirthDt(DateTimeUtils.getDateStringInFormat(employee.getDob(), DateTimeUtils.DateFormatPattern.YEAR_MONTH_DAY));
        dto.setJoinDt(DateTimeUtils.getDateStringInFormat(employee.getJoinedDate(), DateTimeUtils.DateFormatPattern.YEAR_MONTH_DAY));
        return dto;
    }
    public Employees mapDtoToEmployees(EmployeesDto dto,Employees emp){
        // Check for duplicate empCode
        if (dto.getEmpCode() != null) {
            // Only check if creating new or changing empCode
            Optional<Employees> existingEmp = employeeRepository.findByEmpCode(dto.getEmpCode());
            if (existingEmp.isPresent() && (emp.getId() == null || !existingEmp.get().getId().equals(emp.getId()))) {
                throw new DuplicateEmpCodeException("Employee code already exists: " + dto.getEmpCode());
            }
        }
        emp.setEmpCode(dto.getEmpCode());
        // Split name into first and last
        String[] nameParts = dto.getName().split(" ");
        emp.setFirstName(nameParts[0]);
        if (nameParts.length > 1) {
            emp.setLastName(nameParts[1]);
        }
        emp.setMobile1(dto.getMobile1());
        emp.setMobile2(dto.getMobile2());
        emp.setDepartments(departmentsRepository.findById(dto.getDepId()).orElse(null));
        emp.setStatuses(statusRepository.findById(dto.getStatus()).orElse(null));
        emp.setNationalities(nationalitiesRepository.findById(dto.getNatianalityId()).orElse(null));
        try {
            emp.setDob(DateTimeUtils.getDateFromString(dto.getBirthDt(), DateTimeUtils.DateFormatPattern.YEAR_MONTH_DAY));
        } catch (ParseException e) {
            emp.setDob(null); // or handle/log as needed
        }

        try {
            emp.setJoinedDate(Date.from(Instant.now()));
        }
        catch (Exception p){
            p.getMessage();
        }
        emp.setEditBy(usersRepository.findById(Integer.valueOf(dto.getEditBy())).orElse(null));
        emp.setEditDate(dto.getEditDate());
        emp.setCreateBy(usersRepository.findById(Integer.valueOf(dto.getEditBy())).orElse(null));
        return emp;
    }

}
