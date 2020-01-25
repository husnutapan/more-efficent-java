package com.java.solution.solid.liskovsubstitution;

public enum CarBrands {
    FERRARI("Ferrari"),
    FORD("Ford"),
    MERCEDES("Mercedes"),
    BMW("Bmw");

    private String brand;

    CarBrands(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
