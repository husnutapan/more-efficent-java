package algorithms;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class ClimbingTheLeaderboard {

    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        List<Integer> sortedList = Arrays.stream(scores).boxed().collect(Collectors.toList());
        Collections.sort(sortedList, Collections.reverseOrder());
        int[] returnData = new int[alice.length];
        int lastIndex = sortedList.get(scores.length - 1);
        int index = 0;
        int counter = 0;
        for (int i = 0; i < alice.length; i++) {
            if (alice[i] < lastIndex) {
                returnData[index++] = scores.length;
                counter = 0;
            }
            for (Integer e : sortedList) {
                if (e <= alice[i]) {
                    returnData[index++] = ++counter;
                    counter = 0;
                } else counter++;
            }
        }

        return returnData;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int scoresCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int aliceCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }

        int[] result = climbingLeaderboard(scores, alice);
    }


}
