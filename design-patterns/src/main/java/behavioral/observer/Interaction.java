package behavioral.observer;

public interface Interaction {
    void register(Observer observer);

    void unregister(Observer observer);

    void notification();

    Object getMessage(Observer observer);
}
