// package Inherit_Polym;

// // BASIC WARM IP WITH INHERITENCE ----------
// class Animal {
//     String name;
//     int age;

//     Animal(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     void eat() {
//         System.out.println(name + " is eating");
//     }

//     void sleep() {
//         System.out.println(name + " is sleeping");
//     }
// }

// class Dog extends Animal {
//     String breed;

//     Dog(String name, int age, String breed) {
//         super(name, age);
//         this.breed = breed;

//     }

//     void bark() {
//         System.out.println(name + "says: Woof!");
//     }
// }

// public class first {
//     public static void main(String[] args) {
//         Dog d = new Dog("Burno", 3, "Labrador");
//         d.eat();
//         d.sleep();
//         d.bark();

//         System.out.println("Breed: " + d.breed);
//         System.out.println("Name: " + d.name);

//     }
// }
