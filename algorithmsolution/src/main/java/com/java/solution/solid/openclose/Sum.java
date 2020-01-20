package com.java.solution.solid.openclose;

public class Sum implements Operation {
    @Override
    public Integer operate(Integer var1, Integer var2) {
        return var1 + var2;
    }
}
