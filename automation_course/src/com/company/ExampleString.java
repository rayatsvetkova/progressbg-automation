package com.company;

public class ExampleString {
    public static void main(String[] args) {
        String testString = new String("Example string");
        System.out.println("The lenght of the string is: " + testString.length());
        for (int i = 0; i < testString.length(); i++) {
            System.out.println("ChartAr is: " + testString.charAt(i));
        }

    }
}
