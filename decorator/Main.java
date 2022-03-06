package decorator;

public class Main {

    private static boolean isSlackNotificationEnabled = true;
    private static boolean isSmsNotificationEnabled = true;

    public static void main(String[] args) {
        Notifier notifier = new MailNotifier();
        if (isSmsNotificationEnabled) {
            notifier = new SmsNotifier(notifier);
        }
        if (isSlackNotificationEnabled) {
            notifier = new SlackNotifier(notifier);
        }

        notifier.notify("Hai saya decorator", "nabil@gmail.com");
    }
}
