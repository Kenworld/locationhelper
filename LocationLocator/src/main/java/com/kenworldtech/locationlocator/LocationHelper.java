package com.kenworldtech.locationlocator;

import android.location.Location;

public class LocationHelper {
    public  static  float getDistanceInRM(double startLat,double startLongi,double endLat, double endLongi)
    {
        float[] results =new float[0];
        Location.distanceBetween(startLat,startLongi,endLat,endLongi,results);
        return results[0]/1000;
    }
}
