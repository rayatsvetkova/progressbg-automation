package homework2;

import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scan.nextInt();
        scan.close();

        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

    }
}
