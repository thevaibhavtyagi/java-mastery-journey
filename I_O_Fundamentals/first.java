package I_O_Fundamentals;

import java.util.Scanner;

// SIMPLE PROGRAM - USE OF SCANNER --------------
public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " years old.");


        sc.close();
    }
}
