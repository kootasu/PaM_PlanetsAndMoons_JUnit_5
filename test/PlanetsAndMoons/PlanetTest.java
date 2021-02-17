package PlanetsAndMoons;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PlanetTest {

    @Test
    void PlanetConstructor() {
        Planet earth = new Planet("Earth", 5973600000000000000000000f, 40075);
        assertEquals("Earth", earth.getName());
        assertEquals(5973600000000000000000000f, earth.getMassInKilos());
        assertEquals(40075, earth.getCircumferenceInKilometers());
    }

    @Test
    void getName() {
        Planet earth = new Planet("Earth", 5973600000000000000000000f, 40075);
        assertEquals("Earth", earth.getName());
    }

    @Test
    void setName() {
        Planet earth = new Planet("Earth", 5973600000000000000000000f, 40075);
        earth.setName("Earth2");
        assertEquals("Earth2", earth.getName());
    }

    @Test
    void getMassInKilos() {
        Planet earth = new Planet("Earth", 5973600000000000000000000f, 40075);
        assertEquals(5973600000000000000000000f, earth.getMassInKilos());
    }

    @Test
    void setMassInKilos() {
        Planet earth = new Planet("Earth", 5973600000000000000000000f, 40075);
        earth.setMassInKilos(1);
        assertEquals(1, earth.getMassInKilos());
    }

    @Test
    void getCircumferenceInKilometers() {
        Planet earth = new Planet("Earth", 5973600000000000000000000f, 40075);
        assertEquals(40075, earth.getCircumferenceInKilometers());
    }

    @Test
    void setCircumferenceInKilometers() {
        Planet earth = new Planet("Earth", 5973600000000000000000000f, 40075);
        earth.setCircumferenceInKilometers(1);
        assertEquals(1, earth.getCircumferenceInKilometers());
    }

    @Test
    void getOrbiters() {
        Planet earth = new Planet("Earth", 5973600000000000000000000f, 40075);
        ArrayList<CelestialBody> orbiters = new ArrayList<>();
        orbiters.add(new Moon("The Moon", 734200000000000000000000f, 10921));
        earth.setOrbiters(orbiters);
        assertEquals("The Moon", earth.getOrbiters().get(0).getName());
        assertEquals(734200000000000000000000f, earth.getOrbiters().get(0).getMassInKilos());
        assertEquals(10921, earth.getOrbiters().get(0).getCircumferenceInKilometers());
    }

    @Test
    void setOrbiters() {
        Planet earth = new Planet("Earth", 5973600000000000000000000f, 40075);
        ArrayList<CelestialBody> orbiters = new ArrayList<>();
        orbiters.add(new Moon("The Moon", 734200000000000000000000f, 10921));
        earth.setOrbiters(orbiters);
        assertEquals("The Moon", earth.getOrbiters().get(0).getName());
        assertEquals(734200000000000000000000f, earth.getOrbiters().get(0).getMassInKilos());
        assertEquals(10921, earth.getOrbiters().get(0).getCircumferenceInKilometers());
    }
}