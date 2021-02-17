package com.nubari;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PigLatinTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testTranslateMethodConvertsPhraseCorrectly() {
        String phrase = "Hello This Is Our String";
        String convertedString = PigLatin.translatePhrase(phrase);
        assertEquals("elloHay hisTay sIay urOay tringSay", convertedString);
    }

    @Test
    void testDecodePhrase(){
        String phrase = "Hello This Is Our String";
        String convertedString = PigLatin.translatePhrase(phrase);
        assertEquals("elloHay hisTay sIay urOay tringSay", convertedString);
        assertEquals(phrase, PigLatin.decodePhrase(convertedString));
    }
}