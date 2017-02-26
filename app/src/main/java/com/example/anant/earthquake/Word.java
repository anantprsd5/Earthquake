package com.example.anant.earthquake;

/**
 * Created by anant on 22/2/17.
 */

public class Word {

    private String quakeMagnitude;

    private String quakeLocation;

    private long timeInMilliSeconds;

    public Word(String mQuakeMagnitude, String mQuakeLocation, long mtimeInMilliSeconds){
        quakeMagnitude = mQuakeMagnitude;
        timeInMilliSeconds = mtimeInMilliSeconds;
        quakeLocation = mQuakeLocation;
    }

    public String getQuakeMagnitude(){
        return quakeMagnitude;
    }

    public String getQuakeLocation(){
        return quakeLocation;
    }

    public long getQuakeTime(){ return timeInMilliSeconds; }


}
