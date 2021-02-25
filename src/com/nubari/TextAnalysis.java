package com.nubari;

import java.util.*;

public class TextAnalysis {

    public static String countCharacterOccurrences(String phrase) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] characters = phrase.toCharArray();
        long[] frequency = new long[characters.length];
        for (int i = 0; i < phrase.length(); i++) {
            int index = i;
            long count = phrase.chars().filter(character -> character == characters[index]).count();
            frequency[i] = count;
        }
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != ' ') {
                stringBuilder.append(characters[i]);
                stringBuilder.append(" occurred ");
                stringBuilder.append(frequency[i]);
                stringBuilder.append(" times\n");
            }
        }
        Set<String> results = new HashSet<String>(Arrays.asList(stringBuilder.toString().split("\n")));
        stringBuilder.setLength(0);
        for (String text : results) {
            stringBuilder.append(text);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public static void countWordOccurrences(String phrase) {
        Object[] uniqueWords = new HashSet<>(Arrays.asList(phrase.split(" "))).toArray();
        String[] words = phrase.split(" ");
        int[] frequency = new int[uniqueWords.length];
        for (int i = 0; i < uniqueWords.length; i++) {
            String uniqueWord = (String) uniqueWords[i];
            for (String word : words) {
                if (uniqueWord.equalsIgnoreCase(word)) {
                    frequency[i]++;
                }
            }
        }
        for (int i = 0; i < frequency.length; i++) {
            System.out.println(uniqueWords[i] + " occurred " + frequency[i] + " time(s) ");
        }
    }

    public static void countWordLetterOccurrences(String phrase) {
        int numberOfOneLetterWords = 0;
        int numberOfTwoLetterWords = 0;
        int numberOfThreeLetterWords = 0;
        String[] wordsArray = phrase.split(" ");
        for (String word : wordsArray) {
            if (word.length() == 1) {
                numberOfOneLetterWords++;
            }
            if (word.length() == 2) {
                numberOfTwoLetterWords++;
            }
            if (word.length() == 3) {
                numberOfThreeLetterWords++;
            }

        }
        System.out.println("There were/was " +  numberOfOneLetterWords + " one letter words");
        System.out.println("There were/was " +  numberOfTwoLetterWords + " two letter words");
        System.out.println("There were/was " +  numberOfThreeLetterWords + " three letter words");
    }

}
