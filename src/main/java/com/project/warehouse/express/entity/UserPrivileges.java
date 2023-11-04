package com.project.warehouse.express.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "user_privileges")
public class UserPrivileges extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private Users userId;

    @Column(name = "privilege_name", length = 100)
    private String privilegeName;

    @Column(name = "view_privilege")
    private boolean viewPrivilege;

    @Column(name = "add_privilege")
    private boolean addPrivilege;

    @Column(name = "edit_privilege")
    private boolean editPrivilege;

    @Column(name = "delete_privilege")
    private boolean deletePrivilege;

}
