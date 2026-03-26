package final_IOF;

// FINAL - PRACTICE -----------

final class MathConstants {
    static final double PI = 3.14159;
    static final double E = 2.71828;
}

class Circle {
    final int r;

    Circle(int r) {
        this.r = r;
    }

    void area() {
        double result = MathConstants.PI * r * r;
        System.out.println(result);
    }

    final void describe() {
        System.out.println("I am a circle with radius " + r);
    }
}
public class practice1 {
    public static void main(String[] args) {
        Circle c = new Circle(4);

        c.area();
        c.describe();

    }
}
