package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello Raya");
        int number = 6;
        int secondNumber = 4;

        if (number > secondNumber){
            System.out.println("That is true");
        }

        System.out.println("aggregation " + (number + secondNumber));
        System.out.println("subtraction " + (number - secondNumber));
        System.out.println("multiplication " + (number * secondNumber));
        System.out.println("segregation " + (number / secondNumber));
        System.out.println(number % secondNumber);

        float price = 2.5F;
        double priceSecond = 2.7;

        double a = 3.5;
        double b = 1.75;

        a = a + 1;
        b = b - 1;
        System.out.println("A " + a);
        System.out.println("B " + b);

        a++;
        System.out.println("A " + a);

        b++;
        System.out.println("B " + b);

        System.out.println("Number " + number);
        System.out.println("Second Number " + secondNumber);

        number = secondNumber;

        System.out.println("Number " + number);
        System.out.println("Second Number " + secondNumber);

        boolean var = false;

        String name = "Raya";

        System.out.println("Price " + price);
        System.out.println("Second price " + priceSecond);
        System.out.println("Name " + name);

        //Something has changed
        name = "test";

        System.out.println(name);
    }
}
