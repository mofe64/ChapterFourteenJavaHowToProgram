package com.nubari;


import java.security.SecureRandom;

public class RandomSentences {
    private final String[] articleArray = {"the", "a", "one", "some", "any"};
    private final String[] nounArray = {"boy", "girl", "dog", "town", "car"};
    private final String[] verbArray = {"drove", "jumped", "ran", "walked", "skipped"};
    private final String[] prepositionArray = {"to", "from", "over", "under", "on"};
    private final StringBuilder stringBuilder = new StringBuilder();


    public String[] getArticleArray() {
        return articleArray;
    }

    public String[] getVerbArray() {
        return verbArray;
    }

    public String[] getPrepositionArray() {
        return prepositionArray;
    }

    public String[] getNounArray() {
        return nounArray;
    }

    public String generateSentence() {
        String[][] wordArrays = {articleArray, nounArray, verbArray, prepositionArray, articleArray, nounArray};
        for (int i = 0; i < wordArrays.length; i++) {
            int wordIndex = generateWordIndex();
            String word = getWord(wordIndex, wordArrays[i]);
            if (i == 0) {
                word = word.replace(word.charAt(0), Character.toUpperCase(word.charAt(0)));
            }
            stringBuilder.append(word);
            stringBuilder.append(" ");
        }
        stringBuilder.append(".");
        return stringBuilder.toString();
    }

    private String getWord(int index, String[] wordArray) {
        return wordArray[index];
    }

    private int generateWordIndex() {
        SecureRandom secureRandom = new SecureRandom();
        return secureRandom.nextInt(5);
    }

}
