package SRP;

public class NotificationSender {
    public void sendNotification(BankAccount account, String message) {
        // Logic to send a notification to the account holder
        System.out.println("Sending notification to account number: " + account.getAccountNumber());
        System.out.println("Message: " + message);
        // ...
    }
}
