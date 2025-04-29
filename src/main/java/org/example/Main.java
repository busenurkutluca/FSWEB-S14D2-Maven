package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        // Bedroom objesi oluşturma
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("West");
        Ceiling ceiling = new Ceiling(10, PaintColor.WHITE);
        Bed bed = new Bed("Modern", 2, 30, 1, 1);
        Lamp lamp = new Lamp(LampType.NEON, true, 5);
        Wardrobe wardrobe = new Wardrobe(100, 200, 50.5);
        Carpet carpet = new Carpet(300, 400, PaintColor.RED);

        // Düzeltildi: Parametre sırası constructor ile uyumlu hale getirildi
        Bedroom bedroom = new Bedroom("Master Bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp, wardrobe, carpet);

        // Metotları test etme
        System.out.println("Bedroom Name: " + bedroom.getName());
        System.out.println("Wall 1 Direction: " + bedroom.getWall1().getDirection());
        System.out.println("Ceiling Height: " + bedroom.getCeiling().getHeight());
        System.out.println("Ceiling Color: " + bedroom.getCeiling().getColor());
        System.out.println("Bed Style: " + bedroom.getBed().getStyle());
        System.out.println("Lamp Style: " + bedroom.getLamp().getStyle());
        System.out.println("Wardrobe Weight: " + bedroom.getWardrobe().getWeight());
        System.out.println("Carpet Color: " + bedroom.getCarpet().getColor());

        // Davranışsal metotları test etme
        bedroom.getWall1().create();
        bedroom.getCeiling().create();
        bedroom.getBed().make();
        bedroom.getLamp().turnOn();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();
    }
}