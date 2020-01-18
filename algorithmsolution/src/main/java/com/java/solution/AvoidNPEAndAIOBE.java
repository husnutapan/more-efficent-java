package com.java.solution;

import java.util.Optional;

public class AvoidNPEAndAIOBE {
    public static void main(String[] args) {
        String[] array = new String[]{"husnu", null, "tapan", "string", "text"};
        for (int i = 0; i < 10; i++) {
            String result = Optional.ofNullable(array.length > i ? array[i] : null)
                    .map(String::toUpperCase)
                    .orElse("NO DATA IN INDEX");
            System.out.println(result);

        }


    }
}
