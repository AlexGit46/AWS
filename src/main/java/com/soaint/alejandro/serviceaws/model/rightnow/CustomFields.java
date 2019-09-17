
package com.soaint.alejandro.serviceaws.model.rightnow;

import java.util.HashMap;
import java.util.Map;

public class CustomFields {

    private CO cO;
    private C c;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public CO getCO() {
        return cO;
    }

    public void setCO(CO cO) {
        this.cO = cO;
    }

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
