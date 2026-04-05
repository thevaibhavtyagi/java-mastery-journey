package Nested_Classes;

// NAME CONFLICT AND SOLUTION --------------
class Laptop {
    private String brand = "Dell";

    class Keyboard {
        String brand = "LogicTech";

        void showBrands() {
            System.out.println("Keyboard Brand: " + brand);
            System.out.println("Laptop Brand: " + Laptop.this.brand);
        }
    }
}
public class NSIC_practice2 {
    public static void main(String[] args) {

        Laptop l = new Laptop();
        Laptop.Keyboard k = l.new Keyboard();

        k.showBrands();
    }
}
