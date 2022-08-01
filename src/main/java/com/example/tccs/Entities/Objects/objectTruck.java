package com.example.tccs.Entities.Objects;

import java.sql.Date;

import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class objectTruck {
    @Id
    private char[] truckNumber;
    private String manfc;
    private String model;
    @Temporal(TemporalType.DATE)
    private Date lastSvc;

    public objectTruck(){} //no-arg constructor
    
    public char[] getTruckNumber() {
        return truckNumber;
    }
    public void setTruckNumber(char[] truckNumber) {
        this.truckNumber = truckNumber;
    }
    public String getManfc() {
        return manfc;
    }
    public void setManfc(String manfc) {
        this.manfc = manfc;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public Date getLastSvc() {
        return lastSvc;
    }
    public void setLastSvc(Date lastSvc) {
        this.lastSvc = lastSvc;
    }
    
}
