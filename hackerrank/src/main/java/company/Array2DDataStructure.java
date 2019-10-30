package company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


@SolutionInformation(point = 15, inputValue = "1 1 1 0 0 0\n" +
        "0 1 0 0 0 0\n" +
        "1 1 1 0 0 0\n" +
        "0 0 2 4 4 0\n" +
        "0 0 0 2 0 0\n" +
        "0 0 1 2 4 0",
        outputValue = "19", solutionUser = "husnu_tapan")
public class Array2DDataStructure {


    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                list.add(arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);
            }
        }

        return list.stream().collect(Collectors.maxBy(Comparator.naturalOrder())).get();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

