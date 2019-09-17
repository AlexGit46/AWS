package com.soaint.alejandro.serviceaws.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.soaint.alejandro.serviceaws.model.eloqua.ContactEL;
import com.soaint.alejandro.serviceaws.model.servicecloud.ContactSC;
import com.soaint.alejandro.serviceaws.model.servicecloud.Lead;
import com.soaint.alejandro.serviceaws.service.AWSRequest;

public class AWSUtilMapObject {
	public static AWSRequest req = new AWSRequest();
	
    public ContactEL contactel = new ContactEL();
    public ContactSC contactsc = new ContactSC();
    public Lead lead = new Lead();
	
    public static String ID;
	//MAPEO OBJETO CONTACTO ELOQUA
    public String mapEloquaContact(StringBuilder response) throws IOException {
		long id=0;
        try {
            JSONObject object = new JSONObject(response.toString());           
            if(object.has("elements")) {
        	   JSONArray items = new JSONArray();
               items = object.getJSONArray("elements");    
               if (items.length() > 0) {
            	   req.EXIST=true;           	
            	   id = ((JSONObject) items.get(0)).getInt("id");
               }else{          
                   req.EXIST=false;
               }   
           }else {
        	   System.out.println("Item not found");
           }            
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return String.valueOf(id);
    }
    
    //MAPEO OBJETO CONTACTO SERVICE CLOUD
    public String mapServiceCloudContact(StringBuilder response) throws IOException {
		long id=0;
        try {
            JSONObject object = new JSONObject(response.toString());
            if(object.has("items")) {
            	JSONArray items = new JSONArray();
            	items = object.getJSONArray("items");      
                if (items.length() > 0) {
                	req.EXIST=true;          	
                	id = ((JSONObject) items.get(0)).getInt("PartyNumber");
                	ID = String.valueOf(id);
                }else{               
                	req.EXIST=false;
                }
            }else {
         	   System.out.println("Item not found");
            }  
            
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return String.valueOf(id);
    }
    
    //MAPEO OBJETO LEAD SERVICE CLOUD
    public String mapServiceCloudLead(StringBuilder response) throws IOException {
		long id=0;
        try {
            JSONObject object = new JSONObject(response.toString());
            if(object.has("items")) {
	            JSONArray items = new JSONArray();
	            items = object.getJSONArray("items");     
	            if (items.length() > 0) {
	            	req.EXIST=true;          	
	            	id = ((JSONObject) items.get(0)).getLong("LeadId");
	            }else{            
	                req.EXIST=false;
	            }
	        }else {
	        	System.out.println("Item not found");
	        } 
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return String.valueOf(id);
    }
    
    //MAPEO OBJETO CONTACTO RIGHT NOW
    public String mapRightNowContact(StringBuilder response) throws IOException {
		long id=0;
        try {
            JSONObject object = new JSONObject(response.toString());
            if(object.has("items")) {
	            JSONArray items = new JSONArray();
	            items = object.getJSONArray("items");       
	            if (items.length() > 0) {
	            	req.EXIST=true;          	
	            	id = ((JSONObject) items.get(0)).getInt("id");
	            }else{
	            	req.EXIST=false;
	            }
            }else {
	        	System.out.println("Item not found");
	        } 
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return String.valueOf(id);
    }
}
