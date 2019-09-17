
package com.soaint.alejandro.serviceaws.model.eloqua;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContactEL {

    private String type;
    private String currentStatus;
    private String id;
    private String createdAt;
    private String depth;
    private String name;
    private String updatedAt;
    private String emailAddress;
    private String emailFormatPreference;
    private List<FieldValue> fieldValues = null;
    private String firstName;
    private String isBounceback;
    private String isSubscribed;
    private String lastName;
    private String subscriptionDate;
    //private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public ContactEL(String emailAddress, String firstName, String lastName) {
		super();
		this.emailAddress = emailAddress;
		this.firstName = firstName;
		this.lastName = lastName;
	}
    
    

	public ContactEL(String type, String currentStatus, String id, String createdAt, String depth, String name,
			String updatedAt, String emailAddress, String emailFormatPreference, List<FieldValue> fieldValues,
			String firstName, String isBounceback, String isSubscribed, String lastName, String subscriptionDate) {
		super();
		this.type = type;
		this.currentStatus = currentStatus;
		this.id = id;
		this.createdAt = createdAt;
		this.depth = depth;
		this.name = name;
		this.updatedAt = updatedAt;
		this.emailAddress = emailAddress;
		this.emailFormatPreference = emailFormatPreference;
		this.fieldValues = fieldValues;
		this.firstName = firstName;
		this.isBounceback = isBounceback;
		this.isSubscribed = isSubscribed;
		this.lastName = lastName;
		this.subscriptionDate = subscriptionDate;
	}

	public ContactEL() {
		super();
	}

	public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailFormatPreference() {
        return emailFormatPreference;
    }

    public void setEmailFormatPreference(String emailFormatPreference) {
        this.emailFormatPreference = emailFormatPreference;
    }

    public List<FieldValue> getFieldValues() {
        return fieldValues;
    }

    public void setFieldValues(List<FieldValue> fieldValues) {
        this.fieldValues = fieldValues;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getIsBounceback() {
        return isBounceback;
    }

    public void setIsBounceback(String isBounceback) {
        this.isBounceback = isBounceback;
    }

    public String getIsSubscribed() {
        return isSubscribed;
    }

    public void setIsSubscribed(String isSubscribed) {
        this.isSubscribed = isSubscribed;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubscriptionDate() {
        return subscriptionDate;
    }

    public void setSubscriptionDate(String subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }

//    public Map<String, Object> getAdditionalProperties() {
//        return this.additionalProperties;
//    }
//
//    public void setAdditionalProperty(String name, Object value) {
//        this.additionalProperties.put(name, value);
//    }

}
