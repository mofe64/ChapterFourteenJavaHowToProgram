package com.nubari;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorseCodeConverterTest {
    MorseCodeConverter morseCodeConverter;

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void toMorseCode() {
        String morseValue = ".... . .-.. .-.. --- /";
        assertEquals(morseValue, MorseCodeConverter.toMorseCode("Hello "));
    }

    @Test
    void toEnglish() {
        String morseValue = ".... . .-.. .-.. ---/";
        assertEquals("HELLO ", MorseCodeConverter.toEnglish(morseValue));
    }
}