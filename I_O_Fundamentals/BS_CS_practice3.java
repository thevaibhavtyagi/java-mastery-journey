package I_O_Fundamentals;

import java.io.*;
import java.util.Scanner;

public class BS_CS_practice3 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        // Writing to file
        try (PrintWriter pw = new PrintWriter(
                new BufferedWriter(new FileWriter("results.txt")))) {

            for (int i = 1; i <= 3; i++) {
                System.out.print("Enter name of student " + i + ": ");
                String name = sc.nextLine();

                System.out.print("Enter marks of student " + i + ": ");
                int marks = sc.nextInt();
                sc.nextLine();

                pw.println("Student " + i + ": " + name + " — " + marks);
            }
        }

        // Reading from file
        try (BufferedReader br = new BufferedReader(new FileReader("results.txt"))) {
            String line;

            System.out.println("\n--- File Content ---");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }

        sc.close();
    }
}