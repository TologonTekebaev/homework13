package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Fish trout = new Fish();
        trout.setName("Trout");
        trout.setFamily("Salmon");
        trout.setColor("Rainbow");
        trout.setLength(1.53);
        trout.setWeight(4.500);

        trout.fishInfo();

        System.out.println("---------------------");

        Parrot parrot = new Parrot();
        parrot.setName("Alex");
        parrot.setColor("Pink");
        parrot.setCountry("Africa");
        parrot.setWeight(1.900);

        parrot.parrotInfo();

        System.out.println("---------------------");

        Cat cat = new Cat();
        cat.setName("Mumka");
        cat.setAge((byte)3);
        cat.setColor("Black");
        cat.setWeight(4.6);
        cat.setLifespan("10 year");

        cat.catInfo();

        System.out.println("---------------------");

        Dog alabay = new Dog();
        alabay.setName("Alabay");
        alabay.setColor("Brown");
        alabay.setAge((byte) 8);
        alabay.setLifespan("12 - 15 year");
        alabay.setWeight(60.900);

        alabay.dogInfo();







    }
}
