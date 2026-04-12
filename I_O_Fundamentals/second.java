package I_O_Fundamentals;

import java.util.Scanner;
// SIMPLE PROGRAM - SCANNER NOTORIOUS BUG -------------
public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt(); // leaves an \n, which is  cathes by below input, which make code incorrect.

        sc.nextLine(); // to catch newline;

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Age is: " + age);
        System.out.println("Name is: " + name);

        sc.close();
    }
    
}
