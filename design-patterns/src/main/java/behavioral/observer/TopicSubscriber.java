package behavioral.observer;

public class TopicSubscriber implements Observer {

    private String topic;
    private Interaction interaction;

    TopicSubscriber(String topic) {
        this.topic = topic;
    }

    @Override
    public void update() {
        Message msg = (Message) interaction.getMessage(this);
        if (msg != null)
            System.out.println(msg.getTopic() + " " + msg.getCreatedDate());
    }

    @Override
    public void setInteraction(Interaction interaction) {
        this.interaction = interaction;
    }
}
