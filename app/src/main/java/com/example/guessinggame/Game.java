package com.example.guessinggame;

import java.util.Random;

public class Game {
    private int secretNumber;
    private final Random random;

    public Game() {
        random = new Random();
        // Generate a random number between 1 and 10 (inclusive)
        secretNumber = random.nextInt(10) + 1;
    }

    public boolean check(int guess) {
        return guess == secretNumber;
    }
}