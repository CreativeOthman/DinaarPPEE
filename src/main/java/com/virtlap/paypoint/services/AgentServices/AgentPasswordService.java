/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtlap.paypoint.services.AgentServices;

import com.virtlap.paypoint.resource.SQLServerConnectionBehavior;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author OTHMAN AHMAD
 */
public class AgentPasswordService {

    SQLServerConnectionBehavior sscb = new SQLServerConnectionBehavior();
    Connection conn = sscb.getConnection();
    Statement stmt;
   
    public void generateNewPassword(){}
    public void updatePassword(){}
    
    public void diactivatePassword(){}
    
    public void activatePassword(){}
    
    
}
