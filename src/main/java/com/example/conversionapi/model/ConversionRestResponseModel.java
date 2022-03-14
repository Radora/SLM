package com.example.conversionapi.model;

public class ConversionRestResponseModel {

    private boolean valid;
    private String fromType;
    private String toType;
    private float fromValue;
    private float result;


    public ConversionRestResponseModel() {
    }

    public ConversionRestResponseModel(UnitConversionRequestModel request) {

        this.fromType = request.getFromType();
        this.toType = request.getToType();
        this.fromValue = request.getFromValue();
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public String getFromType() {
        return fromType;
    }

    public void setFromType(String fromType) {
        this.fromType = fromType;
    }

    public String getToType() {
        return toType;
    }

    public void setToType(String toType) {
        this.toType = toType;
    }

    public float getFromValue() {
        return fromValue;
    }

    public void setFromValue(float fromValue) {
        this.fromValue = fromValue;
    }

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }
}

