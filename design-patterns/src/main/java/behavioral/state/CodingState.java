package behavioral.state;

public class CodingState implements Development {
    @Override
    public void next(State state) {
        state.setDevelopmentState(new TestState());
    }

    @Override
    public void previous(State state) {
        state.setDevelopmentState(new RequirementState());
    }

    @Override
    public void consoleStatus() {
        System.out.println("The state status is coding inside.");
    }
}
