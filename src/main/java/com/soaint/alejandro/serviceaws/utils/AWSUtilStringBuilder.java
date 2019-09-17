package com.soaint.alejandro.serviceaws.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

public class AWSUtilStringBuilder {
	
  	public StringBuilder stringBuild(int responseCode,HttpURLConnection conn) throws IOException {
  		StringBuilder response = new StringBuilder();
        System.out.println(responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String readLine = null;
            while ((readLine = in.readLine()) != null) {
                response.append(readLine).append("\n");
            }
            in.close();
        } else {
            System.out.println("GET NOT WORKED");
        }
        return response;
    }
}
