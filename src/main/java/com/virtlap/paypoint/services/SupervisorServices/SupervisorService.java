/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtlap.paypoint.services.SupervisorServices;

import com.virtlap.paypoint.models.supervisorModels.Supervisor;
import com.virtlap.paypoint.resource.SQLServerConnectionBehavior;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author OTHMAN AHMAD
 */
public class SupervisorService {
    SQLServerConnectionBehavior sscb = new SQLServerConnectionBehavior();
    Connection conn = sscb.getConnection();
    Statement stmt;
    
    public List<Supervisor> getSupervisors(){ 
        List<Supervisor> Supervisors = new ArrayList();
        try {
            stmt = conn.createStatement();
        
        ResultSet rs = stmt.executeQuery("SELECT * FROM tblSupervisors");
        while(rs.next()){
        Supervisor supervisor = new Supervisor(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getLong(6),rs.getDate(7));
        Supervisors.add(supervisor);
        
        }
        
        } catch (SQLException ex) {
            Logger.getLogger(SupervisorService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    return Supervisors;
    
    }
    
    public List<Supervisor> getSupervisorsById(int id){ 
        List<Supervisor> Supervisors = new ArrayList();
        try {
            stmt = conn.createStatement();
        
        ResultSet rs = stmt.executeQuery("SELECT firstName,lastName,email,phone FROM tblSupervisors where supervisorID ="+id);
        while(rs.next()){
         String fname = rs.getString("firstName");
         String lname = rs.getString("lastName");
         String email = rs.getString("email");
         String phone = rs.getString("phone");
            
            
        Supervisor supervisor = new Supervisor(fname,lname,phone,email);
        Supervisors.add(supervisor);
        
        }
        
        } catch (SQLException ex) {
            Logger.getLogger(SupervisorService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    return Supervisors;
    
    }
    
    
}
