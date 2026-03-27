package AbstractC_Interface;

// A FULL WORKING EXAMPLE - INTERFACES  -------------
interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

interface Faxable {
    void fax();
}

class BasicPrinter implements Printable {
    @Override
    public void print() {
        System.out.println("Basic Printer: Printing document....");
    }
}

class OfficePrinter implements Printable, Scannable, Faxable {
    @Override
    public void print() {
        System.out.println("Office Printer: Printing document....");
    }

    @Override
    public void scan() {
        System.out.println("Scanning...");
    }

    @Override
    public void fax() {
        System.out.println("Faxing....");
    }
}

public class I_first {
    public static void main(String[] args) {
        Printable p1 = new BasicPrinter();
        Printable p2 = new OfficePrinter();

        p1.print();
        p2.print();

        Scannable s = new OfficePrinter();
        s.scan();

        Faxable f = new OfficePrinter();
        f.fax();
    }
}
