package com.homework3;

import java.util.Scanner;

public class MinMaxNumbers {
    public static void main(String[] args) {
        int min = 0;
        int max = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many number are you going to enter: ");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Please enter the numbers you want: ");
            int compare = scanner.nextInt();
            if (i == 0) {
                min = compare;
                max = compare;
                System.out.println("Min: " + min);
                System.out.println("Max: " + max);
            }
            if (min > compare) {
                min = compare;
                System.out.println("Current Min value is: " + min);

            } else if (max < compare) {
                max = compare;
                System.out.println("Current Max value is: " + max);
            }
            System.out.println("Min value is: " + min);
            System.out.println("Max value is: " + max);

        }
        scanner.close();

    }
}
