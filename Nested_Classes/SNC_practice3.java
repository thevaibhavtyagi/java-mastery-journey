package Nested_Classes;

import Nested_Classes.MathUtils.Calculator;
// SNC - LOGIC TEST ----------
class MathUtils {

    static class Calculator {

        static void add(int a, int b) {
            int result = a + b;
            System.out.println("Addition: " + result);
        }

        static void multiply(int a, int b) {
            int result = a * b;
            System.out.println("Multiplication: " + result);
        }

        static void power(int a, int b) {
            int pow = 1;
            for (int i = 0; i < b; i++) {
                pow *= a;
            }
            System.out.println("Power: " + pow);
        }
    }
}
public class SNC_practice3 {
    public static void main(String[] args) {
        Calculator.add(5, 6); // Accessing static method of nested class directly
        Calculator.multiply(5, 6);
        Calculator.power(5, 6);

        // //or
        // Calculator calc = new Calculator();
        // calc.add(5, 6);
        // calc.multiply(5, 6);
        // calc.power(5, 6);
    }
}
