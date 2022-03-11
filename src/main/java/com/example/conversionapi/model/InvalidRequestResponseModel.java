package com.example.conversionapi.model;

public class InvalidRequestResponseModel extends ConversionRestResponseModel{

    private boolean valid;
    private String fromType;
    private String toType;
    private float fromValue;
    private float result;

    public InvalidRequestResponseModel(UnitConversionRequestModel request) {
        this.fromType = request.getFromType();
        this.toType = request.getToType();
        this.fromValue = request.getFromValue();
        this.valid = false;
        this.result = 0.00f;
    }

}
