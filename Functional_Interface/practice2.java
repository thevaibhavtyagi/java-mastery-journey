package Functional_Interface;
import java.util.function.*;

// QUESTION 2 ----------------
public class practice2 {
    public static void main(String[] args) {
        Predicate<String> hasMoreThanFive = s -> s.length() > 5;
        System.out.println(hasMoreThanFive.test("HelloWorld"));

        Function<String, String> reverse = s -> new StringBuilder(s).reverse().toString();
        System.out.println(reverse.apply("Java"));

        Consumer<String> logger = s -> System.out.println("[LOG]: " + s);
        logger.accept("Functional Interfaces");

        Supplier<String> nameSupplier = () -> "Vaibhav";
        System.out.println(nameSupplier.get());
    }
}