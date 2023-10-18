package com.project.warehouse.express.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter

@Entity
@Table(name = "sales")
public class Sales extends BaseEntity{
    @Column(name = "sale_id", nullable = false, unique = true, length = 30)
    private String saleId;
    @ManyToOne
    @JoinColumn(name = "customer_code", referencedColumnName = "code")
    private Customers customer;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "sale_date")
    private Date saleDate;
    @Column(name = "amount_untaxed", nullable = false)
    private long amountUntaxed;
    @Column(name = "tax_amount", nullable = false)
    private long taxAmount;
    @Column(name = "amount_total", nullable = false)
    private long amountTotal;

}
