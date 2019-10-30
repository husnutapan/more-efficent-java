package company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

@SolutionInformation(
        point = 30,
        inputValue = "5" +
                "1 4" +
                "2 5" +
                "3 898" +
                "1 3" +
                "2 12",
        outputValue = "EVEN" +
                "PRIME" +
                "PALINDROME" +
                "ODD" +
                "COMPOSITE",
        solutionUser = "husnu_tapan")
@FunctionalInterface
interface PerformOperation {
    boolean check(int a);
}

class MyMath {
    public static boolean dataCheck(PerformOperation p, int num) {
        return p.check(num);
    }

    PerformOperation isOdd() {
        return new PerformOperation() {
            @Override
            public boolean check(int a) {
                return a % 2 != 0;
            }
        };
    }

    PerformOperation isPrime() {
        return new PerformOperation() {
            @Override
            public boolean check(int a) {
                return java.math.BigInteger.valueOf(a).isProbablePrime(1);
            }
        };
    }

    PerformOperation isPalindrome() {
        return new PerformOperation() {
            @Override
            public boolean check(int a) {
                return Integer.toString(a).equals(new StringBuilder(Integer.toString(a)).reverse().toString());
            }
        };
    }

}
// Write your code here

public class JavaLambdaExpressions {

    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T-- > 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.dataCheck(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.dataCheck(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.dataCheck(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}
