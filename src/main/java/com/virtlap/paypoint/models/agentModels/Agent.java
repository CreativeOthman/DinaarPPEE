/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtlap.paypoint.models.agentModels;



import com.virtlap.paypoint.models.supervisorModels.Supervisor;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author OTHMAN AHMAD
 */

@XmlRootElement()
public class Agent {
    
    private int agentID;
    private String firstName;
    private String lastName;
    private String phone; 
    private Date DateCreated;
    private List<Supervisor> supervisor;

    private List<AccountBalance> AccountDetails;
    private int supervisorID;
    private Date dateModified;
    
    
    public Agent(int agentID, String firstName, String lastName, String phone,Date DateCreated, List<Supervisor> supervisor ,List<AccountBalance> AccountDetail, Date DateModified) {
        this.agentID = agentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.DateCreated = DateCreated;
        this.supervisor = supervisor;
        this.AccountDetails = AccountDetail;
        this.dateModified = DateModified;
    }  
    public Agent(String firstName, String lastName, String phone,int supervisorID) {   
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.supervisorID = supervisorID;
    }

    public Agent() {
    }


     @XmlAttribute()
    public int getAgentID() {
        return agentID;
    }

    public void setAgentID(int agentID) {
        this.agentID = agentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public Date getDateCreated() {
        return DateCreated;
    }

    public void setDateCreated(Date DateCreated) {
        this.DateCreated = DateCreated;
    }


    public List<Supervisor> getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(List<Supervisor> supervisor) {
        this.supervisor = supervisor;
    }
    public int getSupervisorID() {
        return this.supervisorID;
    }


    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }
    
    public List<AccountBalance> getAccountDetails() {
        return AccountDetails;
    }

    public void setAccountDetails(List<AccountBalance> AccountDetails) {
        this.AccountDetails = AccountDetails;
    }

}
