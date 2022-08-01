package com.example.tccs.Entities.Objects;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.example.tccs.Entities.Users.userBranchManager;

public class objectBranch {
    @Id
    private char[] branchId;
    private String brName;
    private String address;
    private String contact;
    private String mailId;
    
    public objectBranch(){} //no-arg constructor

    public char[] getBranchId() {
        return branchId;
    }
    public void setBranchId(char[] branchId) {
        this.branchId = branchId;
    }
    public String getBrName() {
        return brName;
    }
    public void setBrName(String brName) {
        this.brName = brName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    public String getMailId() {
        return mailId;
    }
    public void setMailId(String mailId) {
        this.mailId = mailId;
    }
    public userBranchManager getBrman() {
        return brman;
    }
    public void setBrman(userBranchManager brman) {
        this.brman = brman;
    }
    
    @OneToOne(optional = false)
    @JoinColumn(name="manager")
    private userBranchManager brman;
}
