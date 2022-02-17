package com.example.restservice.model;

public class Address {
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    private int number;
    private String street;

    public Address() {
    }

    public Address(int number, String street) {
        this.number = number;
        this.street = street;
    }
}
