package PlanetsAndMoons;

import java.util.ArrayList;

public class Astronomer {

    /**
     * Method looks at all orbiters of a celestial body
     * Counts the orbiters that are moons and returns count value
     * @param celestialBody
     * @return
     */
    public int countMoons(CelestialBody celestialBody){
        int moons = 0;
        ArrayList<CelestialBody> orbiters = celestialBody.getOrbiters();
        for (CelestialBody orbiter : orbiters){
            if (orbiter instanceof Moon) {
                moons++;
            }
        }
        return moons;
    }

    /**
     * Method for finding gravitational centre (barycentre) of 2 celestial bodies
     * Takes 2 celestial bodies and the difference between them
     * Uses formula to find barycentre: https://da.wikipedia.org/wiki/Barycentrum
     * Number returned is the barycentre's distance from the first celestial body (cb1)
     * @param cb1
     * @param cb2
     * @param distanceInKilometers
     * @return
     */
    public double calculateBarycentre(CelestialBody cb1, CelestialBody cb2, float distanceInKilometers) {
        return (distanceInKilometers * (cb2.getMassInKilos() / (cb1.getMassInKilos() + cb2.getMassInKilos())));
    }
}