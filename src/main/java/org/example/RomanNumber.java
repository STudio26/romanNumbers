package org.example;

public class RomanNumber {
    public RomanNumber() {
    }

    int[] arabicValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] romanValues = {
            "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
    };

    public String convert(int value) {
        StringBuilder result = new StringBuilder();
        while (value != 0)
            for (int i = 0; i < arabicValues.length; i++)
                if (value >= arabicValues[i]) {
                    result.append(romanValues[i]);
                    value -= arabicValues[i];
                    break;
                }
        return result.toString();
    }
}