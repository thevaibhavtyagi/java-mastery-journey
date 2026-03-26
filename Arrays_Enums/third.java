package Arrays_Enums;

import java.util.Arrays;

// THE REFERENCE / COPY TRAP ------------

// public class third {
//     public static void main(String[] args) {
//         int[] a = {1, 2, 3, 4, 5};
//         int[] b = a;  // b points to SAME object, it is not a copy

//         b[0] = 99; // b is not a copy, it is pointing to same memory
//         System.out.println(a[0]);
//     }
// }



// THE REAL COPY OF AN ARRAY --------
public class third {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        // int b[] = new int[a.length];

        // for(int i = 0; i < a.length;  i++) {
        //     b[i] = a[i];
        // }

        // // some operation
        // b[0] = 72;

        // System.out.println(a[0]); // 1, not 72
        // System.out.println(b[0]); // 72 not 1


        // OR
        int[] b = Arrays.copyOf(a, a.length);
        b[0] = 72;
        System.out.println(a[0]); // 1, not 72
        System.out.println(b[0]); // 72 not 1

    }
}