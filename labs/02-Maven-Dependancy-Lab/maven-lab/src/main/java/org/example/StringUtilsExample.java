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

        // Comparing two Strings
        String str1 = "Hello, I am Maryam";
        String str2 = "Hello, I am maryam";
        System.out.printf("Are %s and %s equal? %b\n", str1, str2, compareStringsUsingStringUtils(str1, str2));

        String str3 = "Maryam";
        System.out.printf("Does %s contains %s? %b\n",
                str1, str3, stringContainsAnotherString(str1, str3));

        System.out.printf("\"%s\" without space would be like: \"%s\"!\n"
                , str1, deleteWhiteSpacesUsingStringUnits(str1));

        System.out.printf("Swapping case for \"%s\" would be like: \"%s\"\n"
                , str3, swapCasesUsingStringUtils(str3));

        String str = "My name is Maryam and I'm learning java in DCI.";
        System.out.printf("Shorten this long String:\n\"%s\"\nto contain oly the 20 first characters: \"%s\"\n"
                , str, abbreviateUsingStringUtils(str, 20));

        System.out.printf("\"%c\" repeats %d times in \"%s\"\n", 'a', countSubstringsUsingStringUtils(str1, "a"), str1);
    }

    public static boolean compareStringsUsingStringUtils(String str1, String str2) {
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);
        return StringUtils.compare(str1, str2) == 0;
    }

    public static boolean stringContainsAnotherString(String str1, String str2) {
        return StringUtils.contains(str1, str2);
    }

    public static String deleteWhiteSpacesUsingStringUnits(String str) {
        return StringUtils.deleteWhitespace(str);
    }

    public static String swapCasesUsingStringUtils(String str1) {
        return StringUtils.swapCase(str1);
    }

    public static String abbreviateUsingStringUtils(String str1, int maxLength) {
        return StringUtils.abbreviate(str1, maxLength);
    }

    public static int countSubstringsUsingStringUtils(String str1, String substring) {
        return StringUtils.countMatches(str1, substring);
    }

}
