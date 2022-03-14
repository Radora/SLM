package com.example.conversionapi;

import com.example.conversionapi.repository.ConvertGramRepo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertGramRepoTest {
    public static final ConvertGramRepo G_TO_KG_STRATEGY = new ConvertGramRepo();

    @Test

    public void ConvertGToKG() {
        float result = G_TO_KG_STRATEGY.getConvertedValue(1000);
        assertEquals(1, result);
    }
}
