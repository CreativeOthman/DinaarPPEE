/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtlap.paypoint.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author OTHMAN AHMAD
 */

@Path("/login")
@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
public class Login {
  
    @POST
    public void logUserIn(@FormParam("username")String username,@FormParam("password") String password){
                
    System.out.print(username+""+password);
    
    }
    
    
}
