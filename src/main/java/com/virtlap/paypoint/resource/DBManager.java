/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtlap.paypoint.resource;

import com.virtlap.paypoint.models.agentModels.Agent;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author OTHMAN AHMAD
 */
public class DBManager implements Serializable{
  SQLServerConnectionBehavior sscb = new SQLServerConnectionBehavior();
  Agent agent = new Agent();
  Connection conn = sscb.getConnection();
  Statement stmt;

    
  public ArrayList getAgent(){
          ArrayList Agents = new ArrayList();
      
     
      try {
          this.stmt = conn.createStatement();
          ResultSet rs = stmt.executeQuery("SELECT * FROM tblAgents");
          while(rs.next()){
            String first = rs.getString(1);
            String  last = rs.getString(2);
            int balance = rs.getInt(4);
               
            Agents.add(first);
            Agents.add(last);
            Agents.add(balance);
          }
      } catch (SQLException ex) {
          Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
      }
      
          
      return Agents;
      
      
     
   
  
  }
  
  
    
}
