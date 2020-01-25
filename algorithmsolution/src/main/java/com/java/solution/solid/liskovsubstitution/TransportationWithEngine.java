package com.java.solution.solid.liskovsubstitution;

public class TransportationWithEngine extends Transportation {
    Engine engine;
    CarBrands carBrands;

    public TransportationWithEngine(String name, Integer maxSpeed, Engine engine, CarBrands carBrands) {
        super(name, maxSpeed);
        this.engine = engine;
        this.carBrands = carBrands;
    }

    public void startEngine() {
        engine.startEngine(carBrands);
    }
}
