package com.project.warehouse.express.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "departments")
public class Departments extends BaseEntity{

    @Column (name = "dept_name",unique = true, nullable = false)
    public String deptName;
}
