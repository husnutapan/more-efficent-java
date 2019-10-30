package algorithms;

import java.io.IOException;
import java.util.*;

class Result {

    public static int pickingNumbers(List<Integer> a) {
        int[] freqs = new int[101];
        for (Integer i : a) freqs[i]++;
        int max = 0;
        for (int i = 1; i < freqs.length-1; i++)
            if (freqs[i] + freqs[i+1] > max) max = freqs[i] + freqs[i+1];
        return max;
    }

}

public class PickingNumbers {
    public static void main(String[] args) throws IOException {
        Result.pickingNumbers(new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(2);
            add(3);
            add(1);
            add(2);
            add(2);
            add(2);
            add(2);
        }});
    }
}

