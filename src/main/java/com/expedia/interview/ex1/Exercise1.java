package com.expedia.interview.ex1;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Exercise1 {

    static String timeInWords(int h, int m) {
        return "";
    }





    /**
     *
     * All the code below is not necessary for solving the Exercise.
     * It is just used for test cases.
     *
     */

    public static void main(String[] args) throws IOException {
        testCase(1, 1, 0, "one o'clock");
        testCase(2, 2, 1, "one minute past two");
        testCase(3, 3, 10, "ten minutes past three");
        testCase(4, 4, 15, "quarter past four");
        testCase(5, 5, 30, "half past five");
        testCase(6, 6, 40, "twenty minutes to seven");
        testCase(7, 7, 45, "quarter to eight");
        testCase(8, 8, 47, "thirteen minutes to nine");
        testCase(9, 9, 28, "twenty eight minutes past nine");
        testCase(10, 10, 59, "one minute to eleven");
        testCase(11, 11, 29, "twenty nine minutes past eleven");
        testCase(12, 12, 37, "twenty three minutes to one");
        testCase(13, 12, 45, "quarter to one");
        testCase(14, 12, 15, "quarter past twelve");
    }


    static void testCase(int testId, int h, int m, String expected) {
        String result = timeInWords(h, m);
        String log = result.equalsIgnoreCase(expected) ? "Correct! Test case %d passed!" : "Test case %d incorrect! Expected: %s | Your result: %s";
        System.out.println(String.format(log, testId, expected, result));
    }
}