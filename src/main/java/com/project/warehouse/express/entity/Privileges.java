package com.project.warehouse.express.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "privileges")
public class Privileges extends BaseEntity{

    @Column(name = "name",unique = true, nullable = false)
    public String name;

}
