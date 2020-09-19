package bcit.computing.cst.comp2522.lab02.test;

import bcit.computing.cst.comp2522.lab02.Cat;
import bcit.computing.cst.comp2522.lab02.Dog;
import bcit.computing.cst.comp2522.lab02.IncessantSpeakable;
import bcit.computing.cst.comp2522.lab02.Poodle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

    @Test
    public void testIncessantSpeakableOfCat() {
        Cat c = new Cat();

        assertEquals(false, (c instanceof IncessantSpeakable));
    }

    @Test
    public void testIncessantSpeakableOfPoodle() {
        Poodle p = new Poodle();

        assertEquals(true, (p instanceof IncessantSpeakable));
    }

    @Test
    public void testIncessantSpeakableOfDog() {
        Dog d = new Dog();

        assertEquals(false, (d instanceof IncessantSpeakable));
    }

    @Test
    public void testDogSaysBarkBark() {
        Dog d = new Dog();
        assertEquals("Woof woof!", d.getSpeak());
    }
}


