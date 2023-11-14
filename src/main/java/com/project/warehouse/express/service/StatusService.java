package com.project.warehouse.express.service;

import com.project.warehouse.express.dto.BasicDto;
import com.project.warehouse.express.entity.Statuses;
import com.project.warehouse.express.repository.StatusRepository;
import com.project.warehouse.express.util.DtoMapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StatusService {
    @Autowired
    public StatusRepository statusRepository;

    public List<BasicDto> getAllStatuses(){

        List<BasicDto> dtoList = new ArrayList<>();
        List<Statuses> statuses = statusRepository.findAll();
        for (Statuses status : statuses){
            dtoList.add(DtoMapperUtils.mapStatusDto(status));
        }

        return dtoList;
    }
}
