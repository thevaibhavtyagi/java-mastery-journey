package Arrays_Enums;

// SUM OF DIAGONAL + ANTI DIAGONAL ----------
import java.util.*;
public class D2practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        System.out.println("Enter 3x3 matrix:");

        // input
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        for(int i = 0; i < 3; i++) {
            // main diagonal
            sum += matrix[i][i];

            // anti-diagonal
            if(i != 2 - i) {   // avoid double count
                sum += matrix[i][2 - i];
            }
        }

        System.out.println("Sum of diagonals: " + sum);

        sc.close();
    }
}
