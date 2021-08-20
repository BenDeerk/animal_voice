package com.company;

public class Animals {

    String voice_sound;

    public Animals(String animal_voice)
    {
       voice_sound = animal_voice;
    }

    void Voice()
    {
        System.out.println(voice_sound);
    }

}
