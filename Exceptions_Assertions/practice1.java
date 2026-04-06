package Exceptions_Assertions;

// QUESTION 1 - PRACTICE -----------------
public class practice1 {
    public static void main(String[] args) {
        int a = 10, b = 0;

        try {
            System.out.println("Result is: " + a / b);
            
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }

        System.out.println("Division operation complete.");
    }
}
