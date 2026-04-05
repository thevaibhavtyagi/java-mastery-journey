package Nested_Classes;

// EFFECTIVE FINAL TEST --------------
class Multiplier {

    void buildMultiplier(int factor) {

        class Calculator {
            int multiply(int number) {
                return number * factor;
            }
        }

        // factor = factor + 10; // gives error

        Calculator c = new Calculator();
        System.out.println(c.multiply(5));
    }
}

public class LC_practice2 {
    public static void main(String[] args) {

        Multiplier m = new Multiplier();

        m.buildMultiplier(3);
        m.buildMultiplier(10);
    }
}