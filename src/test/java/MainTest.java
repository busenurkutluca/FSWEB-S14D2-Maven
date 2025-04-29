import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;
import org.example.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(ResultAnalyzer.class)
public class MainTest {

    private Lamp lamp;
    private Bed bed;
    private Wardrobe wardrobe;
    private Carpet carpet;
    private Ceiling ceiling;
    private Wall wall;
    private Bedroom bedroom;

    @BeforeEach
    void setUp() {
        lamp = new Lamp(LampType.NORMAL, true, 80);
        bed = new Bed("Çift Kişilik", 4, 1, 2, 2);
        wardrobe = new Wardrobe(2, 4, 40);
        carpet = new Carpet(3,5, PaintColor.RED);
        ceiling = new Ceiling(3, PaintColor.RED);
        wall = new Wall("NORTH");
    }

    @DisplayName("Lamp sınıf değişkenleri doğru access modifier değerlerine sahip mi ?")
    @Test
    public void testLampAccessModifiers() throws NoSuchFieldException {
        Field styleField = lamp.getClass().getDeclaredField("style");
        Field batteryField = lamp.getClass().getDeclaredField("battery");
        Field globalRatingField = lamp.getClass().getDeclaredField("globRating");

        assertEquals(styleField.getModifiers(), 2);
        assertEquals(batteryField.getModifiers(), 2);
        assertEquals(globalRatingField.getModifiers(), 2);
    }

    @DisplayName("Lamp sınıf değişkenleri doğru type değerlerine sahip mi ?")
    @Test
    public void testLampInstanceTypes() throws NoSuchFieldException {
        assertThat(lamp.getStyle(), instanceOf(LampType.class));
        assertThat(lamp.isBattery(), instanceOf(Boolean.class));
        assertThat(lamp.getGlobRating(), instanceOf(Integer.class));
    }

    @DisplayName("Lamp turnOn methodu doğru çalışıyor mu?")
    @Test
    public void testLampTypes() throws NoSuchFieldException {
        PrintStream saveOut = System.out;
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        lamp.turnOn();
        assertThat(out.toString(), containsString("Lamp is being turned on"));
    }

    @DisplayName("Bed sınıf değişkenleri doğru access modifier değerlerine sahip mi ?")
    @Test
    public void testBedAccessModifiers() throws NoSuchFieldException {
        Field styleField = bed.getClass().getDeclaredField("style");
        Field pillowsField = bed.getClass().getDeclaredField("pillows");
        Field heightField = bed.getClass().getDeclaredField("height");
        Field sheetsField = bed.getClass().getDeclaredField("sheets");
        Field quiltsField = bed.getClass().getDeclaredField("quilt");

        assertEquals(styleField.getModifiers(), 2);
        assertEquals(pillowsField.getModifiers(), 2);
        assertEquals(heightField.getModifiers(), 2);
        assertEquals(sheetsField.getModifiers(), 2);
        assertEquals(quiltsField.getModifiers(), 2);
    }

    @DisplayName("Bed sınıf değişkenleri doğru type değerlerine sahip mi ?")
    @Test
    public void testBedInstanceTypes() throws NoSuchFieldException {
        assertThat(bed.getStyle(), instanceOf(String.class));
        assertThat(bed.getHeight(), instanceOf(Integer.class));
        assertThat(bed.getQuilts(), instanceOf(Integer.class));
        assertThat(bed.getSheets(), instanceOf(Integer.class));
        assertThat(bed.getPillows(), instanceOf(Integer.class));
    }

    @DisplayName("Bed make methodu doğru çalışıyor mu?")
    @Test
    public void testBedMakeMethod() throws NoSuchFieldException {
        PrintStream saveOut = System.out;
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        bed.make();
        assertThat(out.toString(), containsString("The bed is being made."));
    }

    @DisplayName("Wardrobe sınıf değişkenleri doğru access modifier değerlerine sahip mi ?")
    @Test
    public void testWardrobeAccessModifiers() throws NoSuchFieldException {
        Field widthField = wardrobe.getClass().getDeclaredField("width");
        Field heightField = wardrobe.getClass().getDeclaredField("height");
        Field weightField = wardrobe.getClass().getDeclaredField("weight");

        assertEquals(widthField.getModifiers(), 2);
        assertEquals(heightField.getModifiers(), 2);
        assertEquals(weightField.getModifiers(), 2);
    }

    @DisplayName("Wardrobe sınıf değişkenleri doğru type değerlerine sahip mi ?")
    @Test
    public void testWardrobeInstanceTypes() throws NoSuchFieldException {
        assertThat(wardrobe.getWidth(), instanceOf(Integer.class));
        assertThat(wardrobe.getHeight(), instanceOf(Integer.class));
        assertThat(wardrobe.getWeight(), instanceOf(Double.class));
    }

    @DisplayName("Wardrobe add methodu doğru çalışıyor mu?")
    @Test
    public void testWardrobeAddMethod() throws NoSuchFieldException {
        PrintStream saveOut = System.out;
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        wardrobe.add();
        assertThat(out.toString(), containsString("Wardrobe added into Bedroom."));
    }

    @DisplayName("Carpet sınıf değişkenleri doğru access modifier değerlerine sahip mi ?")
    @Test
    public void testCarpetAccessModifiers() throws NoSuchFieldException {
        Field colorField = carpet.getClass().getDeclaredField("color");
        Field widthField = carpet.getClass().getDeclaredField("width");
        Field heightField = carpet.getClass().getDeclaredField("height");

        assertEquals(colorField.getModifiers(), 2);
        assertEquals(widthField.getModifiers(), 2);
        assertEquals(heightField.getModifiers(), 2);
    }

    @DisplayName("Carpet sınıf değişkenleri doğru type değerlerine sahip mi ?")
    @Test
    public void testCarpetInstanceTypes() throws NoSuchFieldException {
        assertThat(carpet.getColor(), instanceOf(PaintColor.class));
        assertThat(carpet.getWidth(), instanceOf(Integer.class));
        assertThat(carpet.getHeight(), instanceOf(Integer.class));
    }

    @DisplayName("Carpet lying methodu doğru çalışıyor mu?")
    @Test
    public void testCarpetLyingMethod() throws NoSuchFieldException {
        PrintStream saveOut = System.out;
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        carpet.lying();
        assertThat(out.toString(), containsString("Carpet is lying on Bedroom floor."));
    }

    @DisplayName("Ceiling sınıf değişkenleri doğru access modifier değerlerine sahip mi ?")
    @Test
    public void testCeilingAccessModifiers() throws NoSuchFieldException {
        Field colorField = ceiling.getClass().getDeclaredField("color");
        Field heightField = ceiling.getClass().getDeclaredField("height");

        assertEquals(colorField.getModifiers(), 2);
        assertEquals(heightField.getModifiers(), 2);
    }

    @DisplayName("Ceiling sınıf değişkenleri doğru type değerlerine sahip mi ?")
    @Test
    public void testCeilingInstanceTypes() throws NoSuchFieldException {
        assertThat(ceiling.getColor(), instanceOf(PaintColor.class));
        assertThat(ceiling.getHeight(), instanceOf(Integer.class));
    }

    @DisplayName("Ceiling create methodu doğru çalışıyor mu?")
    @Test
    public void testCeilingCreateMethod() throws NoSuchFieldException {
        PrintStream saveOut = System.out;
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        ceiling.create();
        assertThat(out.toString(), containsString("Ceiling has been built."));
    }

    @DisplayName("Wall sınıf değişkenleri doğru access modifier değerlerine sahip mi ?")
    @Test
    public void testWallAccessModifiers() throws NoSuchFieldException {
        Field colorField = wall.getClass().getDeclaredField("direction");
        assertEquals(colorField.getModifiers(), 2);
    }

    @DisplayName("Wall sınıf değişkenleri doğru type değerlerine sahip mi ?")
    @Test
    public void testWallInstanceTypes() throws NoSuchFieldException {
        assertThat(wall.getDirection(), instanceOf(String.class));
    }

    @DisplayName("Wall create methodu doğru çalışıyor mu?")
    @Test
    public void testWallCreateMethod() throws NoSuchFieldException {
        PrintStream saveOut = System.out;
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        wall.create();
        assertThat(out.toString(), containsString("Wall has been built."));
    }

}
