package AbstractC_Interface;

// STATIC METHOD + FULL INTERFACE DESIGN ---------
interface  PasswordValidator {
    static boolean isStrong(String password) {
        return password.length() > 8;
    }

    default void showPolicy() {
        System.out.println("Passowrd must be 8 char or long!!");
    }

    void validate(String password);
}

class BasicValidator implements PasswordValidator {
    @Override
    public void validate(String password) {
        if (PasswordValidator.isStrong(password)) {
            System.out.println("Password is strong");
        } else {
            System.out.println("Password is weak");
        }
    }
}
public class static_practice1 {
    public static void main(String[] args) {
        PasswordValidator pv = new BasicValidator();

        System.out.println(PasswordValidator.isStrong("123456789"));

        pv.showPolicy();
        pv.validate("1234567895");
        pv.validate("45625");
    }
}
