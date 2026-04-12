package I_O_Fundamentals;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// PRACTICE 2 - USING BufferedReader ----------

public class I_O_practice2 {
    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.print("Enter your full name: ");
            String name = br.readLine();

            System.out.print("Enter your age: ");
            int age = Integer.parseInt(br.readLine());

            System.out.print("Enter your GPA: ");
            double gpa = Double.parseDouble(br.readLine());

            System.out.printf("Name: %s, Age: %d, GPA: %.1f%n", name, age, gpa);
        }
    }
}