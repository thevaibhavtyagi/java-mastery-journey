package I_O_Fundamentals;

// PRACTICE 1 - BASICS OF I/O ---------------
import java.util.Scanner;
public class I_O_practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your GPA: ");
        double gpa = sc.nextDouble();

        System.out.printf("Name: %s, Age: %d, GPA: %.1f%n", name, age, gpa);

        sc.close();
    }
}
