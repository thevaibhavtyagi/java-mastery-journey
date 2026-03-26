package AbstractC_Interface;

// THE SYNTAX AND BASICS OF ABSTRACT CLASS -------------
abstract class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    abstract double area();

    void displayColor() {
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
public class A_first {
    public static void main(String[] args) {
        Shape s = new Circle("Red", 5.0);

        s.displayColor();
        System.out.println("Circle area: " + s.area());
    }
}
