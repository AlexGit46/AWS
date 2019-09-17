
package com.soaint.alejandro.serviceaws.model.rightnow;

import java.util.HashMap;
import java.util.Map;

public class MarketingSettings {

    private ContactLists contactLists;
    private Object emailFormat;
    private Object marketingOptIn;
    private Object marketingOrganizationName;
    private Object marketingOrganizationNameAlt;
    private Object surveyOptIn;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public ContactLists getContactLists() {
        return contactLists;
    }

    public void setContactLists(ContactLists contactLists) {
        this.contactLists = contactLists;
    }

    public Object getEmailFormat() {
        return emailFormat;
    }

    public void setEmailFormat(Object emailFormat) {
        this.emailFormat = emailFormat;
    }

    public Object getMarketingOptIn() {
        return marketingOptIn;
    }

    public void setMarketingOptIn(Object marketingOptIn) {
        this.marketingOptIn = marketingOptIn;
    }

    public Object getMarketingOrganizationName() {
        return marketingOrganizationName;
    }

    public void setMarketingOrganizationName(Object marketingOrganizationName) {
        this.marketingOrganizationName = marketingOrganizationName;
    }

    public Object getMarketingOrganizationNameAlt() {
        return marketingOrganizationNameAlt;
    }

    public void setMarketingOrganizationNameAlt(Object marketingOrganizationNameAlt) {
        this.marketingOrganizationNameAlt = marketingOrganizationNameAlt;
    }

    public Object getSurveyOptIn() {
        return surveyOptIn;
    }

    public void setSurveyOptIn(Object surveyOptIn) {
        this.surveyOptIn = surveyOptIn;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
