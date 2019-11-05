package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Interaction {
    private List<Observer> observers = new ArrayList<>();
    private Message message;

    @Override
    public void register(Observer observer) {
        if (!observers.contains(observer))
            observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notification() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public Object getMessage(Observer observer) {
        return this.message;
    }

    void publishNewMessage(Message message) {
        System.out.println("Publishing new message...");
        this.message = message;
        notification();
    }
}
