/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtlap.paypoint.models.transferModels;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author OTHMAN AHMAD
 */
@XmlRootElement()
public class Transfer {
    private int transferID;
    private String sfName;
    private String slName;
    private String sphone;
    private int bankCode;
    private String nuban;
    private String bfName;
    private String blName;
    private String bphone;
    private Long amount;
    private int agentID;
    private String dateCreated;
    private int statusCode;
    private int supervisorID;

    public Transfer() {
    }

    public Transfer(int transferID, String sfName, String slName, String sphone,int bankCode, String nuban, String bfName, String blName, String bphone, Long amount, int agentID, String dateCreated, int statusCode, int supervisorID) {
        this.transferID = transferID;
        this.sfName = sfName;
        this.slName = slName;
        this.sphone = sphone;
        this.bankCode = bankCode;
        this.nuban = nuban;
        this.bfName = bfName;
        this.blName = blName;
        this.bphone = bphone;
        this.amount = amount;
        this.agentID = agentID;
        this.dateCreated = dateCreated;
        this.statusCode = statusCode;
        this.supervisorID = supervisorID;
    }
     public Transfer(String sfName, String slName, String sphone,int bankCode, String nuban, String bfName, String blName, String bphone, Long amount, int agentID,  int supervisorID) {       
        this.sfName = sfName;
        this.slName = slName;
        this.sphone = sphone;
        this.bankCode = bankCode;
        this.nuban = nuban;
        this.bfName = bfName;
        this.blName = blName;
        this.bphone = bphone;
        this.amount = amount;
        this.agentID = agentID;
        this.dateCreated = new Date().toString();
        this.statusCode = 200;
        this.supervisorID = supervisorID;
    }

    public int getTransferID() {
        return transferID;
    }

    public void setTransferID(int transferID) {
        this.transferID = transferID;
    }

    public String getSfName() {
        return sfName;
    }

    public void setSfName(String sfName) {
        this.sfName = sfName;
    }

    public String getSlName() {
        return slName;
    }

    public void setSlName(String slName) {
        this.slName = slName;
    }

    public String getSphone() {
        return sphone;
    }

    public void setSphone(String sphone) {
        this.sphone = sphone;
    }

    public int getBankCode() {
        return bankCode;
    }

    public void setBankCode(int bankCode) {
        this.bankCode = bankCode;
    }

    public String getNuban() {
        return nuban;
    }

    public void setNuban(String nuban) {
        this.nuban = nuban;
    }

    public String getBfName() {
        return bfName;
    }

    public void setBfName(String bfName) {
        this.bfName = bfName;
    }

    public String getBlName() {
        return blName;
    }

    public void setBlName(String blName) {
        this.blName = blName;
    }

    public String getBphone() {
        return bphone;
    }

    public void setBphone(String bphone) {
        this.bphone = bphone;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public int getAgentID() {
        return agentID;
    }

    public void setAgentID(int agentID) {
        this.agentID = agentID;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getSupervisorID() {
        return supervisorID;
    }

    public void setSupervisorID(int supervisorID) {
        this.supervisorID = supervisorID;
    }
}
