package com.fladioarmandika.spring.geevn.utils;

import java.util.Random;

public class ModelAttributeGenerator {

    public static int generateId() {
        Random rand = new Random();
        int randomNum = rand.nextInt((999999 - 100000) + 1) + 100000;
        return randomNum;
    }

}
