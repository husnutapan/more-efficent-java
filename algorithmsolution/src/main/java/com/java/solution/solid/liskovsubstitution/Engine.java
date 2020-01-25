package com.java.solution.solid.liskovsubstitution;

import java.util.HashMap;
import java.util.Map;

public class Engine {
    String name;
    Map<String, String> props = new HashMap<>();

    public Map<String, String> getProps() {
        return props;
    }

    public String getName() {
        return name;
    }

    public void startEngine(CarBrands carBrands) {
        String brandName = carBrands.getBrand();
        System.out.println(brandName + " engine started..");
    }
}
