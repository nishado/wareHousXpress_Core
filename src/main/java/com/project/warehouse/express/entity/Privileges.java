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

    @Column(name = "view_privilege",nullable = false )
    public boolean viewPrivilege;

    @Column(name = "edit_privilege",nullable = false )
    public boolean editPrivilege;

    @Column(name = "add_privilege",nullable = false )
    public boolean addPrivilege;

    @Column(name = "delete_privilege",nullable = false )
    public boolean deletePrivilege;
}
