package com.company;

public class Planet extends HeavenlyBody {

    public Planet(String name, double orbitalPeriod) {

        super(name, orbitalPeriod, "Planet");
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {

        if(moon.getBodyType() == "Moon") {

            return super.addSatellite(moon);

        } else {

            return false;
        }
    }
}
