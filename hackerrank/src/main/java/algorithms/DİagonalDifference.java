package algorithms;

import java.util.List;

public class DİagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {

        int arrSize = arr.size();

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < arrSize; i++) {
            leftSum += arr.get(i).get(i);
            rightSum += arr.get(i).get(arrSize - i);
        }
        return Math.abs(rightSum - leftSum);
    }

}
