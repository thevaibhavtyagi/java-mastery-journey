package Arrays_Enums;

// SOME ARRAYS UTILITY CLASS ---------
import java.util.Arrays;

public class fourth {
    public static void main(String[] args) {
        int[] arr = {2, 3, 9, 6, 2};

        // to sort in place
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // some more, like - copyOf, copyOfRange, fill, equals

        // using .equals -------
        int[] b = {2, 3, 9, 6, 2};
        System.out.println(Arrays.equals(arr, b)); // false
    }
    
}
