
package com.soaint.alejandro.serviceaws.model.rightnow;

import java.util.HashMap;
import java.util.Map;

public class Name {

    private String first;
    private String last;
    //private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    

    public Name(String first, String last) {
		super();
		this.first = first;
		this.last = last;
	}

    public Name() {
		super();
	}



	public String getFirst() {
        return first;
    }

	public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

//    public Map<String, Object> getAdditionalProperties() {
//        return this.additionalProperties;
//    }
//
//    public void setAdditionalProperty(String name, Object value) {
//        this.additionalProperties.put(name, value);
//    }

}
