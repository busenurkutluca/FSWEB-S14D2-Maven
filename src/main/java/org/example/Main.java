package org.example;


import org.example.model.Lamp;
import org.example.model.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {

        // Wall nesnelerini oluşturma
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");

        // Ceiling nesnesi oluşturma
        Ceiling ceiling = new Ceiling(55, PaintColor.WHITE);

        // Bed nesnesi oluşturma
        Bed bed = new Bed("Modern", 554, 54, 8, 5);

        // Lamp nesnesi oluşturma
        Lamp lamp = new Lamp(true, 5, LampType.NEON);

        // Wardrobe nesnesi oluşturma
        Wardrobe wardrobe = new Wardrobe(100, 2.5, 85);

        // Carpet nesnesi oluşturma
        Carpet carpet = new Carpet(PaintColor.RED, 4, 8);

        // Bedroom nesnesi oluşturma
        Bedroom bedroom = new Bedroom(bed, carpet, lamp, ceiling, wall1, wall2, wall3, wall4, wardrobe);

        // Metodları çağırma ve ekrana yazdırma
        System.out.println("Testing Bedroom components");

        // Lamp turn on
        lamp.turnOn();

        // Bed make
        bed.make();

        // Wardrobe add
        wardrobe.add();  // Bu metod wardrobe sınıfında tanımlı olmalı

        // Carpet lying
        carpet.lying();  // Bu metod carpet sınıfında tanımlı olmalı

        // Ceiling create
        ceiling.create();  // Bu metod ceiling sınıfında tanımlı olmalı

        // Wall create
        wall1.create();
        wall2.create();
        wall3.create();
        wall4.create();
    }
}
