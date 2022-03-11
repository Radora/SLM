package com.example.conversionapi.repository;

import com.example.conversionapi.model.UnitConversionRequestModel;
import com.example.conversionapi.strategy.ConversionStrategy;

public class ConvertGramRepo implements ConversionStrategy {

    @Override
    public boolean requestIsValid(UnitConversionRequestModel request) {
        if (toTypeIsValid(request.getToType())) {
            return true;
        }
        return false;
    }

    @Override
    public boolean toTypeIsValid(String toType) {
        if (toType.equals("kg") || toType.equals("KG") || toType.equals("Kg") || toType.equals("kG")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public float getConvertedValue(float value) {
        return value / 1000;
    }
}
