package transactionManagment;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class ThrowExceptionComponent {

    @Transactional(propagation = Propagation.REQUIRED)
    public void throwRuntimeWithRequired() {
        throw new RuntimeException("Runtime Exception...");
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void throwRuntimeWithRequiredNew() {
        throw new RuntimeException("Runtime Exception...");
    }
}
