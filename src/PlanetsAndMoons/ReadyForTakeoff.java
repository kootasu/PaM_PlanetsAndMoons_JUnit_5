package PlanetsAndMoons;

import java.util.ArrayList;

public class ReadyForTakeoff {

    public static void main(String[] args) {

        // TODO: For all classes: toString and equals methods
        // TODO: Tests for toString and equals
        // TODO: Messages in tests

        // Creating some celestial bodies
        Cosmos cosmos = new Cosmos();
        ArrayList<CelestialBody> celestialBodies = cosmos.createCelestialBodies();

        // Giving earth some orbiters
        ArrayList<CelestialBody> orbiters = new ArrayList<>();
        orbiters.add(celestialBodies.get(1));
        orbiters.add(celestialBodies.get(2));
        celestialBodies.get(0).setOrbiters(orbiters);

        // Just gazing
        for (CelestialBody celestialBody : celestialBodies){
            System.out.println(celestialBody + "\n");
        }

        // Finding barycentre
        Astronomer astronomer = new Astronomer();
        double earthMoonBarycentre = astronomer.calculateBarycentre(celestialBodies.get(0), celestialBodies.get(1),384400);
        System.out.println("The gravitational centre between the Earth and the Moon lies at " + earthMoonBarycentre +
                " km away from the centre of the Earth's mass.");
    }
}
