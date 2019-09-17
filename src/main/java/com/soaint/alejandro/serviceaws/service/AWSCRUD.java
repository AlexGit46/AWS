package com.soaint.alejandro.serviceaws.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;

import com.soaint.alejandro.serviceaws.utils.*;

public class AWSCRUD {
    private static Properties p = new Properties(System.getProperties());
    private static AWSApliControl apc = new AWSApliControl();
    private static AWSRequest req = new AWSRequest();
    private static AWSUtilAuthorization aua = new AWSUtilAuthorization();
    private static AWSUtilStringBuilder aus = new AWSUtilStringBuilder();
    private static AWSUtilCovertJson aucj = new AWSUtilCovertJson();
    private static AWSUtilMapObject aum = new AWSUtilMapObject();

    public String userCredentials;
    int responseCode=0;

    //----------------------GET---------------------------------------------------------------------------	
    public String GET(String url) throws IOException {
  		InputStream is = new FileInputStream("application.properties");
  		p.load(is); 
  		String ret="";
        URL obj = new URL(url);
        HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
        conn.setRequestMethod(apc.getGET());
        System.out.println("hola"+req.API);
        switch(req.API) {case "ELOQUA":userCredentials = aua.getAuthEloqua();break;
        				 case "SERVICE_CLOUD":userCredentials = aua.getAuthServiceCloud();break;
        				 case "RIGHT_NOW":userCredentials = aua.getAuthRightNow();break;     	
        				}
        conn.setRequestProperty ("Authorization", userCredentials);
        int responseCode = conn.getResponseCode();
        StringBuilder response;
        response = aus.stringBuild(responseCode, conn);
        String tostring = response.toString();       
        switch(req.API) {case "ELOQUA":aucj.convertToJsonContactEloqua(tostring); ret = aum.mapEloquaContact(response);break;
        				 case "SERVICE_CLOUD":aucj.convertToJsonContactServiceCloud(tostring); ret = aum.mapServiceCloudContact(response);break;
        				 case "SERVICE_CLOUD_LEAD":aucj.convertToJsonLeadServiceCloud(tostring); ret = aum.mapServiceCloudLead(response);break;
        				 case "RIGHT_NOW":aucj.convertToJsonContactRightNow(tostring); ret = aum.mapRightNowContact(response);break;     	
        				}
        return ret;
    }

	//----------------------POST---------------------------------------------------------------------------	
    public void POST(String url, String param) throws IOException {
		InputStream is = new FileInputStream("application.properties");
		p.load(is);
        URL obj = new URL(url);
        HttpURLConnection postConnection = (HttpURLConnection) obj.openConnection();
        postConnection.setRequestMethod(apc.getPOST());
        postConnection.setRequestProperty(apc.getPROPERTY_1(), apc.getPROPERTY_2());
        switch(req.API) {case "ELOQUA":userCredentials = aua.getAuthEloqua();break;
        				 case "SERVICE_CLOUD":userCredentials = aua.getAuthServiceCloud();break;
        				 case "RIGHT_NOW":userCredentials = aua.getAuthRightNow();break;     	
        }
        postConnection.setRequestProperty ("Authorization", userCredentials); 
        postConnection.setDoOutput(true);
        OutputStream os = postConnection.getOutputStream();         
        os.write(param.getBytes());        
        os.flush();
        os.close();       
        responseCode = postConnection.getResponseCode();
        System.out.println("\nResponse Code:"+responseCode);
    }
    
    //----------------------DELETE---------------------------------------------------------------------------   
    public void DELETE(String url) throws IOException {
		InputStream is = new FileInputStream("application.properties");
		p.load(is);
        URL obj = new URL(url);
        HttpURLConnection postConnection = (HttpURLConnection) obj.openConnection();
        postConnection.setRequestMethod("DELETE");
        postConnection.setRequestProperty(apc.getPROPERTY_1(), apc.getPROPERTY_2());
        switch(req.API) {case "ELOQUA":userCredentials = aua.getAuthEloqua();break;
        				 case "SERVICE_CLOUD":userCredentials = aua.getAuthServiceCloud();break;
        				 case "RIGHT_NOW":userCredentials = aua.getAuthRightNow();        	break;     	
        				}
        postConnection.setRequestProperty ("Authorization", userCredentials);
        postConnection.setDoOutput(true);
        responseCode = postConnection.getResponseCode();
        System.out.println("\nResponse Code:"+responseCode);
    }
}
