package com.service;

import java.util.Random;

public class SubService2 implements ISubService {

    private int min=101;
    private int max=200;

    @Override
    public int getRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }
}
