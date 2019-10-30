package company;

import java.util.Scanner;
import java.util.Stack;

@SolutionInformation(
        point = 20,
        inputValue = "{}()" +
                "({()})" +
                "{}(" +
                "[]",
        outputValue = "true" +
                "true" +
                "false" +
                "true",
        solutionUser = "husnu_tapan")
public class JavaStack {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            System.out.println(controlText(input));
        }

    }

    static boolean controlText(String text) {

        Stack stack = new Stack();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '{') {
                stack.push('{');
            } else if (text.charAt(i) == '[') {
                stack.push('[');
            } else if (text.charAt(i) == '(') {
                stack.push('(');
            } else if (text.charAt(i) == '}') {
                if (stack.isEmpty()) return false;
                if (!stack.pop().equals('{')) return false;
            } else if (text.charAt(i) == ']') {
                if (stack.isEmpty()) return false;
                if (!stack.pop().equals('[')) return false;
            } else if (text.charAt(i) == ')') {
                if (stack.isEmpty()) return false;
                if (!stack.pop().equals('(')) return false;
            }
        }

        return stack.isEmpty();
    }


}
