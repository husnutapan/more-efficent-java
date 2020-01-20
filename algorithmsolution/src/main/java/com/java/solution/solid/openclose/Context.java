package com.java.solution.solid.openclose;

public class Context {

    private Operation operation;

    Context(Operation operation) {
        this.operation = operation;
    }

    Integer executeOperation(Integer v1, Integer v2) {
        return this.operation.operate(v1, v2);
    }

}
