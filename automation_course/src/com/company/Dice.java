package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {

    public int throwDice(){
        int randomNum = ThreadLocalRandom.current().nextInt(1, 6);
        return randomNum;
    }
}
