package com.example.tccs.Entities.Users;

import javax.persistence.*;;

@Entity
public class userCustomer {
    @Id
    private char cu_id[];
    private String name;
    private String address;
    private String contact;
    private String mail_id;

    public userCustomer(){}

    public char[] getCu_id() {
        return cu_id;
    }

    public void setCu_id(char[] cu_id) {
        this.cu_id = cu_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getMail_id() {
        return mail_id;
    }

    public void setMail_id(String mail_id) {
        this.mail_id = mail_id;
    }
    
}
