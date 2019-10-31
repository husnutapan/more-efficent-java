package creational;

public class SingletonPattern {
}

class EagerInitializing {
    private static final EagerInitializing variable = new EagerInitializing();

    static EagerInitializing getVariable() {
        return variable;
    }
}

class LazyInitializing {
    private static LazyInitializing variable;

    static LazyInitializing getVariable() {
        if (variable == null) {
            variable = new LazyInitializing();
        }
        return variable;
    }
}

class StaticBlockInializing {
    private static StaticBlockInializing variable;

    static {
        try {
            variable = new StaticBlockInializing();
        } catch (Exception e) {
            throw new RuntimeException("There is an error when creating variable");
        }
    }
}

class ThreadSafeInitializing {
    static ThreadSafeInitializing variable;

    static synchronized ThreadSafeInitializing getVariable() {
        if (variable == null) {
            variable = new ThreadSafeInitializing();
        }
        return variable;
    }
}