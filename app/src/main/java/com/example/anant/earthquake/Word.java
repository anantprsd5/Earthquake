package com.example.anant.earthquake;

/**
 * Created by anant on 22/2/17.
 */

public class Word {

    private String quakeMagnitude;

    private String quakeLocation;

    private String quakeDate;

    public Word(String mQuakeMagnitude, String mQuakeLocation, String mQuakeDate){
        quakeMagnitude = mQuakeMagnitude;
        quakeLocation = mQuakeLocation;
        quakeDate = mQuakeDate;
    }

    public String getQuakeMagnitude(){
        return quakeMagnitude;
    }

    public String getQuakeLocation(){
        return quakeLocation;
    }

    public String getQuakeDate(){
        return quakeDate;
    }


}
