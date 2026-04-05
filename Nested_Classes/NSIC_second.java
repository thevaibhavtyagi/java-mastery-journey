package Nested_Classes;

// OuterClass.this keyword use -----------------
class Outer {
    private int x = 10;

    class Inner {
        private int x = 20;

        void display() {
            System.out.println("Inner one: " + x);
            System.out.println("Outer one: " + Outer.this.x);
        }
    }
}
public class NSIC_second {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();

        i.display();
    }
}


// A non-static inner class cannot have static members (fields or methods).
