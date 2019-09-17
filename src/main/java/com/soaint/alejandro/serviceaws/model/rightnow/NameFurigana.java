
package com.soaint.alejandro.serviceaws.model.rightnow;

import java.util.HashMap;
import java.util.Map;

public class NameFurigana {

    private Object first;
    private Object last;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Object getFirst() {
        return first;
    }

    public void setFirst(Object first) {
        this.first = first;
    }

    public Object getLast() {
        return last;
    }

    public void setLast(Object last) {
        this.last = last;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
