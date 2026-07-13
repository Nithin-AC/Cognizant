package com.cognizant.spring;

public class CountryService {

    private Country country;

    public CountryService() {
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void displayCountry() {
        System.out.println(country);
    }
}