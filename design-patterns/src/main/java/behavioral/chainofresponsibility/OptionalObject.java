package behavioral.chainofresponsibility;

import java.util.Optional;

public class OptionalObject {
    static class ObjectsParsing {

        //parsing integer value
        static Optional<Integer> integerParge(Object integerVar) {
            if (integerVar instanceof Integer) {
                return Optional.of((Integer) integerVar);
            }
            return Optional.empty();
        }

        //parsing double value
        static Optional<Double> doubleParse(Object doubleVar) {
            if (doubleVar instanceof Integer) {
                return Optional.of((Double) doubleVar);
            }
            return Optional.empty();
        }

        //parsing long value
        static Optional<Long> longParse(Object longVar) {
            if (longVar instanceof Long) {
                return Optional.of((Long) longVar);
            }
            return Optional.empty();
        }

        //parsing string value
        static Optional<String> stringParse(Object stringVar) {
            if (stringVar instanceof String) {
                return Optional.of((String) stringVar);
            }
            return Optional.empty();
        }
    }
}
