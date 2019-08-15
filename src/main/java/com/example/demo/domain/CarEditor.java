package com.example.demo.domain;

import java.beans.PropertyEditorSupport;

public class CarEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        Car c = new Car();
        c.setName(text);
        setValue(c);
    }
}
