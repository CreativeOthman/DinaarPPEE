/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtlap.paypoint.resource;

import com.virtlap.paypoint.models.agentModels.Agent;
import com.virtlap.paypoint.models.transferModels.Transfer;
import com.virtlap.paypoint.services.AgentServices.AgentService;
import com.virtlap.paypoint.services.TransferService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author OTHMAN AHMAD
 */
 
 @Path("agents")
 @Produces(MediaType.APPLICATION_XML)
public class AgentResource {
    
    AgentService AS = new AgentService();
    
   
    @GET
    public List<Agent> getAgents(){        
       return  AS.getAgent();
    
    }
    TransferService ts = new TransferService();
    //09067027911
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_XML)
    public List<Agent> getAgentsById(@PathParam("id") int id){        
       return  AS.getAgentbyID(id);
    

    }
    
    @GET
    @Path("{id}/transfers")
    @Produces(MediaType.APPLICATION_XML)
    public List<Transfer> getAllTransfers(@PathParam("id") int id) {

        return ts.getTransfersByID(id);
    }
    
    
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response addAgent(@FormParam("fname") String fname,@FormParam("lname") String lname
    ,@FormParam("phone") String phone,@FormParam("supervisorID") int spID){
        
         Agent agent = new Agent(fname,lname,phone,spID);
         return AS.createAgent(agent);
         
    }
    

    
    
}
