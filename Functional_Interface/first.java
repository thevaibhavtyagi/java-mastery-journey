package Functional_Interface;

// FI - A Functional Interface is an interface that has exactly one abstract method.

// FIRST PROGRAM - WORKING AND SYNTAX ---------
@FunctionalInterface
interface SmartGreeting {
    void greet(String name);

    default void greetLoudly(String name) {
        greet(name.toUpperCase());
    }

    static void printInfo() {
        System.out.println("I am a greeting interface");
    }
}
public class first {
    public static void main(String[] args) {
        SmartGreeting s = new SmartGreeting() {
            @Override
            public void greet(String name) {
                System.out.println("Name is: " + name);
            }
        };

        s.greet("Vaibhav");
        s.greetLoudly("Vaibhav");
        SmartGreeting.printInfo();
    }
}
