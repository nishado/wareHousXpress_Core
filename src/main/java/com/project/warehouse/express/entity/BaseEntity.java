package com.project.warehouse.express.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter

@MappedSuperclass
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_by", nullable = false)
    private Long createBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date", nullable = false)
    private Date createDate;

    @Column(name = "edit_by", nullable = false)
    private Long editBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "edit_date", nullable = false)
    private Date editDate;

}
