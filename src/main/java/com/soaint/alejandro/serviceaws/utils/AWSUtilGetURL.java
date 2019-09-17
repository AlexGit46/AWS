package com.soaint.alejandro.serviceaws.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AWSUtilGetURL {
    public static AWSApliControl apc = new AWSApliControl();

	//URL CONTACT ELOQUA
  	public String getURLEloquaContact() throws IOException {
        String URL="";
        URL=apc.getURLELO()+apc.getURLDATELO() +apc.getURLCONELO();
  		return URL;
    } 
  	
  	//URL QUERY EMAIL CONTACT ELOQUA
  	public String getURLEloquaContactMail() throws IOException {
        String URL="";
        URL=apc.getURLELO()+apc.getURLDATELO() +apc.getURLCON() +apc.getURLELEMAIL();
  		return URL;
    }
  	
    //URL CONTACT SERVICE CLOUD
  	public String getURLServiceCloudContact() throws IOException {
        String URL="";
        URL=apc.getURLOSC() + apc.getURLCON();
  		return URL;
    }
  	
    //URL QUERY EMAIL CONTACT SERVICE CLOUD
  	public String getURLServiceCloudContactMail() throws IOException {
        String URL="";
        URL=apc.getURLOSC()+apc.getURLCON() + apc.getURLSCEMAIL();
  		return URL;
    }
  	
    //URL LEAD SERVICE CLOUD
  	public String getURLServiceCloudLead() throws IOException {
        String URL="";
        URL=apc.getURLOSC() + apc.getURLLEAD();
  		return URL;
    }
  	
    //URL QUERY NAME CONTACT SERVICE CLOUD
  	public String getURLServiceCloudLeadName() throws IOException {
        String URL="";
        URL=apc.getURLOSC() + apc.getURLLEAD() + apc.getURLSCNAME();
  		return URL;
    }
  	
    //URL CONTACT RIGHT NOW
  	public String getURLRightNowContact() throws IOException {
        String URL="";
        URL=apc.getURLRN() + apc.getURLCON();
  		return URL;
    } 	
  	
    //URL QUERY MAIL CONTACT RIGHT NOW
  	public String getURLRightNowContactMail() throws IOException {
        String URL="";
        URL=apc.getURLRN() + apc.getURLCON()+apc.getURLRNEMAIL();
  		return URL;
    }
}
