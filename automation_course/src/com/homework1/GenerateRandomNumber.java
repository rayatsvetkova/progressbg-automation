package com.homework1;

import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandomNumber {
    public static void main(String[] args) {
        int min = 1;
        int max = 10;
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);

        System.out.println("Your number is: " + randomNum);

        if (randomNum > 5) {
            System.out.println("The number is GRATER than 5");
        } else {
            System.out.println("The number is NOT greater than 5");
        }
    }


}
