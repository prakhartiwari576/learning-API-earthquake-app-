package com.example.android.quakereport;

/**
 * Created by com on 01-09-2018.
 */

public class Word {
    private String murl;
    private double amagnitude;
    private String aplace;
    private long  adate;

    public Word (double magnitude , String place , long date, String url) {
        amagnitude = magnitude;
        aplace = place ;
        adate = date ;
        murl = url;
    }

    public double GetMagnitude(){
        return amagnitude;
    }
    public String GetPlace(){
        return aplace;
    }
    public long  GetTimeinmilliseconds(){return adate;}
    public String Geturl(){
        return murl;
    }

}

