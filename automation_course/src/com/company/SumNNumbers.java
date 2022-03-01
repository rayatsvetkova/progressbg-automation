package com.company;

import java.util.Scanner;

public class SumNNumbers {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int n;
            int sum = 0;
            System.out.println("Enter a number");
            n = scan.nextInt();
            scan.close();

            for (int i = 1; i <= n; ++i) {
                sum = sum + i;
            }
            System.out.println("Sum is: " + sum);
        }

    }

