import java.util.Scanner;

class MyCalculator {

    public long power(int var1,int var2) throws Exception {
        if(var1==0 || var2==0){
            throw new Exception("n and p should not be zero.");
        }
        else if(var1<0 || var2<0){
            throw new Exception("n or p should not be negative.");
        }
        return (long) Math.pow(var1,var2);


    }

}

public class JavaExceptionHandling {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}