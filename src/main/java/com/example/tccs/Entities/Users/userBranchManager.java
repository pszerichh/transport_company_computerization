package com.example.tccs.Entities.Users;

import java.sql.Date;
import javax.persistence.*;

import com.example.tccs.Entities.Objects.objectBranch;


@Entity
public class userBranchManager {
    @Id
    private char[] emp_id;
    private String name;
    private char[] br_id;
    private String address;
    private float salary;
    private String contact;
    private String mail_id;
    @Temporal(TemporalType.DATE)
    private Date dt_joined;

    public userBranchManager(){} //the no-arg constructor
    public char[] getEmp_id() {
        return emp_id;
    }
    public void setEmp_id(char[] emp_id) {
        this.emp_id = emp_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public char[] getBr_id() {
        return br_id;
    }
    public void setBr_id(char[] br_id) {
        this.br_id = br_id;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    public String getMail_id() {
        return mail_id;
    }
    public void setMail_id(String mail_id) {
        this.mail_id = mail_id;
    }
    public Date getDt_joined() {
        return dt_joined;
    }
    public void setDt_joined(Date dt_joined) {
        this.dt_joined = dt_joined;
    }

    @OneToOne(optional = false, mappedBy = "brman")
    private objectBranch branch;
}
