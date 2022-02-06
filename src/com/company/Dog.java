package com.company;

public class Dog {

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
        this.lifespan = lifespan;
    }
    public void dogInfo(){
        System.out.println("\n Dog name: " + name
        + "\n Dog color: " + color
        + "\n Dog age: " + age
        + "\n Dog weight: " + weight
        + "\n Dog lifespan: " + lifespan);
    }
}
