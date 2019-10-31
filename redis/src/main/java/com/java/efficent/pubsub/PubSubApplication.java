package com.java.efficent.pubsub;

import com.java.efficent.pubsub.middleware.Publisher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PubSubApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(PubSubApplication.class, args);
        Publisher messagePublisher = context.getBean(Publisher.class);
        messagePublisher.publish("This is message from publisher...");
    }


}
