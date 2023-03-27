package com.safar.smartmessdevhacks.model;

import com.google.firebase.firestore.GeoPoint;

public class Owner {

    private String name, email, messName, upi, geoHash, phoneNumber;
    private GeoPoint geoPoint;
    private int monthlyPrice, customerCount;
    private double avgReview;

    public Owner() {
    }

    public Owner(String name, String email, String messName, String upi, String geoHash, String phoneNumber, GeoPoint geoPoint, int monthlyPrice) {
        this.name = name;
        this.email = email;
        this.messName = messName;
        this.upi = upi;
        this.geoHash = geoHash;
        this.phoneNumber = phoneNumber;
        this.geoPoint = geoPoint;
        this.monthlyPrice = monthlyPrice;
        this.customerCount = 0;
        this.avgReview = 0.0;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessName() {
        return messName;
    }

    public void setMessName(String messName) {
        this.messName = messName;
    }

    public String getUpi() {
        return upi;
    }

    public void setUpi(String upi) {
        this.upi = upi;
    }

    public String getGeoHash() {
        return geoHash;
    }

    public void setGeoHash(String geoHash) {
        this.geoHash = geoHash;
    }

    public GeoPoint getGeoPoint() {
        return geoPoint;
    }

    public void setGeoPoint(GeoPoint geoPoint) {
        this.geoPoint = geoPoint;
    }

    public int getMonthlyPrice() {
        return monthlyPrice;
    }

    public void setMonthlyPrice(int monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
    }

    public int getCustomerCount() {
        return customerCount;
    }

    public void setCustomerCount(int customerCount) {
        this.customerCount = customerCount;
    }

    public double getAvgReview() {
        return avgReview;
    }

    public void setAvgReview(double avgReview) {
        this.avgReview = avgReview;
    }
}