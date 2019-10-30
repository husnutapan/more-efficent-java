package algorithms;

public class AVeryBigSum {

    static long aVeryBigSum(long[] ar) {
        long min = 0;

        for (Long var:ar) {
            min+=var;
        }
        return min;
    }

}
