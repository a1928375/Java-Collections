package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    private static Set<HeavenlyBody> solarSystem = new HashSet<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {

        HeavenlyBody temp = new Planet("Mercury", 88);
        solarSystem.add(temp);
        planets.add(temp);

        temp = new Planet("Venus", 225);
        solarSystem.add(temp);
        planets.add(temp);

        temp = new Planet("Earth", 365);
        solarSystem.add(temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new Moon("Moon", 27);
        solarSystem.add(tempMoon);
        temp.addSatellite(tempMoon);

        temp = new Planet("Mars", 687);
        solarSystem.add(temp);
        planets.add(temp);

        tempMoon = new Moon("Deimos", 1.3);
        solarSystem.add(tempMoon);
        temp.addSatellite(tempMoon); // temp is still Mars

        tempMoon = new Moon("Phobos", 0.3);
        solarSystem.add(tempMoon);
        temp.addSatellite(tempMoon); // temp is still Mars

        temp = new Planet("Jupiter", 4332);
        solarSystem.add(temp);
        planets.add(temp);

        tempMoon = new Moon("Io", 1.8);
        solarSystem.add(tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Europa", 3.5);
        solarSystem.add(tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Ganymede", 7.1);
        solarSystem.add(tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Callisto", 16.7);
        solarSystem.add(tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        temp = new Planet("Saturn", 10759);
        solarSystem.add(temp);
        planets.add(temp);

        temp = new Planet("Uranus", 30660);
        solarSystem.add(temp);
        planets.add(temp);

        temp = new Planet("Neptune", 165);
        solarSystem.add(temp);
        planets.add(temp);

        temp = new Planet("Pluto", 248);
        solarSystem.add(temp);
        planets.add(temp);

        System.out.println("Planets");
        for (HeavenlyBody planet : planets) {
            System.out.println("\t" + planet.getName());
        }

        for (HeavenlyBody item : solarSystem) {

            if(item.getName().equals("Mars")) {

                HeavenlyBody body = item;
                System.out.println("Moons of " + body.getName());

                for (HeavenlyBody jupiterMoon : body.getSatellites()) {
                    System.out.println("\t" + jupiterMoon.getName());
                }
            }
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody planet : planets) {
            moons.addAll(planet.getSatellites());
        }

        System.out.println("All Moons");
        for (HeavenlyBody moon : moons) {
            System.out.println("\t" + moon.getName());
        }

        HeavenlyBody pluto = new DwarfPlanet("Pluto", 842);
        planets.add(pluto);
        solarSystem.add(pluto);

        for (HeavenlyBody planet : planets) {
            System.out.println(planet);
        }

        HeavenlyBody earth1 = new Planet("Earth", 365);
        HeavenlyBody earth2 = new Planet("Earth", 365);
        System.out.println(earth1.equals(earth2));
        System.out.println(earth2.equals(earth1));
        System.out.println(earth1.equals(pluto));
        System.out.println(pluto.equals(earth1));

        System.out.println(solarSystem.size());

        for (HeavenlyBody item : solarSystem) {

            if (item.getName().equals("Pluto")) {

                System.out.println(item.getName() + ": " + item.getBodyType());
            }
        }

        System.out.println();
        System.out.println("The solar system contains:");
        for (HeavenlyBody heavenlyBody : solarSystem) {
            System.out.println(heavenlyBody);
        }
    }
}