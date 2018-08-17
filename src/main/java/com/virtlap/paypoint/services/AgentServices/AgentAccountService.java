/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtlap.paypoint.services.AgentServices;

import com.virtlap.paypoint.models.agentModels.AccountBalance;
import com.virtlap.paypoint.resource.SQLServerConnectionBehavior;
import com.virtlap.paypoint.services.SupervisorServices.SupervisorService;
import java.sql.Connection;
import java.sql.Date;
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
public class AgentAccountService {

    SQLServerConnectionBehavior sscb = new SQLServerConnectionBehavior();
    Connection conn = sscb.getConnection();
    Statement stmt;

    public List<AccountBalance> getAccountDetails(int id) {
        List<AccountBalance> AccountDetails = new ArrayList();
        try {
            stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM AccountBalance WHERE AccountID ="+id);
            while (rs.next()) {
                int AccountID = rs.getInt("AccountID");
                int MainBalance = rs.getInt("Balance");
                int Comission = rs.getInt("Comission");
                int UnsettledComission = rs.getInt("UnsettledCommision");

                AccountBalance AccountDetail = new AccountBalance(AccountID,MainBalance,Comission,UnsettledComission);
                AccountDetails.add(AccountDetail);
               

            }

        } catch (SQLException ex) {
            Logger.getLogger(SupervisorService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return AccountDetails;

    }

}
