package com.project.warehouse.express.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "product_units")
public class ProductUnits extends BaseEntity {

    @Column(name = "code", unique = true, nullable = false, length = 30)
    private String code;

    @Column(name = "description", nullable = false)
    private String unit;

}
