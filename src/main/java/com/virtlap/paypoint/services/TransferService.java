/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtlap.paypoint.services;


import com.virtlap.paypoint.models.transferModels.Transfer;
import com.virtlap.paypoint.resource.SQLServerConnectionBehavior;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.Response;

/**
 *
 * @author OTHMAN AHMAD
 */
public class TransferService {
   SQLServerConnectionBehavior sscb = new SQLServerConnectionBehavior();
   Connection conn = sscb.getConnection();
   Statement stmt;
   
   public List<Transfer> getTransfers(){
       List<Transfer> transfers = new ArrayList(); 
       try {
           stmt =conn.createStatement();
           ResultSet rs =stmt.executeQuery("SELECT * FROM tblTransfers");
           
           while(rs.next()){
            
               int transferID = rs.getInt("transferID");
               String sfirstName = rs.getString("sfirstName");
               String slastName = rs.getString("slastName");
               String sphone = rs.getString("sphone");
               int bankCode = rs.getInt("bankCode");
               String nuban = rs.getString("nuban");
               String bfirstName = rs.getString("bfirstName");
               String blastName = rs.getString("blastName");
               String bphone = rs.getString("bphone");
               Long amount = rs.getLong("amount");
               int agentID = rs.getInt("agentID");
               String dateCreated = rs.getString("dateCreated");
               int statusCode =rs.getInt("statusCode");
               int supervisorID = rs.getInt("supervisorID");
               
               Transfer transfer = new Transfer(transferID,sfirstName,slastName,sphone,bankCode,nuban,bfirstName,blastName,bphone,amount,agentID,dateCreated,statusCode,supervisorID);
                transfers.add(transfer);
           }  
           
       } catch (SQLException ex) {
           Logger.getLogger(TransferService.class.getName()).log(Level.SEVERE, null, ex);
       }
   
   
   
       return transfers;
       
   }
   public List<Transfer> getTransfersByID(int id){
       List<Transfer> transfers = new ArrayList(); 
       try {
           stmt =conn.createStatement();
           ResultSet rs =stmt.executeQuery("SELECT * FROM tblTransfers Where agentID = "+id);
           
           
           while(rs.next()){
            
               int transferID = rs.getInt("transferID");
               String sfirstName = rs.getString("sfirstName");
               String slastName = rs.getString("slastName");
               String sphone = rs.getString("sphone");
               int bankCode = rs.getInt("bankCode");
               String nuban = rs.getString("nuban");
               String bfirstName = rs.getString("bfirstName");
               String blastName = rs.getString("blastName");
               String bphone = rs.getString("bphone");
               Long amount = rs.getLong("amount");
               int agentID = rs.getInt("agentID");
               String dateCreated = rs.getString("dateCreated");
               int statusCode =rs.getInt("statusCode");
               int supervisorID = rs.getInt("supervisorID");
               
               Transfer transfer = new Transfer(transferID,sfirstName,slastName,sphone,bankCode,nuban,bfirstName,blastName,bphone,amount,agentID,dateCreated,statusCode,supervisorID);
                transfers.add(transfer);
           }  
           
       } catch (SQLException ex) {
           Logger.getLogger(TransferService.class.getName()).log(Level.SEVERE, null, ex);
       }
   
   
   
       return transfers;
       
   }
   
   
   
   public Response sendTransfer(Transfer transfer){
   
       PreparedStatement ps = null;
    
           String sql = "insert into tblTransfers(sfirstName,slastname,sphone,bankCode,nuban,bfirstName,blastName,bphone,amount,agentID,dateCreated,statusCode,supervisorID) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
       try {
           ps = conn.prepareStatement(sql);
           
           ps.setString(1, transfer.getSfName());
           ps.setString(2, transfer.getSfName());
           ps.setString(3, transfer.getSphone());
           ps.setInt(4, transfer.getBankCode());
           ps.setString(5, transfer.getNuban());
           ps.setString(6, transfer.getBfName());
           ps.setString(7, transfer.getBlName());
           ps.setString(8, transfer.getBphone());
           ps.setLong(9, transfer.getAmount());
           ps.setInt(10, transfer.getAgentID());
           ps.setString(11,transfer.getDateCreated());
           ps.setInt(12, transfer.getStatusCode());
           ps.setInt(13, transfer.getSupervisorID());
         
           ps.execute();
     
       } catch (SQLException ex) {
           Logger.getLogger(TransferService.class.getName()).log(Level.SEVERE, null, ex);
       }
   
       return Response.status(Response.Status.CREATED).entity("Transfer Has Been Sent").build();
   
   
   
   }
}
