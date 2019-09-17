
package com.soaint.alejandro.serviceaws.model.servicecloud;

import java.util.HashMap;
import java.util.Map;

public class Properties {

    private String changeIndicator;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getChangeIndicator() {
        return changeIndicator;
    }

    public void setChangeIndicator(String changeIndicator) {
        this.changeIndicator = changeIndicator;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
