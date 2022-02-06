package com.company;

public class Cat {

    private String name;
    private byte age;
    private double weight;
    private String color;
    private String lifespan;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLifespan() {
        return lifespan;
    }

    public void setLifespan(String lifespan) {
        lifespan = lifespan;
    }
    public void catInfo(){
        System.out.println("\n Cat name: " + name
        + "\n Cat age: " + age
        + "\n Cat color: " + color
        + "\n Cat weight: " + weight
        + "\n Cat lifespan " + lifespan);
    }
}
