package com.homework3;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = 1;
        String result = "";

        do {
            System.out.println("Please chose an option: \n" +
                    "1) Rock \n" +
                    "2) Paper \n" +
                    "3) Scissors \n" +
                    "Else - end the program \n");

            inputNumber = sc.nextInt();
            int randomNum = ThreadLocalRandom.current().nextInt(1, 3);
            String userOption = "";
            String computerOption = "";


            switch (inputNumber) {
                case 1:
                    System.out.println("1) Rock");
                    userOption = "Rock";
                    break;
                case 2:
                    System.out.println("2) Paper");
                    userOption = "Paper";
                    break;
                case 3:
                    System.out.println("3) Scissors");
                    userOption = "Scissors";
                    break;
                default:
                    inputNumber = 0;
                    System.out.println("Bye");

            }


            switch (randomNum) {
                case 1:
                    System.out.println("1) Rock");
                    computerOption = "Rock";
                    break;
                case 2:
                    System.out.println("2) Paper");
                    computerOption = "Paper";
                    break;
                case 3:
                    System.out.println("3) Scissors");
                    computerOption = "Scissors";
                    break;
                default:
                    inputNumber = 0;
                    System.out.println("Bye");
            }

            if (userOption.equals("Paper")) {
                switch (computerOption) {
                    case "Paper":
                        System.out.println("Tie");
                        result = "Tie";
                        break;
                    case "Rock":
                        System.out.println("Win");
                        result="Win";
                        break;
                    case "Scissors":
                        System.out.println("Lose");
                        result="Lose";
                    default:
                        System.out.println("Wrong input");
                }
            } else if (userOption.equals("Rock")) {
                switch (computerOption) {
                    case "Paper":
                        System.out.println("Lose");
                        result="Lose";
                        break;
                    case "Rock":
                        System.out.println("Tie");
                        result="Tie";
                        break;
                    case "Scissors":
                        System.out.println("Win");
                        result="Win";
                    default:
                        System.out.println("Wrong input");
                }
            } else if (userOption.equals("Scissors")) {
                switch (computerOption) {
                    case "Paper":
                        System.out.println("Win");
                        result="Win";
                        break;
                    case "Rock":
                        System.out.println("Lose");
                        result="Lose";
                        break;
                    case "Scissors":
                        System.out.println("Tie");
                        result="Tie";
                    default:
                        System.out.println("Wrong input");
                }
            }

        } while (result.equals("Tie"));
    }
}
