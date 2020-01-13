package behavioral.chainofresponsibility;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class TestPattern {

    public static void main(String[] args) throws Exception {
        detach("1.0");
        detach("1");
        detach("10l");
        detach("text");
    }

    static void detach(Object object) throws Exception {
        List<Function> functions = Arrays.asList(
                OptionalObject.ObjectsParsing::doubleParse,
                OptionalObject.ObjectsParsing::integerParge,
                OptionalObject.ObjectsParsing::doubleParse,
                OptionalObject.ObjectsParsing::stringParse);

        Optional<Object> optional = functions.stream().map(function -> function.apply(object))
                .filter(o -> {
                    Optional opt = (Optional) o;
                    if (opt.isPresent()) return true;
                    return false;
                }).findFirst();
        System.out.println(Optional.of(optional.get()).orElseThrow(Exception::new));
    }
}
