package com.company;

public class CalculatePowerOfANumber {
    public static void main(String[] args) {
        int result = power(2,5);
        System.out.println("result is: " + result);
    }
    public static int power(int basis, int rate){
        if (rate !=0){
            int result = basis*power(basis,(rate-1));
            System.out.println(result);
            return result;
        }
        else {
            return 1;
        }

    }


}
