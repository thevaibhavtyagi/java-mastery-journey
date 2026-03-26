package Arrays_Enums;

// JAGGED ARRAY ---------
import java.util.Arrays;
public class D2practice3 {
    public static void main(String[] args) {

        int[][] arr = new int[5][];

        for(int i = 0; i < 5; i++) {
            arr[i] = new int[i + 1];

            for(int j = 0; j <= i; j++) {
                arr[i][j] = j + 1;
            }
        }

        System.out.println(Arrays.deepToString(arr));
    }
}
