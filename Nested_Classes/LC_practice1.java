package Nested_Classes;

// PRACTICE QUESTION 1 ---------------

class Invoice {
    String companyName;

    Invoice(String companyName) {
        this.companyName = companyName;
    }

    void generateInvoice(String customerName, double amount) {

        // Local inner class
        class InvoiceFormatter {

            void printHeader() {
                System.out.println("Company: " + companyName);
                System.out.println("Customer: " + customerName);
            }

            void printTotal() {
                System.out.println("Total: Rs. " + amount);
            }
        }

        // Object creation of local class
        InvoiceFormatter formatter = new InvoiceFormatter();

        formatter.printHeader();
        formatter.printTotal();

        System.out.println("----------------------");
    }
}

public class LC_practice1 {
    public static void main(String[] args) {

        Invoice inv = new Invoice("Tech Solutions Pvt Ltd");

        inv.generateInvoice("Vaibhav", 2500.75);
        inv.generateInvoice("Rohit", 4899.50);
    }
}