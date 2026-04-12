package I_O_Fundamentals;

// BufferedReader -------------------
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class third {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter something: ");
        String line = br.readLine(); // reads one full line.

        System.out.println("You typed: " + line);
    }
}


// It reads data as String (text), we must convert or parse it.