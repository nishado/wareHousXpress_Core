package com.project.warehouse.express.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "nationalities")
public class Nationalities extends BaseEntity{

    @Column(name = "name")
    public String name;

}
