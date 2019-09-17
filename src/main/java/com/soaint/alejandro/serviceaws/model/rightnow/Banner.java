
package com.soaint.alejandro.serviceaws.model.rightnow;

import java.util.HashMap;
import java.util.Map;

public class Banner {

    private Object importanceFlag;
    private Object text;
    private Object updatedByAccount;
    private Object updatedTime;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Object getImportanceFlag() {
        return importanceFlag;
    }

    public void setImportanceFlag(Object importanceFlag) {
        this.importanceFlag = importanceFlag;
    }

    public Object getText() {
        return text;
    }

    public void setText(Object text) {
        this.text = text;
    }

    public Object getUpdatedByAccount() {
        return updatedByAccount;
    }

    public void setUpdatedByAccount(Object updatedByAccount) {
        this.updatedByAccount = updatedByAccount;
    }

    public Object getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Object updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
