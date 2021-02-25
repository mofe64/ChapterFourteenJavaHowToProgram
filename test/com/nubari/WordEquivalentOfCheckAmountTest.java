package com.nubari;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordEquivalentOfCheckAmountTest {
    WordEquivalentOfCheckAmount wordEquivalentOfCheckAmount;

    @BeforeEach
    void setUp() {
        wordEquivalentOfCheckAmount = new WordEquivalentOfCheckAmount();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void convertToWord() {
        String value = wordEquivalentOfCheckAmount.convertToWord(998.87);
        assertNotNull(value);
        assertEquals("NINE HUNDRED AND NINETY EIGHT 87/100", value);
    }
}