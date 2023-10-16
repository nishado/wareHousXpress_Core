package com.project.warehouse.express.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "stock")
public class Stock extends BaseEntity {

    @Column(name = "item_code", nullable = false, unique = true, length = 30)
    private String itemCode;

    @Column(name = "item_name", nullable = false, unique = true)
    private int itemName;

    @Column(name = "quantity", nullable = false, unique = true)
    private long quantity;

}