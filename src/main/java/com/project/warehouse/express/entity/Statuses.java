package com.project.warehouse.express.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "statuses")
public class Statuses extends BaseEntity{

    @Column (name = "status",unique = true, nullable = false)
    public String status;
}
