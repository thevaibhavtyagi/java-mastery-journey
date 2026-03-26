package AbstractC_Interface;

// CORE APBSTRACT CLASS ----------------
abstract class Animal {
    String name;

    Animal(String name){
        this.name = name;
    }

    abstract void sound();
    void breathe() {
        System.out.println(name + " is breathing");
    }
}

class Dog extends Animal{
    Dog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " barks");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " mewww");
    }

}

class Cow extends Animal{
    Cow(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " mowww");
    }

}
public class Ab_practice1 {
    public static void main(String[] args) {
        Animal[] a = {
            new Dog("Rex"),
            new Cat("Whiskers"),
            new Cow("Bessie"),

        };

        for(Animal aa : a) {
            aa.breathe();
            aa.sound();
        }
    }
}
