package com.project.warehouse.express.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter

@Entity
@Table(name = "product_batches", uniqueConstraints = {@UniqueConstraint(columnNames = {"batch_code", "product_id"})})
public class ProductBatches extends BaseEntity {

    @Column(name = "batch_code", nullable = false, unique = true, length = 30)
    private String batchCode;

    @Column(name = "barcode", unique = true, length = 100)
    private String barcode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", referencedColumnName = "id", nullable = false)
    private Products productId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "purchase_id", referencedColumnName = "id", nullable = false)
    private Purchases purchaseId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "unit_id", referencedColumnName = "id", nullable = false)
    private ProductUnits unitId;

    @Column(name = "quantity", nullable = false)
    private double quantity;

    @Column(name = "total_cost", nullable = false)
    private double totalCost;

    @Column(name = "unit_cost", nullable = false)
    private double unitCost;

    @Column(name = "unit_price", nullable = false)
    private double unitPrice;

    @Column(name = "expiry_date")
    private Date expiryDate;

    @Column(name = "manufactured_date")
    private Date manufacturedDate;

}
