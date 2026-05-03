package I_O_Fundamentals;

import java.io.*;
import java.util.*;

class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    String name;
    int quantity;
    double price;

    Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    double totalValue() {
        return quantity * price;
    }

    public String toString() {
        return "Name: " + name + ", Quantity: " + quantity + ", Price: " + price;
    }
}

public class Ser_practice2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Laptop", 2, 50000));
        list.add(new Product("Phone", 5, 20000));
        list.add(new Product("Tablet", 3, 15000));
        list.add(new Product("Headphones", 10, 2000));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("products.ser"));
        oos.writeObject(list);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("products.ser"));
        List<Product> newList = (List<Product>) ois.readObject();
        ois.close();

        Product maxProduct = newList.get(0);

        for (Product p : newList) {
            if (p.totalValue() > maxProduct.totalValue()) {
                maxProduct = p;
            }
        }

        System.out.println("Product with highest total value:");
        System.out.println(maxProduct);
        System.out.println("Total Value: " + maxProduct.totalValue());
    }
}