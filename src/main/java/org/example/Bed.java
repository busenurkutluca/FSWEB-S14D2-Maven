package org.example;

public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style=style;
        this.pillows = pillows;
        this.height=height;
        this.sheets=sheets;
        this.quilt=quilt;
    }



    public int getHeight() {
        return height;
    }

    public int getQuilt() {
        return quilt;
    }

    public int getPillows() {
        return pillows;
    }

    public int getSheets() {
        return sheets;
    }

    public void make(){
        System.out.println("The bed is being made.");
    }
}

