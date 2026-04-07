package Exceptions_Assertions;

public class throw_throws_1 {

    static void validatePassword(String password) throws IllegalArgumentException {
        if (password == null) {
            throw new IllegalArgumentException("Password cannot be null");
        }
        if (password.length() < 8) {
            throw new IllegalArgumentException("Password too short");
        }
        if (password.length() > 20) {
            throw new IllegalArgumentException("Password too long");
        }
        System.out.println("Password is valid");
    }

    public static void main(String[] args) {

        try {
            validatePassword("short");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            validatePassword(null);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            validatePassword("ValidPass123");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}