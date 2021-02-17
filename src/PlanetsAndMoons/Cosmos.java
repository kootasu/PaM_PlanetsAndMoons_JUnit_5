package PlanetsAndMoons;

import java.util.ArrayList;

public class Cosmos {

    /**
     * Creates and returns one ArrayList of celestial bodies of different types
     *
     * @return
     */
    public ArrayList<CelestialBody> createCelestialBodies() {
        ArrayList<CelestialBody> celestialBodies = new ArrayList<>();
        celestialBodies.add(new Planet("Earth", 5973600000000000000000000f, 40075));
        celestialBodies.add(new Moon("The Moon", 73420000000000000000000f, 10921));
        celestialBodies.add(new UFO("Oumuamua", 1, 0.5));
        return celestialBodies;
    }

}