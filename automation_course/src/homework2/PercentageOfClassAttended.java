package homework2;

import java.util.Scanner;

public class PercentageOfClassAttended {
    public static void main(String[] args) {

        double attendance = 0.75;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter held classes");
        int heldClasses = scan.nextInt();
        System.out.println("Enter attended classes");
        int attendedClasses = scan.nextInt();
        scan.close();
        double calculatePercentage = (attendedClasses * 100) / heldClasses;
        if (calculatePercentage > attendance) {
            System.out.println("Your attendance is: " + calculatePercentage + "% You're allowed to attend the exam");
        } else {
            System.out.println("Your attendance is: " + calculatePercentage + "% You're NOT allowed to participate the exam");
        }

    }
}
