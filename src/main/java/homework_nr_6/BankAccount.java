package homework_nr_6;

public class BankAccount {

    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


}
//3.Добавьте методы deposit(double amount) и withdraw(double amount).
// Метод deposit должен увеличивать balance на указанную сумму,
// а метод withdraw — уменьшать balance на указанную сумму, если достаточно средств на счете.
//4.Инициализируйте объект типа BankAccount в методе main класса BankAccount, передав номер счета и начальный баланс.
// Вызовите методы deposit и withdraw с разными значениями, и выведите текущий баланс на консоль после каждой операции.