package SRP;

public class Main {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account = new BankAccount();
        account.setAccountNumber("123456789");
        account.setBalance(1000);

        // Perform some operations on the account
        account.deposit(500);
        account.withdraw(200);

        // Generate a report for the account
        ReportGenerator reportGenerator = new ReportGenerator();
        reportGenerator.generateReport(account);

        // Send a notification to the account holder
        NotificationSender notificationSender = new NotificationSender();
        String message = "Your account balance is: " + account.getBalance();
        notificationSender.sendNotification(account, message);
    }
}
