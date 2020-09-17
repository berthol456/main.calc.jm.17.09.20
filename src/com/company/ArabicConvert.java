package com.company;

import java.util.List;

public class ArabicConvert {
    public static String arabicToRoman(int number) {
        if ((number <= 0) || (number > 4000)) {
            throw new IllegalArgumentException((number + "Число должно находиться в интервале: 0-4000"));
        }
        List<RomanConvert> romanNumerals = RomanConvert.getReverseSortedValues();
        int i = 0;
        StringBuilder builder = new StringBuilder();
        while ((number > 0) && (i < romanNumerals.size())) {
            RomanConvert currentSymbol = romanNumerals.get(i);
            if (currentSymbol.getValue() <= number) {
                builder.append((currentSymbol.name()));
                number -= currentSymbol.getValue();
            } else {
                i++;
            }

        }
        return builder.toString();
    }
}
