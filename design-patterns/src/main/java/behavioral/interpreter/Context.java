package behavioral.interpreter;

import java.util.ArrayList;
import java.util.List;

public class Context {
    List<Character> operators = new ArrayList<Character>() {{
        add('+');
        add('*');
        add('-');
    }};

    public Boolean checkIsOperator(Character character) {
        if (operators.contains(character))
            return true;
        else
            return false;
    }

    public Interpreter process(Integer var1, Integer var2, Character operatorType) {
        if (operatorType.equals(operators.get(0)))
            return new Sum(var2, var1);
        if (operatorType.equals(operators.get(1)))
            return new Multiply(var2, var1);
        if (operatorType.equals(operators.get(2)))
            return new Substract(var2, var1);
        return null;
    }

}
