package I_O_Fundamentals;

// FILE OUTPUT STREAM -------------------
import java.io.FileOutputStream;
import java.io.IOException;

public class BS_CS_2 {
    public static void main(String[] args) throws IOException {

        String text = "Hello, Java I/O!";

        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            fos.write(text.getBytes()); // convert string to byte array
        }

        System.out.println("Written successfully.");
    }
}

// FOR APPENDING TO EXISTING FILE, WE PASS 'true' as second argument.
// new FileOutputStream("output.txt", true)
