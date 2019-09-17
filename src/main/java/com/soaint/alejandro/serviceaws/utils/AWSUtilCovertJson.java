package com.soaint.alejandro.serviceaws.utils;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.soaint.alejandro.serviceaws.model.eloqua.ContactEL;
import com.soaint.alejandro.serviceaws.model.rightnow.ContactRN;
import com.soaint.alejandro.serviceaws.model.servicecloud.ContactSC;
import com.soaint.alejandro.serviceaws.model.servicecloud.Lead;

public class AWSUtilCovertJson {
	ObjectMapper mapper = new ObjectMapper();
	
	//ELOQUA CONTACT TO JSON
  	public void convertToJsonContactEloqua(String tostring) throws IOException {
  		mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        String jsonInString = tostring;
        ContactEL contact = mapper.readValue(jsonInString, ContactEL.class);
    }
  	
  	//SERVICE CLOUD CONTACT TO JSON
  	public void convertToJsonContactServiceCloud(String tostring) throws IOException {
  		mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        String jsonInString = tostring;
        ContactSC contact = mapper.readValue(jsonInString, ContactSC.class);
    }
  	
  	//SERVICE CLOUD LEAD TO JSON
  	public void convertToJsonLeadServiceCloud(String tostring) throws IOException {
  		mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        String jsonInString = tostring;
        Lead contact = mapper.readValue(jsonInString, Lead.class);
    }
  	
  	//RIGHT NOW CONTACT TO JSON
  	public void convertToJsonContactRightNow(String tostring) throws IOException {
  		mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        String jsonInString = tostring;
        ContactRN contact = mapper.readValue(jsonInString, ContactRN.class);
    }

}
