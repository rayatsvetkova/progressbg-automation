package com.company;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if(i==2){
                continue;// skip the iteration
            }
            System.out.println("This is our number " + (i+1));
        }

//        int n=1;
//        for(;n<=10;){
//            System.out.println("Next number: " + n++);
//        }

    }
}
