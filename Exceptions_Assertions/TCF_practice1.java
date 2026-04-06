package Exceptions_Assertions;

// TRY, CATCH, FINALLY - PRACTICE 1 ---------------

public class TCF_practice1 {
    static void safeDivide(int a, int b) {
        try {
            System.out.println(a / b);

        } catch (ArithmeticException e) {
            System.out.println("Division failed.");
            System.out.println("Exception: " + e.getMessage());

        } finally {
            System.out.println("safeDivide() execution complete.");
        }
    }
    public static void main(String[] args) {
        safeDivide(10, 2);
        safeDivide(5, 0);
        safeDivide(9, 3);
    }
}
