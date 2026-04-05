package Nested_Classes;

// INTERFACE IMPLEMENTATION - QUESTION 3 ---------------
interface Shape {
    double area();

    class ShapeFactory {
        Shape getCircleShape(double radius) {
            class Circle implements Shape {
                @Override
                public double area() {
                    return 3.14159 * radius * radius;
                }
            }

            return new Circle();

        }
    }
}
public class LC_practice3 {
    public static void main(String[] args) {
        Shape.ShapeFactory f = new Shape.ShapeFactory();

        Shape s1 = f.getCircleShape(5);
        System.out.println("Area: " + s1.area());

    }
}



// // WITHOUT SHAPE AS RETURN --------------
// package Nested_Classes;

// import Nested_Classes.Shape.ShapeFactory;

// interface Shape {
//     double area();

//     class ShapeFactory {
//         void getCircleShape(double radius) {
//             class Circle implements Shape {
//                 @Override
//                 public double area() {
//                     return 3.14159 * radius * radius;
//                 }
//             }

//             Circle c = new Circle();
//             System.out.println("Area is: " + c.area());

//         }
//     }
// }
// public class LC_practice3 {
//     public static void main(String[] args) {
//         ShapeFactory s = new ShapeFactory();
//         s.getCircleShape(12);

//     }
// }