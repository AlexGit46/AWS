package com.soaint.alejandro.serviceaws.utils;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.soaint.alejandro.serviceaws.model.Contact;
import com.soaint.alejandro.serviceaws.model.eloqua.ContactEL;
import com.soaint.alejandro.serviceaws.model.rightnow.AddressType;
import com.soaint.alejandro.serviceaws.model.rightnow.ContactRN;
import com.soaint.alejandro.serviceaws.model.rightnow.Emails;
import com.soaint.alejandro.serviceaws.model.rightnow.Name;
import com.soaint.alejandro.serviceaws.model.servicecloud.ContactSC;
import com.soaint.alejandro.serviceaws.model.servicecloud.Lead;

public class AWSUtilConvertObject {
	public static AWSUtilMapObject aum = new AWSUtilMapObject();
	ObjectMapper mapper = new ObjectMapper();
	public static Contact crn = new Contact();
    ContactEL contactel = new ContactEL();
    ContactSC contactsc = new ContactSC();
    Lead lead = new Lead();
	AddressType adtype = new AddressType(0);
	Emails emails = new Emails(crn.getAddress(), adtype);
	Name name = new Name(crn.getFirst(),crn.getLast());
	ContactRN contactrn = new ContactRN(emails,name);
	
	//CONVERT TO OBJECT ENTRY JSON
  	public Contact convertcontact(String json) throws IOException {
    	mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        crn = mapper.readValue(json, Contact.class);
        System.out.println(crn); 
        return crn;
    }
	
	 //CREATE CONTACT ELOQUA
    public String convertEloquaContact() throws IOException {
    	mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    	String param ="";  
		contactel = new ContactEL(crn.getAddress(),crn.getFirst(),crn.getLast());
		param=mapper.writeValueAsString(contactel);	
		return param;
    }

    //CREATE CONTACT SERVICE CLOUD
    public String convertServiceCloudContact() throws IOException {
    	mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    	String param ="";  
    	contactsc = new ContactSC(crn.getFirst(),crn.getLast(),crn.getAddress());
    	param=mapper.writeValueAsString(contactsc);
    	return param;
    } 
    
    //CREATE LEAD SERVICE CLOUD
    public String convertServiceCloudLead() throws IOException {
    	mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    	String param ="";  
    	lead = new Lead(contactsc.getEmailAddress()+" Lead",aum.ID);
    	param=mapper.writeValueAsString(lead);
    	return param;
    }
        
    //CREATE CONTACT RIGHT NOW
    public String convertRightNowContact() throws IOException {
    	mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    	String param ="";  
		adtype = new AddressType(0);
		emails = new Emails(crn.getAddress(), adtype);
		name = new Name(crn.getFirst(),crn.getLast());
		contactrn = new ContactRN(emails,name);
		param=mapper.writeValueAsString(contactrn);	
		return param;
    }
}
