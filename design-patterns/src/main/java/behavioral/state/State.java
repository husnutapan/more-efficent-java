package behavioral.state;

public class State {
    private Development developmentState = new RequirementState();

    public void next() {
        developmentState.next(this);
    }

    public void previous() {
        developmentState.previous(this);
    }

    public void consoleStatus() {
        developmentState.consoleStatus();
    }


    public void setDevelopmentState(Development developmentState) {
        this.developmentState = developmentState;
    }
}
