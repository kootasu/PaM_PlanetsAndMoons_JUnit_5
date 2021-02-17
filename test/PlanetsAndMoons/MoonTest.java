package PlanetsAndMoons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoonTest {

    @Test
    void MoonConstructor() {
        Moon moon = new Moon("The Moon", 734200000000000000000000f, 10921);
        assertEquals("The Moon", moon.getName(), "Is name correct?");
        assertEquals(734200000000000000000000f, moon.getMassInKilos(), "Is mass correct?");
        assertEquals(10921, moon.getCircumferenceInKilometers(), "Is circumference correct?");
    }

    @Test
    void getName(){
        Moon moon = new Moon("The Moon", 734200000000000000000000f, 10921);
        assertEquals("The Moon", moon.getName());
    }

    @Test
    void setName(){
        Moon moon = new Moon("The Moon", 734200000000000000000000f, 10921);
        moon.setName("The Mooooon");
        assertEquals("The Mooooon", moon.getName());
    }

    @Test
    void getMassInKilos(){
        Moon moon = new Moon("The Moon", 734200000000000000000000f, 10921);
        assertEquals(734200000000000000000000f, moon.getMassInKilos());
    }

    @Test
    void setMassInKilos(){
        Moon moon = new Moon("The Moon", 734200000000000000000000f, 10921);
        moon.setMassInKilos(1);
        assertEquals(1, moon.getMassInKilos());
    }

    @Test
    void getCircumferenceInKilometers(){
        Moon moon = new Moon("The Moon", 734200000000000000000000f, 10921);
        assertEquals(10921, moon.getCircumferenceInKilometers());
    }

    @Test
    void setCircumferenceInKilometers(){
        Moon moon = new Moon("The Moon", 734200000000000000000000f, 10921);
        moon.setCircumferenceInKilometers(1);
        assertEquals(1, moon.getCircumferenceInKilometers());
    }

}