package Nested_Classes;

// PRACTICE QUESTION 1 ON NSIC ----------
class Bank {
    String bankName;
    String ifscCode;

    Bank(String bankName, String ifscCode) {
        this.bankName = bankName;
        this.ifscCode = ifscCode;
    }

    class Account {
        String accountNumber;
        double balance;

        Account(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        double deposit(double amount) {
            balance += amount;
            return balance;
        }

        void showDetails(){
            System.out.println("Bank name: " + bankName);
            System.out.println("IFSC: " + ifscCode);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance is: " + balance);
        }
    }
}
public class NSIC_practice1 {
    public static void main(String[] args) {
        Bank b = new Bank("SBI", "SBI240N1");

        Bank.Account a1 = b.new Account("XXXXXXX7854", 74565.05);

        Bank.Account a2 = b.new Account("XXXXXXX7214", 78545.05);

        a1.deposit(1256.25);
        a1.showDetails();

        System.out.println("-------------");

        a2.deposit(4586.25);
        a2.showDetails();

    }
}
