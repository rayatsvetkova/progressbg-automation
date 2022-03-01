package com.homework2;

import java.util.Scanner;

public class CorrectDate {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter day");
        int day = scan.nextInt();
        System.out.println("Enter month");
        int month = scan.nextInt();
        System.out.println("Enter year");
        int year = scan.nextInt();
        scan.close();

        if ((day >= 1 && day <= 31) && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && (year >= 1900 && year <= 9999)) {
            System.out.println("The date is correct");
        } else if ((day >= 1 && day <= 30) && (month == 4 || month == 6 || month == 9 || month == 11) && (year >= 1900 && year <= 9999)) {
            System.out.println("The date is correct");
        } else if (month == 2 && (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) && (year >= 1900 && year <= 9999)) {
            System.out.println("The date is correct");
        } else {
            System.out.println("The date is NOT correct");
        }

    }

}

