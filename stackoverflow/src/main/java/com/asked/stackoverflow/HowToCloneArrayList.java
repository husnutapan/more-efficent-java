package com.asked.stackoverflow;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//https://stackoverflow.com/questions/715650/how-to-clone-arraylist-and-also-clone-its-contents
public class HowToCloneArrayList {
    public static void main(String[] args) {
        Model model = new Model("my-model1", 10);
        Model model2 = new Model("my-model2", 40);
        Model model3 = new Model("my-model3", 30);
        Model model4 = new Model("my-model4", 20);
        List<Model> myList = new ArrayList<Model>() {{
            add(model);
            add(model2);
            add(model3);
            add(model4);
        }};
        //deep copy
        List<Model> deepCopyList = myList.stream().map(d -> d.clone()).collect(Collectors.toList());
        deepCopyList.forEach(System.out::println);

        System.out.println("*----***----*");

        //shallow copy
        List<Model> shallowCopy = new ArrayList<>(myList);
        shallowCopy.forEach(System.out::println);
    }
}


class Model {
    public String name;
    public Integer age;

    public Model(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Model clone() {
        return new Model(name, age);
    }

    @Override
    public String toString() {
        return "{name:" + name + " age:" + age + "}";
    }
}