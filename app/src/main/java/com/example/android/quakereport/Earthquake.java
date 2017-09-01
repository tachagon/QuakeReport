package com.example.android.quakereport;

/**
 * Created by tachagon on 1/9/2560.
 */

public class Earthquake {

    // magnitude of the earthquake
    private double mMagnitude;

    // location of the earthquake
    private String mLocation;

    // date of the earthquake
    private String mDate;

    /**
     * Constructs a new {@link Earthquake} object
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location  is the city location of the earthquake
     * @param date      is the date the earthquake happened
     */
    public Earthquake(double magnitude, String location, String date) {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    /**
     * @return the magnitude of the earthquake
     */
    public double getMagnitude() {
        return mMagnitude;
    }

    /**
     * @return the location of the earthquake
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * @return the date of the earthquake
     */
    public String getDate() {
        return mDate;
    }

}
