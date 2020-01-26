package eventhandler.customevent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class EventHandling implements CommandLineRunner {

    @Autowired
    EventPublisher eventPublisher;


    public static void main(String[] args) throws Exception {
        SpringApplication springApplication = new SpringApplication(EventHandling.class);
        springApplication.setDefaultProperties(Collections.singletonMap("server.port", "9999"));
        springApplication.run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        eventPublisher.emitEvent();
    }
}
