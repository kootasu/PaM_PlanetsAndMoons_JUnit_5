package PlanetsAndMoons;

import java.util.ArrayList;

public abstract class CelestialBody {

    /**
     * Just a few attributes...
     * circumferenceInKilometers never really used for anything :/
     */
    private String name;
    private float massInKilos;
    public double circumferenceInKilometers;
    private ArrayList<CelestialBody> orbiters;

    public CelestialBody(String name, float massInKilos, double circumferenceInKilometers) {
        this.name = name;
        this.massInKilos = massInKilos;
        this.circumferenceInKilometers = circumferenceInKilometers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMassInKilos() {
        return massInKilos;
    }

    public void setMassInKilos(float massInKilos) {
        this.massInKilos = massInKilos;
    }

    public double getCircumferenceInKilometers() {
        return circumferenceInKilometers;
    }

    public void setCircumferenceInKilometers(double circumferenceInKilometers) {
        this.circumferenceInKilometers = circumferenceInKilometers;
    }

    public ArrayList<CelestialBody> getOrbiters() {
        return orbiters;
    }

    public void setOrbiters(ArrayList<CelestialBody> orbiters) {
        this.orbiters = orbiters;
    }

    @Override
    public String toString() {
        String str = "Celestial body: " + getName() + "\n" +
                "Mass: " + getMassInKilos() + "\n" +
                "Circumference: " + getCircumferenceInKilometers();
        // If there are any orbiters
        if (getOrbiters() != null){
            for (CelestialBody orbiter : getOrbiters()) {
                str += "\nOrbiter: " + orbiter.getName();
            }
        }
        return str;
    }
}
