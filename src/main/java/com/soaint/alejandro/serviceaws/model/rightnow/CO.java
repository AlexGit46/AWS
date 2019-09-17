
package com.soaint.alejandro.serviceaws.model.rightnow;

import java.util.HashMap;
import java.util.Map;

public class CO {

    private Object prueba;
    private Object prueba55;
    private Object reservas;
    private Object reservas1;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Object getPrueba() {
        return prueba;
    }

    public void setPrueba(Object prueba) {
        this.prueba = prueba;
    }

    public Object getPrueba55() {
        return prueba55;
    }

    public void setPrueba55(Object prueba55) {
        this.prueba55 = prueba55;
    }

    public Object getReservas() {
        return reservas;
    }

    public void setReservas(Object reservas) {
        this.reservas = reservas;
    }

    public Object getReservas1() {
        return reservas1;
    }

    public void setReservas1(Object reservas1) {
        this.reservas1 = reservas1;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
