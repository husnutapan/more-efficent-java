package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        if (a.size() != b.size()) return null;
        else {
            int aPoint = 0;
            int bPoint = 0;

            for (int i = 0; i < a.size(); i++) {
                if (a.get(i) > b.get(i)) {
                    aPoint++;

                } else if (a.get(i) < b.get(i)) {
                    bPoint++;
                }
            }
            List<Integer> list = Arrays.asList(aPoint, bPoint);
            return list;
        }


    }


}
