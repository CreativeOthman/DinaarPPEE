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
public class AccountType {
    private int value;
    private String Name;

    public AccountType(int value, String Name) {
        this.value = value;
        this.Name = Name;
    }

    public AccountType() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
}
