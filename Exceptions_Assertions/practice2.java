package Exceptions_Assertions;

// QUESTION 2 - PRACTICE -----------------
public class practice2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception message: " + e.getMessage());
        }

        System.out.println("Loop finished.");
    }
}
