package homework_nr_6;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1: Class ArrayUtils:");
        int[] numbers = new int[]{
                3, 7, 20, 6, 15, 9, 124, -16, 50, 44, 55, -3
        };

        System.out.println("The maximum number in array is " + ArrayUtils.findMax(numbers));
        System.out.println("The minimum number in array is " + ArrayUtils.findMin(numbers));
        System.out.println();

        System.out.println("Task 2: Class BankAccount:");
        BankAccount account_1 = new BankAccount("24CC46-5", 5789.16);
        BankAccount account_2 = new BankAccount("28EJ18-3", 1034.49);

        double depositAmount = 50.15;
        double withdrewAmount = 145.16;

        System.out.println (account_1.accountNumber + " - " + BankAccount.deposit(account_1.balance, depositAmount));
        System.out.println (account_2.accountNumber + " - " + BankAccount.withdraw(account_2.balance, withdrewAmount));
        System.out.println();

        System.out.println("Task 3: Class NumberUtils:");
        int testingNumber = 6;
        if (NumberUtils.isPrime(testingNumber) == true) {
            System.out.println(NumberUtils.isPrime(testingNumber) + ", " + testingNumber + " is prime number");
        } else {
            System.out.println(NumberUtils.isPrime(testingNumber) + ", " + testingNumber + " is not prime number");

        }



    }
}
