package com.example.conversionapi.repository;

import com.example.conversionapi.model.UnitConversionRequestModel;
import com.example.conversionapi.strategy.ConversionStrategy;

public class ConvertFahrenheitRepo implements ConversionStrategy {

    @Override
    public boolean requestIsValid(UnitConversionRequestModel request) {
        if (toTypeIsValid(request.getToType())) {
            return true;
        }
        return false;
    }

    @Override
    public boolean toTypeIsValid(String toType) {
        if (toType.equals("C") || toType.equals("c")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public float getConvertedValue(float fromValue) {

        return (fromValue - 32) * 5 / 9;
    }
}