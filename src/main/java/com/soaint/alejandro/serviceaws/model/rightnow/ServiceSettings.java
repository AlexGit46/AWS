
package com.soaint.alejandro.serviceaws.model.rightnow;

import java.util.HashMap;
import java.util.Map;

public class ServiceSettings {

    private AnswerNotifications answerNotifications;
    private CategoryNotifications categoryNotifications;
    private ProductNotifications productNotifications;
    private SLAInstances sLAInstances;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public AnswerNotifications getAnswerNotifications() {
        return answerNotifications;
    }

    public void setAnswerNotifications(AnswerNotifications answerNotifications) {
        this.answerNotifications = answerNotifications;
    }

    public CategoryNotifications getCategoryNotifications() {
        return categoryNotifications;
    }

    public void setCategoryNotifications(CategoryNotifications categoryNotifications) {
        this.categoryNotifications = categoryNotifications;
    }

    public ProductNotifications getProductNotifications() {
        return productNotifications;
    }

    public void setProductNotifications(ProductNotifications productNotifications) {
        this.productNotifications = productNotifications;
    }

    public SLAInstances getSLAInstances() {
        return sLAInstances;
    }

    public void setSLAInstances(SLAInstances sLAInstances) {
        this.sLAInstances = sLAInstances;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
