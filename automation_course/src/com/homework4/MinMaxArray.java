package com.homework4;

public class MinMaxArray {
    public static void main(String[] args) {
        int arr[] = {50, 15, 4, 19, 21};

        System.out.println(minimum(arr));
        System.out.println(maximum(arr));

    }


    public static int minimum(int arr[]) {
        int minimum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int currentElement = arr[i];
            if (minimum > currentElement) {
                minimum = currentElement;
            }
        }
        //System.out.println(minimum);
        return minimum;
    }

    public static int maximum(int arr[]) {
        int maximum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int currentElement = arr[i];
            if (maximum < currentElement) {
                maximum = currentElement;
            }
        }
        return maximum;
    }

}
