/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtlap.paypoint.resource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author OTHMAN AHMAD
 */
public class SQLServerConnectionBehavior implements ServerConnectionBehavior {
    
    @Override
    public Connection getConnection() {
            Connection conn = null;
        try {
            
            String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            String userName = "DinaarAdmin";
            String password = "admin";
            Class.forName(driver);
            
             conn = DriverManager.getConnection(getConnectionUrl(),userName,password);
          
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SQLServerConnectionBehavior.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        return conn;
    }

    @Override
    public String getConnectionUrl() {     
        String url = "jdbc:sqlserver://OTHMANAHMAD\\SQLEXPRESS14;databaseName=DinaarPayPoint;";
        return url;
    }
    
}
