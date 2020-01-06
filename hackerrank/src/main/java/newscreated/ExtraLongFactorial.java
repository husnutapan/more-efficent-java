package newscreated;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorial {
    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
        BigInteger bigInteger = new BigInteger("1");

        for (int i = 1; i <= n; i++) {
            bigInteger = bigInteger.multiply(new BigInteger(String.valueOf(i)));
        }
        System.out.println(bigInteger);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        extraLongFactorials(n);

        scanner.close();
    }

}
