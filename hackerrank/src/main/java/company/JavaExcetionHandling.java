package company;

import java.io.*;
import java.util.*;

public class JavaExcetionHandling {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int val1 = 0, val2 = 0;
        try {
            val1 = scanner.nextInt();
        } catch (InputMismatchException im) {
            System.out.println("java.util.InputMismatchException");
            System.exit(0);
        }

        try {
            val2 = scanner.nextInt();
        } catch (InputMismatchException im) {
            System.out.println("java.util.InputMismatchException");
            System.exit(0);
        }


        try {
            int a = val1 / val2;
            System.out.println(a);
        } catch (ArithmeticException a) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }

    }
}
