package com.service;

import java.util.Random;

public class SubService implements ISubService {

    private int min=1;
    private int max=100;

    @Override
    public int getRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }
}
