package com.example.tccs.Entities.Objects;

import java.util.Date;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.example.tccs.Entities.Users.userClient;

public class objectTransactions {
    @Id
    private char[] trnId;
    @Temporal(TemporalType.DATE)
    private Date trDate;
    private String payMethod;
    @ManyToOne(optional = true)
    @JoinColumn(name = "client_id")
    private userClient client;
    public char[] getTrnId() {
        return trnId;
    }
    public void setTrnId(char[] trnId) {
        this.trnId = trnId;
    }
    public Date getTrDate() {
        return trDate;
    }
    public void setTrDate(Date trDate) {
        this.trDate = trDate;
    }
    public String getPayMethod() {
        return payMethod;
    }
    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }
    public userClient getClient() {
        return client;
    }
    public void setClient(userClient client) {
        this.client = client;
    }
    
}
