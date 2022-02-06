package com.company;

public class Parrot {

    private String name;
    private String color;
    private double weight;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public void parrotInfo(){
        System.out.println("\n Parrot name: " + name
        + "\n Parrot color: " + color
        + "\n Parrot country: " + country
        + "\n Parrot weight: " + weight);
    }
}
