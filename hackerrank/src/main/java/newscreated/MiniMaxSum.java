package newscreated;

import java.math.BigInteger;
import java.util.Scanner;

public class MiniMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        BigInteger max = new BigInteger(String.valueOf(arr[0]));
        BigInteger min = new BigInteger(String.valueOf(arr[0]));

        BigInteger total = new BigInteger(String.valueOf(0));
        for (int i = 0; i < arr.length; i++) {
            if (min.compareTo(new BigInteger(String.valueOf(arr[i]))) > 0) {
                min = new BigInteger(String.valueOf(arr[i]));
            }
            if (max.compareTo(new BigInteger(String.valueOf(arr[i]))) < 0) {
                max = new BigInteger(String.valueOf(arr[i]));
            }
            total = total.add(new BigInteger(String.valueOf(arr[i])));
        }
        System.out.print((total.subtract(max)) + " " + total.subtract(min));
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}