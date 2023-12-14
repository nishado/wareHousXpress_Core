package com.project.warehouse.express.service;

import com.project.warehouse.express.dto.BasicDto;
import com.project.warehouse.express.dto.UserPrivilegesDto;
import com.project.warehouse.express.entity.Privileges;
import com.project.warehouse.express.repository.PrivilegesRepository;
import com.project.warehouse.express.util.mappers.DtoMapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PrivilegesService {
    @Autowired
    public PrivilegesRepository privilegesRepository;

    public List<UserPrivilegesDto> getAllPrivileges(){
        List<UserPrivilegesDto> dtoList = new ArrayList<>();
        List<Privileges> privs = privilegesRepository.findAll();
        for(Privileges p : privs){
            dtoList.add(DtoMapperUtils.mapPrivilegeDto(p));
        }
        return dtoList;
    }
}



//10,7,22,1,8,11
