package com.nubari;

public class CheckProtection {
    private static final int numberOfSpaces = 9;

    public static String printAmount(int amount) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(amount);
        String amountToPrint = stringBuilder.toString();
        stringBuilder.setLength(0);
        if (amountToPrint.length() > numberOfSpaces) {
            throw new IllegalArgumentException("Amount to print cannot be more than 9 characters");
        }
        if (amountToPrint.length() == 9) {
            String lastThreeDigits = amountToPrint.substring(amountToPrint.length() - 3);
            System.out.println(lastThreeDigits);
            String nextThreeDigits = amountToPrint.substring(amountToPrint.length() - 6, amountToPrint.length() - 3);
            System.out.println(nextThreeDigits);
            String firstThreeDigits = amountToPrint.substring(0, amountToPrint.length() - 6);
            System.out.println(firstThreeDigits);
            stringBuilder.setLength(0);
            stringBuilder.append(firstThreeDigits);
            stringBuilder.append(",");
            stringBuilder.append(nextThreeDigits);
            stringBuilder.append(",");
            stringBuilder.append(lastThreeDigits);
            System.out.println(stringBuilder.toString());
            return stringBuilder.toString();

        }
        int numberOfStarsToAppend = numberOfSpaces - amountToPrint.length();
        if (amountToPrint.length() == 6) {
            String lastThreeDigits = amountToPrint.substring(amountToPrint.length() - 3);
            String firstThreeDigits = amountToPrint.substring(0, amountToPrint.length() - 3);
            stringBuilder.append("*".repeat(numberOfStarsToAppend));
            stringBuilder.append(firstThreeDigits);
            stringBuilder.append(",");
            stringBuilder.append(lastThreeDigits);
            return stringBuilder.toString();
        }
        if (amountToPrint.length() <= 3) {
            stringBuilder.append("*".repeat(numberOfStarsToAppend));
            stringBuilder.append(amountToPrint);
            return stringBuilder.toString();
        }
        if (amountToPrint.length() > 6) {
            String lastThreeDigits = amountToPrint.substring(amountToPrint.length() - 3);
            String nextSetOfThree = amountToPrint.substring(amountToPrint.length() - 6, amountToPrint.length() - 3);
            String remainingDigits = amountToPrint.substring(0, amountToPrint.length() - 6);
            stringBuilder.append("*".repeat(numberOfStarsToAppend));
            stringBuilder.append(remainingDigits);
            stringBuilder.append(",");
            stringBuilder.append(nextSetOfThree);
            stringBuilder.append(",");
            stringBuilder.append(lastThreeDigits);
            return stringBuilder.toString();
        }
        String lastThreeDigits = amountToPrint.substring(amountToPrint.length() - 3);
        String remainingDigits = amountToPrint.substring(0, amountToPrint.length() - 3);
        stringBuilder.append("*".repeat(numberOfStarsToAppend));
        stringBuilder.append(remainingDigits);
        stringBuilder.append(",");
        stringBuilder.append(lastThreeDigits);
//            System.out.println(stringBuilder.toString());
        return stringBuilder.toString();


    }
}
