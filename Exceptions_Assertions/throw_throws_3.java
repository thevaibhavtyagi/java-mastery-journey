package Exceptions_Assertions;

public class throw_throws_3 {

    static void readData() throws Exception {
        throw new Exception("Data source unavailable");
    }

    public static void processData() throws Exception {
        readData();
    }

    public static void main(String[] args) {

        try {
            processData();
        } catch (Exception e) {
            System.out.println("System error: " + e.getMessage());
        }
    }
}