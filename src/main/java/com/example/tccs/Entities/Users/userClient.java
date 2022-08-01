package com.example.tccs.Entities.Users;

import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.example.tccs.Entities.Objects.objectConsignment;
import com.example.tccs.Entities.Objects.objectTransactions;

public class userClient {
    @Id
    private char[] clientId;
    private String name;
    private String address;
    private String contact;
    private String[] mailId;

    @OneToMany(mappedBy = "client")
    private objectTransactions transact;

    @OneToMany(mappedBy = "client")
    private objectConsignment cons;

    public userClient(){} //no-arg constructor

    public char[] getClientId() {
        return clientId;
    }
    public void setClientId(char[] clientId) {
        this.clientId = clientId;
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
    public String[] getMailId() {
        return mailId;
    }
    public void setMailId(String[] mailId) {
        this.mailId = mailId;
    }
    public objectTransactions getTransact() {
        return transact;
    }
    public void setTransact(objectTransactions transact) {
        this.transact = transact;
    }

    public objectConsignment getCons() {
        return cons;
    }

    public void setCons(objectConsignment cons) {
        this.cons = cons;
    }
    
}
