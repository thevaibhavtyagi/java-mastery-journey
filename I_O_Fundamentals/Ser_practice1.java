package I_O_Fundamentals;


// BAISC SERILIAZE/DESERIALIZE ----------------
import java.io.*;

class Book implements Serializable {
    private static final long serialVersionUID = 1L;

    String title;
    String author;
    double price;
    transient int internalCode;

    Book(String title, String author, double price, int internalCode) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.internalCode = internalCode;
    }

    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Price: " + price + ", InternalCode: " + internalCode;
    }
}

public class Ser_practice1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Book b1 = new Book("Java Basics", "Vaibhav", 499.99, 12345);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.ser"))) {
            oos.writeObject(b1);
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.ser"))) {
            Book b2 = (Book) ois.readObject();

            System.out.println("Original Object:");
            System.out.println(b1);

            System.out.println("Deserialized Object:");
            System.out.println(b2);
        }
    }
}