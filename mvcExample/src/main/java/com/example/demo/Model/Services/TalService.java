package com.example.demo.Model.Services;

import java.util.concurrent.ThreadLocalRandom;

public class TalService {

    public int generateTal(){

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 500 + 1);

        return randomNumber;
    }
}
