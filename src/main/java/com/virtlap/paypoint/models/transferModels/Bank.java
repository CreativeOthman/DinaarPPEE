/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtlap.paypoint.models.transferModels;

/**
 *
 * @author OTHMAN AHMAD
 */
public class Bank {
    private int Id;
    private int CbnCode;
    private String Name;

    public Bank(int Id, int CbnCode, String Name) {
        this.Id = Id;
        this.CbnCode = CbnCode;
        this.Name = Name;
    }

    public Bank() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getCbnCode() {
        return CbnCode;
    }

    public void setCbnCode(int CbnCode) {
        this.CbnCode = CbnCode;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
}
