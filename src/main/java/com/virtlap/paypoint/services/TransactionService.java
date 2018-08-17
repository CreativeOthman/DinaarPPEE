/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtlap.paypoint.services;

import com.virtlap.paypoint.models.Transaction;
import com.virtlap.paypoint.resource.SQLServerConnectionBehavior;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author OTHMAN AHMAD
 */
public class TransactionService {
    
    SQLServerConnectionBehavior sscb = new SQLServerConnectionBehavior();
    Connection conn = sscb.getConnection(); 
    Statement stmt;

    public List<Transaction> getTransactions() {
        List<Transaction> Transactions = new ArrayList();
        
        try {
            this.stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Transactions");
            while(rs.next()){
            Transaction transaction = new Transaction(rs.getInt(1),rs.getInt(2),rs.getDate(3),rs.getInt(4));
                
            Transactions.add(transaction);
         
            }
        } catch (SQLException ex) {
            Logger.getLogger(TransactionService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return Transactions;
    }
    }
    
    
    
    

