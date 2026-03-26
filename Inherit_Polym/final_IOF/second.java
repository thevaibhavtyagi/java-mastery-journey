package Inherit_Polym.final_IOF;
// IT IS TYPE CHECKING AT RUNTIME - instanceOF()-----

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class second {
    public static void main(String[] args) {
        Animal a = new Dog();

        System.out.println(a instanceof Dog); //true
        System.out.println(a instanceof Animal); //true
        System.out.println(a instanceof Cat); //false  CAT IS NOT A DOG
    }
}
