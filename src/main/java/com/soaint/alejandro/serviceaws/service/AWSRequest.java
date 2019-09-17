package com.soaint.alejandro.serviceaws.service;

import java.io.IOException;

import com.soaint.alejandro.serviceaws.model.Contact;
import com.soaint.alejandro.serviceaws.utils.AWSUtilConvertObject;
import com.soaint.alejandro.serviceaws.utils.AWSUtilGetURL;

public class AWSRequest {

	private static AWSCRUD crud = new AWSCRUD();
	private static AWSUtilConvertObject auc = new AWSUtilConvertObject();
	private static AWSUtilGetURL aug = new AWSUtilGetURL();

    public static boolean EXIST;
	public static String API;

	private String param="";
	private String url="";

  //----------------------ADD---------------------------------------------------------------------------
  	public void setEloqua(Contact con) throws IOException {
        API="ELOQUA";
        System.out.println(API);
	    param = auc.convertEloquaContact();
	    url = aug.getURLEloquaContactMail()+ "'" + con.getAddress() + "'";
	    crud.GET(url);
	    url = aug.getURLEloquaContact();
	    if(!EXIST) {
	    	crud.POST(url,param);
	    }
    }

	public void setServiceCloud(Contact con) throws IOException {
        API="SERVICE_CLOUD";
    	param = auc.convertServiceCloudContact();
    	url = aug.getURLServiceCloudContactMail()+ "'" + con.getAddress() + "'";
    	crud.GET(url);
    	url = aug.getURLServiceCloudContact();
    	if(!EXIST) {
    		crud.POST(url,param);
    		url = aug.getURLServiceCloudContactMail()+ "'" + con.getAddress() + "'";
    		crud.GET(url);
    			API = "SERVICE_CLOUD_LEAD";
    			param = auc.convertServiceCloudLead();
    			url = aug.getURLServiceCloudLead();
    			crud.POST(url,param);
    	}
    }

	public void setRightNow(Contact con) throws IOException {
        API="RIGHT_NOW";
    	param = auc.convertRightNowContact();
    	url = aug.getURLRightNowContactMail()+ "'" + con.getAddress() + "'";
    	crud.GET(url);
    	url = aug.getURLRightNowContact();
    	if(!EXIST) {
    		crud.POST(url,param);
    	}
    } 
      
	//----------------------DELETE---------------------------------------------------------------------------		
	public void deleteContactEloqua(String email) throws IOException{
        String id;
	    API = "ELOQUA";
        url = aug.getURLEloquaContactMail() + "'" + email + "'";
		id = crud.GET(url);
		url = aug.getURLEloquaContact() + "/" + id;
		crud.DELETE(url);
	}

	public void deleteContactLeadServiceCloud(String email) throws IOException{
        String id;
	    API = "SERVICE_CLOUD";
        url = aug.getURLServiceCloudContactMail() + "'" + email + "'";
		id = crud.GET(url);
		url = aug.getURLServiceCloudContact() + "/" + id;
		crud.DELETE(url);
			API = "SERVICE_CLOUD_LEAD";
			url = aug.getURLServiceCloudLeadName()+ "'" + email + " Lead" + "'";
			id = crud.GET(url);
			url = aug.getURLServiceCloudLead() + "/" + id;
			crud.DELETE(url);
	}

	public void deleteContactRightNow(String email) throws IOException{
        String id;
	    API = "RIGHT_NOW";
        url = aug.getURLRightNowContactMail() + "'" + email + "'";
		id = crud.GET(url);
		url = aug.getURLRightNowContact() + "/" + id;
		crud.DELETE(url);
	}
}

