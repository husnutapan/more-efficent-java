package com.java.solution.solid.openclose;

public class Test {
    public static void main(String[] args) {
        Context context = new Context(new Sum());
        System.out.println(context.executeOperation(5, 10));

        context = new Context(new Subtract());
        System.out.println(context.executeOperation(5, 10));

    }
}
