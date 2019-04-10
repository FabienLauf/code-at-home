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
        testCase(1, 5, 0, "five o'clock");
        testCase(2, 5, 1, "one minute past five");
        testCase(3, 5, 10, "ten minutes past five");
        testCase(4, 5, 15, "quarter past five");
        testCase(5, 5, 30, "half past five");
        testCase(6, 5, 40, "twenty minutes to six");
        testCase(7, 5, 45, "quarter to six");
        testCase(8, 5, 47, "thirteen minutes to six");
        testCase(9, 5, 28, "twenty eight minutes past five");
        testCase(10, 7, 59, "one minute to eight");
        testCase(11, 7, 29, "twenty nine minutes past seven");
    }


    static void testCase(int testId, int h, int m, String expected) {
        String result = timeInWords(h, m);
        String log = result.equalsIgnoreCase(expected) ? "Correct! Test case %d passed!" : "Test case %d incorrect! Expected: %s | Your result: %s";
        System.out.println(String.format(log, testId, expected, result));
    }
}