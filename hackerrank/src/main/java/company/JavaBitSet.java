package company;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int prosessSize = scanner.nextInt();

        BitSet bitSet1 = new BitSet();
        BitSet bitSet2 = new BitSet();


        for (int i = 0; i < size - 1; i++) {
            bitSet1.set(i, 0);
            bitSet2.set(i, 0);
        }

        for (int i = 0; i < prosessSize; i++) {
            String processType = scanner.next();
            int firstIndex = scanner.nextInt();
            int secondIndex = scanner.nextInt();
            calculate(processType, firstIndex, secondIndex, bitSet1, bitSet2);
        }
    }


    static void calculate(String type, int first, int second, BitSet bitSet1, BitSet bitSet2) {
        if (type.equals("AND")) {
            bitSet1.and(bitSet2);
            System.out.print(bitSet1);
            System.out.print(bitSet2);
        }
        if (type.equals("SET")) {
            if (first == 1) {
                bitSet1.set(second, first);
            }
            if (first == 2) {
                bitSet2.set(second, first);
            }
        }
        if (type.equals("FLIP")) {

        }
        if (type.equals("OR")) {

        }


    }
}
