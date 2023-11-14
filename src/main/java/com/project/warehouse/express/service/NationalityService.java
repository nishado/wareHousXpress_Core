package com.project.warehouse.express.service;

import com.project.warehouse.express.dto.BasicDto;
import com.project.warehouse.express.entity.Nationalities;
import com.project.warehouse.express.repository.NationalityRepository;
import com.project.warehouse.express.util.DtoMapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NationalityService {

    @Autowired
    public NationalityRepository nationalityRepository;

    public List<BasicDto> getAllNationalities(){
        List<Nationalities> nations = nationalityRepository.findAll();
        List<BasicDto> dtoList = new ArrayList<>();
        for(Nationalities nat : nations){
            dtoList.add(DtoMapperUtils.mapNationalityDto(nat));
        }

        return dtoList;
    }

}
