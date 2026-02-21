package com.yurii.pavlenko;

/**
 * Demonstrates type inference with 'var' and highlights readability concerns.
 */
public class Solution {
    public static void main(String[] args) {
        // Using var for implicit type inference
        var plus = "+";
        var message = "Greeting: Hi, Java ";

        // The author wanted to enter the number 11 as a number for possible further calculations,
        // but made a mistake by putting double quotes.
        // The compiler defined the number 11 as a string, which may cause an error later.
        var str = "11";

        // There was a calculation error because the compiler defined the variable str as a string.
        // ERROR java: incompatible types: java.lang.String cannot be converted to int
        // int javaVersion21 = str + 10;

        // Display the value
        System.out.println(message + str + plus);

        // This line of code will not execute do to an initialization error at the line: var str = "11";
        // System.out.println(message + javaVersion21 + plus);
    }
}