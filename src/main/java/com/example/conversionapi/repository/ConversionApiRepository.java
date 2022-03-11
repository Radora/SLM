package com.example.conversionapi.repository;



import com.example.conversionapi.model.ConversionRestResponseModel;
import com.example.conversionapi.model.UnitConversionRequestModel;
import com.example.conversionapi.strategy.ConversionStrategy;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class ConversionApiRepository {

    public ConversionApiRepository() {
    }

    public ConversionRestResponseModel readRequest(UnitConversionRequestModel request) {

        ConversionStrategy converter;

        return null;

    }

}


