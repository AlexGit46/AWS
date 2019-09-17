package com.soaint.alejandro.serviceaws.utils;

import java.util.Base64;

public class AWSUtilAuthorization {
	private static AWSApliControl apc = new AWSApliControl();

	public String basicAuth;
	public String auth;
	
	//CONVERT TO 64
  	private String convert64(String userCredentials){
  		basicAuth = "Basic " + new String(Base64.getEncoder().encode(userCredentials.getBytes()));
  		return basicAuth;
    }
	
  	//GET AUTHORIZATION ELOQUA
  	public String getAuthEloqua() {
  		auth = apc.getCREDELO();
  		return convert64(auth);		
    }
  	
    //GET AUTHORIZATION ELOQUA
  	public String getAuthServiceCloud() {
  		auth = apc.getCREDOSC();
  		return convert64(auth);
    }
  	
    //GET AUTHORIZATION ELOQUA
  	public String getAuthRightNow(){
  		auth = apc.getCRED();
  		return convert64(auth);
    }

}
