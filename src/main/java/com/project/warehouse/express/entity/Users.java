package com.project.warehouse.express.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name = "user_Code", nullable = false)
    private short userCd;

    @OneToOne
    @JoinColumn(name = "user_code", referencedColumnName = "user_id", insertable = false, updatable = false)
    private UserScreen userScreen;

    @Column(name = "password", nullable = false, length = 20)
    private String password;

    @Column(name = "user_name", length = 50, nullable = false)
    private String userName;

    @Column(name = "edit_by", length = 20, nullable = true)
    private String editBy;

    @Column(name = "edit_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date editDt;

    @Column(name = "create_by", length = 20, nullable = true)
    private String createBy;

    @Column(name = "create_Date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;

    @Column(name = "emp_code", length = 20, nullable = false)
    private String empCode;

    // Getter and Setter methods

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public short getUserCd() {
        return userCd;
    }

    public void setUserCd(short userCd) {
        this.userCd = userCd;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return userName;
    }

    public void setName(String userName) {
        this.userName = Users.this.userName;
    }

    public String getEditBy() {
        return editBy;
    }

    public void setEditBy(String editBy) {
        this.editBy = editBy;
    }

    public Date getEditDt() {
        return editDt;
    }

    public void setEditDt(Date editDt) {
        this.editDt = editDt;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreatDate() {
        return createDate;
    }

    public void setCreatDate(Date creatDate) {
        this.createDate = creatDate;
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }
}


