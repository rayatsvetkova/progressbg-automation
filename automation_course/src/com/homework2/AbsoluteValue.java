package com.homework2;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {

        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        number = scan.nextInt();
        scan.close();

        int abs_number = (number < 0) ? -number : number;
        System.out.println("The absolute value of your number is: " + abs_number);
    }
}
