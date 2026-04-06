package Exceptions_Assertions;

// EXAMPLE OF PoE -------------------
class PropagationDemo {
    static void methodC() {
        System.out.print("Inside methodC");
        int result = 10 / 0;
        System.out.println("This never prints");
    }

    static void methodB() {
        System.out.println("Inside methodB");
        methodC(); // No try-catch here
        System.out.println("This never prints either");
    }

    static void methodA() {
        System.out.println("Inside methodA");
        methodB(); // No try-catch here
        System.out.println("This never prints either");
    }
}

public class first_PoE {
    public static void main(String[] args) {
        System.out.println("Inside main");
        try {
            PropagationDemo.methodA();
        } catch (ArithmeticException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }

        System.out.println("main continues after catch");
    }
}