package Arrays_Enums;

// PRINTING ONLY EVEN OF ARRAY ----------
import java.util.*;
public class arrPractice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array length: ");
        int n = sc.nextInt();

        System.out.print("Enter array elements: ");
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Original Array: ");
        System.out.println(Arrays.toString(arr));

        System.out.print("Modified Array: ");
        for(int num : arr) {
            if(num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
    
}
