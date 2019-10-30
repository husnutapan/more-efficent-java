package company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 input
 5
 5 41 77 74 22 44
 1 12
 4 37 34 36 52
 0
 3 20 22 33
 5
 1 3
 3 4
 3 1
 4 3
 5 5
 output
 74
 52
 37
 ERROR!
 ERROR!
 */
public class JavaArrayList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int var1 = scanner.nextInt();

        List<List<Integer>> list = new ArrayList<>(new ArrayList<>());

        for (int i = 0; i < var1; i++) {
            List list1 = new ArrayList();
            int var2 = scanner.nextInt();
            for (int j = 0; j < var2; j++) {
                int var3 = scanner.nextInt();
                list1.add(j, var3);
            }
            list.add(list1);
        }


        int var4 = scanner.nextInt();

        int[][] output = new int[var4][2];

        for (int i = 0; i < var4; i++) {
            int left = scanner.nextInt();
            int right = scanner.nextInt();
            output[i][0] = left - 1;
            output[i][1] = right - 1;

        }


        for (int i = 0; i < var4; i++) {
            try {
                System.out.println(list.get(output[i][0]).get(output[i][1]));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }

        }

    }
}
