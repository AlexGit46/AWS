
package com.soaint.alejandro.serviceaws.model.rightnow;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Notes {

    private List<Link____> links = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<Link____> getLinks() {
        return links;
    }

    public void setLinks(List<Link____> links) {
        this.links = links;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
