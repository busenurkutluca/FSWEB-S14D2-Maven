package org.example;

import org.example.model.enums.PaintColor;

public class Carpet {
    private int width;
    private int height;
    private PaintColor color;

    public Carpet(PaintColor color, int height, int width) {
        this.color = color;
        this.height = height;
        this.width = width;
    }

    public PaintColor getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void lying(){
        System.out.println("Carpet is lying on Bedroom floor.");
    }
}
