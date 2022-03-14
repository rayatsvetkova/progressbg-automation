package com.homework4;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayWithRandomNumbers {
    public static void main(String[] args) {
        int n=10;
        int arr[]= new int[n];
        randomNumbersArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void randomNumbersArray(int arr[]) {
       for(int i=0;i<arr.length;i++){
           int randomNum = ThreadLocalRandom.current().nextInt(1, 10);
           arr[i]=randomNum;

       }

    }

}
