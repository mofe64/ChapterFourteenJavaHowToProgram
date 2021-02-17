package com.nubari;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomSentencesTest {
    RandomSentences randomSentences;
    @BeforeEach
    void setUp() {
        randomSentences = new RandomSentences();
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testGetArticleArray(){
        assertNotNull(randomSentences.getArticleArray());
    }

    @Test
    void testGetNounArray(){
        assertNotNull(randomSentences.getNounArray());
    }

    @Test
    void testGetVerbArray(){
        assertNotNull(randomSentences.getVerbArray());
    }

    @Test
    void testGetPrepositionArray(){
        assertNotNull(randomSentences.getPrepositionArray());
    }

    @Test
    void testGenerateSentence(){
        String sentence = randomSentences.generateSentence();
        assertNotNull(sentence);
        assertFalse(sentence.isEmpty());
        assertFalse(sentence.isBlank());
        System.out.println(sentence);
    }
}