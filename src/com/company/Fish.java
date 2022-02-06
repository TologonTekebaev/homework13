package com.company;

public class Fish {
    private String name;
    private String family;
    private double weight;
    private double length;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
            this.weight = weight;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
            this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
            this.color = color;
        }
        public void fishInfo(){
            System.out.println("\n Fish name: " + name +
                    "\n Fish family: " + family +
                    "\n Fish weight: " + weight +
                    "\n Fish lenght: " + length +
                    "\n Fish color: " + color);
        }
    }
