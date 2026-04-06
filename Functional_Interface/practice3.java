package Functional_Interface;
import java.util.function.*;

// QUESTION 3 -------------------------
class StringProcessor {
    public static void process(String input, Function<String, String> transformer) {
        System.out.println(transformer.apply(input));
    }
}

public class practice3 {
    public static void main(String[] args) {
        StringProcessor.process("hello world", s -> s.toUpperCase());

        StringProcessor.process("hello world", s -> s.replace(" ", "_"));

        StringProcessor.process("hello world", s -> ">> " + s + " <<");
    }
}

// Passing behavior as an argument means supplying a function (logic) to a method instead of fixed code.
// It is powerful because it makes code flexible, reusable, and allows dynamic behavior without modifying the method itself.