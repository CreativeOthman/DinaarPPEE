/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtlap.paypoint.models.agentModels;


import java.sql.Date;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;


/**
 *
 * @author OTHMAN AHMAD
 */
@XmlRootElement()
public class AccountBalance {
    private int AccountID;
    private int Balance;
    private int Comissiont;
    private int UnsettledComission;
    private Date dateCreate;
    private Date dateModified;
    private int CreatedBy;

    public AccountBalance(int AccountID, int Balance, int Comissiont, int UnsettledComission) {
        this.AccountID = AccountID;
        this.Balance = Balance;
        this.Comissiont = Comissiont;
        this.UnsettledComission = UnsettledComission;
       
    }

    public AccountBalance() {
    }


    public int getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(int CreatedBy) {
        this.CreatedBy = CreatedBy;
    }
     @XmlAttribute()
    public int getAccountID() {
        return AccountID;
    }

    public void setAccountID(int AccountID) {
        this.AccountID = AccountID;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int Balance) {
        this.Balance = Balance;
    }

    public int getComissiont() {
        return Comissiont;
    }

    public void setComissiont(int Comissiont) {
        this.Comissiont = Comissiont;
    }

    public int getUnsettledComission() {
        return UnsettledComission;
    }

    public void setUnsettledComission(int UnsettledComission) {
        this.UnsettledComission = UnsettledComission;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }
    
}
