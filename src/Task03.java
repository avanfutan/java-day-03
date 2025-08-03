import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Task03 {

    public static void run() {
        // 1. Predicate: Check if string start with "A"
        Predicate<String> startWithA = s -> s.startsWith("A");
        System.out.println(startWithA.test("Alice"));
        System.out.println(startWithA.test("Bob"));

        // 2. Function: Convert String to its Length
        Function<String, Integer> stringLength = String::length;
        System.out.println(stringLength.apply("Hello"));  // 5

        // 3. Consumer: Print String in Uppercase
        Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
        printUpperCase.accept("hello");  // HELLO

        // 4. Supplier: Return Random Number
        Supplier<Double> randomNumber = Math::random;
        System.out.println(randomNumber.get());
    }
}
