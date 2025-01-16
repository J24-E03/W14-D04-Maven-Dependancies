package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class StringUtilsExampleTest {
    @Test
    void testTrim() {
        String input = "  Hello World  ";
        assertEquals("Hello World", StringUtils.trim(input));
    }

    @Test
    void testReverse() {
        String input = "Java";
        assertEquals("avaJ", StringUtils.reverse(input));
    }

    @Test
    void testIsEmpty() {
        assertTrue(StringUtils.isEmpty(""));
        assertFalse(StringUtils.isEmpty("text"));
    }

    @Test
    void testComparingStrings() {
        String str1 = "Hello, I am Maryam";
        String str2 = "Hello, I am maryam";
        assertFalse(StringUtilsExample.compareStringsUsingStringUtils(str1, str2));
    }

    @Test
    void testStringContains() {
        String str1 = "Hello, I am Maryam";
        String str2 = "Maryam";
        assertTrue(StringUtilsExample.stringContainsAnotherString(str1, str2));
    }

    @Test
    void testDeleteSpace() {
        String str1 = "Hello, I am Maryam";
        assertEquals("Hello,IamMaryam", StringUtilsExample.deleteWhiteSpacesUsingStringUnits(str1));
    }

    @Test
    void testSwapCases() {
        String input = "Maryam";
        assertEquals("mARYAM", StringUtilsExample.swapCasesUsingStringUtils(input));
    }

    @Test
    void testAbbreviate() {
        String input = "This is a very long string that needs to be shortened.";
        assertEquals("This is a very lo...", StringUtilsExample.abbreviateUsingStringUtils(input, 20));
    }

    @Test
    void testCountSubstrings() {
        String input = "Hello, my name is Maryam and I am learning java.";
        assertEquals(8, StringUtilsExample.countSubstringsUsingStringUtils(input, "a"));
    }

}