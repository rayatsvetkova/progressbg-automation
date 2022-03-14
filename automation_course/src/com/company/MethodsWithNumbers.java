package com.company;

import java.sql.SQLOutput;

public class MethodsWithNumbers {
    public static void main(String[] args) {

        int a = 8;
        int b = 7;
        System.out.println("Simple sum: " + (a + b));
        System.out.println("Sum from method: " + sum(a, b));
        System.out.println("Subtraction from method: " + subtract(a, b));
        System.out.println("Multiplication from method: " + multiplication(a, b));
        System.out.println("Division from method: " + divide(a, b));
        System.out.println("Average: " + avg(a, b));

    }

    public static int sum(int number1, int number2) {
        int result = number1 + number2;

        return result;
    }

    public static int subtract(int number1, int number2) {
        int result = number1 - number2;
        return result;
    }

    public static int multiplication(int number1, int number2) {
        int result = number1 * number2;
        return result;
    }

    public static int divide(int number1, int number2) {
        int result = number1 / number2;
        return result;
    }

    public static double avg(double number1, double number2){
        double result = (number1+number2)/2;
        return result;
    }

}
