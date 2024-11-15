package homework_nr_6;

public class BankAccount {

    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public static double deposit (double balance, double depositAmount) {
        balance += depositAmount;
        return balance;
    }

    public static double withdraw(double balance, double withdrawAmount) {

        if(balance >= withdrawAmount) {
            return balance-= withdrawAmount;
        } else return balance;

    }
}


