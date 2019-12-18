package behavioral.interpreter;

public class Substract implements Interpreter {
    
    private final Integer var1;
    private final Integer var2;

    public Substract(Integer var1, Integer var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    @Override
    public Integer compute() {
        return var1 - var2;
    }
}
