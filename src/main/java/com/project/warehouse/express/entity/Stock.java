package com.project.warehouse.express.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "stock")
public class Stock extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private Products productId;

    @Column(name = "batch_code", nullable = false, unique = true)
    private String batchCode;

    @Column(name = "quantity", nullable = false, unique = true)
    private long quantity;

}