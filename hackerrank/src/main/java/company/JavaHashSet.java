package company;

import java.util.HashSet;
import java.util.Scanner;

public class JavaHashSet {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        HashSet hashSet = new HashSet();
        for (int i = 0; i < t; i++) {
            hashSet.add(pair_left[i] + "_" + pair_right[i]);
            System.out.println(hashSet.size());
        }
    }
}