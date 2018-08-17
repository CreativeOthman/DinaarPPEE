/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtlap.paypoint.services.AgentServices;

import com.virtlap.paypoint.models.agentModels.AccountBalance;
import com.virtlap.paypoint.models.agentModels.Agent;
import com.virtlap.paypoint.models.supervisorModels.Supervisor;
import com.virtlap.paypoint.resource.DBManager;
import com.virtlap.paypoint.resource.SQLServerConnectionBehavior;
import com.virtlap.paypoint.services.SupervisorServices.SupervisorService;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.Response;



/**
 *
 * @author OTHMAN AHMAD
 */
public class AgentService  {
    
    SQLServerConnectionBehavior sscb = new SQLServerConnectionBehavior();
    Connection conn = sscb.getConnection();
    Statement stmt;

    
  public List<Agent> getAgent(){
          
      List<Agent> Agents = new ArrayList();
      
     
      try {
          this.stmt = conn.createStatement();
          ResultSet rs = stmt.executeQuery("SELECT * FROM tblAgents");
          while(rs.next()){
              int id = rs.getInt("agentID");
              String firstName = rs.getString("firstName");
              String lastName = rs.getString("lastName");
              String phone = rs.getString("phone");
              Date date= rs.getDate("dateCreated");
              List<Supervisor> supervisorID = new SupervisorService().getSupervisorsById(rs.getInt("supervisorID"));
              List<AccountBalance> accountDetails = new AgentAccountService().getAccountDetails(id);
              Date dateModified = rs.getDate("dateModified");
              
              Agent agent = new Agent(id,firstName,lastName,phone,date,supervisorID,accountDetails,dateModified);
            
               
            
            Agents.add(agent);
          }
      } catch (SQLException ex) {
          Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
      }
      
          

    return  Agents;
    
    }
  
   public List<Agent> getAgentbyID(int id){
        List<Agent> Agents = new ArrayList();
      
     
      try {
          this.stmt = conn.createStatement();
          ResultSet rs = stmt.executeQuery("SELECT * FROM tblAgents where agentID = "+id);
          while(rs.next()){
              int agentID = rs.getInt("agentID");
              String firstName = rs.getString("firstName");
              String lastName = rs.getString("lastName");
              String phone = rs.getString("phone");
              Date date= rs.getDate("dateCreated");
              List<Supervisor> supervisorID = new SupervisorService().getSupervisorsById(rs.getInt("supervisorID"));
              List<AccountBalance> accountDetails = new AgentAccountService().getAccountDetails(id);
              Date dateModified = rs.getDate("dateModified");
              
              Agent agent = new Agent(agentID,firstName,lastName,phone,date,supervisorID,accountDetails,dateModified);
               
            
            Agents.add(agent);
          }
      } catch (SQLException ex) {
          Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
      }
      
          

    return  Agents;
    
       
    }
   public List<Agent> getAgentbySPID(int id){
        List<Agent> Agents = new ArrayList();
      
     
      try {
          this.stmt = conn.createStatement();
          ResultSet rs = stmt.executeQuery("SELECT * FROM tblAgents where supervisorID = "+id);
          while(rs.next()){
              int agentID = rs.getInt("agentID");
              String firstName = rs.getString("firstName");
              String lastName = rs.getString("lastName");
              String phone = rs.getString("phone");
              Date date= rs.getDate("dateCreated");
              //int supervisorID = rs.getInt("supervisorID");
              List<AccountBalance> accountDetails = new AgentAccountService().getAccountDetails(agentID);
              List<Supervisor> supervisorID = new SupervisorService().getSupervisorsById(rs.getInt("supervisorID"));
              Date dateModified = rs.getDate("dateModified");
              
              Agent agent = new Agent(agentID,firstName,lastName,phone,date,supervisorID,accountDetails,dateModified);
               
            
            Agents.add(agent);
          }
      } catch (SQLException ex) {
          Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
      }
      
          

    return  Agents;
    
       
    }
   
   public Response createAgent(Agent agent){    
       String sql ="insert into tblAgents (firstName,lastName,phone,balance,dateCreated,supervisorID) values(?,?,?,?)";
      try {
          PreparedStatement ps = conn.prepareStatement(sql);
          ps.setString(1,agent.getFirstName());
          ps.setString(2,agent.getLastName());
          ps.setString(3,agent.getPhone());
          ps.setInt(5,agent.getSupervisorID());
          
          ps.execute();
          conn.close();
          
      } catch (SQLException ex) {
          Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
      }
      
          
return Response.status(Response.Status.CREATED).entity(agent).build();
        
       
    }
  

}
