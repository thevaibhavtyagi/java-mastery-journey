package Exceptions_Assertions;

public class throw_throws_2 {

    static int getElement(int[] arr, int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= arr.length) {
            throw new ArrayIndexOutOfBoundsException("Invalid index: " + index);
        }
        return arr[index];
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30};

        try {
            System.out.println(getElement(arr, 1));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(getElement(arr, -1));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(getElement(arr, 5));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}