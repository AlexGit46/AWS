
package com.soaint.alejandro.serviceaws.model.rightnow;

import java.util.HashMap;
import java.util.Map;

public class SalesSettings {

    private Object acquiredDate;
    private Object salesAccount;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Object getAcquiredDate() {
        return acquiredDate;
    }

    public void setAcquiredDate(Object acquiredDate) {
        this.acquiredDate = acquiredDate;
    }

    public Object getSalesAccount() {
        return salesAccount;
    }

    public void setSalesAccount(Object salesAccount) {
        this.salesAccount = salesAccount;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
