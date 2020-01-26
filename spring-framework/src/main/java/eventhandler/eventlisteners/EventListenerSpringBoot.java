package eventhandler.eventlisteners;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication(scanBasePackages = "eventhandler.eventlisteners",
        exclude = org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class)
public class EventListenerSpringBoot {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                EventListenerSpringBoot.class);
        context.stop();
        context.start();
        context.close();
    }

}
