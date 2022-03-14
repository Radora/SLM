package com.example.conversionapi;

import com.example.conversionapi.repository.ConvertCelsiusRepo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertCelsiusRepoTest {

    public static final ConvertCelsiusRepo C_TO_F_STRATEGY = new ConvertCelsiusRepo();

    @Test
    public void ConvertCToF () {
        float result = C_TO_F_STRATEGY.getConvertedValue(0);
        assertEquals(32, result);
    }
}

// 32 F = 0 C (fromValue :0)