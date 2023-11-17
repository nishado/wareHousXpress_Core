package com.project.warehouse.express.service;

import com.project.warehouse.express.dto.BasicDto;
import com.project.warehouse.express.entity.Nationalities;
import com.project.warehouse.express.repository.NationalitiesRepository;
import com.project.warehouse.express.util.mapperUtils.DtoMapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NationalityService {

    @Autowired
    public NationalitiesRepository nationalitiesRepository;

    public List<BasicDto> getAllNationalities(){
        List<Nationalities> nations = nationalitiesRepository.findAll();
        List<BasicDto> dtoList = new ArrayList<>();
        for(Nationalities nat : nations){
            dtoList.add(DtoMapperUtils.mapNationalityDto(nat));
        }

        return dtoList;
    }

}
