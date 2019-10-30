package algorithms;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class ExtraLongFactorials {

    static void extraLongFactorials(int n) {

        final BigInteger[] bigInteger = {new BigInteger("1")};


        IntStream.range(1, n).forEach(cons ->
            bigInteger[0] = bigInteger[0].multiply(new BigInteger(String.valueOf(cons))));

        System.out.println(bigInteger[0]);
    }

    public static void main(String[] args) {

        extraLongFactorials(5);

    }


}
