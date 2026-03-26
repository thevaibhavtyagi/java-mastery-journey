package Arrays_Enums;

// ROTATE AN ARRAY TO THE RIGHT BY K POSITIONS ---------
import java.util.*;
public class arrPractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array length: ");
        int n = sc.nextInt();

        System.out.print("Enter array elements: ");
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();
        k = k % n;

        int[] arr2 = new int[arr.length];

        int x = 0;
        for(int i = n - k; i < n; i++) {
            arr2[x++] = arr[i];
        }
        for(int i = 0; i < n - k; i++) {
            arr2[x++] = arr[i];
        }

        System.out.println(Arrays.toString(arr2));

        sc.close();

    }
    
}
