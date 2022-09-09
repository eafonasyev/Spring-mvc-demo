package com.eafonasyev.classes;

import java.util.LinkedHashMap;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private LinkedHashMap<String,String> countryOptions;
    private String favoriteLanguage;
    private Number countHours;

    public Number getCountHours() {
        return countHours;
    }

    public void setCountHours(Number countHours) {
        this.countHours = countHours;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public Student() {
        countryOptions = new LinkedHashMap<String, String>();
        countryOptions.put("BR","BRAZIL");
        countryOptions.put("KZ","KAZAHSTAN");
        countryOptions.put("RU","RUSSIAN");
        countryOptions.put("US","USA");
        countryOptions.put("UZ","UZBEKISTAN");


    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
        this.countryOptions = countryOptions;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
