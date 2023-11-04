package com.project.warehouse.express.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "products")
public class Products extends BaseEntity {

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "code", unique = true)
    private String code;

    @Column(name = "unit", nullable = false)
    private String unit;

    @Column(name = "cost_price", nullable = false)
    private double cost_price;

    @Column(name = "selling_price", nullable = false)
    private double sellingPrice;

}
