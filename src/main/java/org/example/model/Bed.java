package org.example.model;

public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    // Constructor
    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    // Methods
    public void make() {
        System.out.println("The bed is being made.");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilts() {
        return quilt;
    }
}