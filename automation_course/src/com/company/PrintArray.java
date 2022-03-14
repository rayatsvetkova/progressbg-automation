package com.company;
import java.util.Arrays;

public class PrintArray {
    public static void main(String[] args) {
        int arr[] = {2, 23, 15, 23, 4, 5};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
           System.out.println(arr[i]);
        }

    }
}

