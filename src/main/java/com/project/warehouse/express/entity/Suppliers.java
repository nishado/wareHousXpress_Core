package com.project.warehouse.express.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

@Entity
@Table(name = "suppliers")
public class  Suppliers extends BaseEntity {

    @Column(name = "code", unique = true, nullable = false, length = 30)
    private String code;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "mobile_1", length = 30)
    private String mobile1;

    @Column(name = "mobile_2", length = 30)
    private String mobile2;

    @Column(name = "address")
    private String address;


}
