package Exceptions_Assertions;
// PRACTICE QUESTION 1 - SHOW PROPAGATION OF E -----------------
public class PoE_practice1 {
    static void calculate() {
        System.out.println("I am calculate");
        int num = Integer.parseInt("abc");
    }

    
    static void process() {
        System.out.println("I am process()");
        calculate();
        System.out.println("I may print or may not");
    }

    static void start() {
        System.out.println("I am start()");
        process();
        System.out.println("I may print or may not");
    }
    public static void main(String[] args) {
        System.out.println("Inside main");
        try {
            start();
        } catch (NumberFormatException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }

        System.out.println("Program recovered successfully.");
    }
}
