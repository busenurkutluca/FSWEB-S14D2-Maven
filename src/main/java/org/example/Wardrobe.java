package org.example;

public class Wardrobe {
    private int width;
    private int height;
    private double weight;

    public Wardrobe(int height, double weight, int width) {
        this.height = height;
        this.weight = weight;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int getWidth() {
        return width;
    }

    public void add(){
        System.out.println("Wardrobe added into Bedroom.");
    }
}
