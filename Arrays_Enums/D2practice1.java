package Arrays_Enums;

// TRANSPOSE OF A MATRIX -----------
import java.util.*;
public class D2practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] mat = new int[r][c];
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Transpose
        int[][] transpose = new int[c][r];
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                transpose[j][i] = mat[i][j];
            }
        }

        // Print transposed matrix
        for(int i = 0; i < c; i++) {
            for(int j = 0; j < r; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
