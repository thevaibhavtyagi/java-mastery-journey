package I_O_Fundamentals;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BS_CS_5 {
    public static void main(String[] args) throws IOException {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt"))) {
            bw.write("Alice, 92");
            bw.newLine();

            bw.write("Dom, 82");
            bw.newLine();

            bw.write("Thomas, 71");
        
        }

        try(BufferedReader br = new BufferedReader(new FileReader("student.txt"))) {
            String line;

            while((line = br.readLine()) != null) {
                System.out.println("Read: " + line);
            }
        }
    }
}
