// package Inherit_Polym;

// PRACTICE - toString() ----------

class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "Book: {Title'" + title + "', Author=" + author + ", Price=" + price + "}";
    }

}
public class objPractice2 {
    public static void main(String[] args) {
        Book b1 = new Book("AboutLife", "Vaibhav", 399.0);
        Book b2 = new Book("WhatLife", "Vaibhav", 389.0);

        System.out.println(b1);
        System.out.println(b2);

        String r = "It is concat " + b1;
        System.out.println(r);
        
    }
}
