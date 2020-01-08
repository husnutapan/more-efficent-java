package newscreated;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CountingValley {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int valleyCount = 0;
        int balance = 0;
        char[] arr = s.toCharArray();

        for (char var : arr) {
            if (var == 'U') balance++;
            if (var == 'D') balance--;
            if (balance == 0 && var == 'U') valleyCount++;
        }
        return valleyCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int result = countingValleys(8, "UDDDUDUU");
        System.out.println(result);
        scanner.close();
    }
}
