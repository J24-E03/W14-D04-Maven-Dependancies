package org.example;

import org.apache.commons.lang3.StringUtils;

public class StringUtilsExample {
    public static void main(String[] args) {
        String input = "  Maven Lab Example  ";

        // Trim the string
        String trimmed = StringUtils.trim(input);
        System.out.println("Trimmed: '" + trimmed + "'");

        // Reverse the string
        String reversed = StringUtils.reverse(trimmed);
        System.out.println("Reversed: " + reversed);

        // Check if the string is empty
        boolean isEmpty = StringUtils.isEmpty(trimmed);
        System.out.println("Is Empty: " + isEmpty);

        // Capitalize the string
        String capitalized = StringUtils.capitalize(trimmed);
        System.out.println("Capitalized: " + capitalized);

        boolean isNumeric = StringUtils.isNumeric(trimmed);
        System.out.println("Is Numeric: " + isNumeric);

        String text = "Part 3: Explore the Apache Commons Lang Documentation";
        char searchChar = 'e';
        char replacementChar = '*';
        String newText = StringUtils.replaceChars(text, searchChar, replacementChar);
        System.out.printf("StringUtils.replaceChars(%s, %s, %s) = %s", text, searchChar, replacementChar, newText);
        System.out.println();

    }



}