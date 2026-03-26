package Inherit_Polym;

// MULTILEVEL INHERITENCE ------------
class Shape {
    String color;

    void shape() {
        System.out.println("This is a shape with color: " + color);
    }
}

class Polygon extends Shape {
    int sides;

    void displayPolygon() {
        System.out.println("This is a polygon with " + sides + " sides");
    }
}

class Triangle extends Polygon {
    double area;

    void displayTriangle() {
        System.out.println("This is a triangle with area: " + area);
    }
}

public class inPractice3 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.color = "Red";
        t.sides = 3;
        t.area = 12.5;
        
        t.shape();
        t.displayPolygon();
        t.displayTriangle();
    }
    
}