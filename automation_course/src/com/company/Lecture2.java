package com.company;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Lecture2 {
    public static void main(String[] args) {

        /* Generate random number
        int min = -100;
        int max = 100;
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        System.out.println("The number is: " + randomNum);
         */


        /* Normal way of using if-else

        if (randomNum > 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }
         */


        /*
        Shorter way of using if-else
        String result = randomNum > 0 ? "The number is positive" : "The number is negative";
        System.out.println(result);
         */


        int score;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter score");
        score = scan.nextInt();
        scan.close();
        /*
        if (score == 2) {
            System.out.println("Slab" + score);
        } else if (score == 3) {
            System.out.println("Sreden" + score);
        } else if (score == 4) {
            System.out.println("Dobyr" + score);
        } else if (score == 5) {
            System.out.println("Mn.dobyr" + score);
        } else if (score == 6) {
            System.out.println("Otlichen" + score);
        } else {
            System.out.println("This is invalid score");
        }
         */


        switch (score) {
            case 2:
                System.out.println("Slab " + score);
                break;
            case 3:
                System.out.println("Sreden " + score);
                break;
            case 4:
                System.out.println("Dobyr " + score);
                break;
            case 5:
                System.out.println("Mn.dobyr " + score);
                break;
            case 6:
                System.out.println("Otlichen " + score);
                break;
            default:
                System.out.println("This is invalid score");
        }


    }
}


