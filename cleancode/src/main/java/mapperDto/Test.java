package mapperDto;

public class Test {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.getAllEmployee().forEach(consumer -> {
            System.out.print(consumer.getFullName() + " ");
            System.out.println(consumer.getExperinceYear());
        });
    }
}
