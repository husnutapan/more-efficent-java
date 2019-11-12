package core.java.reference;

import java.lang.ref.*;

public class JavaMemoryReference {


    public static void main(String[] args) throws InterruptedException {
        // weak();
        // strong();
        // soft();
        // phantom();
    }

    private static void phantom() throws InterruptedException {
        Employee employee = new Employee("Husnu", 25);
        ReferenceQueue q = new ReferenceQueue();

        PhantomReference pr = new PhantomReference(employee, q);
        Reference reference = q.remove();

    }

    //if jvm needs to memory destroy to that assigned type object(getting memory out of error from jvm.)
    private static void soft() {
        Employee employee = new Employee("Husnu", 25);
        SoftReference<Employee> softReference = new SoftReference<>(employee);
        System.out.println(softReference.get());
        employee = null;
        System.gc();
        System.out.println(softReference.get());
    }

    //when we call the garbage collection destroy to assigned null value.
    private static void weak() {
        Employee employee = new Employee("Husnu", 25);
        WeakReference<Employee> weakReference = new WeakReference<>(employee);
        System.out.println(weakReference.get());
        employee = null;
        System.gc();
        System.out.println(weakReference.get());
    }

    //eligeble for Garbage Collection
    //Most usable this method
    static void strong() {
        Employee employee = new Employee("Husnu", 25);
        employee = null;
    }

}


class Employee {
    private String name;
    private Integer age;

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name:" + name + " age:" + age;
    }
}