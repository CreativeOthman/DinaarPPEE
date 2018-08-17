/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtlap.paypoint.resource;

import java.sql.Connection;

/**
 *
 * @author OTHMAN AHMAD
 */
public interface ServerConnectionBehavior {
    
    Connection getConnection();
    String getConnectionUrl();
    
}
