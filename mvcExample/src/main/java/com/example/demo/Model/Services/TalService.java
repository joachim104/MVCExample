package com.example.demo.Model.Services;

import com.example.demo.Model.Entities.Tal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class TalService {

    public int generateTal(){

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 500 + 1);

        return randomNumber;
    }

    public List<Tal> generateList(){

        List<Tal> tallist = new ArrayList<>();

        Tal tal1 = new Tal(generateTal());
        Tal tal2 = new Tal(generateTal());
        Tal tal3 = new Tal(generateTal());
        Tal tal4 = new Tal(generateTal());

        tallist.add(tal1);
        tallist.add(tal2);
        tallist.add(tal3);
        tallist.add(tal4);

        return tallist;
    }
}
