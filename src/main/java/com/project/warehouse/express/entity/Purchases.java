package com.project.warehouse.express.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "purchases")
public class Purchases extends BaseEntity{

    @Column(name = "purchase_id", nullable = false, unique = true, length = 30)
    private String purchaseId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "supplier_id", referencedColumnName = "id", nullable = false)
    private Suppliers supplier;

    @Column(name = "amount_total", nullable = false)
    private double amountTotal;

    @Column(name = "tax_amount", nullable = false)
    private double taxAmount;

    @Column(name = "amount_untaxed", nullable = false)
    private double amountUntaxed;

    @PrePersist
    @PreUpdate
    private void validateAmounts() {
        if (amountTotal != amountUntaxed + taxAmount) {
            throw new IllegalStateException("Sum of amountUntaxed and taxAmount must be equal to amountTotal");
        }
    }

}
