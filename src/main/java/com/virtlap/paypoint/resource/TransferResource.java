/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtlap.paypoint.resource;

import com.virtlap.paypoint.models.transferModels.Transfer;
import com.virtlap.paypoint.services.TransferService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author OTHMAN AHMAD
 */
@Path("transfers")
public class TransferResource {

    TransferService ts = new TransferService();

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Transfer> getAllTransfers() {

        return ts.getTransfers();

    }

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response sendTransfer(@FormParam("sfname") String sfname, @FormParam("slname") String slname, @FormParam("sphone") String sphone, @FormParam("bfname") String bfname, @FormParam("blname") String blname, @FormParam("bphone") String bphone, @FormParam("bankCode") int bankCode, @FormParam("nuban") String nuban, @FormParam("amount") Long amount, @FormParam("agentID") int agentID, @FormParam("spID") int spID) {

        Transfer tranfer = new Transfer(sfname, slname, sphone, bankCode, nuban, bfname, blname, bphone, amount, agentID, spID);

        return ts.sendTransfer(tranfer);

    }

}
