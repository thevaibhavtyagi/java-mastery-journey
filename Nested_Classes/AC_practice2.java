package Nested_Classes;

// QUESTION 2 OF AC -------------------
abstract class Vehicle {
    int speed;

    Vehicle(int speed) {
        this.speed = speed;
    }

    abstract String fuelType();

    void describe() {
        System.out.println("Speed: " + speed + ", Fuel Type: " + fuelType());
    }
}

public class AC_practice2 {
    public static void main(String[] args) {

        // Anonymous class for Petrol Car
        Vehicle petrolCar = new Vehicle(120) {
            @Override
            String fuelType() {
                return "Petrol";
            }
        };

        // Anonymous class for Electric Bike
        Vehicle electricBike = new Vehicle(80) {
            @Override
            String fuelType() {
                return "Electric";
            }
        };

        petrolCar.describe();
        electricBike.describe();
    }
}