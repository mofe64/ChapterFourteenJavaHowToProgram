package com.nubari;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class WordEquivalentOfCheckAmount {
    public String convertToWord(double checkAmount) {
        if (checkAmount > 1000.0) {
            throw new IllegalArgumentException("Check Amount must be 1000 or less");
        }
        if (checkAmount == 1000) {
            return "ONE THOUSAND";
        }
        int numberOfHundreds = (int) checkAmount / 100;
        StringBuilder stringBuilder = new StringBuilder();
        if (numberOfHundreds != 0) {
            stringBuilder.append(getWordRep(numberOfHundreds));
            stringBuilder.append(" HUNDRED");
        }
        double remainderAfterHundreds = checkAmount % 100;
        if (remainderAfterHundreds <= 0) {
            return stringBuilder.toString();
        }
        int numberOfTens = (int) remainderAfterHundreds / 10;
        stringBuilder.append(" AND");
        if (numberOfTens != 0) {
            stringBuilder.append(" ");
            stringBuilder.append(getWordRepTens(numberOfTens));
        }
        double remainderAfterTens = checkAmount % 10;
        if (remainderAfterTens <= 0) {
            return stringBuilder.toString();
        }
        int numberOfUnits = (int) remainderAfterTens;
        stringBuilder.append(" ");
        stringBuilder.append(getWordRep(numberOfUnits));

        double decimals = checkAmount % 1;
        if (decimals <= 0) {
            return stringBuilder.toString();
        }
        double roundedDecimal = round(decimals, 2);
        stringBuilder.append(" ");
        String formattedDecimalValue = String.valueOf(roundedDecimal).substring(2);
        stringBuilder.append(formattedDecimalValue);
        stringBuilder.append("/");
        stringBuilder.append(100);

        return stringBuilder.toString();
    }

    private String getWordRep(int number) {
        switch (number) {
            case 1 -> {
                return "ONE";
            }
            case 2 -> {
                return "TWO";
            }
            case 3 -> {
                return "THREE";
            }
            case 4 -> {
                return "FOUR";
            }
            case 5 -> {
                return "FIVE";
            }
            case 6 -> {
                return "SIX";
            }
            case 7 -> {
                return "SEVEN";
            }
            case 8 -> {
                return "EIGHT";
            }
            case 9 -> {
                return "NINE";
            }
            case 0 -> {
                return "ZERO";
            }

        }
        return null;
    }

    private String getWordRepTens(int number) {
        switch (number) {

            case 2 -> {
                return "TWENTY";
            }
            case 3 -> {
                return "THIRTY";
            }
            case 4 -> {
                return "FORTY";
            }
            case 5 -> {
                return "FIFTY";
            }
            case 6 -> {
                return "SIXTY";
            }
            case 7 -> {
                return "SEVENTY";
            }
            case 8 -> {
                return "EIGHTY";
            }
            case 9 -> {
                return "NINETY";
            }

        }
        return null;
    }

    private double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

}
