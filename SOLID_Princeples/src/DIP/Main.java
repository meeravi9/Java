package DIP;

interface NotificationChannel {
    void sendNotification(String message);
}

class EmailNotificationChannel implements NotificationChannel {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending email notification: " + message);
        // Logic for sending email notification
    }
}

class SMSNotificationChannel implements NotificationChannel {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS notification: " + message);
        // Logic for sending SMS notification
    }
}

class NotificationService {
    private NotificationChannel notificationChannel;

    public NotificationService(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    public void sendNotification(String message) {

        notificationChannel.sendNotification(message);
    }
}

public class Main {
    public static void main(String[] args) {
        EmailNotificationChannel emailChannel = new EmailNotificationChannel();
        SMSNotificationChannel smsChannel = new SMSNotificationChannel();

        NotificationService emailNotificationService = new NotificationService(emailChannel);
        NotificationService smsNotificationService = new NotificationService(smsChannel);

        emailNotificationService.sendNotification("Hello, this is an email notification!");
        smsNotificationService.sendNotification("Hello, this is an SMS notification!");
    }
}
/*This example demonstrates the Dependency Inversion Principle (DIP). The NotificationService depends
 on the abstraction (NotificationChannel interface) rather than concrete implementations.
 By injecting the specific implementation (EmailNotificationChannel or SMSNotificationChannel) into
  the NotificationService through the constructor, we can easily switch between different notification
   channels without modifying the NotificationService class.
   This promotes loose coupling, modularity, and flexibility in the codebase.*/
