package com.project.warehouse.express.service;

import com.project.warehouse.express.dto.BasicDto;
import com.project.warehouse.express.entity.Departments;
import com.project.warehouse.express.repository.DepartmentsRepository;
import com.project.warehouse.express.util.mappers.DtoMapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentService {
    private final DepartmentsRepository departmentsRepository;

    @Autowired
    public DepartmentService(DepartmentsRepository departmentsRepository) {
        this.departmentsRepository = departmentsRepository;
    }

    public List<BasicDto> getAllDepartments(){
        List<BasicDto> dtoList = new ArrayList<>();
        List<Departments> departments = departmentsRepository.findAll();
        for (Departments dep : departments){
            dtoList.add(DtoMapperUtils.mapDeptDto(dep));
        }


        return dtoList;
    }

}
