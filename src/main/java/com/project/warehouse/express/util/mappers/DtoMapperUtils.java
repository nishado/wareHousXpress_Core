package com.project.warehouse.express.util.mappers;

import com.project.warehouse.express.dto.*;
import com.project.warehouse.express.entity.*;
import com.project.warehouse.express.util.DateTimeUtils;

public class DtoMapperUtils {

    private DtoMapperUtils() {
        throw new IllegalStateException("Util class initialized.");
    }


    public static BasicDto mapDeptDto(Departments departments) {

        BasicDto dto = new BasicDto();
        dto.setId(departments.getId());
        dto.setName(departments.getName());

        return dto;
    }

    public static BasicDto mapPrivDto(Privileges privileges) {

        BasicDto dto = new BasicDto();
        dto.setId(privileges.getId());
        dto.setName(privileges.getName());

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
