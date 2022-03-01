package com.company;

import java.util.Scanner;

public class SumOfNumbersGivenByUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many number are you going to enter: ");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < num; i++) {
            System.out.println("Please enter the numbers you want: ");
            sum += scanner.nextInt();

        }
        System.out.println("Your sum is: " + sum);
        scanner.close();

    }
}

