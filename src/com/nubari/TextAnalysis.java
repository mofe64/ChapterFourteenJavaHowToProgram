package com.nubari;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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

}
