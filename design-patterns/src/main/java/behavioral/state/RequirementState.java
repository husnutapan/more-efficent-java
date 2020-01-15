package behavioral.state;

public class RequirementState implements Development {

    @Override
    public void next(State state) {
        state.setDevelopmentState(new CodingState());
    }

    @Override
    public void previous(State state) {
        System.out.println("There is not prev state of requirement.");
    }

    @Override
    public void consoleStatus() {
        System.out.println("The state status is requirement inside.");
    }
}
