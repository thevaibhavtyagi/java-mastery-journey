package Nested_Classes;

// BUILDER PATTERN ONE - LITTLE CHALLENGING -----------
class Computer {
    private String brand;
    private int ram;
    private int storage;
    private boolean hasGPU;

    private Computer(Builder builder) {
        this.brand = builder.brand;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.hasGPU = builder.hasGPU;
    }

    public void display() {
        System.out.println("Brand: " + brand + ", RAM: " + ram + "GB, Storage: " + storage + "GB, GPU: " + (hasGPU ? "Yes" : "No"));
    }

    static class Builder {
        private String brand;
        private int ram;
        private int storage;
        private boolean hasGPU;

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }
        public Builder setRam(int ram) {
            this.ram = ram;
            return this;
        }
        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }
        public Builder setHasGPU(boolean hasGPU) {
            this.hasGPU = hasGPU;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
public class SNC_practice4 {
    public static void main(String[] args) {
        Computer c = new Computer.Builder()
                        .setBrand("Lenovo")
                        .setRam(16)
                        .setStorage(512)
                        .setHasGPU(true)
                        .build();

        Computer c2 = new Computer.Builder()
                        .setBrand("HP")
                        .setRam(8)
                        .setStorage(256)
                        .setHasGPU(false)
                        .build();
        c.display();
        c2.display();
    }
}
