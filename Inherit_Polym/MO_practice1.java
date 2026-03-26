package Inherit_Polym;

// OVERRIDING + SUPER TOGETHER -------------
class Animal {
    void describe() {
        System.out.println("I am an animal.");
    }
}

class Dog extends Animal {
    @Override
    void describe() {
        super.describe();
        System.out.println("I am also a DOG.");
    }
}
public class MO_practice1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.describe();
    }
}
