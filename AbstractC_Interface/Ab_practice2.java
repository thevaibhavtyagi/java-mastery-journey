package AbstractC_Interface;

// ABSTRACT - REAL WORLD DESIGN --------------
abstract class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    abstract double calculateInterest();

    void displayInfo() {
        System.out.println("Holder name: " + accountHolder);
        System.out.println("Balance is: " + balance);

        System.out.println("Interest applied = " + calculateInterest());
    }

}

class SavingsAccount extends BankAccount {
    SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.04;
    }
}

class CurrentAccount extends BankAccount {
    CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.015;
    }
}
public class Ab_practice2 {
    public static void main(String[] args) {
        BankAccount[] b = {
            new SavingsAccount("Vaibhav", 5000.25),
            new CurrentAccount("Raam", 6452.23)
        };

        for(BankAccount bb : b) {
            bb.displayInfo();
        }
    }
    
}
