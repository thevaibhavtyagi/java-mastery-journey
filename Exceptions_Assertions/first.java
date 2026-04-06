package Exceptions_Assertions;

// BASICS OF EXCEPTION ------------

// CASE 1 - Without exception handling
// public class first {
//     public static void main(String[] args) {
//         int[] arr = new int[5];
//         arr[10] = 42;  //Index out of bound exception
//         System.out.println("DONE"); // This line never runs
//     }
// }



// CASE 2 - With exception handling
public class first {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 42;  //Index out of bound exception

        }  catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This index doesn't exist");
            System.out.println("Error details: " + e.getMessage());    
        }

        // Program continues normally
        System.out.println("This will go normally!!");
    }
}
