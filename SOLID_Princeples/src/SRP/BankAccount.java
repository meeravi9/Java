package SRP;
/*In this example, we have three separate classes: BankAccount, ReportGenerator, and NotificationSender.

The BankAccount class has a single responsibility, which is to manage the bank account operations such as deposit, withdrawal, and balance inquiry. It encapsulates the account details and provides methods to interact with the account.

The ReportGenerator class is responsible for generating reports based on the account details. It takes a BankAccount object as input and generates a report specific to that account. This separates the responsibility of generating reports from the BankAccount class.

The NotificationSender class handles sending notifications to the account holder. It also takes a BankAccount object and a message as input, and performs the necessary logic to send the notification. By having a separate class for this responsibility, we ensure that the BankAccount class remains focused on its primary responsibility of managing the account.

By separating these responsibilities into different classes, we adhere to the Single Responsibility Principle (SRP) and create a more maintainable and modular codebase.*/
public class BankAccount {
    private String accountNumber;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public double getBalance() {
        return balance;
    }
}

