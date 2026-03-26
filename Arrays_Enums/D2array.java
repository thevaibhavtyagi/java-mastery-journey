package Arrays_Enums;

// 2D ARRAY SUM -----------
public class D2array {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int sum = 0;

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++) {
                sum = sum + mat[i][j];
            }
        }

        System.out.println(sum);
    }
}
