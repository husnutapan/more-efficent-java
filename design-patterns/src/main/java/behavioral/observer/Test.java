package behavioral.observer;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Topic topic = new Topic();
        Observer observer1 = new TopicSubscriber("Test1");
        Observer observer2 = new TopicSubscriber("Test2");
        Observer observer3 = new TopicSubscriber("Test3");
        Observer observer4 = new TopicSubscriber("Test4");

        topic.register(observer1);
        topic.register(observer2);
        topic.register(observer3);
        topic.register(observer4);

        observer1.setInteraction(topic);
        observer2.setInteraction(topic);
        observer3.setInteraction(topic);
        observer4.setInteraction(topic);

        observer1.update();

        topic.publishNewMessage(new Message("Test Detail", new Date(), "Test Topic"));

    }
}
