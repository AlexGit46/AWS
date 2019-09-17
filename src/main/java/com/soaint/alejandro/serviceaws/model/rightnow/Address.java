
package com.soaint.alejandro.serviceaws.model.rightnow;

import java.util.HashMap;
import java.util.Map;

public class Address {

    private Object city;
    private Object country;
    private Object postalCode;
    private Object stateOrProvince;
    private Object street;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Object getCity() {
        return city;
    }

    public void setCity(Object city) {
        this.city = city;
    }

    public Object getCountry() {
        return country;
    }

    public void setCountry(Object country) {
        this.country = country;
    }

    public Object getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Object postalCode) {
        this.postalCode = postalCode;
    }

    public Object getStateOrProvince() {
        return stateOrProvince;
    }

    public void setStateOrProvince(Object stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
    }

    public Object getStreet() {
        return street;
    }

    public void setStreet(Object street) {
        this.street = street;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
