package I_O_Fundamentals;

import java.io.PrintWriter;

// WRITTING OUTPUT - PrintWritter -------------
public class four {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Hello from PrintWritter!");
        pw.printf("Pi is %.2f%n", Math.PI);

        pw.flush(); // force output to actually appear
    }
    
}
