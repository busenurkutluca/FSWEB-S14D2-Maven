package org.example;

import org.example.model.Lamp;

public class Bedroom {
   private String name;
   private Wall wall1;
   private Wall wall2;
   private Wall wall3;
   private Wall wall4;
   private Ceiling ceiling;
   private Bed bed;
   private Lamp lamp;
   private Wardrobe wardrobe;
   private Carpet carpet;


    public Bedroom(Bed bed, Carpet carpet, Ceiling ceiling, Lamp lamp, String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Wardrobe wardrobe) {
        this.bed = bed;
        this.carpet = carpet;
        this.ceiling = ceiling;
        this.lamp = lamp;
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.wardrobe = wardrobe;
    }

    public Bedroom(Bed bed, Carpet carpet, Lamp lamp, Ceiling ceiling, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Wardrobe wardrobe) {
    }

    public Bed getBed() {
        return bed;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public String getName() {
        return name;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }
}
