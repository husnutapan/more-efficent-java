package creational;


import javax.annotation.PostConstruct;
import java.util.*;

public class PrototypePattern {
    public static void main(String[] args) {
        Model model = new Model();
        model.fillData();

        Model cloned = (Model) model.clone();
        cloned.myList.stream().forEach(System.out::println);
    }
}


class Model implements Cloneable {
    Set<String> myList;
    
    Model() {
        myList = new HashSet<>();
    }

    Model(Set<String> set) {
        this.myList = set;
    }

    void fillData() {
        myList.add("test1");
        myList.add("test2");
        myList.add("test3");
        myList.add("Damaged Data");
    }

    @Override
    protected Object clone() {

        Set<String> clonedObj = new HashSet<>();

        myList.stream().forEach(c -> {
            if (!c.equals("Damaged Data")) clonedObj.add(c);
        });
        return new Model(clonedObj);
    }
}