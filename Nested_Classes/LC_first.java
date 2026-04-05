package Nested_Classes;

// LOCAL CLASS - A local class is a class defined inside a method 


// SIMPLE EXAMPLE ----------
class TF {
    private String cn = "TechCrop";

    void printReport(String title, int year) {
        class ReportPrinter {
            void printHeader() {
                System.out.println("Header ----------");
                System.out.println("Report: " + title);
                System.out.println("Year: " + year);

                System.out.println("===================");

            }

            void printFooter() {
                System.out.println("--------- End of " + title + " -----------");
            }
        }

        ReportPrinter printer = new ReportPrinter();
        printer.printHeader();
        System.out.println("  [Report content goes here]");
        printer.printFooter();
    }
}
public class LC_first {
    public static void main(String[] args) {
        TF formatter = new TF();
        formatter.printReport("Annual Summary", 2024);
        System.out.println();
        formatter.printReport("Q3 Results", 2024);

    }
}
