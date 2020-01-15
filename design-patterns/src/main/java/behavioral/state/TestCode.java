package behavioral.state;

public class TestCode {
    public static void main(String[] args) {
        State state = new State();
        state.consoleStatus();

        state.next();
        state.consoleStatus();

        state.next();
        state.consoleStatus();

        //ready for review state, dont have further state
        state.next();
        state.consoleStatus();
    }
}
