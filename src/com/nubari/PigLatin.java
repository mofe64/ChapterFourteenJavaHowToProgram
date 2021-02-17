package com.nubari;


public class PigLatin {
    public static String translatePhrase(String phrase) {
        String[] wordArray = phrase.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < wordArray.length; i++) {
            stringBuilder.append(encodeWord(wordArray[i]));
            if (i != wordArray.length - 1)
                stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    private static String encodeWord(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        char firstLetter = word.charAt(0);
        String wordWithoutFirstLetter = word.substring(1);
        stringBuilder.append(wordWithoutFirstLetter);
        stringBuilder.append(firstLetter);
        stringBuilder.append("ay");
        return stringBuilder.toString();
    }

    public static String decodePhrase(String encodedPhrase) {
        String[] encodedWordArray = encodedPhrase.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < encodedWordArray.length; i++) {
            stringBuilder.append(decodeWord(encodedWordArray[i]));
            if (i != encodedWordArray.length - 1)
                stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    private static String decodeWord(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        String wordWithoutAyExtension = word.substring(0, word.length() - 2);
        char originalFirstLetter = wordWithoutAyExtension.charAt(wordWithoutAyExtension.length() -1);
        stringBuilder.append(originalFirstLetter);
        String restOfOriginalWord = wordWithoutAyExtension.substring(0, wordWithoutAyExtension.length() -1);
        stringBuilder.append(restOfOriginalWord);
        return stringBuilder.toString();
    }
}
