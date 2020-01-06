package newscreated;

import java.io.IOException;

public class KangarooSameTimeSameLand {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        int gap, prevGap;
        while (true) {
            prevGap = Math.abs(x2 - x1);
            x1 = x1 + v1;
            x2 = x2 + v2;
            gap = Math.abs(x2 - x1);
            if (gap > prevGap) return "NO";
            if (gap == 0) return "YES";
        }
    }

    public static void main(String[] args) throws IOException {

        String result = kangaroo(0, 3, 4, 2);
        System.out.println(result);

    }


}
