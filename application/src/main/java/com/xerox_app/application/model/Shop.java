package com.xerox_app.application.model;

import java.util.UUID;

public class Shop {
    private String shopId;
    private String name;
    private String location;
    private String contactInfo;


    // Constructor

    public Shop(String name, String location, String contactInfo)
    {
        this.shopId = UUID.randomUUID().toString();
        this.name = name;
        this.location = location;
        this.contactInfo = contactInfo;
    }

    // Getters and Setters

    public String getId() {
        return shopId;
    }

    public void setId(String id) {
        this.shopId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
