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
	private static AWSRequest req = new AWSRequest();
    private ContactEL contactel = new ContactEL();
    private ContactSC contactsc = new ContactSC();
    private Lead lead = new Lead();
    public static String ID;
    JSONArray items;

	//MAPEO OBJETO CONTACTO ELOQUA
    public String mapEloquaContact(StringBuilder response){
		long id=0;
        try {
            JSONObject object = new JSONObject(response.toString());           
            if(object.has("elements")) {
        	   items = new JSONArray();
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
    public String mapServiceCloudContact(StringBuilder response){
		long id=0;
        try {
            JSONObject object = new JSONObject(response.toString());
            if(object.has("items")) {
            	items = new JSONArray();
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
    public String mapServiceCloudLead(StringBuilder response){
		long id=0;
        try {
            JSONObject object = new JSONObject(response.toString());
            if(object.has("items")) {
	            items = new JSONArray();
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
    public String mapRightNowContact(StringBuilder response){
		long id=0;
        try {
            JSONObject object = new JSONObject(response.toString());
            if(object.has("items")) {
	            items = new JSONArray();
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
