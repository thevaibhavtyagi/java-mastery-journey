package Arrays_Enums;

// WORKING WITH FOR EACH LOOP ----------
public class second {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for(int num : arr) {
            num = num * 2; // this only changes num, not arr
            System.out.print(num + " ");
        }

        System.out.println('\n');
        for(int num : arr) {
            System.out.print(num + " "); // it will print original array only
        }
    }
    
}
