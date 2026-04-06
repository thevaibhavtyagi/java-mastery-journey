package Functional_Interface;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class LE_second {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        System.out.println("Addition is: " + add.operate(4, 7));
    }
}
