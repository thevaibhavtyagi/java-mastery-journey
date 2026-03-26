package Inherit_Polym;

// PRACTICE -equals() ------------
class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj == null) return false;

        if(getClass() != obj.getClass()) return false;

        Point other = (Point) obj;

        return this.x == other.x && this.y == other.y;
    }

    @Override
    public String toString() {
        return "Point{P1: " + x + ", P2: " + y + "}";
    }
}
public class objPractice3 {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(3, 4);

        System.out.println(p1);
        System.out.println(p1.equals(p2));

    }
    
}
