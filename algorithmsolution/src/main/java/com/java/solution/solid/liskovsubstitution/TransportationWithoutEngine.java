package com.java.solution.solid.liskovsubstitution;

public class TransportationWithoutEngine extends Transportation {

    public TransportationWithoutEngine(String name, Integer maxSpeed) {
        super(name, maxSpeed);
    }

    void moveWithoutEngine(Integer meter) {
        System.out.println("Moved approximately : " + meter);
    }
}
