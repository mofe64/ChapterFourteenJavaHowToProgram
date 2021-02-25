package com.nubari;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextAnalysisTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testCountCharacterOccurrence() {
        System.out.println(TextAnalysis.countCharacterOccurrences("Hello I am Mofe"));
    }

    @Test
    void testCountWordOccurrence() {
        TextAnalysis.countWordOccurrences("Hello I am a bit shy but hello but");
    }
    @Test
    void testCountWordLetterOccurrences(){
        TextAnalysis.countWordLetterOccurrences("Hello How are you today i am fine thank you");
    }
}