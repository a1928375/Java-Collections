package com.company;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {

    private final Key key;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod, String bodyType) {
        this.key = new Key(name, bodyType);
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public Key getKey() {
        return key;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addSatellite(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    @Override
    public final boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if(obj instanceof HeavenlyBody) {

            HeavenlyBody theObject = (HeavenlyBody) obj;

            return this.key == theObject.getKey();
        }

        return false;
    }

    @Override
    public final int hashCode() {
        return this.key.hashCode();
    }

    @Override
    public String toString() {
        return this.key.getName() + ": " + this.key.getBodyType() + ", " + this.orbitalPeriod;
    }

    public static Key makeKey(String name, String bodyType) {

        return new Key(name, bodyType);
    }

    public static final class Key {

        private String name;
        private String bodyType;

        private Key(String name, String bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public String getBodyType() {
            return bodyType;
        }

        @Override
        public final boolean equals(Object obj) {

                Key key = (Key) obj;
                if (this.name.equals(key.getName())) {

                    return this.bodyType == key.getBodyType();
                }

            return false;
        }

        @Override
        public final int hashCode() {
            return this.name.hashCode() + this.bodyType.hashCode() + 57;
        }

        @Override
        public String toString() {
            return this.name + ": " + this.bodyType;
        }
    }
}