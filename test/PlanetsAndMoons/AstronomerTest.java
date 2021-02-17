package PlanetsAndMoons;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AstronomerTest {

    Astronomer astronomer = new Astronomer();
    Planet earth = new Planet("Earth", 5973600000000000000000000f, 40075);
    Moon moon = new Moon("The Moon", 734200000000000000000000f, 10921);

    @Test
    void countMoons(){
        UFO ufo = new UFO("Oumuamua", 1,0.5);
        ArrayList<CelestialBody> orbiters = new ArrayList<>();
        orbiters.add(moon); // Adding a moon
        orbiters.add(ufo); // Adding a UFO (not a moon)
        earth.setOrbiters(orbiters);
        assertEquals(1, astronomer.countMoons(earth), "Is moon count correct?");
    }

    // TODO
    @Test
    void calculateBarycentre() {
        assertEquals(47246, astronomer.calculateBarycentre(earth, moon, 384400),
                "Does method calculation match my own?");
    }
}