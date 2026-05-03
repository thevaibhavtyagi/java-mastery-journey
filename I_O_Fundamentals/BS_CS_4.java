package I_O_Fundamentals;

// USE OF FILEREADER AND FILEWRITER ---------------
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BS_CS_4 {
    public static void main(String[] args) throws IOException {

        // writting to a file
        try (FileWriter fw = new FileWriter("notes.txt", true)) {
            fw.write("This is line one\n");
            fw.write("This is line two\n");
        }

        // reading to a file
        try (FileReader fr = new FileReader("notes.txt")) {
            int ch;

            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        }
    }
}
