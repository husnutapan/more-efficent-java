package behavioral.state;

public interface Development {

    void next(State state);

    void previous(State state);

    void consoleStatus();

}
