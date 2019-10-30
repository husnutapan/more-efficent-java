import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int characterSize = scanner.nextInt();
        int processSize = scanner.nextInt();

        BitSet bitSet1 = new BitSet();
        BitSet bitSet2 = new BitSet();
        byte[] var1 = new byte[characterSize];
        for (int i = 0; i < characterSize; i++) {
            var1[i] = 0;
        }
        System.out.println(BitSet.valueOf(var1));
    }
}
