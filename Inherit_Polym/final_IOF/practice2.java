package final_IOF;
// INSTANCEOF() - PRACTICE ---------

class Shape {
    void draw() {

    }
}

class Circle extends Shape {
    void rollAround() {

    }
}

class Rectangle extends Shape {
    void calculatePerimeter(int l, int w) {

    }
}

class Triangle extends Shape {
    void checkType() {

    }
}


public class practice2 {
    public static void main(String[] args) {
        Shape[] s = {
            new Circle(), 
            new Rectangle(),
            new Triangle()
        };

        for(Shape ss : s) {
            ss.draw();

            if(ss instanceof Circle c) {
                c.rollAround();
            } else if(ss instanceof Rectangle r) {
                r.calculatePerimeter(0, 0);
            } else if (ss instanceof Triangle t) {
                t.checkType();
            }
        }
    }
}
