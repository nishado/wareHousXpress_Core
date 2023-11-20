package com.project.warehouse.express.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Check;

@Getter
@Setter

@Entity
@Table(name = "stock_total")
public class StockTotal extends BaseEntity {

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "batch_id", nullable = false)
    private ProductBatches batchId;

    @Column(name = "initial_quantity", nullable = false)
    private long initialQuantity;

    @Column(name = "current_quantity", nullable = false)
    private long currentQuantity;

    @PreUpdate
    @PrePersist
    @Check(constraints = "initial_quantity = (SELECT quantity from product_batches where id = batch_id)")
    private void checkInitialQuantity(){
        if (batchId != null && initialQuantity != batchId.getQuantity()) {
            throw new IllegalStateException("Initial quantity must match the quantity in the associated ProductBatches entity.");
        }
    }

}