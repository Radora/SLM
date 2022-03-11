package com.example.conversionapi.repository;



import com.example.conversionapi.model.ConversionRestResponseModel;
import com.example.conversionapi.model.InvalidRequestResponseModel;
import com.example.conversionapi.model.UnitConversionRequestModel;
import com.example.conversionapi.strategy.ConversionStrategy;
import org.springframework.stereotype.Repository;


@Repository
public class ConversionApiRepository {

    public ConversionApiRepository() {
    }

    public ConversionRestResponseModel readRequest(UnitConversionRequestModel request) {

        ConversionStrategy converter;

        switch (request.getFromType()) {
            case "g":
            case "G":
                converter = new ConvertGramRepo();
                break;
            case "kg":
            case "KG":
            case "Kg":
            case "kG":
                converter = new ConvertKilogramRepo();
                break;
            case "c":
            case "C":
                converter = new ConvertCelsiusRepo();
                break;
            case "f":
            case "F":
                converter = new ConvertFahrenheitRepo();
                break;
            default:
                return new InvalidRequestResponseModel(request);
        }

        if (converter.requestIsValid(request)) {
            float result = converter.getConvertedValue(request.getFromValue());
            ConversionRestResponseModel response = new ConversionRestResponseModel(request);
            response.setValid(true);
            response.setResult(result);
            return response;

        } else {
            return new InvalidRequestResponseModel(request);
        }
    }

}


