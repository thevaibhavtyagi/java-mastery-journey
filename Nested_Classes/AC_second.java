package Nested_Classes;

// FORM 2 -- EXTENDING AN ABSTRACT CLASS --------------
class ShapeDemo {
    abstract static class Shape {
        String color;

        Shape(String color) {
            this.color = color;
        }

        abstract double area();

        void display() {
            System.out.println("Color: " + color + ", Area: " + area());
        }
    }
}
public class AC_second {
    public static void main(String[] args) {
        ShapeDemo.Shape circle = new ShapeDemo.Shape("Red") {
            double radius = 7.0;

            @Override
            double area() {
                return 3.14159 * radius * radius;
            }
        };

        circle.display();
    }
}


// FORM 3 - IT IS EXTENDING CONCRETE CLASSES, SAME AS ABSTRACT.