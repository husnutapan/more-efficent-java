package core.java.internal.works;

import java.util.HashSet;

public class HashmapHashcodeEqual {
    public static void main(String[] args) {
        MyModel myModel = new MyModel(1, "foo", 25);
        MyModel myModel2 = new MyModel(1, "foo", 25);

        //different hashcode
        System.out.println(myModel.hashCode());
        System.out.println(myModel2.hashCode());
        System.out.println("is Equal two object:" + myModel.equals(myModel2));


        HashSet<MyModel> set = new HashSet<>();
        set.add(myModel);
        set.add(myModel2);
//        System.out.println("Contains without hashcode override:" + set.contains(new MyModel(1, "foo", 25)));
        System.out.println("Contains hashcode override:" + set.contains(new MyModel(1, "foo", 25)));
    }

}

class MyModel {
    private int id;
    private String name;
    private int age;

    public MyModel() {
    }

    public MyModel(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof MyModel)) return false;
        if (obj == this) return true;
        return id == ((MyModel) obj).getId();
    }

    @Override
    public int hashCode() {
        return id;
    }
}