package com.company.part_2;

import java.util.Random;

public class Die {

    public int roll_the_die(){
        return new Random().nextInt(6)+1;
    }
}
