package company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class JavaDequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();

        HashSet hashSet = new HashSet();

        int n = in.nextInt();
        int m = in.nextInt();

        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            hashSet.add(num);

            if (deque.size() == m) {
                if (hashSet.size() > max)
                    max = hashSet.size();
                if (max == m)
                    break;
                int first = (int) deque.remove();
                if (!deque.contains(first)) hashSet.remove(first);
            }
        }
        System.out.println(max);
    }
}
