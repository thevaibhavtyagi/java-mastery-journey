package AbstractC_Interface;

// DIAMOND CONFLICT - RESOLUTION THROUGH INTERFACES ONLY ----

interface X {
    default void show() {
        System.out.println("I am from X !!");
    }
}

interface Y {
    default void show() {
        System.out.println("I am from Y !!");
    }
}

class Z implements X, Y {
    @Override
    public void show() {
        X.super.show();
        Y.super.show();

        System.out.println("I am Z own's, and I have solved conflict :)");
    }
}
public class practice3 {
    public static void main(String[] args) {
        X x = new Z();
        Y y = new Z();

        x.show();
        y.show();
    }
    
}
