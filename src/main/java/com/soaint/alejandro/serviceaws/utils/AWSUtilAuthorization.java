package com.soaint.alejandro.serviceaws.utils;

import java.io.IOException;
import java.util.Base64;

public class AWSUtilAuthorization {
	public static AWSApliControl apc = new AWSApliControl();
	
	//CONVERT TO 64
  	public String convert64(String userCredentials){
  		String basicAuth = "Basic " + new String(Base64.getEncoder().encode(userCredentials.getBytes())); 		
  		return basicAuth;
    }
	
  	//GET AUTHORIZATION ELOQUA
  	public String getAuthEloqua() throws IOException {
  		String auth="";
  		auth = apc.getCREDELO();
  		return convert64(auth);		
    }
  	
    //GET AUTHORIZATION ELOQUA
  	public String getAuthServiceCloud() throws IOException {
  		String auth="";
  		auth = apc.getCREDOSC();
  		return convert64(auth);
    }
  	
    //GET AUTHORIZATION ELOQUA
  	public String getAuthRightNow() throws IOException {
  		String auth="";
  		auth = apc.getCRED();
  		return convert64(auth);
    }

}
