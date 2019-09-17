
package com.soaint.alejandro.serviceaws.model.rightnow;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SLAInstances {

    private List<Link__________> links = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<Link__________> getLinks() {
        return links;
    }

    public void setLinks(List<Link__________> links) {
        this.links = links;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
