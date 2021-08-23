package com.company;

public class Animals {

    void Voice()
    {
        System.out.println("Give a voice:");
    }

}

class Cat extends Animals {

    void Voice()
    {
        System.out.println("Meow");
    }

}

class Dog extends Animals {

    void Voice()
    {
        System.out.println("GAW GAW");
    }

}

