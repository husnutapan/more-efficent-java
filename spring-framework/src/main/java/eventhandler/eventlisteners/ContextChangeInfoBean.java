package eventhandler.eventlisteners;

import org.springframework.context.event.*;
import org.springframework.stereotype.Component;

@Component
public class ContextChangeInfoBean {

    @EventListener
    void contextRefresh(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("Context refresh event catched...");
        System.out.println(contextRefreshedEvent);
    }

    @EventListener
    void handleContextStart(ContextStartedEvent contextStartedEvent) {
        System.out.println("Context start event catched...");
        System.out.println(contextStartedEvent);
    }


    @EventListener
    void handleContextStop(ContextStoppedEvent contextStoppedEvent) {
        System.out.println("Context stop event catched...");
        System.out.println(contextStoppedEvent);
    }


    @EventListener
    void handleContextClose(ContextClosedEvent contextClosedEvent) {
        System.out.println("Context close event catched...");
        System.out.println(contextClosedEvent);
    }
}
