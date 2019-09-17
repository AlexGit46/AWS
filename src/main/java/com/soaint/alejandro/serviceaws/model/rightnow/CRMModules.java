
package com.soaint.alejandro.serviceaws.model.rightnow;

import java.util.HashMap;
import java.util.Map;

public class CRMModules {

    private Boolean marketing;
    private Boolean sales;
    private Boolean service;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Boolean getMarketing() {
        return marketing;
    }

    public void setMarketing(Boolean marketing) {
        this.marketing = marketing;
    }

    public Boolean getSales() {
        return sales;
    }

    public void setSales(Boolean sales) {
        this.sales = sales;
    }

    public Boolean getService() {
        return service;
    }

    public void setService(Boolean service) {
        this.service = service;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
