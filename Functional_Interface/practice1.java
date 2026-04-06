package Functional_Interface;

// LAMBDA BASICS ----------------
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class practice1 {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        printResult(4, 7, add);

        MathOperation sub = (a, b) -> a - b;
        printResult(78, 45, sub);

        MathOperation mul = (a, b) -> a * b;
        printResult(78, 45, mul);

        MathOperation div = (a, b) -> a / b;
        printResult(78, 45, div);
    }

    static void printResult(int a, int b, MathOperation op) {
        System.out.println(op.operate(a, b));
    }
}
