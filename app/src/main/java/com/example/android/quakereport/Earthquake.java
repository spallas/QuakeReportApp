package com.example.android.quakereport;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by davidespallaccini on 05/08/16.
 */
public class Earthquake {

    private String mLocation;
    // a string containing a long representing unix time
    private long mDate;
    private double mMagnitude;
    private String mUrl;


    public Earthquake(String mLocation, long mDate, double mMagnitude, String mUrl) {
        this.mLocation = mLocation;
        this.mDate = mDate;
        this.mMagnitude = mMagnitude;
        this.mUrl = mUrl;
    }

    public String getLocation() {
        return mLocation;
    }
    public String getUrl(){ return mUrl; }

    /**
     * Gives back a readable date
     * @return a formatted date given by {@link SimpleDateFormat}
     */
    public String getDate() {
        Date date = new Date(mDate);
        SimpleDateFormat formatter = new SimpleDateFormat("MMM dd, yyyy", Locale.ITALIAN);
        String ret = formatter.format(date);;
        return ret;
    }

    public String getTime(){
        Date date = new Date(mDate);
        SimpleDateFormat formatter = new SimpleDateFormat("h:mm a", Locale.ITALIAN);
        String ret = formatter.format(date);;
        return ret;
    }

    public double getMagnitude() {
        return mMagnitude;
    }
}
