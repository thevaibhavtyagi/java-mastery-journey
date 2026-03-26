// package Inherit_Polym;

// OVERRIDING + SUPER ------------
class Vehicle {
    void start() {
        System.out.println("Vehicle engine starting...");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        super.start();
        System.out.println("Car-specific startup complete.");
    }
}

class Truck extends Vehicle {
    @Override
    void start() {
        super.start();
        System.out.println("Truck-specific startup complete.");
    }
}
public class MO_practice3 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Truck();

        v1.start();
        v2.start();
    }
}
