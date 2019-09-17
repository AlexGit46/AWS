
package com.soaint.alejandro.serviceaws.model.rightnow;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnswerNotifications {

    private List<Link_______> links = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<Link_______> getLinks() {
        return links;
    }

    public void setLinks(List<Link_______> links) {
        this.links = links;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
