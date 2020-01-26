package eventhandler.customevent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyCustomEventHandler implements ApplicationListener<MyCustomEvent> {
    @Override
    public void onApplicationEvent(MyCustomEvent myCustomEvent) {
        System.out.println(myCustomEvent.toString());
    }
}
