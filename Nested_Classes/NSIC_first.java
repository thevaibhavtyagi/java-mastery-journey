package Nested_Classes;

// BASIC UNDERSTANDING AND SYNTAX -------------
class Car {
    private String brand;
    private int year;

    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    class Engine {
        private int hp;

        Engine(int hp) {
            this.hp = hp;
        }

        void start() {
             System.out.println(brand + " (" + year + ") engine started.");
            System.out.println("Horsepower: " + hp);
        }

        void showOuter() {
            System.out.println("This engine belong to: " + Car.this.brand);
        }
    }
}
public class NSIC_first {
    public static void main(String[] args) {
        Car c = new Car("Toyota", 2022);
        Car c2 = new Car("BMW", 2024);

        Car.Engine e1 = c.new Engine(150);
        Car.Engine e2 = c2.new Engine(300);

        e1.start();
        e2.start();

        System.out.println("--------------");
        e1.showOuter();
        e2.showOuter();


    }
}
