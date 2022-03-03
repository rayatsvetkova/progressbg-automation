package com.homework3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int factorial = 1;
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        n = scan.nextInt();
        scan.close();
        for(int i=1;i<= n;i++){
            factorial=factorial*i;
        }
        System.out.println( "Factorial = " + factorial);

    }
}
