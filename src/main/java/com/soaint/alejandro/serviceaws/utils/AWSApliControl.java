package com.soaint.alejandro.serviceaws.utils;

import java.util.ResourceBundle;

public class AWSApliControl {
    private static final ResourceBundle PROPERTIES = ResourceBundle.getBundle("application");
        public String getURLRN(){
                return PROPERTIES.getString("URLRN");
            }
        public String getURLOSC(){
            return PROPERTIES.getString("URLOSC");
        }
        public String getURLELO(){
            return PROPERTIES.getString("URLELO");
        }
        public String getURLCON(){
            return PROPERTIES.getString("URLCON");
        }
        public String getURLLEAD(){
            return PROPERTIES.getString("URLLEAD");
        }
        public String getURLINC(){
            return PROPERTIES.getString("URLINC");
        }
        public String getURLDATELO(){
            return PROPERTIES.getString("URLDATELO");
        }
        public String getURLCONELO(){
            return PROPERTIES.getString("URLCONELO");
        }
        public String getURLRNEMAIL(){
            return PROPERTIES.getString("URLRNEMAIL");
        }
        public String getURLSCEMAIL(){
            return PROPERTIES.getString("URLSCEMAIL");
        }
        public String getURLSCNAME(){
            return PROPERTIES.getString("URLSCNAME");
        }
        public String getURLELEMAIL(){
            return PROPERTIES.getString("URLELEMAIL");
        }
        public String getGET(){
            return PROPERTIES.getString("GET");
        }
        public String getPOST(){
            return PROPERTIES.getString("POST");
        }
        public String getCRED(){
            return PROPERTIES.getString("CRED");
        }
        public String getCREDOSC(){
            return PROPERTIES.getString("CREDOSC");
        }
        public String getCREDELO(){
            return PROPERTIES.getString("CREDELO");
        }
        public String getPROPERTY_1(){
            return PROPERTIES.getString("PROPERTY_1");
        }
        public String getPROPERTY_2(){
        return PROPERTIES.getString("PROPERTY_2");
    }
}

