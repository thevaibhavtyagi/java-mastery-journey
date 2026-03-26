// package Inherit_Polym;

// MULTILEVEL INHERITENCE -------------
class A {
    void breathe() {
        System.out.println("Breathing.....");
    }
}

class B extends A {
    void bark() {
        System.out.println("Woof!");
    }
}

class C extends B {
    void eat() {
        System.out.println("Eating....");
    }
}
public class third {
    public static void main(String[] args) {
        C c = new C();
        c.breathe();
        c.bark();
        c.eat();
    }
    
}
