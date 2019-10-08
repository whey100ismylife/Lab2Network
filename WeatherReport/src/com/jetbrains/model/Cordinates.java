package com.jetbrains.model;

public class Cordinates {
    private double longitude;
    private double latitude;
    private double altitude;

    public Cordinates(double longitude, double latitude, double altitude){
        this.longitude = longitude;
        this.latitude = latitude;
        this.altitude = altitude;
    }

    public double getAltitude() {
        return altitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
