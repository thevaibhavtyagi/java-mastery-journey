package Arrays_Enums;

// EQUAL IN CONTENT BUT NOT NECESSARILY IN ORDER -----
import java.util.*;

public class arrPractice3 {
    public static void main(String[] args) {
        int[] a = {3, 1, 2};
        int[] b = {1, 2, 3};

        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(Arrays.equals(a, b));
    }
}
