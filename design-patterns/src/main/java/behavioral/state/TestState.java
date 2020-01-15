package behavioral.state;

public class TestState implements Development {
    @Override
    public void next(State state) {
        System.out.println("ready for merge code.");
    }

    @Override
    public void previous(State state) {
        state.setDevelopmentState(new CodingState());
    }

    @Override
    public void consoleStatus() {
        System.out.println("The state status is test inside.");
    }
}
