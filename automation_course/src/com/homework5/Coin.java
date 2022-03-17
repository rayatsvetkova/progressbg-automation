package com.homework5;

import java.util.concurrent.ThreadLocalRandom;

public class Coin {

    public String flip() {
        int randomNum = ThreadLocalRandom.current().nextInt(1, 3);
        if (randomNum == 1) {
            return "ezi";
        } else {
            return "tura";
        }

    }
}
