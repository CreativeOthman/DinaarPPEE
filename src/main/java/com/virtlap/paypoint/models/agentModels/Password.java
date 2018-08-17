/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtlap.paypoint.models.agentModels;

import java.util.Date;

/**
 *
 * @author OTHMAN AHMAD
 */
public class Password {
    private int AccountID;
    private String Password;
    private String PasswordQuestion;
    private String PasswordAnswer;
    private int CreatedBy;
    private Date CreatedOn;
    private Date ModifiedOn;
    private int Active;

    public Password(int AccountID, String Password, String PasswordQuestion, String PasswordAnswer, int CreatedBy, Date CreatedOn, Date ModifiedOn, int Active) {
        this.AccountID = AccountID;
        this.Password = Password;
        this.PasswordQuestion = PasswordQuestion;
        this.PasswordAnswer = PasswordAnswer;
        this.CreatedBy = CreatedBy;
        this.CreatedOn = CreatedOn;
        this.ModifiedOn = ModifiedOn;
        this.Active = Active;
    }

    public Password() {
    }

    public int getAccountID() {
        return AccountID;
    }

    public void setAccountID(int AccountID) {
        this.AccountID = AccountID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getPasswordQuestion() {
        return PasswordQuestion;
    }

    public void setPasswordQuestion(String PasswordQuestion) {
        this.PasswordQuestion = PasswordQuestion;
    }

    public String getPasswordAnswer() {
        return PasswordAnswer;
    }

    public void setPasswordAnswer(String PasswordAnswer) {
        this.PasswordAnswer = PasswordAnswer;
    }

    public int getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(int CreatedBy) {
        this.CreatedBy = CreatedBy;
    }

    public Date getCreatedOn() {
        return CreatedOn;
    }

    public void setCreatedOn(Date CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    public Date getModifiedOn() {
        return ModifiedOn;
    }

    public void setModifiedOn(Date ModifiedOn) {
        this.ModifiedOn = ModifiedOn;
    }

    public int getActive() {
        return Active;
    }

    public void setActive(int Active) {
        this.Active = Active;
    }
    
    
}
