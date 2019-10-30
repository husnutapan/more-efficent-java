package booking.solutions;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution3 {

    static int howManyAgentsToAdd(int noOfCurrentAgents, List<List<Integer>> callsTimes) {
        int agentCount = 0;

        for (int i = 0; i < callsTimes.size()-1; i++) {
            for (int j = 0; j < 2; j++) {
                if(callsTimes.get(i).get(j)<=callsTimes.get(i+1).get(j) && callsTimes.get(i).get(j+1)<callsTimes.get(i+1).get(j+1))
                    agentCount++;
            }
        }
        return agentCount==0 ? 0: agentCount;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int noOfCurrentAgents = Integer.parseInt(bufferedReader.readLine().trim());

        int callsTimesRows = Integer.parseInt(bufferedReader.readLine().trim());
        int callsTimesColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> callsTimes = new ArrayList<>();

        for (int i = 0; i < callsTimesRows; i++) {
            String[] callsTimesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> callsTimesRowItems = new ArrayList<>();

            for (int j = 0; j < callsTimesColumns; j++) {
                int callsTimesItem = Integer.parseInt(callsTimesRowTempItems[j]);
                callsTimesRowItems.add(callsTimesItem);
            }

            callsTimes.add(callsTimesRowItems);
        }

        int res = howManyAgentsToAdd(noOfCurrentAgents, callsTimes);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
