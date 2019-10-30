import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaSparseArray {

    // Complete the matchingStrings function below.
    //ON2 not suggestion
    static int[] matchingStrings1(String[] strings, String[] queries) {
        int[] count = new int[queries.length];

        int matchCount;
        for (int i = 0; i < queries.length; i++) {
            matchCount = 0;
            for (String string : strings) {
                if (string.equals(queries[i]))
                    matchCount++;
            }
            count[i] = matchCount;
        }

        return null;
    }

    static long[] matchingStrings(String[] strings, String[] queries) {

        return Arrays.stream(queries).mapToLong(q -> Arrays.stream(strings)
                .filter(q::equals)
                .count()).toArray();
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] strings = new String[stringsCount];

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            strings[i] = stringsItem;
        }

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] queries = new String[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }

        long[] res = matchingStrings(strings, queries);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));

            if (i != res.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}