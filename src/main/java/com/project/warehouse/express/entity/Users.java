package com.project.warehouse.express.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


@Entity
@Table(name = "users")
public class Users extends BaseEntity {

    @Column(name = "user_code", nullable = false, unique = true)
    private int userCode;

    @Column(name = "password", nullable = false, length = 20)
    private String password;

    @Column(name = "user_name", length = 50, nullable = false, unique = true)
    private String username;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "emp_id", referencedColumnName = "id", nullable = false)
    private Employees empId;

}


