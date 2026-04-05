package Nested_Classes;
// QUESTION 1 -------------
interface Printable {
    void print();
}
public class AC_practice1 {
    public static void main(String[]  args) {
        Printable p = new Printable() {
            @Override
            public void print() {
                System.out.println("Claude is teaching in super best way :)");
            }
        };

        Printable p2 = new Printable() {
            @Override
            public void print() {
                System.out.println("\nTHANK YOU CLAUDE :)");
            }
        };

        Printable p3 = new Printable() {
            @Override
            public void print() {
                System.out.println("\n========= KEPP THE SAME WAY, YOU ARE THE BEST============= ");
            }
        };

        p.print();
        p2.print();
        p3.print();

    }
}
