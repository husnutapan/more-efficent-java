
public class JavaReflection {

    public static void main(String[] args) {
        Class student = Student.class.getClass();
        java.lang.reflect.Method[] methods = student.getDeclaredMethods();

        java.util.ArrayList<String> methodList = new java.util.ArrayList<>();
        for (java.lang.reflect.Method method : methods) {
            methodList.add(method.getName());
        }
        java.util.Collections.sort(methodList);
        for (String name : methodList) {
            System.out.println(name);
        }
    }

}

class Student {
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void anothermethod() {
    }
}
