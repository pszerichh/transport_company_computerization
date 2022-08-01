package com.example.tccs.Entities.Objects;

import java.util.Date;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.example.tccs.Entities.Users.userClient;

public class objectConsignment {
    @Id
    private char[] consId;
    //many to one mapping
    private float volume;
    private String source;
    private String dest;
    @Temporal(TemporalType.DATE)
    private Date arrdt;
    @Temporal(TemporalType.DATE)
    private Date depdt;

    public objectConsignment(){} //no-arg constructor
    
    public char[] getConsId() {
        return consId;
    }
    public void setConsId(char[] consId) {
        this.consId = consId;
    }
    public float getVolume() {
        return volume;
    }
    public void setVolume(float volume) {
        this.volume = volume;
    }
    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public String getDest() {
        return dest;
    }
    public void setDest(String dest) {
        this.dest = dest;
    }
    public Date getArrdt() {
        return arrdt;
    }
    public void setArrdt(Date arrdt) {
        this.arrdt = arrdt;
    }
    public Date getDepdt() {
        return depdt;
    }
    public void setDepdt(Date depdt) {
        this.depdt = depdt;
    }
    @ManyToOne //join column here
    private userClient client;
    
}