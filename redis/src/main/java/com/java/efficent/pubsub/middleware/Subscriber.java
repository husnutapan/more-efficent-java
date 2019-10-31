package com.java.efficent.pubsub.middleware;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.stereotype.Component;

@Component
public class Subscriber implements MessageListener {
    @Override
    public void onMessage(Message message, byte[] bytes) {
        System.out.println("Message received:" + message.toString());
    }
}
