package Functional_Interface;
import java.util.function.*;

public class FI_third {
    public static void main(String[] args) {
        // Predicate<Integer> isEven = n -> n % 2 == 0;
        // System.out.println(isEven.test(4));


        // Function<String, Integer> lengthOf = s -> s.length();
        // System.out.println(lengthOf.apply("Vaibhav"));

        // Consumer<String> printer = s -> System.out.println(">> " + s);
        // printer.accept("Hello");

        Supplier<String> greeting = () -> "Good Morning";
        System.out.println(greeting.get());
    }
}
