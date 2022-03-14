package com.example.conversionapi.strategy;

import com.example.conversionapi.model.UnitConversionRequestModel;

public interface ConversionStrategy {

    boolean requestIsValid(UnitConversionRequestModel conversionRequest);

    boolean toTypeIsValid(String toType);

    float getConvertedValue(float value);

}