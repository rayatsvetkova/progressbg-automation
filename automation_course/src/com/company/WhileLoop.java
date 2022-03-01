package com.company;

public class WhileLoop {
    public static void main(String[] args) {
        // Print the numbers from 1 to 10
        int n = 1;
        while (n <= 10) {
            if(n==5){
                n++;
                break;//exit the loop
                //continue; // skip the iteration
            }
            System.out.println("Next number: " + n);
            n++;
        }
    }
}
