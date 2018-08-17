/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtlap.paypoint.models;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author OTHMAN AHMAD
 */

@XmlRootElement()
public class Transaction {
       
  private  int transferID;
  private int REF;
  private  Date dateCreated;
  private int supervisorID;

    public Transaction() {
    }

    public Transaction(int transferID, int REF, Date dateCreated, int supervisorID) {
        this.transferID = transferID;
        
        this.REF = REF;
        this.dateCreated = dateCreated;
        this.supervisorID = supervisorID;
    }

    public int getTransferID() {
        return transferID;
    }

    public void setTransferID(int transferID) {
        this.transferID = transferID;
    }



    public int getREF() {
        return REF;
    }

    public void setREF(int REF) {
        this.REF= REF;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public int getSupervisorID() {
        return supervisorID;
    }

    public void setSupervisorID(int supervisorID) {
        this.supervisorID = supervisorID;
    }

  
  
}
