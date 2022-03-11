package com.example.conversionapi;

import com.example.conversionapi.repository.ConvertKilogramRepo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertKilogramRepoTest {
    public static final ConvertKilogramRepo KG_TO_G_STRATEGY = new ConvertKilogramRepo();

    @Test

    public void ConvertKGToG() {
        float result = KG_TO_G_STRATEGY.getConvertedValue(1);
        assertEquals(1000, result);
    }
}
