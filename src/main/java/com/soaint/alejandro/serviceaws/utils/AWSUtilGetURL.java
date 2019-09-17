package com.soaint.alejandro.serviceaws.utils;

public class AWSUtilGetURL {
    private static AWSApliControl apc = new AWSApliControl();

    public String URL="";
	//URL CONTACT ELOQUA
  	public String getURLEloquaContact(){
        URL=apc.getURLELO()+apc.getURLDATELO() +apc.getURLCONELO();
  		return URL;
    } 
  	
  	//URL QUERY EMAIL CONTACT ELOQUA
  	public String getURLEloquaContactMail(){
        URL=apc.getURLELO()+apc.getURLDATELO() +apc.getURLCON() +apc.getURLELEMAIL();
  		return URL;
    }
  	
    //URL CONTACT SERVICE CLOUD
  	public String getURLServiceCloudContact(){
        URL=apc.getURLOSC() + apc.getURLCON();
  		return URL;
    }
  	
    //URL QUERY EMAIL CONTACT SERVICE CLOUD
  	public String getURLServiceCloudContactMail(){
        URL=apc.getURLOSC()+apc.getURLCON() + apc.getURLSCEMAIL();
  		return URL;
    }
  	
    //URL LEAD SERVICE CLOUD
  	public String getURLServiceCloudLead(){
        URL=apc.getURLOSC() + apc.getURLLEAD();
  		return URL;
    }
  	
    //URL QUERY NAME CONTACT SERVICE CLOUD
  	public String getURLServiceCloudLeadName(){
        URL=apc.getURLOSC() + apc.getURLLEAD() + apc.getURLSCNAME();
  		return URL;
    }
  	
    //URL CONTACT RIGHT NOW
  	public String getURLRightNowContact(){
        URL=apc.getURLRN() + apc.getURLCON();
  		return URL;
    } 	
  	
    //URL QUERY MAIL CONTACT RIGHT NOW
  	public String getURLRightNowContactMail(){
        URL=apc.getURLRN() + apc.getURLCON()+apc.getURLRNEMAIL();
  		return URL;
    }
}
