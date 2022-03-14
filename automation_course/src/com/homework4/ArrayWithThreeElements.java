package com.homework4;

import java.util.Scanner;

public class ArrayWithThreeElements {
    public static void main(String[] args) {
        int arr[] = new int[3];
        userChoice(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        takeThePreviousMethod(arr);


    }

    public static void userChoice(int arr[]) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a number: ");
            int number = scan.nextInt();
            arr[i] = number;
        }
        scan.close();
    }

    public static void takeThePreviousMethod(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if (num == arr[j]) {
                    System.out.println(num + " ");
                    //System.out.println(num + " " + arr[j]);

                }

            }


        }
    }

}
