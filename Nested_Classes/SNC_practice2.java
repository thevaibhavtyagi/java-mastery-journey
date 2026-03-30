package Nested_Classes;

import Nested_Classes.Library.Book;
// SIMPLE WARM UP - PRACTICE ---------------
class Library {
    private static String libraryName = "LPU CENTRAL";

    static class Book {
        private String title;
        private String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        void display() {
            System.out.println("Library Name: " + libraryName);
            System.out.println("Title: " + title);
            System.out.println("Author name: " + author);
        }

    }
}
public class SNC_practice2 {
    public static void main(String[] args) {
        Library.Book b = new Library.Book("It's Starting", "Vaibhav");

        b.display();

        Book b2 = new Book("It will go", "Vaibhav");
        b2.display();
    }
    
}
