package behavioral.interpreter;

import java.util.Stack;

public class Test {


    public static void main(String[] args) {
        String unProcessExpression = "15-48*+";

        Context context = new Context();

        char[] characters = unProcessExpression.toCharArray();

        Stack<Integer> stackProcessor = new Stack<>();

        for (Character character : characters) {
            boolean isOperator = context.checkIsOperator(character);
            if (isOperator) {
                Interpreter interpreter = context.process(stackProcessor.pop(), stackProcessor.pop(), character);
                stackProcessor.push(interpreter.compute());
            } else {
                stackProcessor.push(Integer.parseInt(String.valueOf(character)));
            }
        }
        System.out.println("Result is :" + stackProcessor.pop());

    }
}
