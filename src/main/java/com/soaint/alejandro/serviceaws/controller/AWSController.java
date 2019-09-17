package com.soaint.alejandro.serviceaws.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.soaint.alejandro.serviceaws.service.AWSService;
import com.soaint.alejandro.serviceaws.utils.AWSUtilFormatter;

@RestController
public class AWSController {
	public static AWSUtilFormatter auf = new AWSUtilFormatter();

	@Autowired
	AWSService service;
	
	//----------------------END POINT ADD-------------------------------------------------------------------------------------------
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String addContacts(@RequestBody String json) throws IOException{	
		String json2 = auf.FormatJsonSend(json);
		return service.addContact(json2);
	}
	
	//----------------------END POINT DELETE---------------------------------------------------------------------------
	@RequestMapping(value="/delete/{email}", method=RequestMethod.DELETE)
	public String deleteContactSC(@PathVariable("email") String email) throws IOException{
		String email2 = auf.FurmatURISend(email);
		return service.deleteContact(email2);
	}
}
