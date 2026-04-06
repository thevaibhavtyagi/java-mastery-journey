package Exceptions_Assertions;

// TRY, CATCH, FINALLY - PRACTICE 2 ----------------------------

public class TCF_practice2 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            System.out.println(arr[10]);

            int num = Integer.parseInt("abc");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("Exception: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("I am all rounder handler");
            
        } finally {
            System.out.println("Well! I always run");
        }
    }
}
