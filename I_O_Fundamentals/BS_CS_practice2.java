package I_O_Fundamentals;

// PRACTICE 2 - LINE PROCESSING ----------
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BS_CS_practice2 {
    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new FileReader("numbers.txt"))) {
            String line;

            int sum = 0;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            while((line = br.readLine()) != null) {
                sum = sum + Integer.parseInt(line);
                line = line.trim();

                if(Integer.parseInt(line) > max) {
                    max = Integer.parseInt(line);
                }

                if(Integer.parseInt(line) < min) {
                    min = Integer.parseInt(line);
                }

                System.out.println(line);

            }

            System.out.println("Sum is: " + sum);
            System.out.println("Max is: " + max);
            System.out.println("Min is: " + min);


        }
    }
}
