package com.homework3;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        int currentFibonacci = 1;
        int previousFibonacci = 1;
        int fibonacciSum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fibonacci limit number: ");
        int n = scanner.nextInt();
        scanner.close();
        for (int i = 2; i < n; i++) {
            fibonacciSum = currentFibonacci + previousFibonacci;
            previousFibonacci = currentFibonacci;
            currentFibonacci = fibonacciSum;
        }
        System.out.println("Fibonacci " + n + " = " + fibonacciSum);

    }

}
