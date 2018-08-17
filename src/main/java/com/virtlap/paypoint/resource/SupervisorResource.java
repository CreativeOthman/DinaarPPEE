/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtlap.paypoint.resource;


import com.virtlap.paypoint.models.agentModels.Agent;
import com.virtlap.paypoint.models.supervisorModels.Supervisor;
import com.virtlap.paypoint.services.AgentServices.AgentService;
import com.virtlap.paypoint.services.SupervisorServices.SupervisorService;
import java.util.List;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 *
 * @author OTHMAN AHMAD
 */

@Singleton
@Path("supervisors")
public class SupervisorResource {
    
    SupervisorService ss = new SupervisorService();
    AgentService as = new AgentService();
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Supervisor> getSupervisors(){
         return ss.getSupervisors();
    }
    
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_XML)
    public List<Supervisor> getSupervisorsById(@PathParam("id") int id){
    
     return ss.getSupervisorsById(id);
    
    }
    
    @GET
    @Path("{id}/agents")
    @Produces(MediaType.APPLICATION_XML)
    public List<Agent> getAgentsBySPId(@PathParam("id") int id){        
       return  as.getAgentbySPID(id);
    
    }
    
   
    
}
