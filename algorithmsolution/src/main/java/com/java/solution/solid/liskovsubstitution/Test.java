package com.java.solution.solid.liskovsubstitution;

public class Test {
    public static void main(String[] args) {
        TransportationWithEngine transportationWithEngine =
                new TransportationWithEngine("Test Car", 250, new Engine(), CarBrands.MERCEDES);
        transportationWithEngine.startEngine();

        transportationWithEngine =
                new TransportationWithEngine("Test Car2", 300, new Engine(), CarBrands.FERRARI);
        transportationWithEngine.startEngine();

        TransportationWithoutEngine transportationWithoutEngine = new TransportationWithoutEngine("Test Bicycle", 50);
        transportationWithoutEngine.moveWithoutEngine(1000);

    }
}
