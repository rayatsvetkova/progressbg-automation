package com.company;

import java.sql.SQLOutput;

public class MinOfThreeNumbers {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 3;
        System.out.println("Min value is: " + min(a,b,c));

    }

    public static int min(int number1, int number2, int number3) {
        if (number1 <=number2 && number1 <=number3) {
            return number1;
        } else if (number2 < number1 && number2 < number3) {
            return number2;
        } else {
            return number3;
        }


    }
}
