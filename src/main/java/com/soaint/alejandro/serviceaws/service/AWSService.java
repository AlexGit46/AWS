package com.soaint.alejandro.serviceaws.service;

import java.io.IOException;

import org.springframework.stereotype.Service;

import com.soaint.alejandro.serviceaws.model.Contact;
import com.soaint.alejandro.serviceaws.utils.AWSUtilConvertObject;

@Service
public class AWSService { 
    private static AWSRequest req = new AWSRequest();
	private static AWSUtilConvertObject auc = new AWSUtilConvertObject();
	private static Contact con = new Contact();
    
    //----------------------ADD---------------------------------------------------------------------------   
	public String addContact(String json) throws IOException{		
		con = auc.convertcontact(json);	
		req.setEloqua(con);
		req.setServiceCloud(con);
		req.setRightNow(con);		
		return "El contacto "+con.getFirst()+" "+con.getLast()+" con mail "+con.getAddress()+" fue creado con éxito";		
	}
    //----------------------DELETE---------------------------------------------------------------------------   
	public String deleteContact(String email) throws IOException{		
		req.deleteContactEloqua(email);
		req.deleteContactLeadServiceCloud(email);
		req.deleteContactRightNow(email);
		return "El contacto con email "+email+" fue eliminado con éxito";
	}
	

	
	
	
	
	

    
    

    
    

	
	
}
